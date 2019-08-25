package com.woniu.service;

import java.util.List;

import com.woniu.entity.Registertemporary;
import com.woniu.entity.Servicesharetemporary;
import com.woniu.entity.ServicesharetemporaryModel;

public interface IRegisterService {
	
	
	void save(Registertemporary regi,ServicesharetemporaryModel ssts,String info);
	List<Registertemporary> findAll();
	Registertemporary findOne(Integer id);

}
