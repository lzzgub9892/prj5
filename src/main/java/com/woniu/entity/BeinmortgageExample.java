package com.woniu.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BeinmortgageExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public BeinmortgageExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
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

		public Criteria andBmidIsNull() {
			addCriterion("bmid is null");
			return (Criteria) this;
		}

		public Criteria andBmidIsNotNull() {
			addCriterion("bmid is not null");
			return (Criteria) this;
		}

		public Criteria andBmidEqualTo(Integer value) {
			addCriterion("bmid =", value, "bmid");
			return (Criteria) this;
		}

		public Criteria andBmidNotEqualTo(Integer value) {
			addCriterion("bmid <>", value, "bmid");
			return (Criteria) this;
		}

		public Criteria andBmidGreaterThan(Integer value) {
			addCriterion("bmid >", value, "bmid");
			return (Criteria) this;
		}

		public Criteria andBmidGreaterThanOrEqualTo(Integer value) {
			addCriterion("bmid >=", value, "bmid");
			return (Criteria) this;
		}

		public Criteria andBmidLessThan(Integer value) {
			addCriterion("bmid <", value, "bmid");
			return (Criteria) this;
		}

		public Criteria andBmidLessThanOrEqualTo(Integer value) {
			addCriterion("bmid <=", value, "bmid");
			return (Criteria) this;
		}

		public Criteria andBmidIn(List<Integer> values) {
			addCriterion("bmid in", values, "bmid");
			return (Criteria) this;
		}

		public Criteria andBmidNotIn(List<Integer> values) {
			addCriterion("bmid not in", values, "bmid");
			return (Criteria) this;
		}

		public Criteria andBmidBetween(Integer value1, Integer value2) {
			addCriterion("bmid between", value1, value2, "bmid");
			return (Criteria) this;
		}

		public Criteria andBmidNotBetween(Integer value1, Integer value2) {
			addCriterion("bmid not between", value1, value2, "bmid");
			return (Criteria) this;
		}

		public Criteria andServiceidIsNull() {
			addCriterion("serviceid is null");
			return (Criteria) this;
		}

		public Criteria andServiceidIsNotNull() {
			addCriterion("serviceid is not null");
			return (Criteria) this;
		}

		public Criteria andServiceidEqualTo(Integer value) {
			addCriterion("serviceid =", value, "serviceid");
			return (Criteria) this;
		}

		public Criteria andServiceidNotEqualTo(Integer value) {
			addCriterion("serviceid <>", value, "serviceid");
			return (Criteria) this;
		}

		public Criteria andServiceidGreaterThan(Integer value) {
			addCriterion("serviceid >", value, "serviceid");
			return (Criteria) this;
		}

		public Criteria andServiceidGreaterThanOrEqualTo(Integer value) {
			addCriterion("serviceid >=", value, "serviceid");
			return (Criteria) this;
		}

		public Criteria andServiceidLessThan(Integer value) {
			addCriterion("serviceid <", value, "serviceid");
			return (Criteria) this;
		}

		public Criteria andServiceidLessThanOrEqualTo(Integer value) {
			addCriterion("serviceid <=", value, "serviceid");
			return (Criteria) this;
		}

		public Criteria andServiceidIn(List<Integer> values) {
			addCriterion("serviceid in", values, "serviceid");
			return (Criteria) this;
		}

		public Criteria andServiceidNotIn(List<Integer> values) {
			addCriterion("serviceid not in", values, "serviceid");
			return (Criteria) this;
		}

		public Criteria andServiceidBetween(Integer value1, Integer value2) {
			addCriterion("serviceid between", value1, value2, "serviceid");
			return (Criteria) this;
		}

		public Criteria andServiceidNotBetween(Integer value1, Integer value2) {
			addCriterion("serviceid not between", value1, value2, "serviceid");
			return (Criteria) this;
		}

		public Criteria andGeneralmortgageIsNull() {
			addCriterion("generalmortgage is null");
			return (Criteria) this;
		}

		public Criteria andGeneralmortgageIsNotNull() {
			addCriterion("generalmortgage is not null");
			return (Criteria) this;
		}

		public Criteria andGeneralmortgageEqualTo(BigDecimal value) {
			addCriterion("generalmortgage =", value, "generalmortgage");
			return (Criteria) this;
		}

		public Criteria andGeneralmortgageNotEqualTo(BigDecimal value) {
			addCriterion("generalmortgage <>", value, "generalmortgage");
			return (Criteria) this;
		}

		public Criteria andGeneralmortgageGreaterThan(BigDecimal value) {
			addCriterion("generalmortgage >", value, "generalmortgage");
			return (Criteria) this;
		}

		public Criteria andGeneralmortgageGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("generalmortgage >=", value, "generalmortgage");
			return (Criteria) this;
		}

		public Criteria andGeneralmortgageLessThan(BigDecimal value) {
			addCriterion("generalmortgage <", value, "generalmortgage");
			return (Criteria) this;
		}

		public Criteria andGeneralmortgageLessThanOrEqualTo(BigDecimal value) {
			addCriterion("generalmortgage <=", value, "generalmortgage");
			return (Criteria) this;
		}

		public Criteria andGeneralmortgageIn(List<BigDecimal> values) {
			addCriterion("generalmortgage in", values, "generalmortgage");
			return (Criteria) this;
		}

		public Criteria andGeneralmortgageNotIn(List<BigDecimal> values) {
			addCriterion("generalmortgage not in", values, "generalmortgage");
			return (Criteria) this;
		}

		public Criteria andGeneralmortgageBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("generalmortgage between", value1, value2, "generalmortgage");
			return (Criteria) this;
		}

		public Criteria andGeneralmortgageNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("generalmortgage not between", value1, value2, "generalmortgage");
			return (Criteria) this;
		}

		public Criteria andMaxmortgageIsNull() {
			addCriterion("maxmortgage is null");
			return (Criteria) this;
		}

		public Criteria andMaxmortgageIsNotNull() {
			addCriterion("maxmortgage is not null");
			return (Criteria) this;
		}

		public Criteria andMaxmortgageEqualTo(BigDecimal value) {
			addCriterion("maxmortgage =", value, "maxmortgage");
			return (Criteria) this;
		}

		public Criteria andMaxmortgageNotEqualTo(BigDecimal value) {
			addCriterion("maxmortgage <>", value, "maxmortgage");
			return (Criteria) this;
		}

		public Criteria andMaxmortgageGreaterThan(BigDecimal value) {
			addCriterion("maxmortgage >", value, "maxmortgage");
			return (Criteria) this;
		}

		public Criteria andMaxmortgageGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("maxmortgage >=", value, "maxmortgage");
			return (Criteria) this;
		}

		public Criteria andMaxmortgageLessThan(BigDecimal value) {
			addCriterion("maxmortgage <", value, "maxmortgage");
			return (Criteria) this;
		}

		public Criteria andMaxmortgageLessThanOrEqualTo(BigDecimal value) {
			addCriterion("maxmortgage <=", value, "maxmortgage");
			return (Criteria) this;
		}

		public Criteria andMaxmortgageIn(List<BigDecimal> values) {
			addCriterion("maxmortgage in", values, "maxmortgage");
			return (Criteria) this;
		}

		public Criteria andMaxmortgageNotIn(List<BigDecimal> values) {
			addCriterion("maxmortgage not in", values, "maxmortgage");
			return (Criteria) this;
		}

		public Criteria andMaxmortgageBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("maxmortgage between", value1, value2, "maxmortgage");
			return (Criteria) this;
		}

		public Criteria andMaxmortgageNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("maxmortgage not between", value1, value2, "maxmortgage");
			return (Criteria) this;
		}

		public Criteria andMortgageeIsNull() {
			addCriterion("mortgagee is null");
			return (Criteria) this;
		}

		public Criteria andMortgageeIsNotNull() {
			addCriterion("mortgagee is not null");
			return (Criteria) this;
		}

		public Criteria andMortgageeEqualTo(Integer value) {
			addCriterion("mortgagee =", value, "mortgagee");
			return (Criteria) this;
		}

		public Criteria andMortgageeNotEqualTo(Integer value) {
			addCriterion("mortgagee <>", value, "mortgagee");
			return (Criteria) this;
		}

		public Criteria andMortgageeGreaterThan(Integer value) {
			addCriterion("mortgagee >", value, "mortgagee");
			return (Criteria) this;
		}

		public Criteria andMortgageeGreaterThanOrEqualTo(Integer value) {
			addCriterion("mortgagee >=", value, "mortgagee");
			return (Criteria) this;
		}

		public Criteria andMortgageeLessThan(Integer value) {
			addCriterion("mortgagee <", value, "mortgagee");
			return (Criteria) this;
		}

		public Criteria andMortgageeLessThanOrEqualTo(Integer value) {
			addCriterion("mortgagee <=", value, "mortgagee");
			return (Criteria) this;
		}

		public Criteria andMortgageeIn(List<Integer> values) {
			addCriterion("mortgagee in", values, "mortgagee");
			return (Criteria) this;
		}

		public Criteria andMortgageeNotIn(List<Integer> values) {
			addCriterion("mortgagee not in", values, "mortgagee");
			return (Criteria) this;
		}

		public Criteria andMortgageeBetween(Integer value1, Integer value2) {
			addCriterion("mortgagee between", value1, value2, "mortgagee");
			return (Criteria) this;
		}

		public Criteria andMortgageeNotBetween(Integer value1, Integer value2) {
			addCriterion("mortgagee not between", value1, value2, "mortgagee");
			return (Criteria) this;
		}

		public Criteria andMortgagerIsNull() {
			addCriterion("mortgager is null");
			return (Criteria) this;
		}

		public Criteria andMortgagerIsNotNull() {
			addCriterion("mortgager is not null");
			return (Criteria) this;
		}

		public Criteria andMortgagerEqualTo(Integer value) {
			addCriterion("mortgager =", value, "mortgager");
			return (Criteria) this;
		}

		public Criteria andMortgagerNotEqualTo(Integer value) {
			addCriterion("mortgager <>", value, "mortgager");
			return (Criteria) this;
		}

		public Criteria andMortgagerGreaterThan(Integer value) {
			addCriterion("mortgager >", value, "mortgager");
			return (Criteria) this;
		}

		public Criteria andMortgagerGreaterThanOrEqualTo(Integer value) {
			addCriterion("mortgager >=", value, "mortgager");
			return (Criteria) this;
		}

		public Criteria andMortgagerLessThan(Integer value) {
			addCriterion("mortgager <", value, "mortgager");
			return (Criteria) this;
		}

		public Criteria andMortgagerLessThanOrEqualTo(Integer value) {
			addCriterion("mortgager <=", value, "mortgager");
			return (Criteria) this;
		}

		public Criteria andMortgagerIn(List<Integer> values) {
			addCriterion("mortgager in", values, "mortgager");
			return (Criteria) this;
		}

		public Criteria andMortgagerNotIn(List<Integer> values) {
			addCriterion("mortgager not in", values, "mortgager");
			return (Criteria) this;
		}

		public Criteria andMortgagerBetween(Integer value1, Integer value2) {
			addCriterion("mortgager between", value1, value2, "mortgager");
			return (Criteria) this;
		}

		public Criteria andMortgagerNotBetween(Integer value1, Integer value2) {
			addCriterion("mortgager not between", value1, value2, "mortgager");
			return (Criteria) this;
		}

		public Criteria andLocationIsNull() {
			addCriterion("location is null");
			return (Criteria) this;
		}

		public Criteria andLocationIsNotNull() {
			addCriterion("location is not null");
			return (Criteria) this;
		}

		public Criteria andLocationEqualTo(String value) {
			addCriterion("location =", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationNotEqualTo(String value) {
			addCriterion("location <>", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationGreaterThan(String value) {
			addCriterion("location >", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationGreaterThanOrEqualTo(String value) {
			addCriterion("location >=", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationLessThan(String value) {
			addCriterion("location <", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationLessThanOrEqualTo(String value) {
			addCriterion("location <=", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationLike(String value) {
			addCriterion("location like", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationNotLike(String value) {
			addCriterion("location not like", value, "location");
			return (Criteria) this;
		}

		public Criteria andLocationIn(List<String> values) {
			addCriterion("location in", values, "location");
			return (Criteria) this;
		}

		public Criteria andLocationNotIn(List<String> values) {
			addCriterion("location not in", values, "location");
			return (Criteria) this;
		}

		public Criteria andLocationBetween(String value1, String value2) {
			addCriterion("location between", value1, value2, "location");
			return (Criteria) this;
		}

		public Criteria andLocationNotBetween(String value1, String value2) {
			addCriterion("location not between", value1, value2, "location");
			return (Criteria) this;
		}

		public Criteria andScopeIsNull() {
			addCriterion("scope is null");
			return (Criteria) this;
		}

		public Criteria andScopeIsNotNull() {
			addCriterion("scope is not null");
			return (Criteria) this;
		}

		public Criteria andScopeEqualTo(String value) {
			addCriterion("scope =", value, "scope");
			return (Criteria) this;
		}

		public Criteria andScopeNotEqualTo(String value) {
			addCriterion("scope <>", value, "scope");
			return (Criteria) this;
		}

		public Criteria andScopeGreaterThan(String value) {
			addCriterion("scope >", value, "scope");
			return (Criteria) this;
		}

		public Criteria andScopeGreaterThanOrEqualTo(String value) {
			addCriterion("scope >=", value, "scope");
			return (Criteria) this;
		}

		public Criteria andScopeLessThan(String value) {
			addCriterion("scope <", value, "scope");
			return (Criteria) this;
		}

		public Criteria andScopeLessThanOrEqualTo(String value) {
			addCriterion("scope <=", value, "scope");
			return (Criteria) this;
		}

		public Criteria andScopeLike(String value) {
			addCriterion("scope like", value, "scope");
			return (Criteria) this;
		}

		public Criteria andScopeNotLike(String value) {
			addCriterion("scope not like", value, "scope");
			return (Criteria) this;
		}

		public Criteria andScopeIn(List<String> values) {
			addCriterion("scope in", values, "scope");
			return (Criteria) this;
		}

		public Criteria andScopeNotIn(List<String> values) {
			addCriterion("scope not in", values, "scope");
			return (Criteria) this;
		}

		public Criteria andScopeBetween(String value1, String value2) {
			addCriterion("scope between", value1, value2, "scope");
			return (Criteria) this;
		}

		public Criteria andScopeNotBetween(String value1, String value2) {
			addCriterion("scope not between", value1, value2, "scope");
			return (Criteria) this;
		}

		public Criteria andMaxclaimIsNull() {
			addCriterion("maxclaim is null");
			return (Criteria) this;
		}

		public Criteria andMaxclaimIsNotNull() {
			addCriterion("maxclaim is not null");
			return (Criteria) this;
		}

		public Criteria andMaxclaimEqualTo(BigDecimal value) {
			addCriterion("maxclaim =", value, "maxclaim");
			return (Criteria) this;
		}

		public Criteria andMaxclaimNotEqualTo(BigDecimal value) {
			addCriterion("maxclaim <>", value, "maxclaim");
			return (Criteria) this;
		}

		public Criteria andMaxclaimGreaterThan(BigDecimal value) {
			addCriterion("maxclaim >", value, "maxclaim");
			return (Criteria) this;
		}

		public Criteria andMaxclaimGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("maxclaim >=", value, "maxclaim");
			return (Criteria) this;
		}

		public Criteria andMaxclaimLessThan(BigDecimal value) {
			addCriterion("maxclaim <", value, "maxclaim");
			return (Criteria) this;
		}

		public Criteria andMaxclaimLessThanOrEqualTo(BigDecimal value) {
			addCriterion("maxclaim <=", value, "maxclaim");
			return (Criteria) this;
		}

		public Criteria andMaxclaimIn(List<BigDecimal> values) {
			addCriterion("maxclaim in", values, "maxclaim");
			return (Criteria) this;
		}

		public Criteria andMaxclaimNotIn(List<BigDecimal> values) {
			addCriterion("maxclaim not in", values, "maxclaim");
			return (Criteria) this;
		}

		public Criteria andMaxclaimBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("maxclaim between", value1, value2, "maxclaim");
			return (Criteria) this;
		}

		public Criteria andMaxclaimNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("maxclaim not between", value1, value2, "maxclaim");
			return (Criteria) this;
		}

		public Criteria andReturntimeIsNull() {
			addCriterion("returntime is null");
			return (Criteria) this;
		}

		public Criteria andReturntimeIsNotNull() {
			addCriterion("returntime is not null");
			return (Criteria) this;
		}

		public Criteria andReturntimeEqualTo(Date value) {
			addCriterion("returntime =", value, "returntime");
			return (Criteria) this;
		}

		public Criteria andReturntimeNotEqualTo(Date value) {
			addCriterion("returntime <>", value, "returntime");
			return (Criteria) this;
		}

		public Criteria andReturntimeGreaterThan(Date value) {
			addCriterion("returntime >", value, "returntime");
			return (Criteria) this;
		}

		public Criteria andReturntimeGreaterThanOrEqualTo(Date value) {
			addCriterion("returntime >=", value, "returntime");
			return (Criteria) this;
		}

		public Criteria andReturntimeLessThan(Date value) {
			addCriterion("returntime <", value, "returntime");
			return (Criteria) this;
		}

		public Criteria andReturntimeLessThanOrEqualTo(Date value) {
			addCriterion("returntime <=", value, "returntime");
			return (Criteria) this;
		}

		public Criteria andReturntimeIn(List<Date> values) {
			addCriterion("returntime in", values, "returntime");
			return (Criteria) this;
		}

		public Criteria andReturntimeNotIn(List<Date> values) {
			addCriterion("returntime not in", values, "returntime");
			return (Criteria) this;
		}

		public Criteria andReturntimeBetween(Date value1, Date value2) {
			addCriterion("returntime between", value1, value2, "returntime");
			return (Criteria) this;
		}

		public Criteria andReturntimeNotBetween(Date value1, Date value2) {
			addCriterion("returntime not between", value1, value2, "returntime");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberIsNull() {
			addCriterion("identificationnumber is null");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberIsNotNull() {
			addCriterion("identificationnumber is not null");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberEqualTo(String value) {
			addCriterion("identificationnumber =", value, "identificationnumber");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberNotEqualTo(String value) {
			addCriterion("identificationnumber <>", value, "identificationnumber");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberGreaterThan(String value) {
			addCriterion("identificationnumber >", value, "identificationnumber");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberGreaterThanOrEqualTo(String value) {
			addCriterion("identificationnumber >=", value, "identificationnumber");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberLessThan(String value) {
			addCriterion("identificationnumber <", value, "identificationnumber");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberLessThanOrEqualTo(String value) {
			addCriterion("identificationnumber <=", value, "identificationnumber");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberLike(String value) {
			addCriterion("identificationnumber like", value, "identificationnumber");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberNotLike(String value) {
			addCriterion("identificationnumber not like", value, "identificationnumber");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberIn(List<String> values) {
			addCriterion("identificationnumber in", values, "identificationnumber");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberNotIn(List<String> values) {
			addCriterion("identificationnumber not in", values, "identificationnumber");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberBetween(String value1, String value2) {
			addCriterion("identificationnumber between", value1, value2, "identificationnumber");
			return (Criteria) this;
		}

		public Criteria andIdentificationnumberNotBetween(String value1, String value2) {
			addCriterion("identificationnumber not between", value1, value2, "identificationnumber");
			return (Criteria) this;
		}

		public Criteria andRegistertimeIsNull() {
			addCriterion("registertime is null");
			return (Criteria) this;
		}

		public Criteria andRegistertimeIsNotNull() {
			addCriterion("registertime is not null");
			return (Criteria) this;
		}

		public Criteria andRegistertimeEqualTo(Date value) {
			addCriterion("registertime =", value, "registertime");
			return (Criteria) this;
		}

		public Criteria andRegistertimeNotEqualTo(Date value) {
			addCriterion("registertime <>", value, "registertime");
			return (Criteria) this;
		}

		public Criteria andRegistertimeGreaterThan(Date value) {
			addCriterion("registertime >", value, "registertime");
			return (Criteria) this;
		}

		public Criteria andRegistertimeGreaterThanOrEqualTo(Date value) {
			addCriterion("registertime >=", value, "registertime");
			return (Criteria) this;
		}

		public Criteria andRegistertimeLessThan(Date value) {
			addCriterion("registertime <", value, "registertime");
			return (Criteria) this;
		}

		public Criteria andRegistertimeLessThanOrEqualTo(Date value) {
			addCriterion("registertime <=", value, "registertime");
			return (Criteria) this;
		}

		public Criteria andRegistertimeIn(List<Date> values) {
			addCriterion("registertime in", values, "registertime");
			return (Criteria) this;
		}

		public Criteria andRegistertimeNotIn(List<Date> values) {
			addCriterion("registertime not in", values, "registertime");
			return (Criteria) this;
		}

		public Criteria andRegistertimeBetween(Date value1, Date value2) {
			addCriterion("registertime between", value1, value2, "registertime");
			return (Criteria) this;
		}

		public Criteria andRegistertimeNotBetween(Date value1, Date value2) {
			addCriterion("registertime not between", value1, value2, "registertime");
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

		public Criteria andMaxfactIsNull() {
			addCriterion("maxfact is null");
			return (Criteria) this;
		}

		public Criteria andMaxfactIsNotNull() {
			addCriterion("maxfact is not null");
			return (Criteria) this;
		}

		public Criteria andMaxfactEqualTo(String value) {
			addCriterion("maxfact =", value, "maxfact");
			return (Criteria) this;
		}

		public Criteria andMaxfactNotEqualTo(String value) {
			addCriterion("maxfact <>", value, "maxfact");
			return (Criteria) this;
		}

		public Criteria andMaxfactGreaterThan(String value) {
			addCriterion("maxfact >", value, "maxfact");
			return (Criteria) this;
		}

		public Criteria andMaxfactGreaterThanOrEqualTo(String value) {
			addCriterion("maxfact >=", value, "maxfact");
			return (Criteria) this;
		}

		public Criteria andMaxfactLessThan(String value) {
			addCriterion("maxfact <", value, "maxfact");
			return (Criteria) this;
		}

		public Criteria andMaxfactLessThanOrEqualTo(String value) {
			addCriterion("maxfact <=", value, "maxfact");
			return (Criteria) this;
		}

		public Criteria andMaxfactLike(String value) {
			addCriterion("maxfact like", value, "maxfact");
			return (Criteria) this;
		}

		public Criteria andMaxfactNotLike(String value) {
			addCriterion("maxfact not like", value, "maxfact");
			return (Criteria) this;
		}

		public Criteria andMaxfactIn(List<String> values) {
			addCriterion("maxfact in", values, "maxfact");
			return (Criteria) this;
		}

		public Criteria andMaxfactNotIn(List<String> values) {
			addCriterion("maxfact not in", values, "maxfact");
			return (Criteria) this;
		}

		public Criteria andMaxfactBetween(String value1, String value2) {
			addCriterion("maxfact between", value1, value2, "maxfact");
			return (Criteria) this;
		}

		public Criteria andMaxfactNotBetween(String value1, String value2) {
			addCriterion("maxfact not between", value1, value2, "maxfact");
			return (Criteria) this;
		}

		public Criteria andCancelserviceidIsNull() {
			addCriterion("cancelserviceid is null");
			return (Criteria) this;
		}

		public Criteria andCancelserviceidIsNotNull() {
			addCriterion("cancelserviceid is not null");
			return (Criteria) this;
		}

		public Criteria andCancelserviceidEqualTo(Integer value) {
			addCriterion("cancelserviceid =", value, "cancelserviceid");
			return (Criteria) this;
		}

		public Criteria andCancelserviceidNotEqualTo(Integer value) {
			addCriterion("cancelserviceid <>", value, "cancelserviceid");
			return (Criteria) this;
		}

		public Criteria andCancelserviceidGreaterThan(Integer value) {
			addCriterion("cancelserviceid >", value, "cancelserviceid");
			return (Criteria) this;
		}

		public Criteria andCancelserviceidGreaterThanOrEqualTo(Integer value) {
			addCriterion("cancelserviceid >=", value, "cancelserviceid");
			return (Criteria) this;
		}

		public Criteria andCancelserviceidLessThan(Integer value) {
			addCriterion("cancelserviceid <", value, "cancelserviceid");
			return (Criteria) this;
		}

		public Criteria andCancelserviceidLessThanOrEqualTo(Integer value) {
			addCriterion("cancelserviceid <=", value, "cancelserviceid");
			return (Criteria) this;
		}

		public Criteria andCancelserviceidIn(List<Integer> values) {
			addCriterion("cancelserviceid in", values, "cancelserviceid");
			return (Criteria) this;
		}

		public Criteria andCancelserviceidNotIn(List<Integer> values) {
			addCriterion("cancelserviceid not in", values, "cancelserviceid");
			return (Criteria) this;
		}

		public Criteria andCancelserviceidBetween(Integer value1, Integer value2) {
			addCriterion("cancelserviceid between", value1, value2, "cancelserviceid");
			return (Criteria) this;
		}

		public Criteria andCancelserviceidNotBetween(Integer value1, Integer value2) {
			addCriterion("cancelserviceid not between", value1, value2, "cancelserviceid");
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
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table beinmortgage
	 * @mbg.generated  Mon Aug 19 16:10:36 CST 2019
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table beinmortgage
     *
     * @mbg.generated do_not_delete_during_merge Mon Aug 19 15:45:31 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}