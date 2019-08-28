package com.woniu.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniu.entity.Client;
import com.woniu.entity.ClientExample;
import com.woniu.entity.Netsign;
import com.woniu.entity.NetsignExample;
import com.woniu.entity.NetsignObj;
import com.woniu.entity.Ownership;
import com.woniu.entity.OwnershipExample;
import com.woniu.entity.OwnershipExample.Criteria;
import com.woniu.entity.PageBean;
import com.woniu.entity.Room;
import com.woniu.entity.Zone;
import com.woniu.entity.ZoneExample;
import com.woniu.mapper.ClientMapper;
import com.woniu.mapper.NetsignMapper;
import com.woniu.mapper.OwnershipMapper;
import com.woniu.mapper.RoomMapper;
import com.woniu.mapper.ZoneMapper;
import com.woniu.service.INetsignService;
import com.woniu.service.IRegistertorService;

@Service
public class NetsignServiceImpl implements INetsignService {
	
	@Resource
	private NetsignMapper netsignMapper;
	
	@Resource
	private RoomMapper roomMapper;
	
	@Resource
	private ClientMapper clientMapper;
	
	@Resource
	private  OwnershipMapper ownershipMapper;
	
	@Resource
	private ZoneMapper zoneMapper;

	@Override
	public void save(NetsignObj netsignObj) {
		Netsign netsign=new Netsign();
		netsign.setNetstatus(0);
		netsign.setNettime(new Date());
		Room room = roomMapper.findRoomidByAllName(netsignObj.getHname(), netsignObj.getBuildingnumber(), netsignObj.getRoomnumber());
		if(room==null) {
			throw new RuntimeException("该房屋不存在");
		}
		if(room.getRoomstatusid()==3||room.getRoomstatusid()==4) {
			throw new RuntimeException("该房屋不可以进行网签");
		}
		OwnershipExample ownershipExample=new OwnershipExample();
		ownershipExample.createCriteria().andRoomidEqualTo(room.getRoomid());
		List<Ownership> os = ownershipMapper.selectByExample(ownershipExample);
		for (Ownership ownership : os) {
			if(ownership.getClientid()!=room.getRoomid()) {
				throw new RuntimeException("售房者并不是房主");
			}
		}
		netsign.setRoomid(room.getRoomid());
		ClientExample example1=new ClientExample();
		example1.createCriteria().andClientnameEqualTo(netsignObj.getBuyername());
		example1.createCriteria().andIdcardEqualTo(netsignObj.getBuyeridcard());
		List<Client> bs = clientMapper.selectByExample(example1);
		Client b=bs.get(0);
		if(b==null) {
			throw new RuntimeException("购房者信息不正确");
		}
		Zone buyerZone = zoneMapper.selectByPrimaryKey(b.getZid());
		if(buyerZone.getCid()!=610100) {
			throw new RuntimeException("购房者不是西安户口");
		}
		ClientExample example2=new ClientExample();
		example2.createCriteria().andClientnameEqualTo(netsignObj.getSellername());
		example2.createCriteria().andIdcardEqualTo(netsignObj.getSelleridcard());
		List<Client> ss = clientMapper.selectByExample(example2);
		Client s=ss.get(0);
		if(s==null) {
			throw new RuntimeException("售房者信息不正确");
		}
		
		
		netsign.setBuyer(b.getClientid());
		netsign.setSeller(s.getClientid());
		String netnumber = UUID.randomUUID().toString().replaceAll("-","");
		netsign.setNetnumber(netnumber);
		netsignMapper.insert(netsign);
	}

	@Override
	public void examine(Integer netid) {
		Integer buyerid = netsignMapper.selectByPrimaryKey(netid).getBuyer();
		Integer roomCount = ownershipMapper.countByBuyerid(buyerid);
		if(roomCount!=null&&roomCount!=0) {
			throw new RuntimeException("购房者名下已有"+roomCount+"套房产");
		}
		Netsign netsign = netsignMapper.selectByPrimaryKey(netid);
		netsign.setNetstatus(1);
		netsignMapper.updateByPrimaryKeySelective(netsign);
	}

	@Override
	public Netsign findByNetid(Integer netid) {
		Netsign netsign = netsignMapper.selectByPrimaryKey(netid);
		return netsign;
	}

	@Override
	public List<Netsign> findByPage(PageBean pageBean) throws ParseException {
		NetsignExample example=new NetsignExample();
		example.createCriteria().andNetstatusEqualTo(0);
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//		if(pageBean.getStartDate()!=null&&!pageBean.getStartDate().equals("")) {
//			System.out.println("!!!!!!!!!!!");
//			System.out.println(sdf.parse(pageBean.getStartDate()));
//			example.createCriteria().andNettimeGreaterThan(sdf.parse(pageBean.getStartDate()));
//		}
//		if(pageBean.getEndDate()!=null&&!pageBean.getEndDate().equals("")) {
//			System.out.println("!!!!!!!!!!!");
//			System.out.println(sdf.parse(pageBean.getEndDate()));
//			example.createCriteria().andNettimeLessThan(sdf.parse(pageBean.getEndDate()));
//		}
		List<Netsign> list = netsignMapper.selectByExample(example, new RowBounds(pageBean.getOffset(), pageBean.getLimit()));
		int count = (int) netsignMapper.countByExample(example);
		pageBean.setCount(count);
		return list;
	}

	@Override
	public Netsign findByNetnumber(String netnumber) {
		NetsignExample example=new NetsignExample();
		example.createCriteria().andNetnumberEqualTo(netnumber);
		List<Netsign> list = netsignMapper.selectByExample(example);
		if(list==null||list.size()==0) {
			return null;
		}else {
			return list.get(0);
		}
	}

	@Override
	public List<Netsign> findByPageAndSuccess(PageBean pageBean) {
		NetsignExample example=new NetsignExample();
		example.createCriteria().andNetstatusEqualTo(1);
		List<Netsign> list = netsignMapper.selectByExample(example, new RowBounds(pageBean.getOffset(), pageBean.getLimit()));
		int count = (int) netsignMapper.countByExample(example);
		pageBean.setCount(count);
		return list;
	}

	@Override
	public void faild(Integer netid) {
		Netsign netsign = netsignMapper.selectByPrimaryKey(netid);
		netsign.setNetstatus(2);
		netsignMapper.updateByPrimaryKey(netsign);
		
	}

}
