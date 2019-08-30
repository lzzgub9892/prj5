package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.woniu.entity.Client;
import com.woniu.entity.Service;
import com.woniu.entity.ServiceExample;
import com.woniu.entity.Servicestatus;
import com.woniu.entity.Servicetype;
import com.woniu.mapper.ClientMapper;
import com.woniu.mapper.ServiceMapper;
import com.woniu.mapper.ServicestatusMapper;
import com.woniu.mapper.ServicetypeMapper;
import com.woniu.service.IServiceService;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements IServiceService {
	
	@Resource
	private ServiceMapper serviceMapper;
	
	@Resource
	private ServicetypeMapper servicetypeMapper;
	
	@Resource
	private ServicestatusMapper servicestatusMapper;
	
	@Resource
	private ClientMapper clientmapper;

	@Override
	public void save(com.woniu.entity.Service service) {
		serviceMapper.insert(service);
	}

	@Override
	public List<com.woniu.entity.Service> findAll() {
		return serviceMapper.selectByExample(null);
	}

	@Override
	public List<com.woniu.entity.Service> findByServicestatus(Integer servicestatus) {
		// TODO Auto-generated method stub
		ServiceExample example = new ServiceExample();
		example.createCriteria().andServicestatusidEqualTo(servicestatus);
		List<com.woniu.entity.Service> list = serviceMapper.selectByExample(example);
		for (Service service : list) {
			int servicetypeid = service.getServicetypeid();
			Servicetype servicetype = servicetypeMapper.findByServicetypeid(servicetypeid);
			int servicestatusid = service.getServicestatusid();
			Servicestatus servicestatuss = servicestatusMapper.findByservicestatusid(servicestatusid);
			Integer shenqingid = service.getProposer();
			Client shenqingren = clientmapper.findById(shenqingid);
			service.setServicetype(servicetype);
			service.setServicestatus(servicestatuss);
			service.setShenqingclient(shenqingren);
		}
		
		return list;
	}

}
