package com.woniu.mapper;

import com.woniu.entity.Registrationtype;
import com.woniu.entity.RegistrationtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistrationtypeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table registrationtype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	long countByExample(RegistrationtypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table registrationtype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByExample(RegistrationtypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table registrationtype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByPrimaryKey(Integer registrationtypeid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table registrationtype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insert(Registrationtype record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table registrationtype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insertSelective(Registrationtype record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table registrationtype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	List<Registrationtype> selectByExample(RegistrationtypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table registrationtype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	Registrationtype selectByPrimaryKey(Integer registrationtypeid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table registrationtype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Registrationtype record,
			@Param("example") RegistrationtypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table registrationtype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExample(@Param("record") Registrationtype record, @Param("example") RegistrationtypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table registrationtype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKeySelective(Registrationtype record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table registrationtype
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKey(Registrationtype record);
}