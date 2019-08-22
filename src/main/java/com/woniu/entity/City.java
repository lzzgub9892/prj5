package com.woniu.entity;

import java.io.Serializable;
import java.util.List;

public class City implements Serializable{
	
	private Province province;
	
	
	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column city.cid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	private Integer cid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column city.cname
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	private String cname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column city.pid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	private Integer pid;
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column city.cid
	 * @return  the value of city.cid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public Integer getCid() {
		return cid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column city.cid
	 * @param cid  the value for city.cid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column city.cname
	 * @return  the value of city.cname
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column city.cname
	 * @param cname  the value for city.cname
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column city.pid
	 * @return  the value of city.pid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public Integer getPid() {
		return pid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column city.pid
	 * @param pid  the value for city.pid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	private List zones;
    public List getZones() {
		return zones;
	}

	public void setZones(List zones) {
		this.zones = zones;
	}
}