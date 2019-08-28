package com.woniu.service;

import java.text.ParseException;
import java.util.List;

import com.woniu.entity.Netsign;
import com.woniu.entity.NetsignObj;
import com.woniu.entity.PageBean;

public interface INetsignService {
	//新增网签
	void save(NetsignObj netsignObj);
	
	//网签审批
	void examine(Integer netid);
	
	
	//网签失败
	void faild(Integer netid);
	//查询网签状态
	Netsign findByNetid(Integer netid);
	
	List<Netsign> findByPage(PageBean pageBean) throws ParseException;
	
	Netsign findByNetnumber(String netnumber);

	List<Netsign> findByPageAndSuccess(PageBean pageBean);
	
	
	

}
