package com.woniu.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Registertemporary;
import com.woniu.entity.Servicesharetemporary;
import com.woniu.service.IRegisterService;
import com.woniu.service.impl.RegisterserviceImpl;

@Controller
@RequestMapping("/admin/register")
public class RegisterController {
	
	@Resource
	private IRegisterService registerservice;
	
	
	@RequestMapping("save")
	public String save(Registertemporary regi, Servicesharetemporary sst,HttpServletRequest req) {
		System.out.println("RegisterController.save()");
		if(regi.getAgentidcard().equals("")||sst.getShareidcard().equals("")) {
			System.out.println("====================================");
			req.setAttribute("error", "信息不足，请补充");
			return "admin/register/ruku";
		}
		registerservice.save(regi, sst);
		return "admin/register/ruku"; 
	}
	
	
}


