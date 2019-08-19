package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniu.entity.Log;
import com.woniu.entity.LogExample;
import com.woniu.entity.LogExample.Criteria;
import com.woniu.entity.PageBean;
import com.woniu.mapper.NationMapper;
import com.woniu.service.INationService;

/**   
 * @ClassName:  TreeServiceImpl   
 * @Description:TODO(分页)   
 * @author: 蜗牛学院老韩
 * @date:   2019年8月5日 下午4:42:57   
 *     
 * @Copyright: 2019 www.woniu.com Inc. All rights reserved. 
 */  
@Service
public class NationServiceImpl implements INationService{
	@Resource
	private NationMapper nationMapper;

	@Override
	public List findByNation(String nation) {
		// TODO Auto-generated method stub
		return nationMapper.findByNation(nation);
	}
	
	
	
	
	
}
