package com.woniu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Service;
import com.woniu.service.IServiceService;

@Controller
@RequestMapping("admin")
public class ServiceController {
	
	@Resource
	private IServiceService serviceServiceImpl;
	
	@RequestMapping("findAll")
	public String findAll(HttpServletRequest request) {
		List<Service> list=serviceServiceImpl.findAll();
		request.setAttribute("services",list);
		return "admin/regeditservice/list_shouli";
	}
}
