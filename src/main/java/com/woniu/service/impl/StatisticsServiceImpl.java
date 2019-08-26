package com.woniu.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.web.tags.HasPermissionTag;
import org.springframework.stereotype.Service;

import com.woniu.entity.Roomtype;
import com.woniu.mapper.RoomMapper;
import com.woniu.mapper.RoomtypeMapper;
import com.woniu.service.IStatisticsService;
@Service
public class StatisticsServiceImpl implements IStatisticsService {
	@Resource
	private RoomMapper roomMapper;
	
	@Resource
	private RoomtypeMapper roomtypeMapper;

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
	

}
