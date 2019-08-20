package com.woniu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniu.entity.House;
import com.woniu.entity.HouseExample;


public interface HouseMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table house
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	long countByExample(HouseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table house
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByExample(HouseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table house
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByPrimaryKey(Integer hid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table house
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insert(House record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table house
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insertSelective(House record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table house
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	List<House> selectByExample(HouseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table house
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	House selectByPrimaryKey(Integer hid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table house
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExampleSelective(@Param("record") House record, @Param("example") HouseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table house
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExample(@Param("record") House record, @Param("example") HouseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table house
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKeySelective(House record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table house
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKey(House record);
}