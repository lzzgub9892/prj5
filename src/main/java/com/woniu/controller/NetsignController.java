package com.woniu.controller;

import java.io.IOException;
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

@RequestMapping("/admin/netsign/")
@RestController
public class NetsignController {
	
	@Resource
	private INetsignService netsignServiceImpl;
	
	@RequestMapping("register")
	public String register(NetsignObj netsignObj) {
		netsignServiceImpl.save(netsignObj);
		return null;
	}
	
	@RequestMapping("findByPage")
	public Map findByPage(PageBean pageBean) {
		Map map=new HashMap<String, Object>();
		List<Netsign> list = netsignServiceImpl.findByPage(pageBean);
		map.put("list", list);
		map.put("page", pageBean);
		return map;
	}
	
	@RequestMapping("examineInput")
	public ModelAndView examineInput(Integer netid,HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("!!!!!!!!!!!!!");
		Map map=new HashMap<String, Object>();
		map.put("netid", netid);
//		request.getRequestDispatcher("/admin/netsign/examine.jsp");
//		response.sendRedirect("/admin/netsign/examine.jsp");
		ModelAndView mav=new ModelAndView("admin/netsign/examine");
		return mav;
	}
	
	
	
}
