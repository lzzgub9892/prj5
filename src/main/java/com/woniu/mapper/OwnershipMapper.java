package com.woniu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniu.entity.Ownership;
import com.woniu.entity.OwnershipExample;

public interface OwnershipMapper {
	List<Ownership> findByHid(Integer hid);
	/**
	 * 通过购房人id查找有几套房
	 * @param buyerid
	 * @return
	 */
	Integer countByBuyerid(Integer buyerid);
	
	List<Ownership> findByClientid(Integer clientid);
	
	Ownership findByServicenumber(String servicenumber);

	void deleteByRoomid(Integer roomid);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ownership
	 * @mbg.generated  Wed Aug 21 14:57:48 CST 2019
	 */
	long countByExample(OwnershipExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ownership
	 * @mbg.generated  Wed Aug 21 14:57:48 CST 2019
	 */
	int deleteByExample(OwnershipExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ownership
	 * @mbg.generated  Wed Aug 21 14:57:48 CST 2019
	 */
	int deleteByPrimaryKey(Integer osid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ownership
	 * @mbg.generated  Wed Aug 21 14:57:48 CST 2019
	 */
	int insert(Ownership record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ownership
	 * @mbg.generated  Wed Aug 21 14:57:48 CST 2019
	 */
	int insertSelective(Ownership record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ownership
	 * @mbg.generated  Wed Aug 21 14:57:48 CST 2019
	 */
	List<Ownership> selectByExample(OwnershipExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ownership
	 * @mbg.generated  Wed Aug 21 14:57:48 CST 2019
	 */
	Ownership selectByPrimaryKey(Integer osid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ownership
	 * @mbg.generated  Wed Aug 21 14:57:48 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Ownership record, @Param("example") OwnershipExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ownership
	 * @mbg.generated  Wed Aug 21 14:57:48 CST 2019
	 */
	int updateByExample(@Param("record") Ownership record, @Param("example") OwnershipExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ownership
	 * @mbg.generated  Wed Aug 21 14:57:48 CST 2019
	 */
	int updateByPrimaryKeySelective(Ownership record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ownership
	 * @mbg.generated  Wed Aug 21 14:57:48 CST 2019
	 */
	int updateByPrimaryKey(Ownership record);
}