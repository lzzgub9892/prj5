package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Sharetype;
import com.woniu.entity.SharetypeExample;
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
	@Override
	public Sharetype findBySharetypename(String sharetypename) {
		// TODO Auto-generated method stub
		SharetypeExample example = new SharetypeExample();
		example.createCriteria().andSharetypeEqualTo(sharetypename);
		List<Sharetype> list = sharetypeMappe.selectByExample(example);
		return list.size()==0?null:list.get(0);
	}

}
