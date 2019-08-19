package com.woniu.service;

import java.util.List;

import com.woniu.entity.Log;
import com.woniu.entity.PageBean;

public interface ILogService {
	public List findAll(Log log,PageBean pageBean);
	public Log findById(Integer id);
	public void delete(Integer id);
}
