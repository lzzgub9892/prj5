package com.woniu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.entity.NetsignObj;
import com.woniu.service.INetsignService;

@RequestMapping("/admin/examine/netsign/")
@Controller
public class NetsignController {
	
	@Resource
	private INetsignService netsignServiceImpl;
	
	public String register(NetsignObj netsignObj) {
		netsignServiceImpl.save(netsignObj);
		return null;
	}
	
}
