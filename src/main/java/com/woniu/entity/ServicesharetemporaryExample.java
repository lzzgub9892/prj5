package com.woniu.entity;

import java.util.ArrayList;
import java.util.List;

public class ServicesharetemporaryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    public ServicesharetemporaryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
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
     * This method corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
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

        public Criteria andShareidIsNull() {
            addCriterion("shareid is null");
            return (Criteria) this;
        }

        public Criteria andShareidIsNotNull() {
            addCriterion("shareid is not null");
            return (Criteria) this;
        }

        public Criteria andShareidEqualTo(Integer value) {
            addCriterion("shareid =", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidNotEqualTo(Integer value) {
            addCriterion("shareid <>", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidGreaterThan(Integer value) {
            addCriterion("shareid >", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shareid >=", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidLessThan(Integer value) {
            addCriterion("shareid <", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidLessThanOrEqualTo(Integer value) {
            addCriterion("shareid <=", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidIn(List<Integer> values) {
            addCriterion("shareid in", values, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidNotIn(List<Integer> values) {
            addCriterion("shareid not in", values, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidBetween(Integer value1, Integer value2) {
            addCriterion("shareid between", value1, value2, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidNotBetween(Integer value1, Integer value2) {
            addCriterion("shareid not between", value1, value2, "shareid");
            return (Criteria) this;
        }

        public Criteria andRtidIsNull() {
            addCriterion("rtid is null");
            return (Criteria) this;
        }

        public Criteria andRtidIsNotNull() {
            addCriterion("rtid is not null");
            return (Criteria) this;
        }

        public Criteria andRtidEqualTo(Integer value) {
            addCriterion("rtid =", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidNotEqualTo(Integer value) {
            addCriterion("rtid <>", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidGreaterThan(Integer value) {
            addCriterion("rtid >", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtid >=", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidLessThan(Integer value) {
            addCriterion("rtid <", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidLessThanOrEqualTo(Integer value) {
            addCriterion("rtid <=", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidIn(List<Integer> values) {
            addCriterion("rtid in", values, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidNotIn(List<Integer> values) {
            addCriterion("rtid not in", values, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidBetween(Integer value1, Integer value2) {
            addCriterion("rtid between", value1, value2, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidNotBetween(Integer value1, Integer value2) {
            addCriterion("rtid not between", value1, value2, "rtid");
            return (Criteria) this;
        }

        public Criteria andSharenameIsNull() {
            addCriterion("sharename is null");
            return (Criteria) this;
        }

        public Criteria andSharenameIsNotNull() {
            addCriterion("sharename is not null");
            return (Criteria) this;
        }

        public Criteria andSharenameEqualTo(String value) {
            addCriterion("sharename =", value, "sharename");
            return (Criteria) this;
        }

        public Criteria andSharenameNotEqualTo(String value) {
            addCriterion("sharename <>", value, "sharename");
            return (Criteria) this;
        }

        public Criteria andSharenameGreaterThan(String value) {
            addCriterion("sharename >", value, "sharename");
            return (Criteria) this;
        }

        public Criteria andSharenameGreaterThanOrEqualTo(String value) {
            addCriterion("sharename >=", value, "sharename");
            return (Criteria) this;
        }

        public Criteria andSharenameLessThan(String value) {
            addCriterion("sharename <", value, "sharename");
            return (Criteria) this;
        }

        public Criteria andSharenameLessThanOrEqualTo(String value) {
            addCriterion("sharename <=", value, "sharename");
            return (Criteria) this;
        }

        public Criteria andSharenameLike(String value) {
            addCriterion("sharename like", value, "sharename");
            return (Criteria) this;
        }

        public Criteria andSharenameNotLike(String value) {
            addCriterion("sharename not like", value, "sharename");
            return (Criteria) this;
        }

        public Criteria andSharenameIn(List<String> values) {
            addCriterion("sharename in", values, "sharename");
            return (Criteria) this;
        }

        public Criteria andSharenameNotIn(List<String> values) {
            addCriterion("sharename not in", values, "sharename");
            return (Criteria) this;
        }

        public Criteria andSharenameBetween(String value1, String value2) {
            addCriterion("sharename between", value1, value2, "sharename");
            return (Criteria) this;
        }

        public Criteria andSharenameNotBetween(String value1, String value2) {
            addCriterion("sharename not between", value1, value2, "sharename");
            return (Criteria) this;
        }

        public Criteria andShareidcardIsNull() {
            addCriterion("shareidcard is null");
            return (Criteria) this;
        }

        public Criteria andShareidcardIsNotNull() {
            addCriterion("shareidcard is not null");
            return (Criteria) this;
        }

        public Criteria andShareidcardEqualTo(String value) {
            addCriterion("shareidcard =", value, "shareidcard");
            return (Criteria) this;
        }

        public Criteria andShareidcardNotEqualTo(String value) {
            addCriterion("shareidcard <>", value, "shareidcard");
            return (Criteria) this;
        }

        public Criteria andShareidcardGreaterThan(String value) {
            addCriterion("shareidcard >", value, "shareidcard");
            return (Criteria) this;
        }

        public Criteria andShareidcardGreaterThanOrEqualTo(String value) {
            addCriterion("shareidcard >=", value, "shareidcard");
            return (Criteria) this;
        }

        public Criteria andShareidcardLessThan(String value) {
            addCriterion("shareidcard <", value, "shareidcard");
            return (Criteria) this;
        }

        public Criteria andShareidcardLessThanOrEqualTo(String value) {
            addCriterion("shareidcard <=", value, "shareidcard");
            return (Criteria) this;
        }

        public Criteria andShareidcardLike(String value) {
            addCriterion("shareidcard like", value, "shareidcard");
            return (Criteria) this;
        }

        public Criteria andShareidcardNotLike(String value) {
            addCriterion("shareidcard not like", value, "shareidcard");
            return (Criteria) this;
        }

        public Criteria andShareidcardIn(List<String> values) {
            addCriterion("shareidcard in", values, "shareidcard");
            return (Criteria) this;
        }

        public Criteria andShareidcardNotIn(List<String> values) {
            addCriterion("shareidcard not in", values, "shareidcard");
            return (Criteria) this;
        }

        public Criteria andShareidcardBetween(String value1, String value2) {
            addCriterion("shareidcard between", value1, value2, "shareidcard");
            return (Criteria) this;
        }

        public Criteria andShareidcardNotBetween(String value1, String value2) {
            addCriterion("shareidcard not between", value1, value2, "shareidcard");
            return (Criteria) this;
        }

        public Criteria andShareaddresssIsNull() {
            addCriterion("shareaddresss is null");
            return (Criteria) this;
        }

        public Criteria andShareaddresssIsNotNull() {
            addCriterion("shareaddresss is not null");
            return (Criteria) this;
        }

        public Criteria andShareaddresssEqualTo(String value) {
            addCriterion("shareaddresss =", value, "shareaddresss");
            return (Criteria) this;
        }

        public Criteria andShareaddresssNotEqualTo(String value) {
            addCriterion("shareaddresss <>", value, "shareaddresss");
            return (Criteria) this;
        }

        public Criteria andShareaddresssGreaterThan(String value) {
            addCriterion("shareaddresss >", value, "shareaddresss");
            return (Criteria) this;
        }

        public Criteria andShareaddresssGreaterThanOrEqualTo(String value) {
            addCriterion("shareaddresss >=", value, "shareaddresss");
            return (Criteria) this;
        }

        public Criteria andShareaddresssLessThan(String value) {
            addCriterion("shareaddresss <", value, "shareaddresss");
            return (Criteria) this;
        }

        public Criteria andShareaddresssLessThanOrEqualTo(String value) {
            addCriterion("shareaddresss <=", value, "shareaddresss");
            return (Criteria) this;
        }

        public Criteria andShareaddresssLike(String value) {
            addCriterion("shareaddresss like", value, "shareaddresss");
            return (Criteria) this;
        }

        public Criteria andShareaddresssNotLike(String value) {
            addCriterion("shareaddresss not like", value, "shareaddresss");
            return (Criteria) this;
        }

        public Criteria andShareaddresssIn(List<String> values) {
            addCriterion("shareaddresss in", values, "shareaddresss");
            return (Criteria) this;
        }

        public Criteria andShareaddresssNotIn(List<String> values) {
            addCriterion("shareaddresss not in", values, "shareaddresss");
            return (Criteria) this;
        }

        public Criteria andShareaddresssBetween(String value1, String value2) {
            addCriterion("shareaddresss between", value1, value2, "shareaddresss");
            return (Criteria) this;
        }

        public Criteria andShareaddresssNotBetween(String value1, String value2) {
            addCriterion("shareaddresss not between", value1, value2, "shareaddresss");
            return (Criteria) this;
        }

        public Criteria andSharetypeIsNull() {
            addCriterion("sharetype is null");
            return (Criteria) this;
        }

        public Criteria andSharetypeIsNotNull() {
            addCriterion("sharetype is not null");
            return (Criteria) this;
        }

        public Criteria andSharetypeEqualTo(String value) {
            addCriterion("sharetype =", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeNotEqualTo(String value) {
            addCriterion("sharetype <>", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeGreaterThan(String value) {
            addCriterion("sharetype >", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeGreaterThanOrEqualTo(String value) {
            addCriterion("sharetype >=", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeLessThan(String value) {
            addCriterion("sharetype <", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeLessThanOrEqualTo(String value) {
            addCriterion("sharetype <=", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeLike(String value) {
            addCriterion("sharetype like", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeNotLike(String value) {
            addCriterion("sharetype not like", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeIn(List<String> values) {
            addCriterion("sharetype in", values, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeNotIn(List<String> values) {
            addCriterion("sharetype not in", values, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeBetween(String value1, String value2) {
            addCriterion("sharetype between", value1, value2, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeNotBetween(String value1, String value2) {
            addCriterion("sharetype not between", value1, value2, "sharetype");
            return (Criteria) this;
        }

        public Criteria andShareIsNull() {
            addCriterion("share is null");
            return (Criteria) this;
        }

        public Criteria andShareIsNotNull() {
            addCriterion("share is not null");
            return (Criteria) this;
        }

        public Criteria andShareEqualTo(Double value) {
            addCriterion("share =", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareNotEqualTo(Double value) {
            addCriterion("share <>", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareGreaterThan(Double value) {
            addCriterion("share >", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareGreaterThanOrEqualTo(Double value) {
            addCriterion("share >=", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareLessThan(Double value) {
            addCriterion("share <", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareLessThanOrEqualTo(Double value) {
            addCriterion("share <=", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareIn(List<Double> values) {
            addCriterion("share in", values, "share");
            return (Criteria) this;
        }

        public Criteria andShareNotIn(List<Double> values) {
            addCriterion("share not in", values, "share");
            return (Criteria) this;
        }

        public Criteria andShareBetween(Double value1, Double value2) {
            addCriterion("share between", value1, value2, "share");
            return (Criteria) this;
        }

        public Criteria andShareNotBetween(Double value1, Double value2) {
            addCriterion("share not between", value1, value2, "share");
            return (Criteria) this;
        }

        public Criteria andSharetelIsNull() {
            addCriterion("sharetel is null");
            return (Criteria) this;
        }

        public Criteria andSharetelIsNotNull() {
            addCriterion("sharetel is not null");
            return (Criteria) this;
        }

        public Criteria andSharetelEqualTo(String value) {
            addCriterion("sharetel =", value, "sharetel");
            return (Criteria) this;
        }

        public Criteria andSharetelNotEqualTo(String value) {
            addCriterion("sharetel <>", value, "sharetel");
            return (Criteria) this;
        }

        public Criteria andSharetelGreaterThan(String value) {
            addCriterion("sharetel >", value, "sharetel");
            return (Criteria) this;
        }

        public Criteria andSharetelGreaterThanOrEqualTo(String value) {
            addCriterion("sharetel >=", value, "sharetel");
            return (Criteria) this;
        }

        public Criteria andSharetelLessThan(String value) {
            addCriterion("sharetel <", value, "sharetel");
            return (Criteria) this;
        }

        public Criteria andSharetelLessThanOrEqualTo(String value) {
            addCriterion("sharetel <=", value, "sharetel");
            return (Criteria) this;
        }

        public Criteria andSharetelLike(String value) {
            addCriterion("sharetel like", value, "sharetel");
            return (Criteria) this;
        }

        public Criteria andSharetelNotLike(String value) {
            addCriterion("sharetel not like", value, "sharetel");
            return (Criteria) this;
        }

        public Criteria andSharetelIn(List<String> values) {
            addCriterion("sharetel in", values, "sharetel");
            return (Criteria) this;
        }

        public Criteria andSharetelNotIn(List<String> values) {
            addCriterion("sharetel not in", values, "sharetel");
            return (Criteria) this;
        }

        public Criteria andSharetelBetween(String value1, String value2) {
            addCriterion("sharetel between", value1, value2, "sharetel");
            return (Criteria) this;
        }

        public Criteria andSharetelNotBetween(String value1, String value2) {
            addCriterion("sharetel not between", value1, value2, "sharetel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table servicesharetemporary
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 21 14:57:48 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table servicesharetemporary
     *
     * @mbg.generated Wed Aug 21 14:57:48 CST 2019
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