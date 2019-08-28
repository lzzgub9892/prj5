package com.woniu.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.woniu.entity.Netsign;
import com.woniu.entity.NetsignObj;
import com.woniu.entity.PageBean;
import com.woniu.service.INetsignService;
import com.woniu.service.IRoomService;

@RequestMapping("/admin/netsign/")
@RestController
public class NetsignController {
	
	@Resource
	private INetsignService netsignServiceImpl;
	
	
	@RequestMapping("register")
	public Map register(NetsignObj netsignObj) {
		Map<String, Object> map=new HashMap();
		try {
			netsignServiceImpl.save(netsignObj);
		} catch (Exception e) {
			map.put("message", e.getMessage());
		}
		return map;
	}
	@RequestMapping("findSuccess")
	public Map findSuccess(PageBean pageBean) throws ParseException {
		Map<String, Object> map=new HashMap();
		List<Netsign> list = netsignServiceImpl.findByPageAndSuccess(pageBean);
		map.put("list", list);
		map.put("page", pageBean);
		return map;
	}
	
	@RequestMapping("findByPage")
	public Map findByPage(PageBean pageBean) throws ParseException {
		Map<String, Object> map=new HashMap();
		List<Netsign> list = netsignServiceImpl.findByPage(pageBean);
		map.put("list", list);
		map.put("page", pageBean);
		return map;
	}
	
	
	@RequestMapping("examineInput")
	public Map netsiginInput(Integer netid){
		Map<String, Object> map=new HashMap();
		Netsign netsign = netsignServiceImpl.findByNetid(netid);
		map.put("netsign", netsign);
		return map;
	}
	
	@RequestMapping("examine")
	public Map examine(Integer netid){
		Map<String, Object> map=new HashMap();
		try {
			netsignServiceImpl.examine(netid);
		} catch (Exception e) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println( e.getMessage());
			map.put("message", e.getMessage());
		}
		return map;
	}
	
	@RequestMapping("query")
	public Map query(String netnumber){
		Netsign netsign = netsignServiceImpl.findByNetnumber(netnumber);
		Map<String, Object> map=new HashMap();
		map.put("netsign", netsign);
		if(netsign==null) {
			map.put("message", "该网签不存在");
		}
		return map;
	}
	
	
	
}
