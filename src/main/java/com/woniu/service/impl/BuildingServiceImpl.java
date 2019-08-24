package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Building;
import com.woniu.mapper.BuildingMapper;
import com.woniu.service.IbuildingService;
@Service
public class BuildingServiceImpl implements IbuildingService {
    
	@Resource
	private BuildingMapper buildingMapper;
	@Override
	public List<Building> findall() {
		// TODO Auto-generated method stub
		return buildingMapper.selectByExample(null);
	}
	@Override
	public List<Building> findbyhid(int hid) {
		// TODO Auto-generated method stub
		return buildingMapper.findByhid(hid);
	}
	

}
