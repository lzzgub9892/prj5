package com.woniu.mapper;

import com.woniu.entity.Indept;
import com.woniu.entity.IndeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndeptMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indept
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	long countByExample(IndeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indept
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByExample(IndeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indept
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int deleteByPrimaryKey(Integer indeptid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indept
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insert(Indept record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indept
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int insertSelective(Indept record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indept
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	List<Indept> selectByExample(IndeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indept
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	Indept selectByPrimaryKey(Integer indeptid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indept
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Indept record, @Param("example") IndeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indept
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByExample(@Param("record") Indept record, @Param("example") IndeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indept
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKeySelective(Indept record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indept
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	int updateByPrimaryKey(Indept record);
}