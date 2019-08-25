package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Servicetype;
import com.woniu.entity.ServicetypeExample;
import com.woniu.mapper.ServicetypeMapper;
import com.woniu.service.IServicetypeService;

@Service
public class ServicetypeServiceImpl implements IServicetypeService {

	@Resource
	private ServicetypeMapper servicetypeMapper;
	
	@Override
	public List<Servicetype> findByPid(Integer pid) {
		return servicetypeMapper.findByPid(pid);
	}

	@Override
	public List<Servicetype> findAll() {
		return servicetypeMapper.selectByExample(null);
	}

	

}
