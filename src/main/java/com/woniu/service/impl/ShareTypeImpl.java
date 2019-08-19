package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Sharetype;
import com.woniu.mapper.SharetypeMapper;
import com.woniu.service.IShareTypeService;
@Service
public class ShareTypeImpl implements IShareTypeService {
    @Resource
    private SharetypeMapper sharetypeMappe;
	@Override
	public List<Sharetype> findall() {
		// TODO Auto-generated method stub
		return sharetypeMappe.selectByExample(null);
	}

}
