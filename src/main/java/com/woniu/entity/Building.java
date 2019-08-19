package com.woniu.entity;

public class Building {
	private House house;
	
    public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	@Override
	public String toString() {
		return "Building [house=" + house + ", buildingid=" + buildingid + ", buildingname=" + buildingname
				+ ", buildingnumber=" + buildingnumber + ", floor=" + floor + ", count=" + count + ", totalarea="
				+ totalarea + ", descripe=" + descripe + ", hid=" + hid + "]";
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.buildingid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer buildingid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.buildingname
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private String buildingname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.buildingnumber
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private String buildingnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.floor
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer floor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.count
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.totalarea
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer totalarea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.descripe
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private String descripe;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.hid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer hid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.buildingid
     *
     * @return the value of building.buildingid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getBuildingid() {
        return buildingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.buildingid
     *
     * @param buildingid the value for building.buildingid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.buildingname
     *
     * @return the value of building.buildingname
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public String getBuildingname() {
        return buildingname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.buildingname
     *
     * @param buildingname the value for building.buildingname
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.buildingnumber
     *
     * @return the value of building.buildingnumber
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public String getBuildingnumber() {
        return buildingnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.buildingnumber
     *
     * @param buildingnumber the value for building.buildingnumber
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setBuildingnumber(String buildingnumber) {
        this.buildingnumber = buildingnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.floor
     *
     * @return the value of building.floor
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getFloor() {
        return floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.floor
     *
     * @param floor the value for building.floor
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.count
     *
     * @return the value of building.count
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.count
     *
     * @param count the value for building.count
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.totalarea
     *
     * @return the value of building.totalarea
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getTotalarea() {
        return totalarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.totalarea
     *
     * @param totalarea the value for building.totalarea
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setTotalarea(Integer totalarea) {
        this.totalarea = totalarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.descripe
     *
     * @return the value of building.descripe
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public String getDescripe() {
        return descripe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.descripe
     *
     * @param descripe the value for building.descripe
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setDescripe(String descripe) {
        this.descripe = descripe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.hid
     *
     * @return the value of building.hid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.hid
     *
     * @param hid the value for building.hid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }
}