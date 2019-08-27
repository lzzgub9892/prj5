package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Ownership;
import com.woniu.mapper.OwnershipMapper;
import com.woniu.service.IOwnershipService;

@Service
public class OwnershipServiceImpl implements IOwnershipService{

	@Resource
	private OwnershipMapper ownershipmapper;
	
	@Override
	public List<Ownership> findByClientid(Integer clientid) {
		return ownershipmapper.findByClientid(clientid);
	}

	@Override
	public Ownership findByServicenumber(String servicenumber) {
		return ownershipmapper.findByServicenumber(servicenumber);
	}

}
