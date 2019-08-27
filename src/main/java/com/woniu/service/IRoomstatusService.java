package com.woniu.service;

import java.util.List;

import com.woniu.entity.Roomstatus;

public interface IRoomstatusService {
	Roomstatus findById(int roomstatusid);
	List<Roomstatus> findAll();
}
