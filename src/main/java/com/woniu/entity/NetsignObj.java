package com.woniu.entity;

import java.io.Serializable;

//该类主要是在网签登记时封装从页面传来的各种信息
public class NetsignObj implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String hname;
	private String buildingnumber;
	private String roomnumber;
	private String buyername;
	private String buyeridcard;
	private String sellername;
	private String selleridcard;
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getBuildingnumber() {
		return buildingnumber;
	}
	public void setBuildingnumber(String buildingnumber) {
		this.buildingnumber = buildingnumber;
	}
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	public String getBuyername() {
		return buyername;
	}
	public void setBuyername(String buyername) {
		this.buyername = buyername;
	}
	public String getBuyeridcard() {
		return buyeridcard;
	}
	public void setBuyeridcard(String buyeridcard) {
		this.buyeridcard = buyeridcard;
	}
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	public String getSelleridcard() {
		return selleridcard;
	}
	public void setSelleridcard(String selleridcard) {
		this.selleridcard = selleridcard;
	}
	
	
	
	
}
