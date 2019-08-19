package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.ProvinceMapper;
import com.woniu.service.IProvinceService;

/**   
 * @ClassName:  TreeServiceImpl   
 * @Description:TODO(分页)   
 * @author: 蜗牛学院老韩
 * @date:   2019年8月5日 下午4:42:57   
 *     
 * @Copyright: 2019 www.woniu.com Inc. All rights reserved. 
 */  
@Service
public class ProvinceServiceImpl implements IProvinceService{
	@Resource
	private ProvinceMapper provinceMapper;

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return provinceMapper.selectByExample(null);
	}
	
}
