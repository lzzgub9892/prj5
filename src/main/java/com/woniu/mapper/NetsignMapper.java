package com.woniu.mapper;

import com.woniu.entity.Netsign;
import com.woniu.entity.NetsignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetsignMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table netsign
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	long countByExample(NetsignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table netsign
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int deleteByExample(NetsignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table netsign
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int deleteByPrimaryKey(Integer netid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table netsign
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int insert(Netsign record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table netsign
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int insertSelective(Netsign record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table netsign
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	List<Netsign> selectByExample(NetsignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table netsign
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	Netsign selectByPrimaryKey(Integer netid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table netsign
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Netsign record, @Param("example") NetsignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table netsign
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int updateByExample(@Param("record") Netsign record, @Param("example") NetsignExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table netsign
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int updateByPrimaryKeySelective(Netsign record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table netsign
	 * @mbg.generated  Tue Aug 20 18:39:04 CST 2019
	 */
	int updateByPrimaryKey(Netsign record);
}