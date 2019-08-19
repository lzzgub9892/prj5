package com.woniu.mapper;

import com.woniu.entity.Landnumber;
import com.woniu.entity.LandnumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LandnumberMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landnumber
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	long countByExample(LandnumberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landnumber
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByExample(LandnumberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landnumber
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByPrimaryKey(Integer lnid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landnumber
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insert(Landnumber record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landnumber
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insertSelective(Landnumber record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landnumber
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	List<Landnumber> selectByExample(LandnumberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landnumber
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	Landnumber selectByPrimaryKey(Integer lnid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landnumber
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Landnumber record, @Param("example") LandnumberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landnumber
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExample(@Param("record") Landnumber record, @Param("example") LandnumberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landnumber
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKeySelective(Landnumber record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landnumber
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKey(Landnumber record);
}