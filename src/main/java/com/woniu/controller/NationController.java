package com.woniu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.service.INationService;

@RestController
@RequestMapping("/admin/nation/")
public class NationController {
	@Resource
	private INationService nationService;
	
	@RequestMapping("findByNation")
	public List findByNation(String nation) {
		if(nation!=null)
			return nationService.findByNation(nation);
		return null;
	}
}
