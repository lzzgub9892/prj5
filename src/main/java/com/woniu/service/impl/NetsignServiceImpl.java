package com.woniu.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Netsign;
import com.woniu.entity.NetsignObj;
import com.woniu.mapper.NetsignMapper;
import com.woniu.service.INetsignService;

@Service
public class NetsignServiceImpl implements INetsignService {
	
	@Resource
	private NetsignMapper netsignMapper;

	@Override
	public void save(NetsignObj netsignObj) {
		Netsign netsign=new Netsign();
		netsign.setNetstatus(false);
		netsign.setNettime(new Date());
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
