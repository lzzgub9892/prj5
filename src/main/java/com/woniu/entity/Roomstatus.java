package com.woniu.entity;

public class Roomstatus {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column roomstatus.roomstatusid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	private Integer roomstatusid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column roomstatus.roomstatus
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	private String roomstatus;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column roomstatus.roomstatusid
	 * @return  the value of roomstatus.roomstatusid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public Integer getRoomstatusid() {
		return roomstatusid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column roomstatus.roomstatusid
	 * @param roomstatusid  the value for roomstatus.roomstatusid
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void setRoomstatusid(Integer roomstatusid) {
		this.roomstatusid = roomstatusid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column roomstatus.roomstatus
	 * @return  the value of roomstatus.roomstatus
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public String getRoomstatus() {
		return roomstatus;
	}


	@Override
	public String toString() {
		return "Roomstatus [roomstatusid=" + roomstatusid + ", roomstatus=" + roomstatus + "]";
	}
    
}