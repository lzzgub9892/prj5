package com.woniu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dissentingregistration {
	
	private List<Client> clients=new ArrayList<Client>();
	
	
	
	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	private Service service;
	private Userinfo userinfo;
	
    public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dissentingregistration.id
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dissentingregistration.serviceid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    private Integer serviceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dissentingregistration.clientid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    private Integer clientid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dissentingregistration.dissentingitem
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    private String dissentingitem;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dissentingregistration.registertime
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    private Date registertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dissentingregistration.uid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dissentingregistration.dissentingserviceid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    private Integer dissentingserviceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dissentingregistration.descript
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    private String descript;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dissentingregistration.roomid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    private Integer roomid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dissentingregistration.id
     *
     * @return the value of dissentingregistration.id
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dissentingregistration.id
     *
     * @param id the value for dissentingregistration.id
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dissentingregistration.serviceid
     *
     * @return the value of dissentingregistration.serviceid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public Integer getServiceid() {
        return serviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dissentingregistration.serviceid
     *
     * @param serviceid the value for dissentingregistration.serviceid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dissentingregistration.clientid
     *
     * @return the value of dissentingregistration.clientid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public Integer getClientid() {
        return clientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dissentingregistration.clientid
     *
     * @param clientid the value for dissentingregistration.clientid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dissentingregistration.dissentingitem
     *
     * @return the value of dissentingregistration.dissentingitem
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public String getDissentingitem() {
        return dissentingitem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dissentingregistration.dissentingitem
     *
     * @param dissentingitem the value for dissentingregistration.dissentingitem
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public void setDissentingitem(String dissentingitem) {
        this.dissentingitem = dissentingitem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dissentingregistration.registertime
     *
     * @return the value of dissentingregistration.registertime
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public Date getRegistertime() {
        return registertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dissentingregistration.registertime
     *
     * @param registertime the value for dissentingregistration.registertime
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dissentingregistration.uid
     *
     * @return the value of dissentingregistration.uid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dissentingregistration.uid
     *
     * @param uid the value for dissentingregistration.uid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dissentingregistration.dissentingserviceid
     *
     * @return the value of dissentingregistration.dissentingserviceid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public Integer getDissentingserviceid() {
        return dissentingserviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dissentingregistration.dissentingserviceid
     *
     * @param dissentingserviceid the value for dissentingregistration.dissentingserviceid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public void setDissentingserviceid(Integer dissentingserviceid) {
        this.dissentingserviceid = dissentingserviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dissentingregistration.descript
     *
     * @return the value of dissentingregistration.descript
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public String getDescript() {
        return descript;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dissentingregistration.descript
     *
     * @param descript the value for dissentingregistration.descript
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dissentingregistration.roomid
     *
     * @return the value of dissentingregistration.roomid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public Integer getRoomid() {
        return roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dissentingregistration.roomid
     *
     * @param roomid the value for dissentingregistration.roomid
     *
     * @mbggenerated Thu Aug 22 19:46:37 CST 2019
     */
    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }
}