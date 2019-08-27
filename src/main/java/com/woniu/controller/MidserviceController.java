package com.woniu.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Midservice;
import com.woniu.entity.PageBean;
import com.woniu.entity.Servicestatus;
import com.woniu.entity.Servicetype;
import com.woniu.entity.Userinfo;
import com.woniu.service.IMidserviceService;
import com.woniu.service.IServicestatusService;
import com.woniu.service.IServicetypeService;
import com.woniu.service.IUserinfoService;

@Controller
@RequestMapping("admin")
public class MidserviceController {
	
	@Resource
	private IMidserviceService midserviceServiceImpl;
	@Resource
	private IUserinfoService userinfoServiceImpl;
	@Resource
	private IServicetypeService servicetypeServiceImpl;
	@Resource
	private IServicestatusService servicestatusServiceImpl;
	
	@RequestMapping("saveMidservice")
	public String save(Midservice midservice,HttpSession session) throws ParseException {
		midservice.setProcesstime(new Date());
		Userinfo midinfo=(Userinfo) session.getAttribute("info");
		Userinfo info=userinfoServiceImpl.findByUname(midinfo.getUname());
		System.out.println(info);
		midservice.setUid(info.getUid());
		midservice.setServicestatusid(servicestatusServiceImpl.findByName("已受理").getServicestatusid());
		System.out.println(midservice);
		midserviceServiceImpl.save(midservice);
		return "redirect:/admin/getMidservice";
	}
	
	@RequestMapping("getMidservice")
	public String getMidservice(ModelMap map,PageBean pb,Midservice midservice,String time1,String time2) throws Exception {
		Date d1=null;
		Date d2=null;
		if(time1!=null&&time2!=null&&!time1.equals("")&&!time2.equals("")) {
			d1=new SimpleDateFormat("yyyy-MM-dd").parse(time1);
			d2=new SimpleDateFormat("yyyy-MM-dd").parse(time2);
			System.out.println(d1);
			System.out.println(d2);
		}
		List<Midservice> midservices=midserviceServiceImpl.findByPage(pb,midservice,d1,d2);
		System.out.println(midservice);
		List<Userinfo> userinfos=userinfoServiceImpl.findAll();
		List<Servicetype> servicetypes=servicetypeServiceImpl.findAll();
		List<Servicestatus> servicestatus=servicestatusServiceImpl.findAll();
		map.put("midservices",midservices);
		map.put("userinfos",userinfos);
		map.put("servicetypes",servicetypes);
		map.put("servicestatus",servicestatus);
		map.put("pb",pb);
		map.put("d1",d1);
		map.put("d2",d2);
		return "admin/regeditservice/list_shouli";
	}
}
