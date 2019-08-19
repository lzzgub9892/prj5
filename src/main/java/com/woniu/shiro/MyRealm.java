package com.woniu.shiro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import com.woniu.entity.Tree;
import com.woniu.entity.Userinfo;
import com.woniu.service.IUserinfoService;

@Component
public class MyRealm extends AuthorizingRealm{
	@Resource
	private IUserinfoService userinfoServiceImpl;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		System.out.println("授权");
		
		Userinfo sessioninfo = principals.oneByType(Userinfo.class);
		//有可能此处你又重新查询了一遍数据库
		System.out.println("重新进行数据库的查询你当前用户的权限");
		List<Tree> trees = sessioninfo.getTrees();//当前登录的用户所用于的Tree
		//你的角色和你的权限应该从数据库中查询  角色信息 和这个角色具有的树
		
		
		Set<String> roles = new HashSet<String>();
		Set<String> premission = new HashSet<String>();
		for (Tree tree : trees) {
			if(tree.getFile()!=null)
			{
				String file = tree.getFile();//  userinfo/findAll
				if(file.indexOf("/")!=-1) {
					file = file.substring(0, file.lastIndexOf("/"));  //userinfo
					premission.add(file+":*");
				}
			}
		}
		
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.setRoles(roles);//角色
		info.setStringPermissions(premission);//权限
		
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		System.out.println("登录");
		String uname = (String)token.getPrincipal();//得到用户输入的用户名
		//此时你应该查询数据库  根据用户名得到整个对象
		Userinfo info = userinfoServiceImpl.findByUname(uname);
		
		List list = new ArrayList();
		list.add(uname);//这个集合只能有一个String类型的字段 这个字段Shirot就会认为是uname
		list.add(info);
		
		if(info==null) {
			return null;
		}else {
			SimpleAuthenticationInfo sinfo = new SimpleAuthenticationInfo(list,info.getUpass(),getName());
			return sinfo;
		}
	}

}
