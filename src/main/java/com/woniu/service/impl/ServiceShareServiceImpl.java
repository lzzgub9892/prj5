package com.woniu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Serviceshare;
import com.woniu.entity.Sharetype;
import com.woniu.mapper.ClientMapper;
import com.woniu.mapper.ServiceshareMapper;
import com.woniu.mapper.SharetypeMapper;
import com.woniu.service.IserviceshareService;
@Service
public class ServiceShareServiceImpl implements IserviceshareService {
    //这是共有人表的mapper
	@Resource
	private ServiceshareMapper serviceshareMapper;
    //这是共有人类型的mapper
	
	@Override
	public void save(Serviceshare serviceshare) {
        serviceshareMapper.insert(serviceshare);
	}

}
