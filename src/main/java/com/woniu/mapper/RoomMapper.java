package com.woniu.mapper;

import com.woniu.entity.Room;
import com.woniu.entity.RoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table room
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	long countByExample(RoomExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table room
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByExample(RoomExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table room
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByPrimaryKey(Integer roomid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table room
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insert(Room record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table room
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insertSelective(Room record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table room
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	List<Room> selectByExample(RoomExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table room
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	Room selectByPrimaryKey(Integer roomid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table room
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table room
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table room
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKeySelective(Room record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table room
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKey(Room record);
}