package com.woniu.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.woniu.entity.Client;
import com.woniu.entity.Ownership;
import com.woniu.entity.Registertemporary;
import com.woniu.entity.Service;
import com.woniu.entity.Serviceshare;
import com.woniu.entity.Servicesharetemporary;
import com.woniu.entity.ServicesharetemporaryModel;
import com.woniu.entity.Sharetype;
import com.woniu.entity.Userinfo;
import com.woniu.service.IClientService;
import com.woniu.service.IRegisterService;
import com.woniu.service.IServiceService;
import com.woniu.service.IServiceShareTemporaryService;
import com.woniu.service.IShareTypeService;
import com.woniu.service.IUserinfoService;
import com.woniu.service.IserviceshareService;
import com.woniu.service.impl.ClientServiceImpl;
import com.woniu.service.impl.RegisterserviceImpl;
import com.woniu.service.impl.ServiceServiceImpl;
import com.woniu.service.impl.ServiceShareServiceImpl;
import com.woniu.util.FileUtil;

@Controller
@RequestMapping("/admin/register")
public class RegisterController {
	
	@Resource
	private IRegisterService registerservice;
	@Resource
	private IServiceShareTemporaryService serviceShareTemporaryService;
	@Resource
	private IClientService clientService;
	@Resource
	private IServiceService serviceService;
	@Resource
	private IShareTypeService shareTypeService;
	@Resource
	private IUserinfoService userinfoService;
	@Resource
	private IserviceshareService serviceShareServiceImpl;
	
	//存储临时登记数据
	@RequestMapping("save")
	public String save(Registertemporary regi, ServicesharetemporaryModel ssts,HttpServletRequest req) {
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
		
		registerservice.save(regi, ssts,info);
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
	
	
	//审核之后的存储流程
	@RequestMapping("beputinstroge")
	@ResponseBody
	@Transactional
	public Map bePutInStroge(Integer rtid,String textarea,String approver,HttpSession session) {
		Map<String,String> map = new HashMap();
		Service service = new Service();
		Registertemporary regi = registerservice.findOne(rtid);
		Date date = new Date();
		//申请人
		Client client = clientService.findByCilentnameIdcard(regi.getProposer(), regi.getPropidcard());
		if(client!=null) {
			service.setProposer(client.getClientid());
		}else {
			Client newclient = new Client();
			newclient.setClientname(regi.getProposer());
			newclient.setIdcard(regi.getPropidcard());
			newclient.setPhone(regi.getProptel());
			newclient.setAddress(regi.getDomicileaddress());
			clientService.save(newclient);
			service.setProposer(newclient.getClientid());
		}
		//代理人
		Client clientdaili = clientService.findByCilentnameIdcard(regi.getAgent(), regi.getAgentidcard());
		if(clientdaili!=null) {
			service.setAgent(clientdaili.getClientid());
		}else {
			Client newclient = new Client();
			newclient.setClientname(regi.getAgent());
			newclient.setIdcard(regi.getAgentidcard());
			
			clientService.save(newclient);
			service.setAgent(newclient.getClientid());
		}
		//业务类型ID
		service.setServicetypeid(regi.getServicetypeid());
		//业务状态
		service.setServicestatusid(4);
		//业务编号
		String number = new SimpleDateFormat("yyyyMMddHHmmss").format(date);
		number = "10008"+number;
		service.setServicenumber(number);
		//文件名
		service.setApplication(regi.getApplication());
		service.setIdcopy(regi.getIdcopy());
		service.setPhoto(regi.getPhoto());
		service.setPurchasecopy(regi.getPurchasecopy());
		service.setContractcopy(regi.getContractcopy());
		service.setTaxcopy(regi.getTaxcopy());
		//审批意见
		service.setIdea(textarea);
		service.setApprover(approver);
		//存储
		serviceService.save(service);
		
		//共有人
		List<Servicesharetemporary> ssts = serviceShareTemporaryService.findByRegistertemporary(rtid);
		if(ssts!=null&&ssts.size()>=0) {
			//共有人对象
			for (Servicesharetemporary sst : ssts) {
				Serviceshare share = new Serviceshare();
				share.setServiceid(service.getServiceid());
				Client cli = clientService.findByCilentnameIdcard(sst.getSharename(), sst.getShareidcard());

				if(cli!=null) {
					share.setClientid(cli.getClientid());
				}else {
					Client newclient = new Client();
					newclient.setClientname(sst.getSharename());
					newclient.setIdcard(sst.getShareidcard());
					newclient.setAddress(sst.getShareaddresss());
					newclient.setPhone(sst.getSharetel());
					
					clientService.save(newclient);
					share.setClientid(newclient.getClientid());
				}
				share.setShare(sst.getShare().intValue());
				
				Sharetype sharetype = shareTypeService.findBySharetypename(sst.getSharetype());
				share.setSharetypeid(sharetype.getSharetypeid());
				serviceShareServiceImpl.save(share);
			}
		}
		//所有权
		Ownership ownership = new Ownership();
		//生成业务宗号
		String osid = new SimpleDateFormat("yyyyMMddHHmmss").format(date);
		osid = "10001"+osid;
		ownership.setServicenumber(osid);
		ownership.setRoomid(regi.getRoomid());
		ownership.setRegistertime(date);
		Userinfo userinfo = (Userinfo) session.getAttribute("info");
		ownership.setUid(userinfo.getUid());
		ownership.setClientid(client.getClientid());
		
		map.put("chenggong", "审核成功，已入库");
		return map;
	}
	
	@RequestMapping("torukuupdate")
	public String update(Integer rtid,ModelMap map) {
		System.out.println(rtid+"-----------------------------");
		Registertemporary regi = registerservice.findOne(rtid);
		List<Servicesharetemporary> ssts = serviceShareTemporaryService.findByRegistertemporary(rtid);
		ServicesharetemporaryModel sstss = new ServicesharetemporaryModel();
		sstss.setServicesharetemporarys(ssts);
		map.put("regi", regi);
		map.put("sstss", sstss);
		map.put("method", "update");
		return "admin/register/ruku";
	}
	
}


