package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Servicestatus;
import com.woniu.mapper.ServicestatusMapper;
import com.woniu.service.IServicestatusService;

@Service
public class ServicestatusServiceImpl implements IServicestatusService {

	@Resource
	private ServicestatusMapper servicestatusMapper;
	
	@Override
	public List<Servicestatus> findAll() {
		return servicestatusMapper.selectByExample(null);
	}

	@Override
	public Servicestatus findByName(String servicestatus) {
		return servicestatusMapper.findByName(servicestatus);
	}

}
