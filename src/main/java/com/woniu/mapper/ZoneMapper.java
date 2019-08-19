package com.woniu.mapper;

import com.woniu.entity.Zone;
import com.woniu.entity.ZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZoneMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zone
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	long countByExample(ZoneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zone
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByExample(ZoneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zone
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByPrimaryKey(Integer zid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zone
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insert(Zone record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zone
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insertSelective(Zone record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zone
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	List<Zone> selectByExample(ZoneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zone
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	Zone selectByPrimaryKey(Integer zid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zone
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Zone record, @Param("example") ZoneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zone
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExample(@Param("record") Zone record, @Param("example") ZoneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zone
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKeySelective(Zone record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zone
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKey(Zone record);
}