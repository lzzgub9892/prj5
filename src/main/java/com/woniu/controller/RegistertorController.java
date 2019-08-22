package com.woniu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import com.woniu.entity.Room;
import com.woniu.service.IRegistertorService;
import com.woniu.service.impl.RegistertorServiceImpl;

@Controller
@RequestMapping("/admin/registertor/")
public class RegistertorController {

	@Resource
	private IRegistertorService registertorServiceImpl;
	
	
	@RequestMapping("findByRoomId")
	public String findByRoomId(Integer roomid,ModelMap map) {
		System.out.println(roomid+"llllllllllllllllllllllllll");
		Room room = registertorServiceImpl.findByRoomId(roomid);
		map.put("room", room);
		return "/admin/registertor/dengjibu";
	}
	
	@RequestMapping("findAll")
	public String findAll(ModelMap map) {
		List<Room> roomList = registertorServiceImpl.findAll();
		map.put("roomList", roomList);
		return "/admin/registertor/list_dengjibu";
	}
}
