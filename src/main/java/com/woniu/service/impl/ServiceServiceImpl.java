package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.ServiceMapper;
import com.woniu.service.IServiceService;

@Service
public class ServiceServiceImpl implements IServiceService {
	
	@Resource
	private ServiceMapper serviceMapper;

	@Override
	public void save(com.woniu.entity.Service service) {
		serviceMapper.insert(service);
	}

	@Override
	public List<com.woniu.entity.Service> findAll() {
		return serviceMapper.selectByExample(null);
	}

}
