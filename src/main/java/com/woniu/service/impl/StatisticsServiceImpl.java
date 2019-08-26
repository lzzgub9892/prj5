package com.woniu.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.web.tags.HasPermissionTag;
import org.springframework.stereotype.Service;

import com.woniu.entity.Buildingarea;
import com.woniu.entity.Buildingstructure;
import com.woniu.entity.Landownership;
import com.woniu.entity.Roomtype;
import com.woniu.mapper.BuildingareaMapper;
import com.woniu.mapper.BuildingstructureMapper;
import com.woniu.mapper.LandownershipMapper;
import com.woniu.mapper.RoomMapper;
import com.woniu.mapper.RoomtypeMapper;
import com.woniu.service.IStatisticsService;
@Service
public class StatisticsServiceImpl implements IStatisticsService {
	@Resource
	private RoomMapper roomMapper;
	
	@Resource
	private RoomtypeMapper roomtypeMapper;
	
	@Resource
	private BuildingareaMapper buildingareaMapper;
	
	@Resource
	private LandownershipMapper landownershipMapper;
	
	@Resource
	private BuildingstructureMapper buildingstructureMapper;

	@Override
	public List countByRoomtype(String startdate,String enddate) {
		List<Roomtype> list = roomtypeMapper.selectByExample(null);
		List l=new ArrayList();
		for (Roomtype roomtype : list) {
			Object[] objArr=new Object[2];
			objArr[0]=roomtype.getRname();
			objArr[1]=roomMapper.countByRoomtype(startdate, enddate, roomtype.getRid());
			l.add(objArr);
		}
		return l;
	}

	@Override
	public List countByBuildingstructure(String startdate, String enddate) {
		List<Buildingstructure> list=buildingstructureMapper.selectByExample(null);
		List l=new ArrayList();
		for (Buildingstructure bs : list) {
			Object[] objArr=new Object[2];
			objArr[0]=bs.getBsname();
			objArr[1]=roomMapper.countByBuildingstructure(startdate, enddate, bs.getBsid());
			l.add(objArr);
		}
		return l;
	}

	@Override
	public List countByBuildingarea(String startdate, String enddate) {
		List<Buildingarea> list=buildingareaMapper.selectByExample(null);
		List l=new ArrayList();
		for (Buildingarea ba : list) {
			Object[] objArr=new Object[2];
			objArr[0]=ba.getBname();
			objArr[1]=roomMapper.countByBuildingarea(startdate, enddate, ba.getBid());
			l.add(objArr);
		}
		return l;
	}

	@Override
	public List countByLandownership(String startdate, String enddate) {
		List<Landownership> list=landownershipMapper.selectByExample(null);
		List l=new ArrayList();
		for (Landownership ls : list) {
			Object[] objArr=new Object[2];
			objArr[0]=ls.getOname();
			objArr[1]=roomMapper.countByLandownership(startdate, enddate,ls.getOid());
			l.add(objArr);
		}
		return l;
	}
	
	@Override
	public List countByDateBetween(String startdate, String enddate) {
		List list=new ArrayList();
		Object[] objArr=new Object[2];
		objArr[0]=startdate+"至"+enddate;
		objArr[1]=roomMapper.countByDateBetween(startdate, enddate);
		list.add(objArr);
		return list;
	}
	

}
