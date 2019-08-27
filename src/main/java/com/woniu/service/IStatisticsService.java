package com.woniu.service;

import java.util.List;
import java.util.Map;

public interface IStatisticsService {
	
	List countByLandownership(String startdate,String enddate);
	
	List countByRoomtype(String startdate,String enddate);
	
	List countByBuildingstructure(String startdate,String enddate);
	
	List countByBuildingarea(String startdate,String enddate);
	
	List countByDateBetween(String startdate,String enddate);

}
