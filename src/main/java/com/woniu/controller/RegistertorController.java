package com.woniu.controller;

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
		Room room = registertorServiceImpl.findByRoomId(1);
		map.put("room", room);
		return "/admin/registertor/dengjibu";
	}
}
