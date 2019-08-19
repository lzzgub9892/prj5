package com.woniu.service;

import java.util.List;

import com.woniu.entity.PageBean;
import com.woniu.entity.Student;

public interface IStudentService {
	public List findAll(PageBean pageBean);
	public int delete(Integer stid);
	public void deleteBatch(Integer[] stids);
	public void save(Student student);
	public void update(Student student);
	public Student findById(Integer stid);
}
