package com.woniu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.entity.House;
import com.woniu.service.IhouseService;

@RestController
@RequestMapping("admin/houses")
public class HouseController {
 
	@Resource
	private IhouseService houseServiceImpl;
	
	@RequestMapping("/findall")
	@ResponseBody
	public List<House> findall() {
		List<House> list = houseServiceImpl.findall();
		return list;
	}
}
