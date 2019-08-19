package com.woniu.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Client;
import com.woniu.entity.ClientExample;
import com.woniu.entity.ClientExample.Criteria;
import com.woniu.mapper.ClientMapper;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.service.IClientService;


@Service
@Transactional
public class ClientServiceImpl implements IClientService{
	
	@Resource
	private ClientMapper clientMapper;
	
	
	//增加客户
	@Override
	public void save(Client client) {
		// TODO Auto-generated method stub
		clientMapper.insertSelective(client);
	}
	
	//修改各户信息
	@Override
	public void update(Client client) {
		// TODO Auto-generated method stub
		clientMapper.updateByPrimaryKeySelective(client);
	}
	
	//通过主键找到客户
	@Override
	public Client findByClientid(Integer clientid) {
		// TODO Auto-generated method stub
		return clientMapper.selectByPrimaryKey(clientid);
	}
	
	//通过姓名和身份证找到客户
	@Override
	public Client findByCilentnameIdcard(String clientname, String idcard) {
		// TODO Auto-generated method stub
		ClientExample example = new ClientExample();
		Criteria criteria = example.createCriteria();
		criteria.andClientnameEqualTo(clientname);
		criteria.andIdcardEqualTo(idcard);
		List<Client> client = clientMapper.selectByExample(example);
		return client.get(0);

	}
	
	//查询所有客户
	@Override
	public List<Client> findall() {
		// TODO Auto-generated method stub
		return clientMapper.selectByExample(null);
	}
}
