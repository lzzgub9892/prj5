package com.woniu;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.woniu.entity.Nation;
import com.woniu.mapper.NationMapper;
import com.woniu.tools.Pinyin;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Prj14ApplicationTests {
	@Resource
	private NationMapper nationMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testxxx() {
		List<Nation> list = nationMapper.findByNation("hz");
		for (Nation nation : list) {
			System.out.println(nation);
		}
	}
}
