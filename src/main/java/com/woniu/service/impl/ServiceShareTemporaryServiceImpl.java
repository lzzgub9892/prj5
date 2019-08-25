package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Servicesharetemporary;
import com.woniu.entity.ServicesharetemporaryExample;
import com.woniu.mapper.ServicesharetemporaryMapper;
import com.woniu.service.IServiceShareTemporaryService;

@Service
public class ServiceShareTemporaryServiceImpl implements IServiceShareTemporaryService {

	@Resource
	private ServicesharetemporaryMapper serviceShareTemporaryMapper;
	
	@Override
	public List<Servicesharetemporary> findByRegistertemporary(Integer rtid) {
		// TODO Auto-generated method stub
		System.out.println(rtid+"---------------------------------------");
		if(rtid!=null) {
		ServicesharetemporaryExample example = new ServicesharetemporaryExample();
		example.createCriteria().andRtidEqualTo(rtid);
		List<Servicesharetemporary> list = serviceShareTemporaryMapper.selectByExample(example);
		return list;
		}
		return null;
	}

}
