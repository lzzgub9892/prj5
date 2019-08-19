package com.woniu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.service.IProvinceService;

@RestController
@RequestMapping("/admin/province")
public class ProvinceController {
	@Resource
	private IProvinceService provinceServiceImpl;
	
	@RequestMapping("findAll")
	public List findAll() {
		ObjectMapper objectMapper = new ObjectMapper();
		List list = provinceServiceImpl.findAll();
		return list;
	}
}
