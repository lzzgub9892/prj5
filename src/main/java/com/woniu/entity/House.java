package com.woniu.entity;

public class House {
    @Override
	public String toString() {
		return "House [company=" + company + ", landuse=" + landuse + ", landownership=" + landownership + ", roomtype="
				+ roomtype + ", designpurposes=" + designpurposes + ", zone=" + zone + ", buildingarea=" + buildingarea
				+ ", landnumber=" + landnumber + ", buildingstructure=" + buildingstructure + ", gainingmethod="
				+ gainingmethod + ", housestatus=" + housestatus + ", hid=" + hid + ", hname=" + hname + ", cid=" + cid
				+ ", lid=" + lid + ", oid=" + oid + ", rid=" + rid + ", did=" + did + ", zid=" + zid + ", bid=" + bid
				+ ", lnid=" + lnid + ", bsid=" + bsid + ", gid=" + gid + ", location=" + location + ", housedrawing="
				+ housedrawing + ", housestatusid=" + housestatusid + "]";
	}
    private Company company;
    private Landuse landuse;
    private Landownership landownership;
    private Roomtype roomtype;
    private Designpurposes designpurposes;
    private Zone zone;
    private Buildingarea buildingarea;
    private Landnumber landnumber;
    private Buildingstructure buildingstructure;
    private Gainingmethod gainingmethod;
    private Housestatus housestatus;
    
    
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Landuse getLanduse() {
		return landuse;
	}

	public void setLanduse(Landuse landuse) {
		this.landuse = landuse;
	}

	public Landownership getLandownership() {
		return landownership;
	}

	public void setLandownership(Landownership landownership) {
		this.landownership = landownership;
	}

	public Roomtype getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(Roomtype roomtype) {
		this.roomtype = roomtype;
	}

	public Designpurposes getDesignpurposes() {
		return designpurposes;
	}

	public void setDesignpurposes(Designpurposes designpurposes) {
		this.designpurposes = designpurposes;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public Buildingarea getBuildingarea() {
		return buildingarea;
	}

	public void setBuildingarea(Buildingarea buildingarea) {
		this.buildingarea = buildingarea;
	}

	public Landnumber getLandnumber() {
		return landnumber;
	}

	public void setLandnumber(Landnumber landnumber) {
		this.landnumber = landnumber;
	}

	public Buildingstructure getBuildingstructure() {
		return buildingstructure;
	}

	public void setBuildingstructure(Buildingstructure buildingstructure) {
		this.buildingstructure = buildingstructure;
	}

	public Gainingmethod getGainingmethod() {
		return gainingmethod;
	}

	public void setGainingmethod(Gainingmethod gainingmethod) {
		this.gainingmethod = gainingmethod;
	}

	public Housestatus getHousestatus() {
		return housestatus;
	}

	public void setHousestatus(Housestatus housestatus) {
		this.housestatus = housestatus;
	}
	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.hid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer hid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.hname
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private String hname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.cid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.lid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer lid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.oid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer oid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.rid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer rid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.did
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer did;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.zid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer zid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.bid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer bid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.lnid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer lnid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.bsid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer bsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.gid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer gid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.location
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.housedrawing
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private String housedrawing;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house.housestatusid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    private Integer housestatusid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.hid
     *
     * @return the value of house.hid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.hid
     *
     * @param hid the value for house.hid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.hname
     *
     * @return the value of house.hname
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public String getHname() {
        return hname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.hname
     *
     * @param hname the value for house.hname
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setHname(String hname) {
        this.hname = hname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.cid
     *
     * @return the value of house.cid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.cid
     *
     * @param cid the value for house.cid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.lid
     *
     * @return the value of house.lid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getLid() {
        return lid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.lid
     *
     * @param lid the value for house.lid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setLid(Integer lid) {
        this.lid = lid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.oid
     *
     * @return the value of house.oid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.oid
     *
     * @param oid the value for house.oid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.rid
     *
     * @return the value of house.rid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.rid
     *
     * @param rid the value for house.rid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.did
     *
     * @return the value of house.did
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.did
     *
     * @param did the value for house.did
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.zid
     *
     * @return the value of house.zid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getZid() {
        return zid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.zid
     *
     * @param zid the value for house.zid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setZid(Integer zid) {
        this.zid = zid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.bid
     *
     * @return the value of house.bid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getBid() {
        return bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.bid
     *
     * @param bid the value for house.bid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.lnid
     *
     * @return the value of house.lnid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getLnid() {
        return lnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.lnid
     *
     * @param lnid the value for house.lnid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setLnid(Integer lnid) {
        this.lnid = lnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.bsid
     *
     * @return the value of house.bsid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getBsid() {
        return bsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.bsid
     *
     * @param bsid the value for house.bsid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setBsid(Integer bsid) {
        this.bsid = bsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.gid
     *
     * @return the value of house.gid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.gid
     *
     * @param gid the value for house.gid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.location
     *
     * @return the value of house.location
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.location
     *
     * @param location the value for house.location
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.housedrawing
     *
     * @return the value of house.housedrawing
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public String getHousedrawing() {
        return housedrawing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.housedrawing
     *
     * @param housedrawing the value for house.housedrawing
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setHousedrawing(String housedrawing) {
        this.housedrawing = housedrawing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house.housestatusid
     *
     * @return the value of house.housestatusid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Integer getHousestatusid() {
        return housestatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house.housestatusid
     *
     * @param housestatusid the value for house.housestatusid
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setHousestatusid(Integer housestatusid) {
        this.housestatusid = housestatusid;
    }
}