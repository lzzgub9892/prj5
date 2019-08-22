package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.entity.Room;
import com.woniu.mapper.RoomMapper;
import com.woniu.service.IRegistertorService;

@Service
public class RegistertorServiceImpl implements IRegistertorService {

	@Resource
	private RoomMapper roomMapper;
	
	@Transactional(readOnly = true)
	@Override
	public Room findByRoomId(Integer roomid) {
		// TODO Auto-generated method stub
		return roomMapper.selectByPrimaryKey(roomid);
	}

	@Override
	public List<Room> findAll() {
		// TODO Auto-generated method stub
		return roomMapper.selectByExample(null);
	}

}
