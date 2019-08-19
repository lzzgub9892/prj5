package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.entity.Userinfo;
import com.woniu.entity.UserinforoleExample;
import com.woniu.entity.UserinforoleKey;
import com.woniu.mapper.UserinfoMapper;
import com.woniu.mapper.UserinforoleMapper;
import com.woniu.service.IUserinfoService;

@Service
public class UserinfoServiceImpl implements IUserinfoService {
	@Resource
	private UserinfoMapper userinfoMapper;
	@Resource
	private UserinforoleMapper userinfoRoleMapper;

	@Override
	@Transactional(readOnly = true)
	public Userinfo findByUname(String uname) {
		// TODO Auto-generated method stub
		return userinfoMapper.findByUname(uname);
	}

	@Override
	@Transactional(readOnly = true)
	public List findAll() {
		// TODO Auto-generated method stub
		return userinfoMapper.selectByExample(null);
	}

	@Override
	@Transactional
	public void save(Userinfo info, Integer[] chk) {
		// TODO Auto-generated method stub
		// 插入Userinfo
		userinfoMapper.insert(info);
		// 插入userinfoRole
		if (chk != null)
			for (Integer rid : chk) {
				UserinforoleKey key = new UserinforoleKey();
				key.setUid(info.getUid());
				key.setRid(rid);
				userinfoRoleMapper.insert(key);
			}
	}

	@Override
	public void delete(Integer uid) {
		// TODO Auto-generated method stub
		Userinfo info = new Userinfo();
		info.setUid(uid);
		info.setIsdelete(true);
		userinfoMapper.updateByPrimaryKeySelective(info);
	}

	@Override
	public void revoke(Integer uid) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Userinfo info = new Userinfo();
		info.setUid(uid);
		info.setIsdelete(false);
		userinfoMapper.updateByPrimaryKeySelective(info);
	}

	@Override
	public Userinfo findById(Integer uid) {
		// TODO Auto-generated method stub
		return userinfoMapper.selectByPrimaryKey(uid);
	}

	@Override
	public void update(Userinfo info, Integer[] chk) {
		// TODO Auto-generated method stub
		// 修改Userinfo
		userinfoMapper.updateByPrimaryKeySelective(info);
		
		//删除对应用户的所有角色
		UserinforoleExample example = new UserinforoleExample();
		example.createCriteria().andUidEqualTo(info.getUid());
		userinfoRoleMapper.deleteByExample(example);
		
		// 插入userinfoRole
		if (chk != null)
			for (Integer rid : chk) {
				UserinforoleKey key = new UserinforoleKey();
				key.setUid(info.getUid());
				key.setRid(rid);
				userinfoRoleMapper.insert(key);
			}
	}

}
