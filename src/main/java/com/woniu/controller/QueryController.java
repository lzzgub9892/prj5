package com.woniu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Client;
import com.woniu.entity.House;
import com.woniu.entity.Ownership;
import com.woniu.mapper.ClientMapper;
import com.woniu.mapper.HouseMapper;
import com.woniu.service.IClientService;
import com.woniu.service.IOwnershipService;
import com.woniu.service.IServiceService;

@Controller
@RequestMapping("admin")
public class QueryController {
	
	@Resource
	private IServiceService serviceServiceImpl;
	@Resource
	private IOwnershipService ownershipServiceImpl;
	@Resource
	private HouseMapper housemapper;
	@Resource
	private ClientMapper clientmapper;
	@Resource
	private IClientService clientServiceImpl;
	
	@RequestMapping("findStart")
	public String findStart(String servicetype,String servicenumber,ModelMap map,Client client) {
		System.out.println("QueryController.findStart()");
		if(servicenumber!=null&&!servicenumber.equals("")) {
			findByServiceNumber(servicenumber,map);
		}else if(client.getClientname()!=null&&client.getIdcard()!=null) {
			System.out.println(client+"1111111111111111111111"); 
			Client clilent =clientServiceImpl.findByCilentnameIdcard(client.getClientname(),client.getIdcard());
			System.out.println(client+"222222222222222222222"); 
			findByClient(client,map);
		}
			 
		return "admin/query/querylist";
	}
	
	@RequestMapping("findByServiceType")
	public void findByServiceType(String servicetype) {
		
		System.out.println("QueryController.findByServiceType()");
//		return "admin/registertor/querylist";
	}

//	@RequestMapping("findByServiceNumber")
	public String findByServiceNumber(String servicenumber,ModelMap map) {
		Ownership ownership=ownershipServiceImpl.findByServicenumber(servicenumber);
		House house=housemapper.findByServicenumber(servicenumber);
		List<Ownership> ownerships=new ArrayList<>();
		List<House> houses=new ArrayList<>();
		ownerships.add(ownership);
		houses.add(house);
		map.put("ownerships",ownerships);
		map.put("houses",houses);
		
		System.out.println("QueryController.findByServiceNumber()");
		return "admin/query/querylist";
	}
	
	public void findByClient(Client client,ModelMap map) {
		System.out.println("QueryController.findByClient()11111111111111111111111111111");
		List<Ownership> ownerships=ownershipServiceImpl.findByClientid(client.getClientid());
		List<House> houses=new ArrayList<>();
		for (Ownership ownership : ownerships) {
			House house=housemapper.findByServicenumber(ownership.getServicenumber());
			houses.add(house);
		}
		map.put("ownerships",ownerships);
		map.put("houses",houses);
	}
}
