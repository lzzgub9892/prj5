package com.woniu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Servicetype;
import com.woniu.service.IServicetypeService;

@Controller
@RequestMapping("admin")
public class ServicetypeController {

	@Resource
	private IServicetypeService servicetypeServiceImpl;
	
	@RequestMapping("getServicetype")
	public String getServicetype(String tname,HttpServletRequest request) {
		System.out.println(tname);
		List<Servicetype> all=servicetypeServiceImpl.findAll();
		List<Servicetype> servicetypes=null;
		if(tname!=null) {
			for (Servicetype servicetype : all) {
				if(tname.equals(servicetype.getServicetype())) {
					int pid=servicetype.getServicetypeid();
					servicetypes=servicetypeServiceImpl.findByPid(pid);
					request.setAttribute("servicetypes",servicetypes);
					break;
				}
			}
		}
		System.out.println(servicetypes);
		return "admin/regeditservice/suoyouquan";
	}
}
