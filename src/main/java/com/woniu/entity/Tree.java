package com.woniu.entity;

import java.io.Serializable;

public class Tree implements Serializable{
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tree.tid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	private Integer tid;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tree.name
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tree.file
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	private String file;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tree.pid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	private Integer pid;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tree.icon
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	private String icon;
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tree.tid
	 * @return  the value of tree.tid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public Integer getTid() {
		return tid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tree.tid
	 * @param tid  the value for tree.tid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void setTid(Integer tid) {
		this.tid = tid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tree.name
	 * @return  the value of tree.name
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tree.name
	 * @param name  the value for tree.name
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tree.file
	 * @return  the value of tree.file
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public String getFile() {
		return file;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tree.file
	 * @param file  the value for tree.file
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tree.pid
	 * @return  the value of tree.pid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public Integer getPid() {
		return pid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tree.pid
	 * @param pid  the value for tree.pid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tree.icon
	 * @return  the value of tree.icon
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tree.icon
	 * @param icon  the value for tree.icon
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示�?�?)   
	 */ 
	private static final long serialVersionUID = 1L;

	private boolean open = true;
    public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
}