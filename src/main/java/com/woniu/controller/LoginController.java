package com.woniu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.entity.Userinfo;
import com.woniu.service.ITreeService;
import com.woniu.service.IUserinfoService;

@Controller
public class LoginController {
	@Resource
	private IUserinfoService userinfoService;
	@Resource
	private ITreeService treeService;
	
	@RequestMapping("/login")
	//首先获取当前方法的参数，
	//获取参数的名称
	//通过反射获取request中的值，填充到这个方法上  再进行调用
	//反射是否能获取方法的参数名?(本身Java是无法获取参数的方法名的)
	//只有三种方式：
//		1：JavaAssiat 能够对字节码进行编程
//		2:Spring提供了一个类LocalVariableTableParameterNameDiscoverer  能够读取字节码得到参数名称
//		3：jdk1.8做设置之后也可以读取到参数名称
//		//核心点都是读取字节码
	//Spring原理  已启动的扫描，构建类结构。
	//如果不加@RequestAttribute("uname") 只能读取字节码文件来得到参数名称
	//如果加了@RequestAttribute("uname") 通过反射得到你RequestAttribute的value了。
	public String login(Userinfo info,HttpSession session,HttpServletRequest request) throws JsonProcessingException {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new  UsernamePasswordToken(info.getUname(),info.getUpass());
		
		try {
			subject.login(token);
			info = subject.getPrincipals().oneByType(Userinfo.class);
			
			ObjectMapper mapper =  new ObjectMapper();
			String json = mapper.writeValueAsString(info.getTrees());
			session.setAttribute("info", info);
			session.setAttribute("json", json);
			//登录成功了 你还要把登录后的对象  放入session
			return "redirect:/admin/main.jsp";
		}catch (UnknownAccountException e) {
			// TODO: handle exception
			request.setAttribute("error", "没有"+info.getUname()+"这个账号");
			return "/index";
		}catch (IncorrectCredentialsException e) {
			// TODO: handle exception
			request.setAttribute("error", "密码错误");
			return "/index";
		} catch (Exception e) {
			// TODO: handle exception
			return "/index";
		}

	}
	
	
}
