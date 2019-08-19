package com.woniu.service;

import java.util.List;

import com.woniu.entity.Userinfo;

public interface IUserinfoService {
	public Userinfo findByUname(String uname);
	public void save(Userinfo info,Integer[] chk);
	public Userinfo findById(Integer uid);
	public void update(Userinfo info,Integer[] chk);
	
	
	public void delete(Integer uid);
	public void revoke(Integer uid);
	public List findAll();
}
