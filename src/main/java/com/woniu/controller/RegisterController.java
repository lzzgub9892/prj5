package com.woniu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import com.woniu.entity.Room;
import com.woniu.service.IRegisterService;
import com.woniu.service.impl.RegisterServiceImpl;

@Controller
@RequestMapping("/admin/register/")
public class RegisterController {

	@Resource
	private IRegisterService RegisterServiceImpl;
	
	
	@RequestMapping("findByRoomId")
	public String findByRoomId(Integer roomid,ModelMap map) {
		Room room = RegisterServiceImpl.findByRoomId(1);
		map.put("room", room);
		return "/admin/register/dengjibu";
	}
}
