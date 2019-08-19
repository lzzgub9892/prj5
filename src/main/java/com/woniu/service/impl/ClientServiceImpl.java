package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Client;
import com.woniu.mapper.ClientMapper;
import com.woniu.service.IclientService;
@Service
public class ClientServiceImpl implements IclientService {
    @Resource
    private ClientMapper clientMapper;
	@Override
	public List<Client> findall() {
		// TODO Auto-generated method stub
		return clientMapper.selectByExample(null);
	}

}
