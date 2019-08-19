package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Userinfo;
import com.woniu.mapper.TreeMapper;
import com.woniu.service.ITreeService;

/**   
 * @ClassName:  TreeServiceImpl   
 * @Description:TODO(查询所有的树节点)   
 * @author: 蜗牛学院老韩
 * @date:   2019年8月5日 下午4:42:57   
 *     
 * @Copyright: 2019 www.woniu.com Inc. All rights reserved. 
 */  
@Service
public class TreeServiceImpl implements ITreeService{
	@Resource
	private TreeMapper treeMapper;
	
	
	public List findAll() {
		return treeMapper.selectByExample(null);
	}
	
}
