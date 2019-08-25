package com.woniu.service;

import java.util.List;

import com.woniu.entity.Servicesharetemporary;

public interface IServiceShareTemporaryService {
	
	
	List<Servicesharetemporary> findByRegistertemporary(Integer rtid);

}
