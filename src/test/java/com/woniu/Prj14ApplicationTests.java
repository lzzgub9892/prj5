package com.woniu;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.woniu.entity.Nation;
import com.woniu.entity.Room;
import com.woniu.mapper.NationMapper;
import com.woniu.mapper.RoomMapper;
import com.woniu.service.IRegistertorService;
import com.woniu.service.IRoomService;
import com.woniu.tools.Pinyin;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Prj14ApplicationTests {
	@Resource
	private IRegistertorService RegisterServiceImpl;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testxxx() {
		Room room = RegisterServiceImpl.findByRoomId(1);
		System.out.println(room);
	}
}
