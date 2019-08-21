package com.woniu.mapper;

import com.woniu.entity.Servicetype;
import com.woniu.entity.ServicetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicetypeMapper {
	List<Servicetype> findByPid(Integer pid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicetype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	long countByExample(ServicetypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicetype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByExample(ServicetypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicetype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByPrimaryKey(Integer servicetypeid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicetype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insert(Servicetype record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicetype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insertSelective(Servicetype record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicetype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	List<Servicetype> selectByExample(ServicetypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicetype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	Servicetype selectByPrimaryKey(Integer servicetypeid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicetype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Servicetype record, @Param("example") ServicetypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicetype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExample(@Param("record") Servicetype record, @Param("example") ServicetypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicetype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKeySelective(Servicetype record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servicetype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKey(Servicetype record);
}