package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniu.entity.Log;
import com.woniu.entity.LogExample;
import com.woniu.entity.LogExample.Criteria;
import com.woniu.entity.PageBean;
import com.woniu.mapper.LogMapper;
import com.woniu.service.ILogService;

/**   
 * @ClassName:  TreeServiceImpl   
 * @Description:TODO(分页)   
 * @author: 蜗牛学院老韩
 * @date:   2019年8月5日 下午4:42:57   
 *     
 * @Copyright: 2019 www.woniu.com Inc. All rights reserved. 
 */  
@Service
public class LogServiceImpl implements ILogService{
	@Resource
	private LogMapper logMapper;
	
	
	public List findAll(Log log,PageBean pageBean) {
		LogExample example = new LogExample();
		Criteria c = example.createCriteria();
		if(log.getAction()!=null&&!log.getAction().equals(""))
			c.andActionEqualTo(log.getAction());
		if(log.getUname()!=null&&!log.getUname().equals(""))
			c.andUnameEqualTo(log.getUname());
		List list = logMapper.selectByExample(example,new RowBounds(pageBean.getOffset(),pageBean.getLimit()));
		int count = logMapper.countByExample(example);
		pageBean.setCount(count);
		return list;
	}


	@Override
	public Log findById(Integer id) {
		// TODO Auto-generated method stub
		return logMapper.selectByPrimaryKey(id);
	}


	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		logMapper.deleteByPrimaryKey(id);
	}
	
	
}
