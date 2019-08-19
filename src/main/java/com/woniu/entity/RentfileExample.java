package com.woniu.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentfileExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public RentfileExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRentidIsNull() {
            addCriterion("rentid is null");
            return (Criteria) this;
        }

        public Criteria andRentidIsNotNull() {
            addCriterion("rentid is not null");
            return (Criteria) this;
        }

        public Criteria andRentidEqualTo(Integer value) {
            addCriterion("rentid =", value, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidNotEqualTo(Integer value) {
            addCriterion("rentid <>", value, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidGreaterThan(Integer value) {
            addCriterion("rentid >", value, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rentid >=", value, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidLessThan(Integer value) {
            addCriterion("rentid <", value, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidLessThanOrEqualTo(Integer value) {
            addCriterion("rentid <=", value, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidIn(List<Integer> values) {
            addCriterion("rentid in", values, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidNotIn(List<Integer> values) {
            addCriterion("rentid not in", values, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidBetween(Integer value1, Integer value2) {
            addCriterion("rentid between", value1, value2, "rentid");
            return (Criteria) this;
        }

        public Criteria andRentidNotBetween(Integer value1, Integer value2) {
            addCriterion("rentid not between", value1, value2, "rentid");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("clientid is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("clientid is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(Integer value) {
            addCriterion("clientid =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(Integer value) {
            addCriterion("clientid <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(Integer value) {
            addCriterion("clientid >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientid >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(Integer value) {
            addCriterion("clientid <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(Integer value) {
            addCriterion("clientid <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<Integer> values) {
            addCriterion("clientid in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<Integer> values) {
            addCriterion("clientid not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(Integer value1, Integer value2) {
            addCriterion("clientid between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(Integer value1, Integer value2) {
            addCriterion("clientid not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andRentclientidIsNull() {
            addCriterion("rentclientid is null");
            return (Criteria) this;
        }

        public Criteria andRentclientidIsNotNull() {
            addCriterion("rentclientid is not null");
            return (Criteria) this;
        }

        public Criteria andRentclientidEqualTo(Integer value) {
            addCriterion("rentclientid =", value, "rentclientid");
            return (Criteria) this;
        }

        public Criteria andRentclientidNotEqualTo(Integer value) {
            addCriterion("rentclientid <>", value, "rentclientid");
            return (Criteria) this;
        }

        public Criteria andRentclientidGreaterThan(Integer value) {
            addCriterion("rentclientid >", value, "rentclientid");
            return (Criteria) this;
        }

        public Criteria andRentclientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rentclientid >=", value, "rentclientid");
            return (Criteria) this;
        }

        public Criteria andRentclientidLessThan(Integer value) {
            addCriterion("rentclientid <", value, "rentclientid");
            return (Criteria) this;
        }

        public Criteria andRentclientidLessThanOrEqualTo(Integer value) {
            addCriterion("rentclientid <=", value, "rentclientid");
            return (Criteria) this;
        }

        public Criteria andRentclientidIn(List<Integer> values) {
            addCriterion("rentclientid in", values, "rentclientid");
            return (Criteria) this;
        }

        public Criteria andRentclientidNotIn(List<Integer> values) {
            addCriterion("rentclientid not in", values, "rentclientid");
            return (Criteria) this;
        }

        public Criteria andRentclientidBetween(Integer value1, Integer value2) {
            addCriterion("rentclientid between", value1, value2, "rentclientid");
            return (Criteria) this;
        }

        public Criteria andRentclientidNotBetween(Integer value1, Integer value2) {
            addCriterion("rentclientid not between", value1, value2, "rentclientid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andRenttimeIsNull() {
            addCriterion("renttime is null");
            return (Criteria) this;
        }

        public Criteria andRenttimeIsNotNull() {
            addCriterion("renttime is not null");
            return (Criteria) this;
        }

        public Criteria andRenttimeEqualTo(Date value) {
            addCriterion("renttime =", value, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeNotEqualTo(Date value) {
            addCriterion("renttime <>", value, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeGreaterThan(Date value) {
            addCriterion("renttime >", value, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("renttime >=", value, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeLessThan(Date value) {
            addCriterion("renttime <", value, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeLessThanOrEqualTo(Date value) {
            addCriterion("renttime <=", value, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeIn(List<Date> values) {
            addCriterion("renttime in", values, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeNotIn(List<Date> values) {
            addCriterion("renttime not in", values, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeBetween(Date value1, Date value2) {
            addCriterion("renttime between", value1, value2, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeNotBetween(Date value1, Date value2) {
            addCriterion("renttime not between", value1, value2, "renttime");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNull() {
            addCriterion("roomid is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomid is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Integer value) {
            addCriterion("roomid =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Integer value) {
            addCriterion("roomid <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Integer value) {
            addCriterion("roomid >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomid >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Integer value) {
            addCriterion("roomid <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Integer value) {
            addCriterion("roomid <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Integer> values) {
            addCriterion("roomid in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Integer> values) {
            addCriterion("roomid not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Integer value1, Integer value2) {
            addCriterion("roomid between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("roomid not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRentdateIsNull() {
            addCriterion("rentdate is null");
            return (Criteria) this;
        }

        public Criteria andRentdateIsNotNull() {
            addCriterion("rentdate is not null");
            return (Criteria) this;
        }

        public Criteria andRentdateEqualTo(Date value) {
            addCriterion("rentdate =", value, "rentdate");
            return (Criteria) this;
        }

        public Criteria andRentdateNotEqualTo(Date value) {
            addCriterion("rentdate <>", value, "rentdate");
            return (Criteria) this;
        }

        public Criteria andRentdateGreaterThan(Date value) {
            addCriterion("rentdate >", value, "rentdate");
            return (Criteria) this;
        }

        public Criteria andRentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("rentdate >=", value, "rentdate");
            return (Criteria) this;
        }

        public Criteria andRentdateLessThan(Date value) {
            addCriterion("rentdate <", value, "rentdate");
            return (Criteria) this;
        }

        public Criteria andRentdateLessThanOrEqualTo(Date value) {
            addCriterion("rentdate <=", value, "rentdate");
            return (Criteria) this;
        }

        public Criteria andRentdateIn(List<Date> values) {
            addCriterion("rentdate in", values, "rentdate");
            return (Criteria) this;
        }

        public Criteria andRentdateNotIn(List<Date> values) {
            addCriterion("rentdate not in", values, "rentdate");
            return (Criteria) this;
        }

        public Criteria andRentdateBetween(Date value1, Date value2) {
            addCriterion("rentdate between", value1, value2, "rentdate");
            return (Criteria) this;
        }

        public Criteria andRentdateNotBetween(Date value1, Date value2) {
            addCriterion("rentdate not between", value1, value2, "rentdate");
            return (Criteria) this;
        }

        public Criteria andRentpayIsNull() {
            addCriterion("rentpay is null");
            return (Criteria) this;
        }

        public Criteria andRentpayIsNotNull() {
            addCriterion("rentpay is not null");
            return (Criteria) this;
        }

        public Criteria andRentpayEqualTo(BigDecimal value) {
            addCriterion("rentpay =", value, "rentpay");
            return (Criteria) this;
        }

        public Criteria andRentpayNotEqualTo(BigDecimal value) {
            addCriterion("rentpay <>", value, "rentpay");
            return (Criteria) this;
        }

        public Criteria andRentpayGreaterThan(BigDecimal value) {
            addCriterion("rentpay >", value, "rentpay");
            return (Criteria) this;
        }

        public Criteria andRentpayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rentpay >=", value, "rentpay");
            return (Criteria) this;
        }

        public Criteria andRentpayLessThan(BigDecimal value) {
            addCriterion("rentpay <", value, "rentpay");
            return (Criteria) this;
        }

        public Criteria andRentpayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rentpay <=", value, "rentpay");
            return (Criteria) this;
        }

        public Criteria andRentpayIn(List<BigDecimal> values) {
            addCriterion("rentpay in", values, "rentpay");
            return (Criteria) this;
        }

        public Criteria andRentpayNotIn(List<BigDecimal> values) {
            addCriterion("rentpay not in", values, "rentpay");
            return (Criteria) this;
        }

        public Criteria andRentpayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rentpay between", value1, value2, "rentpay");
            return (Criteria) this;
        }

        public Criteria andRentpayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rentpay not between", value1, value2, "rentpay");
            return (Criteria) this;
        }

        public Criteria andCashpayIsNull() {
            addCriterion("cashpay is null");
            return (Criteria) this;
        }

        public Criteria andCashpayIsNotNull() {
            addCriterion("cashpay is not null");
            return (Criteria) this;
        }

        public Criteria andCashpayEqualTo(BigDecimal value) {
            addCriterion("cashpay =", value, "cashpay");
            return (Criteria) this;
        }

        public Criteria andCashpayNotEqualTo(BigDecimal value) {
            addCriterion("cashpay <>", value, "cashpay");
            return (Criteria) this;
        }

        public Criteria andCashpayGreaterThan(BigDecimal value) {
            addCriterion("cashpay >", value, "cashpay");
            return (Criteria) this;
        }

        public Criteria andCashpayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cashpay >=", value, "cashpay");
            return (Criteria) this;
        }

        public Criteria andCashpayLessThan(BigDecimal value) {
            addCriterion("cashpay <", value, "cashpay");
            return (Criteria) this;
        }

        public Criteria andCashpayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cashpay <=", value, "cashpay");
            return (Criteria) this;
        }

        public Criteria andCashpayIn(List<BigDecimal> values) {
            addCriterion("cashpay in", values, "cashpay");
            return (Criteria) this;
        }

        public Criteria andCashpayNotIn(List<BigDecimal> values) {
            addCriterion("cashpay not in", values, "cashpay");
            return (Criteria) this;
        }

        public Criteria andCashpayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cashpay between", value1, value2, "cashpay");
            return (Criteria) this;
        }

        public Criteria andCashpayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cashpay not between", value1, value2, "cashpay");
            return (Criteria) this;
        }

        public Criteria andRentfileIsNull() {
            addCriterion("rentfile is null");
            return (Criteria) this;
        }

        public Criteria andRentfileIsNotNull() {
            addCriterion("rentfile is not null");
            return (Criteria) this;
        }

        public Criteria andRentfileEqualTo(String value) {
            addCriterion("rentfile =", value, "rentfile");
            return (Criteria) this;
        }

        public Criteria andRentfileNotEqualTo(String value) {
            addCriterion("rentfile <>", value, "rentfile");
            return (Criteria) this;
        }

        public Criteria andRentfileGreaterThan(String value) {
            addCriterion("rentfile >", value, "rentfile");
            return (Criteria) this;
        }

        public Criteria andRentfileGreaterThanOrEqualTo(String value) {
            addCriterion("rentfile >=", value, "rentfile");
            return (Criteria) this;
        }

        public Criteria andRentfileLessThan(String value) {
            addCriterion("rentfile <", value, "rentfile");
            return (Criteria) this;
        }

        public Criteria andRentfileLessThanOrEqualTo(String value) {
            addCriterion("rentfile <=", value, "rentfile");
            return (Criteria) this;
        }

        public Criteria andRentfileLike(String value) {
            addCriterion("rentfile like", value, "rentfile");
            return (Criteria) this;
        }

        public Criteria andRentfileNotLike(String value) {
            addCriterion("rentfile not like", value, "rentfile");
            return (Criteria) this;
        }

        public Criteria andRentfileIn(List<String> values) {
            addCriterion("rentfile in", values, "rentfile");
            return (Criteria) this;
        }

        public Criteria andRentfileNotIn(List<String> values) {
            addCriterion("rentfile not in", values, "rentfile");
            return (Criteria) this;
        }

        public Criteria andRentfileBetween(String value1, String value2) {
            addCriterion("rentfile between", value1, value2, "rentfile");
            return (Criteria) this;
        }

        public Criteria andRentfileNotBetween(String value1, String value2) {
            addCriterion("rentfile not between", value1, value2, "rentfile");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNull() {
            addCriterion("descript is null");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("descript is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("descript =", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("descript <>", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThan(String value) {
            addCriterion("descript >", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("descript >=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThan(String value) {
            addCriterion("descript <", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThanOrEqualTo(String value) {
            addCriterion("descript <=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLike(String value) {
            addCriterion("descript like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("descript not like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("descript in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("descript not in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("descript between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("descript not between", value1, value2, "descript");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rentfile
     *
     * @mbg.generated do_not_delete_during_merge Mon Aug 19 15:45:31 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rentfile
     *
     * @mbg.generated Mon Aug 19 15:45:31 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}