package com.woniu.service;

import java.util.List;

import com.woniu.entity.Sharetype;

public interface IShareTypeService {
   List<Sharetype> findall();
   Sharetype findBySharetypename(String sharetypename);
}
