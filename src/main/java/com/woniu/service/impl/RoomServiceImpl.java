package com.woniu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.entity.Room;
import com.woniu.mapper.BuildingMapper;
import com.woniu.mapper.RoomMapper;
import com.woniu.service.IRoomService;
@Service
public class RoomServiceImpl implements IRoomService {

	@Resource
	private RoomMapper roomMapper;
	@Resource
	private BuildingMapper buildingMapper;
	
	@Override
	@Transactional(readOnly = true)
	public Room findByRoomId(Integer roomid) {
		// TODO Auto-generated method stub
		return roomMapper.selectByPrimaryKey(roomid);
	}

	

}
