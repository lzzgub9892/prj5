package com.woniu.service;

import java.util.Date;
import java.util.List;

import com.woniu.entity.Midservice;
import com.woniu.entity.PageBean;

public interface IMidserviceService {
	void save(Midservice midservice);
	List<Midservice> findAll();
	List<Midservice> findByPage(PageBean pb,Midservice midservice,Date d1,Date d2);
}
