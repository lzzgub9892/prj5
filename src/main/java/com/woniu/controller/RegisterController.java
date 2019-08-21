package com.woniu.controller;

import javax.annotation.Resource;

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
	public String save(Registertemporary regi, Servicesharetemporary sst,ModelMap map) {
		if(regi==null||sst==null) {
			map.put("error", "信息不足，请补充");
			return "/ruku";
		}
		registerservice.save(regi, sst);
		return "/ruku";
	}
	
	
}

