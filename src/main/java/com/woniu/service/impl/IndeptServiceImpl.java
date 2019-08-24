package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.entity.Indept;
import com.woniu.entity.PageBean;
import com.woniu.mapper.IndeptMapper;
import com.woniu.service.IIndeptService;
@Service
public class IndeptServiceImpl implements IIndeptService {

	@Resource
	private IndeptMapper indeptMapper;
	
	@Override
	@Transactional
	public void save(Indept indept) {
		// TODO Auto-generated method stub
		indeptMapper.insertSelective(indept);
	}

	@Override
	@Transactional
	public void delete(Integer indeptid) {
		// TODO Auto-generated method stub
		indeptMapper.deleteByPrimaryKey(indeptid);
	}

	@Override
	@Transactional
	public void update(Indept indept) {
		// TODO Auto-generated method stub
		indeptMapper.updateByPrimaryKeySelective(indept);
	}

	@Override
	@Transactional(readOnly = true)
	public Indept findOne(Integer indeptid) {
		// TODO Auto-generated method stub
		return indeptMapper.selectByPrimaryKey(indeptid);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Indept> findAll(PageBean pb) {
		// TODO Auto-generated method stub
		 List<Indept> list = indeptMapper.selectByExample(null,new RowBounds(pb.getOffset(),pb.getLimit()));
		 int count=(int) indeptMapper.countByExample(null);
		 pb.setCount(count);
		 return list;
	}

}
