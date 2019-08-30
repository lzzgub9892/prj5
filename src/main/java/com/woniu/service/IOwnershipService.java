package com.woniu.service;

import java.util.List;

import com.woniu.entity.Ownership;

public interface IOwnershipService {
	List<Ownership> findByClientid(Integer clientid);
	List<Ownership> findByHid(Integer hid);
	Ownership findByServicenumber(String servicenumber);
}
