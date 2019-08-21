package com.woniu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.entity.Registertemporary;
import com.woniu.entity.Servicesharetemporary;
import com.woniu.mapper.RegistertemporaryMapper;
import com.woniu.mapper.ServicesharetemporaryMapper;
import com.woniu.service.IRegisterService;



@Service
@Transactional
public class RegisterserviceImpl implements IRegisterService {
	
	@Resource
	private RegistertemporaryMapper registertemporaryMapper;
	
	@Resource
	private ServicesharetemporaryMapper servicesharetemporaryMapper;
	

	@Override
	public void save(Registertemporary regi, Servicesharetemporary sst) {
		// TODO Auto-generated method stub
		registertemporaryMapper.insertSelective(regi);
		int rtid = regi.getRtid();
		System.out.println(rtid);
		sst.setRtid(rtid);
		servicesharetemporaryMapper.insertSelective(sst);
	}

}
