package com.woniu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.entity.Room;
import com.woniu.mapper.RoomMapper;
import com.woniu.service.IRegisterService;

@Service
public class RegisterServiceImpl implements IRegisterService {

	@Resource
	private RoomMapper roomMapper;
	
	@Transactional(readOnly = true)
	@Override
	public Room findByRoomId(Integer roomid) {
		// TODO Auto-generated method stub
		return roomMapper.selectByPrimaryKey(roomid);
	}

}
