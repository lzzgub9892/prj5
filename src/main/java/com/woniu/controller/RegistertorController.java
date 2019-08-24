package com.woniu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.entity.PageBean;
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
		Room room = registertorServiceImpl.findByRoomId(roomid);
		System.out.println(room.getOwnerships());
		if (room!=null) {
			if (room.getOwnerships().size()==0) {
				return "/admin/registertor/mieji";
			}else {
				map.put("room", room);
			}
		}else {
			return "/admin/registertor/index";
		}
		return "/admin/registertor/dengjibu";
	}
	
	@RequestMapping("findAll")
	public String findAll(ModelMap map,PageBean pageBean) {
		List<Room> roomList = registertorServiceImpl.findAll(pageBean);
		map.put("roomList", roomList);
		map.put("page", pageBean);
		return "/admin/registertor/list_dengjibu";
	}
	
	//灭籍
	@RequestMapping("deleteByRoomId")
	public String deleteByRoomId(Integer roomid) {
		registertorServiceImpl.deleteByRoomId(roomid);
		return "redirect:findAll";
	}
}
