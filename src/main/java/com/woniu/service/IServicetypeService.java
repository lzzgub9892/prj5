package com.woniu.service;

import java.util.List;

import com.woniu.entity.Servicetype;

public interface IServicetypeService {
	
	List<Servicetype> findByPid(Integer pid);
	
	List<Servicetype> findAll();
	
	
}
