package com.woniu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.mapper.ClientMapper;
import com.woniu.mapper.SharetypeMapper;
import com.woniu.service.IserviceshareService;

@RestController
@RequestMapping("serviceshares")
public class ServiceShareController {
    @Resource
    private IserviceshareService serviceshareService;
	
	@Resource
    private SharetypeMapper sharetypeMapper;
    //这是是客户表的mapper
	@Resource
	private ClientMapper clientMapper;
	
	
	
}
