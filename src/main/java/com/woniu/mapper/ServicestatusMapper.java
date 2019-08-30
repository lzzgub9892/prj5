package com.woniu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.woniu.entity.Servicestatus;
import com.woniu.entity.ServicestatusExample;

public interface ServicestatusMapper {
	
	@Select("select * from servicestatus where servicestatusid = #{servicestatusid}")
	Servicestatus findByservicestatusid(Integer servicestatusid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicestatus
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	long countByExample(ServicestatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicestatus
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int deleteByExample(ServicestatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicestatus
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int deleteByPrimaryKey(Integer servicestatusid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicestatus
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int insert(Servicestatus record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicestatus
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int insertSelective(Servicestatus record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicestatus
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	
	List<Servicestatus> selectByExample(ServicestatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicestatus
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	Servicestatus selectByPrimaryKey(Integer servicestatusid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicestatus
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Servicestatus record, @Param("example") ServicestatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicestatus
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int updateByExample(@Param("record") Servicestatus record, @Param("example") ServicestatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicestatus
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int updateByPrimaryKeySelective(Servicestatus record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicestatus
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int updateByPrimaryKey(Servicestatus record);

	Servicestatus findByName(String servicestatus);

}