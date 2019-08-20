package com.woniu.service.impl;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Client;
import com.woniu.entity.Netsign;
import com.woniu.entity.NetsignObj;
import com.woniu.entity.Room;
import com.woniu.mapper.ClientMapper;
import com.woniu.mapper.NetsignMapper;
import com.woniu.mapper.RoomMapper;
import com.woniu.service.INetsignService;

@Service
public class NetsignServiceImpl implements INetsignService {
	
	@Resource
	private NetsignMapper netsignMapper;
	
	@Resource
	private RoomMapper roomMapper;
	
	@Resource
	private ClientMapper clientMapper;

	@Override
	public void save(NetsignObj netsignObj) {
		Netsign netsign=new Netsign();
		netsign.setNetstatus(false);
		netsign.setNettime(new Date());
		Room room = roomMapper.findRoomidByAllName(netsignObj.getHname(), netsignObj.getBuildingnumber(), netsignObj.getRoomnumber());
		if(room==null) {
			throw new RuntimeException("该房屋不存在");
		}
		netsign.setRoomid(room.getRoomid());
		Client buyer=new Client();
		buyer.setClientname(netsignObj.getBuyername());
		buyer.setIdcard(netsignObj.getBuyeridcard());
		Client b = clientMapper.findByNameAndIdcard(buyer);
		if(b==null) {
			throw new RuntimeException("购房者信息不正确");
		}
		Client seller=new Client();
		seller.setClientname(netsignObj.getSellername());
		seller.setIdcard(netsignObj.getSelleridcard());
		Client s = clientMapper.findByNameAndIdcard(seller);
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
	public void success(Integer netid) {
		Netsign netsign = netsignMapper.selectByPrimaryKey(netid);
		netsign.setNetstatus(true);
		netsignMapper.updateByPrimaryKeySelective(netsign);
	}

	@Override
	public Netsign findByNetid(Integer netid) {
		Netsign netsign = netsignMapper.selectByPrimaryKey(netid);
		return netsign;
	}

}
