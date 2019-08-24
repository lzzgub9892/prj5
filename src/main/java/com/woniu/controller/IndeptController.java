package com.woniu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.entity.Indept;
import com.woniu.entity.Message;
import com.woniu.entity.PageBean;
import com.woniu.service.IIndeptService;
import com.woniu.service.impl.IndeptServiceImpl;

@Controller
@RequestMapping("/admin/indept/")
public class IndeptController {

	@Resource
	private IIndeptService indeptServiceImpl;
	
	@RequestMapping("save")
	public @ResponseBody Message save(Indept indept) {
		Message msg=null;
		try {
			indeptServiceImpl.save(indept);
			msg=new Message(true, "机构添加成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			msg=new Message(false, "机构添加失败"+e.getMessage());
		}
		return msg;
	}
	
	@RequestMapping("delete")
	public @ResponseBody Message delete(Integer indeptid) {
		Message msg=null;
		try {
			indeptServiceImpl.delete(indeptid);
			msg=new Message(true, "机构删除成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			msg=new Message(false, "机构删除失败"+e.getMessage());
		}
		return msg;
	}
	@RequestMapping("update")
	public @ResponseBody Message update(Indept indept) {
		Message msg=null;
		try {
			indeptServiceImpl.update(indept);
			msg=new Message(true, "机构修改成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			msg=new Message(false, "机构修改失败"+e.getMessage());
		}
		return msg;
	}
	@RequestMapping("findById")
	public @ResponseBody Indept findById(Integer indeptid) {
		Indept indept = indeptServiceImpl.findOne(indeptid);
		return indept;
	}
	
	@RequestMapping("findAll")
	public @ResponseBody Map findAll(PageBean pageBean) {
		List rows = indeptServiceImpl.findAll(pageBean);
		Map map = new HashMap();
		map.put("total", pageBean.getCount());
		map.put("rows", rows);
		return map;
	}
}
