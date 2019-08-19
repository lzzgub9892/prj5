package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniu.entity.PageBean;
import com.woniu.entity.Student;
import com.woniu.mapper.StudentMapper;
import com.woniu.service.IStudentService;

/**   
 * @ClassName:  TreeServiceImpl   
 * @Description:TODO(分页)   
 * @author: 蜗牛学院老韩
 * @date:   2019年8月5日 下午4:42:57   
 *     
 * @Copyright: 2019 www.woniu.com Inc. All rights reserved. 
 */  
@Service
public class StudentServiceImpl implements IStudentService{
	@Resource
	private StudentMapper studentMapper;
	
	
	public List findAll(PageBean pageBean) {
		List list = studentMapper.selectByExample(null,new RowBounds(pageBean.getOffset(), pageBean.getLimit()));
		int count = studentMapper.countByExample(null);
		pageBean.setCount(count);
		return list;
	}


//	@Override
//	public Log findById(Integer id) {
//		// TODO Auto-generated method stub
//		return logMapper.selectByPrimaryKey(id);
//	}
//
//
	@Override
	public int delete(Integer stid) {
		// TODO Auto-generated method stub
		return studentMapper.deleteByPrimaryKey(stid);
	}


	@Override
	public void deleteBatch(Integer[] stids) {
		// TODO Auto-generated method stub
		studentMapper.deleteBatch(stids);
	}


	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentMapper.insert(student);
	}


	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		studentMapper.updateByPrimaryKey(student);
	}


	@Override
	public Student findById(Integer stid) {
		// TODO Auto-generated method stub
		return studentMapper.selectByPrimaryKey(stid);
	}
	
	
}
