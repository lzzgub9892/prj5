package com.woniu.controller;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.woniu.entity.Registertemporary;
import com.woniu.entity.Servicesharetemporary;
import com.woniu.entity.Userinfo;
import com.woniu.service.IRegisterService;
import com.woniu.service.IServiceShareTemporaryService;
import com.woniu.service.impl.RegisterserviceImpl;
import com.woniu.util.FileUtil;

@Controller
@RequestMapping("/admin/register")
public class RegisterController {
	
	@Resource
	private IRegisterService registerservice;
	@Resource
	private IServiceShareTemporaryService serviceShareTemporaryService;
	
	//存储临时登记数据
	@RequestMapping("save")
	public String save(Registertemporary regi, Servicesharetemporary sst,HttpServletRequest req) {
		System.out.println("RegisterController.save()");
		//获取上传文件数组
        List<MultipartFile> files = ((MultipartHttpServletRequest) req).getFiles("file");
        
        for (MultipartFile file : files) {
        	if(file.isEmpty()) {
        		req.setAttribute("error", "请补全上传文件");
        		return "admin/register/ruku";
        	}
			
		}

        
        
        if(regi.getAgentidcard().equals("")||regi.getProposer().equals("")) {
        	System.out.println("====================================");
        	req.setAttribute("error", "信息不足，请补充");
        	return "admin/register/ruku";
        }
        
        
        //遍历处理文件
        String info = null;
        for (MultipartFile file:files) {
        	
            try {
            	String path = req.getRealPath("/img/");
            	System.out.println(path);
                String s = FileUtil.uploadFile(file,path);
                
                System.out.println(s+"_________________________________________________");
                info = info+"_"+s;
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String[] infos = info.split("_");
        for (String ino : infos) {
			System.out.println(ino);
			
		}
        regi.setApplication(infos[1]);
        regi.setIdcopy(infos[2]);
        regi.setPhoto(infos[3]);
        regi.setPurchasecopy(infos[4]);
        regi.setContractcopy(infos[5]);
        regi.setTaxcopy(infos[6]);
        regi.setServicetypeid(1);
		
		registerservice.save(regi, sst,info);
		return "redirect:tolistruku"; 
	}
	
	//展示临时数据
	@RequestMapping("tolistruku")
	public String findAll(ModelMap map,HttpSession session) {
		List<Registertemporary> regis = registerservice.findAll();
		
		map.put("regis", regis);
		Userinfo info = (Userinfo) session.getAttribute("info");
		String user = info.getUname();
		map.put("user", user);
		return "admin/register/list_ruku";
	}
	
	//查询临时数据，并展示在审核页面
	@RequestMapping("toshenhe")
	public String showShenHe(Integer rtid,ModelMap map) {
		System.out.println(rtid);
		Registertemporary regi = registerservice.findOne(rtid);
		List<Servicesharetemporary> sstss = serviceShareTemporaryService.findByRegistertemporary(rtid);
		System.out.println(sstss.size()+"*********************************************");
		map.put("regi", regi);
		map.put("sstss", sstss);
		return "admin/register/shenhe";
	}
	
}


