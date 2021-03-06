package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.entity.Registertemporary;
import com.woniu.entity.Servicesharetemporary;
import com.woniu.entity.ServicesharetemporaryModel;
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
	public void save(Registertemporary regi, ServicesharetemporaryModel ssts,String info) {
		// TODO Auto-generated method stub
		registertemporaryMapper.insert(regi);
		
		System.out.println(regi.getRtid()+"=============================================");
		List<Servicesharetemporary> list = ssts.getServicesharetemporarys();
		for (Servicesharetemporary sst : list) {
			if(!sst.getSharename().equals("")) {
			sst.setRtid(regi.getRtid());
			servicesharetemporaryMapper.insertSelective(sst);
			}
		}
	}


	@Override
	public List<Registertemporary> findAll() {
		// TODO Auto-generated method stub
		List<Registertemporary> list = registertemporaryMapper.selectByExample(null);
		return list;
	}


	@Override
	public Registertemporary findOne(Integer id) {
		// TODO Auto-generated method stub
		return registertemporaryMapper.selectByPrimaryKey(id);
	}


	@Override
	public void update(Integer rtid) {
		// TODO Auto-generated method stub
		
	}

}
