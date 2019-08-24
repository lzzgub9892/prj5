package com.woniu.service;

import java.util.List;

import com.woniu.entity.Building;

public interface IbuildingService {
   List<Building> findall();
   List<Building> findbyhid(int hid);
}
