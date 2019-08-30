package com.woniu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.entity.Client;
import com.woniu.entity.Servicetype;
import com.woniu.mapper.ServicetypeMapper;
import com.woniu.service.IClientService;
import com.woniu.service.IServicetypeService;

@Controller
@RequestMapping("admin")
public class ServicetypeController {

	@Resource
	private IServicetypeService servicetypeServiceImpl;
	@Resource
	private ServicetypeMapper servicetypemapper;
	@Resource
	private IClientService clientServiceImpl;
	
	@RequestMapping("getServicetype")
	public String getServicetype() {
		Servicetype servicetypes=servicetypemapper.selectByPrimaryKey(1);
		System.out.println(servicetypes);
//		map.put("servicetypes",servicetypes);
		return "admin/regeditservice/suoyouquan";
	}
	
	@RequestMapping("findAllServicetype")
	public @ResponseBody Map findAll(int clientid) {
		System.out.println("ServicetypeController.findAll()");
		Map map=new HashMap();
		List<Servicetype> servicetypes=servicetypeServiceImpl.findAll();
		System.out.println(servicetypes);
		Client client=clientServiceImpl.findByClientid(clientid);
		map.put("servicetypes",servicetypes);
		map.put("client",client);
		return map;
	}
}
