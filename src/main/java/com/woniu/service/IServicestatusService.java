package com.woniu.service;

import java.util.List;

import com.woniu.entity.Servicestatus;

public interface IServicestatusService {
	List<Servicestatus> findAll();

	Servicestatus findByName(String servicestatus);
}
