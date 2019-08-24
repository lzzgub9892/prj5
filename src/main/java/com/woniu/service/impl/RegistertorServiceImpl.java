package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.entity.PageBean;
import com.woniu.entity.Room;
import com.woniu.mapper.BeinmortgageMapper;
import com.woniu.mapper.CloseregistrationMapper;
import com.woniu.mapper.DissentingregistrationMapper;
import com.woniu.mapper.ExistmortgageMapper;
import com.woniu.mapper.OtherregistrationMapper;
import com.woniu.mapper.OwnershipMapper;
import com.woniu.mapper.RoomMapper;
import com.woniu.service.IRegistertorService;

@Service
public class RegistertorServiceImpl implements IRegistertorService {

	@Resource
	private RoomMapper roomMapper;
	
	@Resource
	private OwnershipMapper ownershipMapper;
	
	@Resource
	private ExistmortgageMapper existmortgageMapper;
	
	
	@Resource
	private BeinmortgageMapper beinmortgageMapper;
	
	
	@Resource
	private OtherregistrationMapper otherregistrationMapper;
	
	
	@Resource
	private CloseregistrationMapper closeregistrationMapper;
	
	
	@Resource
	private DissentingregistrationMapper DissentingregistrationMapper;
	
	@Transactional(readOnly = true)
	@Override
	public Room findByRoomId(Integer roomid) {
		// TODO Auto-generated method stub
		return roomMapper.selectByPrimaryKey(roomid);
	}

	@Override
	public List<Room> findAll(PageBean pb) {
		// TODO Auto-generated method stub
		List<Room> list = roomMapper.selectByExample(null,new RowBounds(pb.getOffset(),pb.getLimit()));
		int count=(int) roomMapper.countByExample(null);
		pb.setCount(count);
		return list;
	}
	

	@Override
	public void deleteByRoomId(Integer roomid) {
		// TODO Auto-generated method stub
		ownershipMapper.deleteByRoomid(roomid);
		existmortgageMapper.deleteByRoomid(roomid);
		beinmortgageMapper.deleteByRoomid(roomid);
		otherregistrationMapper.deleteByRoomid(roomid);
		closeregistrationMapper.deleteByRoomid(roomid);
		DissentingregistrationMapper.deleteByRoomid(roomid);
	}

}
