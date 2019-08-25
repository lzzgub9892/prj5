package com.woniu.service;

import java.util.List;

import com.woniu.entity.Indept;
import com.woniu.entity.PageBean;

public interface IIndeptService {

	void save(Indept indept);
	void delete(Integer indeptid);
	void update(Indept indept);
	Indept findOne(Integer indeptid);
	List<Indept> findAll(PageBean pb);
}
