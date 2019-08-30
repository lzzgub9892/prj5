package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.House;
import com.woniu.mapper.HouseMapper;
import com.woniu.service.IhouseService;
@Service
public class HouseServiceImpl implements IhouseService {
    @Resource 
    private HouseMapper houseMapper;
	@Override
	public void save(House house) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(House house) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int hid) {
		// TODO Auto-generated method stub

	}

	@Override
	public House findone(int hid) {
		// TODO Auto-generated method stub
		return houseMapper.selectByPrimaryKey(hid);
	}

	@Override
	public List<House> findall() {
		// TODO Auto-generated method stub
		return houseMapper.selectByExample(null);
	}

	@Override
	public House findByServicenumber(String servicenumber) {
		return houseMapper.findByServicenumber(servicenumber);
	}

	@Override
	public House findByllbb(String lnname, String location, String bsname, String bname) {
		return houseMapper.findByllbb(lnname, location, bsname, bname);
	}
}
