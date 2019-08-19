package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Role;
import com.woniu.entity.RoletreeExample;
import com.woniu.entity.RoletreeKey;
import com.woniu.mapper.RoleMapper;
import com.woniu.mapper.RoletreeMapper;
import com.woniu.service.IRoleService;

/**   
 * @ClassName:  TreeServiceImpl   
 * @Description:TODO(分页)   
 * @author: 蜗牛学院老韩
 * @date:   2019年8月5日 下午4:42:57   
 *     
 * @Copyright: 2019 www.woniu.com Inc. All rights reserved. 
 */  
@Service
public class RoleServiceImpl implements IRoleService{
	@Resource
	private RoleMapper roleMapper;
	@Resource
	private RoletreeMapper roletreeMapper;

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return roleMapper.selectByExample(null);
	}

	@Override
	public void save(Role role,String tids) {
		// TODO Auto-generated method stub
		roleMapper.insert(role);
		
		String[] tidarr = tids.split(",");
		for (String tid : tidarr) {
			RoletreeKey key = new RoletreeKey();
			key.setRid(role.getRid());
			key.setTid(Integer.parseInt(tid));
			roletreeMapper.insert(key);
		}
	}

	@Override
	public void update(Role role,String tids) {
		// TODO Auto-generated method stub
		roleMapper.updateByPrimaryKey(role);
		//delete
		RoletreeExample example = new RoletreeExample();
		example.createCriteria().andRidEqualTo(role.getRid());
		roletreeMapper.deleteByExample(example);
		
		//insert
		String[] tidarr = tids.split(",");
		for (String tid : tidarr) {
			RoletreeKey key = new RoletreeKey();
			key.setRid(role.getRid());
			key.setTid(Integer.parseInt(tid));
			roletreeMapper.insert(key);
		}
	}

	@Override
	public Role findById(Integer rid) {
		// TODO Auto-generated method stub
		return roleMapper.selectByPrimaryKey(rid);
	}
	
	
}
