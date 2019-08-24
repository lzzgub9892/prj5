package com.woniu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.entity.Building;
import com.woniu.entity.House;
import com.woniu.service.IbuildingService;
import com.woniu.service.IhouseService;
@SuppressWarnings("rawtypes")
@RestController
@RequestMapping("admin/house")
public class HouseController {
	@Resource
	private IhouseService houseServiceImpl;
	@Resource
	private IbuildingService buildingServiceImpl;
	@SuppressWarnings("unchecked")
	@RequestMapping("/findall")
	@ResponseBody
    public List findall() {
		List list = houseServiceImpl.findall();
		return list;
	}
	@RequestMapping("findbuilding")
    public Map findbuilding(Integer hid) {
		Map<String,Object> map=new HashMap<String, Object>();
		int id = Integer.valueOf(hid).intValue();
		House house = houseServiceImpl.findone(hid);
//		根据前台传过来的hid 查出楼盘对应的楼栋信息
		List<Building> building = buildingServiceImpl.findbyhid(hid);
		map.put("house", house);
		map.put("building", building);
		return map;
	}
	
}
