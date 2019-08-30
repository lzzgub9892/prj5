package com.woniu.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniu.entity.Midservice;
import com.woniu.entity.MidserviceExample;
import com.woniu.entity.MidserviceExample.Criteria;
import com.woniu.entity.PageBean;
import com.woniu.mapper.MidserviceMapper;
import com.woniu.service.IMidserviceService;

@Service
public class MidserviceServiceImpl implements IMidserviceService {
	
	@Resource
	private MidserviceMapper midserviceMapper;

	@Override
	public void save(Midservice midservice) {
		midserviceMapper.insert(midservice);
	}

	@Override
	public List<Midservice> findAll() {
		return midserviceMapper.selectByExample(null);
	}

	@Override
	public List<Midservice> findByPage(PageBean pb,Midservice midservice,Date d1,Date d2) {
		MidserviceExample example=new MidserviceExample();
		Criteria c=example.createCriteria();
		if(midservice.getProposer()!=null&&!midservice.getProposer().equals(""))
			c.andProposerEqualTo(midservice.getProposer());
		if(midservice.getIdcard()!=null&&!midservice.getIdcard().equals(""))
			c.andIdcardEqualTo(midservice.getIdcard());
//		if(midservice.getServicetypeid()!=null)
//			c.andServicetypeidEqualTo(midservice.getServicetypeid());
//		if(midservice.getServicestatusid()!=null)
//			c.andServicestatusidEqualTo(midservice.getServicestatusid());
		if(d1!=null&&d2!=null) {
			c.andProcesstimeGreaterThan(d1);
			c.andProcesstimeLessThanOrEqualTo(d2);
		}
		int count=midserviceMapper.countByExample(example);
		pb.setCount(count);
		List<Midservice> list=midserviceMapper.selectByExample(example,new RowBounds(pb.getOffset(),pb.getLimit()));
		System.out.println(list);
		return list;
	}

}
