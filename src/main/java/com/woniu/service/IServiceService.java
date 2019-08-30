package com.woniu.service;

import java.util.List;

import com.woniu.entity.Service;

public interface IServiceService {
	void save(Service service);
	
	List<Service> findAll();
	List<Service> findByServicestatus(Integer servicestatus);
}
