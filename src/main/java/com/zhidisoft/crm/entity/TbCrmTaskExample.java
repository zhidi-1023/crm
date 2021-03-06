package com.zhidisoft.crm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCrmTaskExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public TbCrmTaskExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
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

		public Criteria andTaskidIsNull() {
			addCriterion("TASKID is null");
			return (Criteria) this;
		}

		public Criteria andTaskidIsNotNull() {
			addCriterion("TASKID is not null");
			return (Criteria) this;
		}

		public Criteria andTaskidEqualTo(String value) {
			addCriterion("TASKID =", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidNotEqualTo(String value) {
			addCriterion("TASKID <>", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidGreaterThan(String value) {
			addCriterion("TASKID >", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidGreaterThanOrEqualTo(String value) {
			addCriterion("TASKID >=", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidLessThan(String value) {
			addCriterion("TASKID <", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidLessThanOrEqualTo(String value) {
			addCriterion("TASKID <=", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidLike(String value) {
			addCriterion("TASKID like", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidNotLike(String value) {
			addCriterion("TASKID not like", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidIn(List<String> values) {
			addCriterion("TASKID in", values, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidNotIn(List<String> values) {
			addCriterion("TASKID not in", values, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidBetween(String value1, String value2) {
			addCriterion("TASKID between", value1, value2, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidNotBetween(String value1, String value2) {
			addCriterion("TASKID not between", value1, value2, "taskid");
			return (Criteria) this;
		}

		public Criteria andOwneruseridIsNull() {
			addCriterion("OWNERUSERID is null");
			return (Criteria) this;
		}

		public Criteria andOwneruseridIsNotNull() {
			addCriterion("OWNERUSERID is not null");
			return (Criteria) this;
		}

		public Criteria andOwneruseridEqualTo(String value) {
			addCriterion("OWNERUSERID =", value, "owneruserid");
			return (Criteria) this;
		}

		public Criteria andOwneruseridNotEqualTo(String value) {
			addCriterion("OWNERUSERID <>", value, "owneruserid");
			return (Criteria) this;
		}

		public Criteria andOwneruseridGreaterThan(String value) {
			addCriterion("OWNERUSERID >", value, "owneruserid");
			return (Criteria) this;
		}

		public Criteria andOwneruseridGreaterThanOrEqualTo(String value) {
			addCriterion("OWNERUSERID >=", value, "owneruserid");
			return (Criteria) this;
		}

		public Criteria andOwneruseridLessThan(String value) {
			addCriterion("OWNERUSERID <", value, "owneruserid");
			return (Criteria) this;
		}

		public Criteria andOwneruseridLessThanOrEqualTo(String value) {
			addCriterion("OWNERUSERID <=", value, "owneruserid");
			return (Criteria) this;
		}

		public Criteria andOwneruseridLike(String value) {
			addCriterion("OWNERUSERID like", value, "owneruserid");
			return (Criteria) this;
		}

		public Criteria andOwneruseridNotLike(String value) {
			addCriterion("OWNERUSERID not like", value, "owneruserid");
			return (Criteria) this;
		}

		public Criteria andOwneruseridIn(List<String> values) {
			addCriterion("OWNERUSERID in", values, "owneruserid");
			return (Criteria) this;
		}

		public Criteria andOwneruseridNotIn(List<String> values) {
			addCriterion("OWNERUSERID not in", values, "owneruserid");
			return (Criteria) this;
		}

		public Criteria andOwneruseridBetween(String value1, String value2) {
			addCriterion("OWNERUSERID between", value1, value2, "owneruserid");
			return (Criteria) this;
		}

		public Criteria andOwneruseridNotBetween(String value1, String value2) {
			addCriterion("OWNERUSERID not between", value1, value2, "owneruserid");
			return (Criteria) this;
		}

		public Criteria andAboutUserIsNull() {
			addCriterion("ABOUT_USER is null");
			return (Criteria) this;
		}

		public Criteria andAboutUserIsNotNull() {
			addCriterion("ABOUT_USER is not null");
			return (Criteria) this;
		}

		public Criteria andAboutUserEqualTo(String value) {
			addCriterion("ABOUT_USER =", value, "aboutUser");
			return (Criteria) this;
		}

		public Criteria andAboutUserNotEqualTo(String value) {
			addCriterion("ABOUT_USER <>", value, "aboutUser");
			return (Criteria) this;
		}

		public Criteria andAboutUserGreaterThan(String value) {
			addCriterion("ABOUT_USER >", value, "aboutUser");
			return (Criteria) this;
		}

		public Criteria andAboutUserGreaterThanOrEqualTo(String value) {
			addCriterion("ABOUT_USER >=", value, "aboutUser");
			return (Criteria) this;
		}

		public Criteria andAboutUserLessThan(String value) {
			addCriterion("ABOUT_USER <", value, "aboutUser");
			return (Criteria) this;
		}

		public Criteria andAboutUserLessThanOrEqualTo(String value) {
			addCriterion("ABOUT_USER <=", value, "aboutUser");
			return (Criteria) this;
		}

		public Criteria andAboutUserLike(String value) {
			addCriterion("ABOUT_USER like", value, "aboutUser");
			return (Criteria) this;
		}

		public Criteria andAboutUserNotLike(String value) {
			addCriterion("ABOUT_USER not like", value, "aboutUser");
			return (Criteria) this;
		}

		public Criteria andAboutUserIn(List<String> values) {
			addCriterion("ABOUT_USER in", values, "aboutUser");
			return (Criteria) this;
		}

		public Criteria andAboutUserNotIn(List<String> values) {
			addCriterion("ABOUT_USER not in", values, "aboutUser");
			return (Criteria) this;
		}

		public Criteria andAboutUserBetween(String value1, String value2) {
			addCriterion("ABOUT_USER between", value1, value2, "aboutUser");
			return (Criteria) this;
		}

		public Criteria andAboutUserNotBetween(String value1, String value2) {
			addCriterion("ABOUT_USER not between", value1, value2, "aboutUser");
			return (Criteria) this;
		}

		public Criteria andSubjectIsNull() {
			addCriterion("SUBJECT is null");
			return (Criteria) this;
		}

		public Criteria andSubjectIsNotNull() {
			addCriterion("SUBJECT is not null");
			return (Criteria) this;
		}

		public Criteria andSubjectEqualTo(String value) {
			addCriterion("SUBJECT =", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectNotEqualTo(String value) {
			addCriterion("SUBJECT <>", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectGreaterThan(String value) {
			addCriterion("SUBJECT >", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectGreaterThanOrEqualTo(String value) {
			addCriterion("SUBJECT >=", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectLessThan(String value) {
			addCriterion("SUBJECT <", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectLessThanOrEqualTo(String value) {
			addCriterion("SUBJECT <=", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectLike(String value) {
			addCriterion("SUBJECT like", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectNotLike(String value) {
			addCriterion("SUBJECT not like", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectIn(List<String> values) {
			addCriterion("SUBJECT in", values, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectNotIn(List<String> values) {
			addCriterion("SUBJECT not in", values, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectBetween(String value1, String value2) {
			addCriterion("SUBJECT between", value1, value2, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectNotBetween(String value1, String value2) {
			addCriterion("SUBJECT not between", value1, value2, "subject");
			return (Criteria) this;
		}

		public Criteria andDuedateIsNull() {
			addCriterion("DUEDATE is null");
			return (Criteria) this;
		}

		public Criteria andDuedateIsNotNull() {
			addCriterion("DUEDATE is not null");
			return (Criteria) this;
		}

		public Criteria andDuedateEqualTo(Date value) {
			addCriterion("DUEDATE =", value, "duedate");
			return (Criteria) this;
		}

		public Criteria andDuedateNotEqualTo(Date value) {
			addCriterion("DUEDATE <>", value, "duedate");
			return (Criteria) this;
		}

		public Criteria andDuedateGreaterThan(Date value) {
			addCriterion("DUEDATE >", value, "duedate");
			return (Criteria) this;
		}

		public Criteria andDuedateGreaterThanOrEqualTo(Date value) {
			addCriterion("DUEDATE >=", value, "duedate");
			return (Criteria) this;
		}

		public Criteria andDuedateLessThan(Date value) {
			addCriterion("DUEDATE <", value, "duedate");
			return (Criteria) this;
		}

		public Criteria andDuedateLessThanOrEqualTo(Date value) {
			addCriterion("DUEDATE <=", value, "duedate");
			return (Criteria) this;
		}

		public Criteria andDuedateIn(List<Date> values) {
			addCriterion("DUEDATE in", values, "duedate");
			return (Criteria) this;
		}

		public Criteria andDuedateNotIn(List<Date> values) {
			addCriterion("DUEDATE not in", values, "duedate");
			return (Criteria) this;
		}

		public Criteria andDuedateBetween(Date value1, Date value2) {
			addCriterion("DUEDATE between", value1, value2, "duedate");
			return (Criteria) this;
		}

		public Criteria andDuedateNotBetween(Date value1, Date value2) {
			addCriterion("DUEDATE not between", value1, value2, "duedate");
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

		public Criteria andStatusEqualTo(String value) {
			addCriterion("STATUS =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("STATUS <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("STATUS >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("STATUS >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("STATUS <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("STATUS <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("STATUS like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("STATUS not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("STATUS in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("STATUS not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("STATUS between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("STATUS not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andPriorityIsNull() {
			addCriterion("PRIORITY is null");
			return (Criteria) this;
		}

		public Criteria andPriorityIsNotNull() {
			addCriterion("PRIORITY is not null");
			return (Criteria) this;
		}

		public Criteria andPriorityEqualTo(String value) {
			addCriterion("PRIORITY =", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityNotEqualTo(String value) {
			addCriterion("PRIORITY <>", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityGreaterThan(String value) {
			addCriterion("PRIORITY >", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityGreaterThanOrEqualTo(String value) {
			addCriterion("PRIORITY >=", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityLessThan(String value) {
			addCriterion("PRIORITY <", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityLessThanOrEqualTo(String value) {
			addCriterion("PRIORITY <=", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityLike(String value) {
			addCriterion("PRIORITY like", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityNotLike(String value) {
			addCriterion("PRIORITY not like", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityIn(List<String> values) {
			addCriterion("PRIORITY in", values, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityNotIn(List<String> values) {
			addCriterion("PRIORITY not in", values, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityBetween(String value1, String value2) {
			addCriterion("PRIORITY between", value1, value2, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityNotBetween(String value1, String value2) {
			addCriterion("PRIORITY not between", value1, value2, "priority");
			return (Criteria) this;
		}

		public Criteria andSendemailIsNull() {
			addCriterion("SENDEMAIL is null");
			return (Criteria) this;
		}

		public Criteria andSendemailIsNotNull() {
			addCriterion("SENDEMAIL is not null");
			return (Criteria) this;
		}

		public Criteria andSendemailEqualTo(String value) {
			addCriterion("SENDEMAIL =", value, "sendemail");
			return (Criteria) this;
		}

		public Criteria andSendemailNotEqualTo(String value) {
			addCriterion("SENDEMAIL <>", value, "sendemail");
			return (Criteria) this;
		}

		public Criteria andSendemailGreaterThan(String value) {
			addCriterion("SENDEMAIL >", value, "sendemail");
			return (Criteria) this;
		}

		public Criteria andSendemailGreaterThanOrEqualTo(String value) {
			addCriterion("SENDEMAIL >=", value, "sendemail");
			return (Criteria) this;
		}

		public Criteria andSendemailLessThan(String value) {
			addCriterion("SENDEMAIL <", value, "sendemail");
			return (Criteria) this;
		}

		public Criteria andSendemailLessThanOrEqualTo(String value) {
			addCriterion("SENDEMAIL <=", value, "sendemail");
			return (Criteria) this;
		}

		public Criteria andSendemailLike(String value) {
			addCriterion("SENDEMAIL like", value, "sendemail");
			return (Criteria) this;
		}

		public Criteria andSendemailNotLike(String value) {
			addCriterion("SENDEMAIL not like", value, "sendemail");
			return (Criteria) this;
		}

		public Criteria andSendemailIn(List<String> values) {
			addCriterion("SENDEMAIL in", values, "sendemail");
			return (Criteria) this;
		}

		public Criteria andSendemailNotIn(List<String> values) {
			addCriterion("SENDEMAIL not in", values, "sendemail");
			return (Criteria) this;
		}

		public Criteria andSendemailBetween(String value1, String value2) {
			addCriterion("SENDEMAIL between", value1, value2, "sendemail");
			return (Criteria) this;
		}

		public Criteria andSendemailNotBetween(String value1, String value2) {
			addCriterion("SENDEMAIL not between", value1, value2, "sendemail");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridIsNull() {
			addCriterion("CREATORUSERID is null");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridIsNotNull() {
			addCriterion("CREATORUSERID is not null");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridEqualTo(String value) {
			addCriterion("CREATORUSERID =", value, "creatoruserid");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridNotEqualTo(String value) {
			addCriterion("CREATORUSERID <>", value, "creatoruserid");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridGreaterThan(String value) {
			addCriterion("CREATORUSERID >", value, "creatoruserid");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridGreaterThanOrEqualTo(String value) {
			addCriterion("CREATORUSERID >=", value, "creatoruserid");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridLessThan(String value) {
			addCriterion("CREATORUSERID <", value, "creatoruserid");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridLessThanOrEqualTo(String value) {
			addCriterion("CREATORUSERID <=", value, "creatoruserid");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridLike(String value) {
			addCriterion("CREATORUSERID like", value, "creatoruserid");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridNotLike(String value) {
			addCriterion("CREATORUSERID not like", value, "creatoruserid");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridIn(List<String> values) {
			addCriterion("CREATORUSERID in", values, "creatoruserid");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridNotIn(List<String> values) {
			addCriterion("CREATORUSERID not in", values, "creatoruserid");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridBetween(String value1, String value2) {
			addCriterion("CREATORUSERID between", value1, value2, "creatoruserid");
			return (Criteria) this;
		}

		public Criteria andCreatoruseridNotBetween(String value1, String value2) {
			addCriterion("CREATORUSERID not between", value1, value2, "creatoruserid");
			return (Criteria) this;
		}

		public Criteria andCreatedateIsNull() {
			addCriterion("CREATEDATE is null");
			return (Criteria) this;
		}

		public Criteria andCreatedateIsNotNull() {
			addCriterion("CREATEDATE is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedateEqualTo(Date value) {
			addCriterion("CREATEDATE =", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotEqualTo(Date value) {
			addCriterion("CREATEDATE <>", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateGreaterThan(Date value) {
			addCriterion("CREATEDATE >", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
			addCriterion("CREATEDATE >=", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateLessThan(Date value) {
			addCriterion("CREATEDATE <", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateLessThanOrEqualTo(Date value) {
			addCriterion("CREATEDATE <=", value, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateIn(List<Date> values) {
			addCriterion("CREATEDATE in", values, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotIn(List<Date> values) {
			addCriterion("CREATEDATE not in", values, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateBetween(Date value1, Date value2) {
			addCriterion("CREATEDATE between", value1, value2, "createdate");
			return (Criteria) this;
		}

		public Criteria andCreatedateNotBetween(Date value1, Date value2) {
			addCriterion("CREATEDATE not between", value1, value2, "createdate");
			return (Criteria) this;
		}

		public Criteria andUpdtadateIsNull() {
			addCriterion("UPDTADATE is null");
			return (Criteria) this;
		}

		public Criteria andUpdtadateIsNotNull() {
			addCriterion("UPDTADATE is not null");
			return (Criteria) this;
		}

		public Criteria andUpdtadateEqualTo(Date value) {
			addCriterion("UPDTADATE =", value, "updtadate");
			return (Criteria) this;
		}

		public Criteria andUpdtadateNotEqualTo(Date value) {
			addCriterion("UPDTADATE <>", value, "updtadate");
			return (Criteria) this;
		}

		public Criteria andUpdtadateGreaterThan(Date value) {
			addCriterion("UPDTADATE >", value, "updtadate");
			return (Criteria) this;
		}

		public Criteria andUpdtadateGreaterThanOrEqualTo(Date value) {
			addCriterion("UPDTADATE >=", value, "updtadate");
			return (Criteria) this;
		}

		public Criteria andUpdtadateLessThan(Date value) {
			addCriterion("UPDTADATE <", value, "updtadate");
			return (Criteria) this;
		}

		public Criteria andUpdtadateLessThanOrEqualTo(Date value) {
			addCriterion("UPDTADATE <=", value, "updtadate");
			return (Criteria) this;
		}

		public Criteria andUpdtadateIn(List<Date> values) {
			addCriterion("UPDTADATE in", values, "updtadate");
			return (Criteria) this;
		}

		public Criteria andUpdtadateNotIn(List<Date> values) {
			addCriterion("UPDTADATE not in", values, "updtadate");
			return (Criteria) this;
		}

		public Criteria andUpdtadateBetween(Date value1, Date value2) {
			addCriterion("UPDTADATE between", value1, value2, "updtadate");
			return (Criteria) this;
		}

		public Criteria andUpdtadateNotBetween(Date value1, Date value2) {
			addCriterion("UPDTADATE not between", value1, value2, "updtadate");
			return (Criteria) this;
		}

		public Criteria andIscloseIsNull() {
			addCriterion("ISCLOSE is null");
			return (Criteria) this;
		}

		public Criteria andIscloseIsNotNull() {
			addCriterion("ISCLOSE is not null");
			return (Criteria) this;
		}

		public Criteria andIscloseEqualTo(Short value) {
			addCriterion("ISCLOSE =", value, "isclose");
			return (Criteria) this;
		}

		public Criteria andIscloseNotEqualTo(Short value) {
			addCriterion("ISCLOSE <>", value, "isclose");
			return (Criteria) this;
		}

		public Criteria andIscloseGreaterThan(Short value) {
			addCriterion("ISCLOSE >", value, "isclose");
			return (Criteria) this;
		}

		public Criteria andIscloseGreaterThanOrEqualTo(Short value) {
			addCriterion("ISCLOSE >=", value, "isclose");
			return (Criteria) this;
		}

		public Criteria andIscloseLessThan(Short value) {
			addCriterion("ISCLOSE <", value, "isclose");
			return (Criteria) this;
		}

		public Criteria andIscloseLessThanOrEqualTo(Short value) {
			addCriterion("ISCLOSE <=", value, "isclose");
			return (Criteria) this;
		}

		public Criteria andIscloseIn(List<Short> values) {
			addCriterion("ISCLOSE in", values, "isclose");
			return (Criteria) this;
		}

		public Criteria andIscloseNotIn(List<Short> values) {
			addCriterion("ISCLOSE not in", values, "isclose");
			return (Criteria) this;
		}

		public Criteria andIscloseBetween(Short value1, Short value2) {
			addCriterion("ISCLOSE between", value1, value2, "isclose");
			return (Criteria) this;
		}

		public Criteria andIscloseNotBetween(Short value1, Short value2) {
			addCriterion("ISCLOSE not between", value1, value2, "isclose");
			return (Criteria) this;
		}

		public Criteria andIsdeletedIsNull() {
			addCriterion("ISDELETED is null");
			return (Criteria) this;
		}

		public Criteria andIsdeletedIsNotNull() {
			addCriterion("ISDELETED is not null");
			return (Criteria) this;
		}

		public Criteria andIsdeletedEqualTo(Short value) {
			addCriterion("ISDELETED =", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedNotEqualTo(Short value) {
			addCriterion("ISDELETED <>", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedGreaterThan(Short value) {
			addCriterion("ISDELETED >", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedGreaterThanOrEqualTo(Short value) {
			addCriterion("ISDELETED >=", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedLessThan(Short value) {
			addCriterion("ISDELETED <", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedLessThanOrEqualTo(Short value) {
			addCriterion("ISDELETED <=", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedIn(List<Short> values) {
			addCriterion("ISDELETED in", values, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedNotIn(List<Short> values) {
			addCriterion("ISDELETED not in", values, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedBetween(Short value1, Short value2) {
			addCriterion("ISDELETED between", value1, value2, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedNotBetween(Short value1, Short value2) {
			addCriterion("ISDELETED not between", value1, value2, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridIsNull() {
			addCriterion("DELETEUSERID is null");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridIsNotNull() {
			addCriterion("DELETEUSERID is not null");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridEqualTo(String value) {
			addCriterion("DELETEUSERID =", value, "deleteuserid");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridNotEqualTo(String value) {
			addCriterion("DELETEUSERID <>", value, "deleteuserid");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridGreaterThan(String value) {
			addCriterion("DELETEUSERID >", value, "deleteuserid");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridGreaterThanOrEqualTo(String value) {
			addCriterion("DELETEUSERID >=", value, "deleteuserid");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridLessThan(String value) {
			addCriterion("DELETEUSERID <", value, "deleteuserid");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridLessThanOrEqualTo(String value) {
			addCriterion("DELETEUSERID <=", value, "deleteuserid");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridLike(String value) {
			addCriterion("DELETEUSERID like", value, "deleteuserid");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridNotLike(String value) {
			addCriterion("DELETEUSERID not like", value, "deleteuserid");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridIn(List<String> values) {
			addCriterion("DELETEUSERID in", values, "deleteuserid");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridNotIn(List<String> values) {
			addCriterion("DELETEUSERID not in", values, "deleteuserid");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridBetween(String value1, String value2) {
			addCriterion("DELETEUSERID between", value1, value2, "deleteuserid");
			return (Criteria) this;
		}

		public Criteria andDeleteuseridNotBetween(String value1, String value2) {
			addCriterion("DELETEUSERID not between", value1, value2, "deleteuserid");
			return (Criteria) this;
		}

		public Criteria andDeletetimeIsNull() {
			addCriterion("DELETETIME is null");
			return (Criteria) this;
		}

		public Criteria andDeletetimeIsNotNull() {
			addCriterion("DELETETIME is not null");
			return (Criteria) this;
		}

		public Criteria andDeletetimeEqualTo(Date value) {
			addCriterion("DELETETIME =", value, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeNotEqualTo(Date value) {
			addCriterion("DELETETIME <>", value, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeGreaterThan(Date value) {
			addCriterion("DELETETIME >", value, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("DELETETIME >=", value, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeLessThan(Date value) {
			addCriterion("DELETETIME <", value, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeLessThanOrEqualTo(Date value) {
			addCriterion("DELETETIME <=", value, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeIn(List<Date> values) {
			addCriterion("DELETETIME in", values, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeNotIn(List<Date> values) {
			addCriterion("DELETETIME not in", values, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeBetween(Date value1, Date value2) {
			addCriterion("DELETETIME between", value1, value2, "deletetime");
			return (Criteria) this;
		}

		public Criteria andDeletetimeNotBetween(Date value1, Date value2) {
			addCriterion("DELETETIME not between", value1, value2, "deletetime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
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
     * This class corresponds to the database table TB_CRM_TASK
     *
     * @mbg.generated do_not_delete_during_merge Tue Apr 24 11:03:32 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}