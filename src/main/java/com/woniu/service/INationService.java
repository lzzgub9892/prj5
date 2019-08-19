package com.woniu.service;

import java.util.List;

import com.woniu.entity.Log;
import com.woniu.entity.PageBean;

public interface INationService {
	List findByNation(String nation);
}
