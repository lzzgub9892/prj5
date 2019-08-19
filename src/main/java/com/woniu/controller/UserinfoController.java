package com.woniu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Userinfo;
import com.woniu.service.IRoleService;
import com.woniu.service.IUserinfoService;

@Controller
@RequestMapping("/admin/userinfo/")
public class UserinfoController {
	@Resource
	private IUserinfoService userinfoServiceImpl;
	@Resource
	private IRoleService roleServiceImpl;
	
	@RequestMapping("save")
	public String save(Userinfo info,Integer[] chk,ModelMap map) {
		userinfoServiceImpl.save(info, chk);
		return "redirect:findAll";
	}
	@RequestMapping("update")
	public String update(Userinfo info,Integer[] chk,ModelMap map) {
		userinfoServiceImpl.update(info, chk);
		return "redirect:findAll";
	}
	@RequestMapping("delete")
	public String delete(Integer uid) {
		userinfoServiceImpl.delete(uid);
		return "redirect:findAll";
	}
	
	@RequestMapping("revoke")
	public String revoke(Integer uid) {
		userinfoServiceImpl.revoke(uid);
		return "redirect:findAll";
	}
	
	@RequestMapping("findAll")
	public String findAll(ModelMap map) {
		List list = userinfoServiceImpl.findAll();
		map.put("list", list);
		return "/admin/userinfo/list";
	}
	
	@RequestMapping("findById")
	public String findById(Integer uid,ModelMap map) {
		Userinfo info = userinfoServiceImpl.findById(uid);
		map.put("userinfo", info);
		return "forward:goInput";
	}
	
	@RequestMapping("goInput")
	public String goInput(ModelMap map) {
		List roles = roleServiceImpl.findAll();
		map.put("roles", roles);
		return "/admin/userinfo/input";
	}
}
