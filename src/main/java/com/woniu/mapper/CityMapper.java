package com.woniu.mapper;

import com.woniu.entity.City;
import com.woniu.entity.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {

	List<City> findByPid(int pid);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	long countByExample(CityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByExample(CityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByPrimaryKey(Integer cid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insert(City record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insertSelective(City record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	List<City> selectByExample(CityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	City selectByPrimaryKey(Integer cid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExample(@Param("record") City record, @Param("example") CityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKeySelective(City record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table city
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKey(City record);
}