package com.zhidisoft.crm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSystemUserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public TbSystemUserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
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

		public Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("ID =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("ID <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("ID >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("ID >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("ID <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("ID <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("ID like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("ID not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("ID in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("ID not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("ID between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNull() {
			addCriterion("CREATETIME is null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNotNull() {
			addCriterion("CREATETIME is not null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeEqualTo(Date value) {
			addCriterion("CREATETIME =", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("CREATETIME <>", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThan(Date value) {
			addCriterion("CREATETIME >", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("CREATETIME >=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThan(Date value) {
			addCriterion("CREATETIME <", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("CREATETIME <=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIn(List<Date> values) {
			addCriterion("CREATETIME in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("CREATETIME not in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeBetween(Date value1, Date value2) {
			addCriterion("CREATETIME between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
			addCriterion("CREATETIME not between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("EMAIL is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("EMAIL is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("EMAIL =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("EMAIL <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("EMAIL >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("EMAIL >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("EMAIL <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("EMAIL <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("EMAIL like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("EMAIL not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("EMAIL in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("EMAIL not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("EMAIL between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("EMAIL not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("PASSWORD is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("PASSWORD is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("PASSWORD =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("PASSWORD <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("PASSWORD >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("PASSWORD >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("PASSWORD <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("PASSWORD <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("PASSWORD like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("PASSWORD not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("PASSWORD in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("PASSWORD not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("PASSWORD between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("PASSWORD not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("PHONE is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("PHONE is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("PHONE =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("PHONE <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("PHONE >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("PHONE >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("PHONE <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("PHONE <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("PHONE like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("PHONE not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("PHONE in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("PHONE not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("PHONE between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("PHONE not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andSaltIsNull() {
			addCriterion("SALT is null");
			return (Criteria) this;
		}

		public Criteria andSaltIsNotNull() {
			addCriterion("SALT is not null");
			return (Criteria) this;
		}

		public Criteria andSaltEqualTo(String value) {
			addCriterion("SALT =", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotEqualTo(String value) {
			addCriterion("SALT <>", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltGreaterThan(String value) {
			addCriterion("SALT >", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltGreaterThanOrEqualTo(String value) {
			addCriterion("SALT >=", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltLessThan(String value) {
			addCriterion("SALT <", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltLessThanOrEqualTo(String value) {
			addCriterion("SALT <=", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltLike(String value) {
			addCriterion("SALT like", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotLike(String value) {
			addCriterion("SALT not like", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltIn(List<String> values) {
			addCriterion("SALT in", values, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotIn(List<String> values) {
			addCriterion("SALT not in", values, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltBetween(String value1, String value2) {
			addCriterion("SALT between", value1, value2, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotBetween(String value1, String value2) {
			addCriterion("SALT not between", value1, value2, "salt");
			return (Criteria) this;
		}

		public Criteria andSortnumIsNull() {
			addCriterion("SORTNUM is null");
			return (Criteria) this;
		}

		public Criteria andSortnumIsNotNull() {
			addCriterion("SORTNUM is not null");
			return (Criteria) this;
		}

		public Criteria andSortnumEqualTo(Long value) {
			addCriterion("SORTNUM =", value, "sortnum");
			return (Criteria) this;
		}

		public Criteria andSortnumNotEqualTo(Long value) {
			addCriterion("SORTNUM <>", value, "sortnum");
			return (Criteria) this;
		}

		public Criteria andSortnumGreaterThan(Long value) {
			addCriterion("SORTNUM >", value, "sortnum");
			return (Criteria) this;
		}

		public Criteria andSortnumGreaterThanOrEqualTo(Long value) {
			addCriterion("SORTNUM >=", value, "sortnum");
			return (Criteria) this;
		}

		public Criteria andSortnumLessThan(Long value) {
			addCriterion("SORTNUM <", value, "sortnum");
			return (Criteria) this;
		}

		public Criteria andSortnumLessThanOrEqualTo(Long value) {
			addCriterion("SORTNUM <=", value, "sortnum");
			return (Criteria) this;
		}

		public Criteria andSortnumIn(List<Long> values) {
			addCriterion("SORTNUM in", values, "sortnum");
			return (Criteria) this;
		}

		public Criteria andSortnumNotIn(List<Long> values) {
			addCriterion("SORTNUM not in", values, "sortnum");
			return (Criteria) this;
		}

		public Criteria andSortnumBetween(Long value1, Long value2) {
			addCriterion("SORTNUM between", value1, value2, "sortnum");
			return (Criteria) this;
		}

		public Criteria andSortnumNotBetween(Long value1, Long value2) {
			addCriterion("SORTNUM not between", value1, value2, "sortnum");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("STATUS is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("STATUS is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Long value) {
			addCriterion("STATUS =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Long value) {
			addCriterion("STATUS <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Long value) {
			addCriterion("STATUS >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Long value) {
			addCriterion("STATUS >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Long value) {
			addCriterion("STATUS <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Long value) {
			addCriterion("STATUS <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Long> values) {
			addCriterion("STATUS in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Long> values) {
			addCriterion("STATUS not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Long value1, Long value2) {
			addCriterion("STATUS between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Long value1, Long value2) {
			addCriterion("STATUS not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIsNull() {
			addCriterion("UPDATETIME is null");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIsNotNull() {
			addCriterion("UPDATETIME is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeEqualTo(Date value) {
			addCriterion("UPDATETIME =", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotEqualTo(Date value) {
			addCriterion("UPDATETIME <>", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeGreaterThan(Date value) {
			addCriterion("UPDATETIME >", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("UPDATETIME >=", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeLessThan(Date value) {
			addCriterion("UPDATETIME <", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
			addCriterion("UPDATETIME <=", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIn(List<Date> values) {
			addCriterion("UPDATETIME in", values, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotIn(List<Date> values) {
			addCriterion("UPDATETIME not in", values, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeBetween(Date value1, Date value2) {
			addCriterion("UPDATETIME between", value1, value2, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
			addCriterion("UPDATETIME not between", value1, value2, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUsernoteIsNull() {
			addCriterion("USERNOTE is null");
			return (Criteria) this;
		}

		public Criteria andUsernoteIsNotNull() {
			addCriterion("USERNOTE is not null");
			return (Criteria) this;
		}

		public Criteria andUsernoteEqualTo(String value) {
			addCriterion("USERNOTE =", value, "usernote");
			return (Criteria) this;
		}

		public Criteria andUsernoteNotEqualTo(String value) {
			addCriterion("USERNOTE <>", value, "usernote");
			return (Criteria) this;
		}

		public Criteria andUsernoteGreaterThan(String value) {
			addCriterion("USERNOTE >", value, "usernote");
			return (Criteria) this;
		}

		public Criteria andUsernoteGreaterThanOrEqualTo(String value) {
			addCriterion("USERNOTE >=", value, "usernote");
			return (Criteria) this;
		}

		public Criteria andUsernoteLessThan(String value) {
			addCriterion("USERNOTE <", value, "usernote");
			return (Criteria) this;
		}

		public Criteria andUsernoteLessThanOrEqualTo(String value) {
			addCriterion("USERNOTE <=", value, "usernote");
			return (Criteria) this;
		}

		public Criteria andUsernoteLike(String value) {
			addCriterion("USERNOTE like", value, "usernote");
			return (Criteria) this;
		}

		public Criteria andUsernoteNotLike(String value) {
			addCriterion("USERNOTE not like", value, "usernote");
			return (Criteria) this;
		}

		public Criteria andUsernoteIn(List<String> values) {
			addCriterion("USERNOTE in", values, "usernote");
			return (Criteria) this;
		}

		public Criteria andUsernoteNotIn(List<String> values) {
			addCriterion("USERNOTE not in", values, "usernote");
			return (Criteria) this;
		}

		public Criteria andUsernoteBetween(String value1, String value2) {
			addCriterion("USERNOTE between", value1, value2, "usernote");
			return (Criteria) this;
		}

		public Criteria andUsernoteNotBetween(String value1, String value2) {
			addCriterion("USERNOTE not between", value1, value2, "usernote");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("USERNAME is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("USERNAME is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("USERNAME =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("USERNAME <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("USERNAME >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("USERNAME >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("USERNAME <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("USERNAME <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("USERNAME like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("USERNAME not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("USERNAME in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("USERNAME not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("USERNAME between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("USERNAME not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andCreatebyIsNull() {
			addCriterion("CREATEBY is null");
			return (Criteria) this;
		}

		public Criteria andCreatebyIsNotNull() {
			addCriterion("CREATEBY is not null");
			return (Criteria) this;
		}

		public Criteria andCreatebyEqualTo(String value) {
			addCriterion("CREATEBY =", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyNotEqualTo(String value) {
			addCriterion("CREATEBY <>", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyGreaterThan(String value) {
			addCriterion("CREATEBY >", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
			addCriterion("CREATEBY >=", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyLessThan(String value) {
			addCriterion("CREATEBY <", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyLessThanOrEqualTo(String value) {
			addCriterion("CREATEBY <=", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyLike(String value) {
			addCriterion("CREATEBY like", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyNotLike(String value) {
			addCriterion("CREATEBY not like", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyIn(List<String> values) {
			addCriterion("CREATEBY in", values, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyNotIn(List<String> values) {
			addCriterion("CREATEBY not in", values, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyBetween(String value1, String value2) {
			addCriterion("CREATEBY between", value1, value2, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyNotBetween(String value1, String value2) {
			addCriterion("CREATEBY not between", value1, value2, "createby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyIsNull() {
			addCriterion("UPDATEBY is null");
			return (Criteria) this;
		}

		public Criteria andUpdatebyIsNotNull() {
			addCriterion("UPDATEBY is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatebyEqualTo(String value) {
			addCriterion("UPDATEBY =", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotEqualTo(String value) {
			addCriterion("UPDATEBY <>", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyGreaterThan(String value) {
			addCriterion("UPDATEBY >", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
			addCriterion("UPDATEBY >=", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyLessThan(String value) {
			addCriterion("UPDATEBY <", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyLessThanOrEqualTo(String value) {
			addCriterion("UPDATEBY <=", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyLike(String value) {
			addCriterion("UPDATEBY like", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotLike(String value) {
			addCriterion("UPDATEBY not like", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyIn(List<String> values) {
			addCriterion("UPDATEBY in", values, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotIn(List<String> values) {
			addCriterion("UPDATEBY not in", values, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyBetween(String value1, String value2) {
			addCriterion("UPDATEBY between", value1, value2, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotBetween(String value1, String value2) {
			addCriterion("UPDATEBY not between", value1, value2, "updateby");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNull() {
			addCriterion("ROLE_ID is null");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNotNull() {
			addCriterion("ROLE_ID is not null");
			return (Criteria) this;
		}

		public Criteria andRoleIdEqualTo(String value) {
			addCriterion("ROLE_ID =", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotEqualTo(String value) {
			addCriterion("ROLE_ID <>", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThan(String value) {
			addCriterion("ROLE_ID >", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
			addCriterion("ROLE_ID >=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThan(String value) {
			addCriterion("ROLE_ID <", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThanOrEqualTo(String value) {
			addCriterion("ROLE_ID <=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLike(String value) {
			addCriterion("ROLE_ID like", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotLike(String value) {
			addCriterion("ROLE_ID not like", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdIn(List<String> values) {
			addCriterion("ROLE_ID in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotIn(List<String> values) {
			addCriterion("ROLE_ID not in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdBetween(String value1, String value2) {
			addCriterion("ROLE_ID between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotBetween(String value1, String value2) {
			addCriterion("ROLE_ID not between", value1, value2, "roleId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
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
     * This class corresponds to the database table TB_SYSTEM_USER
     *
     * @mbg.generated do_not_delete_during_merge Fri Apr 13 15:34:30 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}