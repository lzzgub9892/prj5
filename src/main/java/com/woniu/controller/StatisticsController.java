package com.woniu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.service.IStatisticsService;

@RequestMapping("/admin/statistics/")
@RestController
public class StatisticsController {
	@Resource
	private IStatisticsService statisticsServiceImpl;
	
	@RequestMapping("show")
	public List show(String startdate,String enddate,Integer condition) {
		List list=null;
		if(condition==1) {
			list=statisticsServiceImpl.countByRoomtype(startdate, enddate);
		}else if(condition==2) {
			list=statisticsServiceImpl.countByBuildingstructure(startdate, enddate);
		}else if(condition==5) {
			list=statisticsServiceImpl.countByBuildingarea(startdate, enddate);
		}else if(condition==6) {
			list=statisticsServiceImpl.countByLandownership(startdate, enddate);
		}else if(condition==3) {
			list=statisticsServiceImpl.countByDateBetween(startdate, enddate);
		}
		return list;
		
	}

}
