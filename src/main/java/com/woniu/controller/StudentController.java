package com.woniu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.entity.Message;
import com.woniu.entity.PageBean;
import com.woniu.entity.Student;
import com.woniu.service.IStudentService;

@RequestMapping("/admin/student/")
@Controller
public class StudentController {
	@Resource
	private IStudentService studentServiceImpl;
	
	@RequestMapping("findAll")
	public @ResponseBody Map findAll(PageBean pageBean) {
		List rows = studentServiceImpl.findAll(pageBean);
		Map map = new HashMap();
		map.put("total", pageBean.getCount());
		map.put("rows", rows);
		return map;
	}
	@RequestMapping("findById")
	public @ResponseBody Student findById(Integer stid) {
		Student student = studentServiceImpl.findById(stid);
		return student;
	}
	
	@RequestMapping("save")
	public @ResponseBody Message save(Student student) {
		Message msg = null;
		try {
			studentServiceImpl.save(student);
			msg = new Message(true, "学生增加成功");
		} catch (Exception e) {
			// TODO: handle exception
			msg = new Message(false, "学生增加失败"+e.getMessage());
		}
		return msg;
	}
	
	@RequestMapping("update")
	public @ResponseBody Message update(Student student) {
		Message msg = null;
		try {
			studentServiceImpl.update(student);
			msg = new Message(true, "学生修改成功");
		} catch (Exception e) {
			// TODO: handle exception
			msg = new Message(false, "学生修改失败"+e.getMessage());
		}
		return msg;
	}
	
	@RequestMapping("delete")
	public @ResponseBody Message delete(Integer stid) {
		Message msg = null;
		try {
			int  count = studentServiceImpl.delete(stid);
			msg = new Message(true, "学生删除成功");
		} catch (Exception e) {
			// TODO: handle exception
			msg = new Message(false, "学生删除失败"+e.getMessage());
		}
		return msg;
	}
	
	@RequestMapping("deleteBatch")
	public @ResponseBody Message deleteBatch(String stidstring) {// 1,2,3
		Message msg = null;
		try {
			String[] tempStrings = stidstring.split(",");
			Integer[] stids = new Integer[tempStrings.length];
			for (int i = 0; i < tempStrings.length; i++) {
				stids[i] = Integer.parseInt(tempStrings[i]);
			}
			studentServiceImpl.deleteBatch(stids);
			msg = new Message(true, "学生批量删除成功");
		} catch (Exception e) {
			// TODO: handle exception
			msg = new Message(false, "学生批量删除失败"+e.getMessage());
		}
		return msg;
	}
}
