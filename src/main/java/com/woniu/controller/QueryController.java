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
import com.woniu.service.IClientService;
import com.woniu.service.IOwnershipService;
import com.woniu.service.IServiceService;
import com.woniu.service.IhouseService;

@Controller
@RequestMapping("admin")
public class QueryController {
	
	@Resource
	private IServiceService serviceServiceImpl;
	@Resource
	private IOwnershipService ownershipServiceImpl;
	@Resource
	private IhouseService houseServiceImpl;
	@Resource
	private IClientService clientServiceImpl;
	
	@RequestMapping("findStart")
	public String findStart(String servicetype,String servicenumber,ModelMap map,Client client,House house,String lnname,String location,String bsname,String bname) {
		if(servicenumber!=null&&!servicenumber.equals("")) {
			findByServiceNumber(servicenumber,map);
		}else if(client.getClientname()!=null&&!client.getClientname().equals("")&&client.getIdcard()!=null&&!client.getIdcard().equals("")) {
			client =clientServiceImpl.findByCilentnameIdcard(client.getClientname(),client.getIdcard());
			System.out.println(client+"========================");
			findByClient(client,map);
		}else
		findByHid(map,lnname,location,bsname,bname);
//		else if() {}
			 
		return "admin/query/querylist";
	}
	
	public void findByServiceType(String servicetype) {
		
	}

	public String findByServiceNumber(String servicenumber,ModelMap map) {
		Ownership ownership=ownershipServiceImpl.findByServicenumber(servicenumber);
		List<Ownership> ownerships=new ArrayList<>();
		ownerships.add(ownership);
		map.put("ownerships",ownerships);
		return "admin/query/querylist";
	}
	
	public void findByClient(Client client,ModelMap map) {
		System.out.println("QueryController.findByClient()");
		List<Ownership> ownerships=ownershipServiceImpl.findByClientid(client.getClientid());
		map.put("ownerships",ownerships);
	}
	
	public void findByHid(ModelMap map,String lnname,String location,String bsname,String bname) {
		House h=houseServiceImpl.findByllbb(lnname,location,bsname,bname);
		List<Ownership> ownerships = ownershipServiceImpl.findByHid(h.getHid());
		map.put("ownerships",ownerships);
	}
}
