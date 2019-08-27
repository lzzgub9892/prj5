package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Roomstatus;
import com.woniu.mapper.RoomstatusMapper;
import com.woniu.service.IRoomstatusService;

@Service
public class RoomstatusServiceImpl implements IRoomstatusService{
	
	@Resource
	private RoomstatusMapper roomstatusMapper;

	@Override
	public Roomstatus findById(int roomstatusid) {
		return roomstatusMapper.selectByPrimaryKey(roomstatusid);
	}

	@Override
	public List<Roomstatus> findAll() {
		return roomstatusMapper.selectByExample(null);
	}

	
}
