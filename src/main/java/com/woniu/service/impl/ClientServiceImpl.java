package com.woniu.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Client;
import com.woniu.mapper.ClientMapper;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.service.IClientService;


@Service
@Transactional
public class ClientServiceImpl implements IClientService{
	
	@Resource
	private ClientMapper clientMapper;

	@Override
	public void save(Client client) {
		// TODO Auto-generated method stub
		clientMapper.insertSelective(client);
	}

	@Override
	public void update(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client findByClientid(Integer clientid) {
		// TODO Auto-generated method stub
		return clientMapper.selectByPrimaryKey(clientid);
	}

	@Override
	public Client findByCilentnameIdcard(String clientname, String idcard) {
		// TODO Auto-generated method stub
		return null;

	}
	
	@Override
	public List<Client> findall() {
		// TODO Auto-generated method stub
		return clientMapper.selectByExample(null);
	}
}
