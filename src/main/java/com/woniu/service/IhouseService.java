package com.woniu.service;

import java.util.List;

import com.woniu.entity.House;

public interface IhouseService {
  void save(House house);
  void update(House house);
  void delete(int hid);
  House findone(int hid);
  List<House> findall( );
}
