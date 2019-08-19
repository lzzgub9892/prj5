package com.woniu.shiro;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.woniu.entity.Tree;
import com.woniu.service.ITreeService;

/**   
 * @ClassName:  ShiroConfiguration   
 * @Description:TODO(配置类就是来配置shiro的)   
 * @author: 蜗牛学院老韩
 * @date:   2019年8月15日 上午10:05:02   
 *     
 * @Copyright: 2019 www.woniu.com Inc. All rights reserved. 
 */  
@Configuration
public class ShiroConfiguration {
	@Resource
	private ITreeService treeServiceImpl;
	
	//提供web方式的过滤的校验
	@Bean
	public ShiroFilterFactoryBean ShiroFilterFactoryBean(SecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		
		//开始设置过滤的基本信息
		//设置当前shiro系统的登录页面是哪里 当没有权限的时候 会自动跳转到这里
		shiroFilterFactoryBean.setLoginUrl("/index.jsp");
		//如果鉴权成功去哪里
		shiroFilterFactoryBean.setSuccessUrl("/admin/index.jsp");
		//未授权的url
		shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorizedUrl.jsp");
		
//		//设置具体的权限
		Map<String,String> map = new LinkedHashMap<String, String>();//此处为了保证放入值的顺序，必须得用LinkedHashMap
//		
		map.put("/js/**", "anon");// js谁都可以访问
		map.put("/css/**", "anon");// js谁都可以访问
		map.put("/images/**", "anon");// js谁都可以访问
		
		//所有目录的访问权限
		//查询出整个树表的访问权限
		List<Tree> list = treeServiceImpl.findAll();
		for (Tree tree : list) {
			if(tree.getFile()!=null)
			{
				String file = tree.getFile();//  userinfo/findAll
				if(file.indexOf("/")!=-1) {
					file = file.substring(0, file.lastIndexOf("/"));  //userinfo
					map.put("/admin/"+file+"/**", "perms["+file+":*]");// 这个目录只能角色是高鹏的才能访问
				}
			}
		}
		
		
		map.put("/admin/**", "authc");// admin目录都必须登录后才能访问
		
		
		
		shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
	
		return shiroFilterFactoryBean;
	}
	
	@Bean
	public SecurityManager securityManager(MyRealm realm) {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(realm);
		securityManager.setCacheManager(ehCacheManager());
		return securityManager;
	}
	
	@Bean
    public EhCacheManager ehCacheManager(){
        System.out.println("启动缓存");
        EhCacheManager ehCacheManager = new EhCacheManager();
        ehCacheManager.setCacheManagerConfigFile("classpath:ehcache.xml");
        return ehCacheManager;
    }
	
}
