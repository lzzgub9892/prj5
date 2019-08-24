package com.woniu.service;

import java.util.List;

import com.woniu.entity.Registertemporary;
import com.woniu.entity.Servicesharetemporary;

public interface IRegisterService {
	
	
	void save(Registertemporary regi,Servicesharetemporary sst,String info);
	List<Registertemporary> findAll();

}
