package com.woniu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.entity.Log;
import com.woniu.entity.PageBean;
import com.woniu.service.ILogService;

@RequestMapping("/admin/log/")
@Controller
public class LogController {
	@Resource
	private ILogService logServiceImpl;
	
	@RequestMapping("findAll")
	public String findAll(Log log,PageBean pageBean,ModelMap map) {
		List list = logServiceImpl.findAll(log,pageBean);
		map.put("list", list);
		map.put("page", pageBean);
		map.put("log", log);
		return "/admin/log/list";
	}
	
	@RequestMapping("findJSON")
	public @ResponseBody Map findAll(Log log,PageBean pageBean) {
		Map map = new HashMap();
		List list = logServiceImpl.findAll(log,pageBean);
		map.put("list", list);
		map.put("page", pageBean);
		map.put("log", log);
		return map;
	}
	
	@RequestMapping("delete")
	public String delete(Integer id) {
		logServiceImpl.delete(id);
		return "redirect:findAll";
	}
	
}
