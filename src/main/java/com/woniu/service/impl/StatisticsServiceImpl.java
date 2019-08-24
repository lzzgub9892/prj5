package com.woniu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

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
	public Map countByRoomtype(String startdate,String enddate) {
		List<Roomtype> list = roomtypeMapper.selectByExample(null);
		Map<String, Long> map=new HashMap<String, Long>();
		for (Roomtype roomtype : list) {
			Long count = roomMapper.countByRoomtype(startdate, enddate, roomtype.getRid());
			map.put(roomtype.getRname(), count);
		}
		return map;
	}
	

}
