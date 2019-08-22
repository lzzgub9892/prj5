package com.woniu.service;

import java.util.List;

import com.woniu.entity.Room;

public interface IRegistertorService {
	Room findByRoomId(Integer roomid);
	List<Room> findAll();
}
