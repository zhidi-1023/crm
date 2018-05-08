package com.zhidisoft.crm.mapper;

import com.zhidisoft.crm.entity.TbCrmTask;
import com.zhidisoft.crm.entity.TbCrmTaskExample.Criteria;
import com.zhidisoft.crm.entity.TbCrmTaskExample.Criterion;
import com.zhidisoft.crm.entity.TbCrmTaskExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TbCrmTaskSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public String countByExample(TbCrmTaskExample example) {
		SQL sql = new SQL();
		sql.SELECT("count(*)").FROM("TB_CRM_TASK");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public String deleteByExample(TbCrmTaskExample example) {
		SQL sql = new SQL();
		sql.DELETE_FROM("TB_CRM_TASK");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public String insertSelective(TbCrmTask record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("TB_CRM_TASK");
		sql.VALUES("TASKID", "#{taskid,jdbcType=VARCHAR}");
		if (record.getOwneruserid() != null) {
			sql.VALUES("OWNERUSERID", "#{owneruserid,jdbcType=VARCHAR}");
		}
		if (record.getAboutUser() != null) {
			sql.VALUES("ABOUT_USER", "#{aboutUser,jdbcType=VARCHAR}");
		}
		if (record.getSubject() != null) {
			sql.VALUES("SUBJECT", "#{subject,jdbcType=VARCHAR}");
		}
		if (record.getDuedate() != null) {
			sql.VALUES("DUEDATE", "#{duedate,jdbcType=TIMESTAMP}");
		}
		if (record.getStatus() != null) {
			sql.VALUES("STATUS", "#{status,jdbcType=VARCHAR}");
		}
		if (record.getPriority() != null) {
			sql.VALUES("PRIORITY", "#{priority,jdbcType=VARCHAR}");
		}
		if (record.getSendemail() != null) {
			sql.VALUES("SENDEMAIL", "#{sendemail,jdbcType=VARCHAR}");
		}
		if (record.getCreatoruserid() != null) {
			sql.VALUES("CREATORUSERID", "#{creatoruserid,jdbcType=VARCHAR}");
		}
		if (record.getCreatedate() != null) {
			sql.VALUES("CREATEDATE", "#{createdate,jdbcType=TIMESTAMP}");
		}
		if (record.getUpdtadate() != null) {
			sql.VALUES("UPDTADATE", "#{updtadate,jdbcType=TIMESTAMP}");
		}
		if (record.getIsclose() != null) {
			sql.VALUES("ISCLOSE", "#{isclose,jdbcType=DECIMAL}");
		}
		if (record.getIsdeleted() != null) {
			sql.VALUES("ISDELETED", "#{isdeleted,jdbcType=DECIMAL}");
		}
		if (record.getDeleteuserid() != null) {
			sql.VALUES("DELETEUSERID", "#{deleteuserid,jdbcType=VARCHAR}");
		}
		if (record.getDeletetime() != null) {
			sql.VALUES("DELETETIME", "#{deletetime,jdbcType=TIMESTAMP}");
		}
		if (record.getDescription() != null) {
			sql.VALUES("DESCRIPTION", "#{description,jdbcType=BLOB}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public String selectByExampleWithBLOBs(TbCrmTaskExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("TASKID");
		} else {
			sql.SELECT("TASKID");
		}
		sql.SELECT("OWNERUSERID");
		sql.SELECT("ABOUT_USER");
		sql.SELECT("SUBJECT");
		sql.SELECT("DUEDATE");
		sql.SELECT("STATUS");
		sql.SELECT("PRIORITY");
		sql.SELECT("SENDEMAIL");
		sql.SELECT("CREATORUSERID");
		sql.SELECT("CREATEDATE");
		sql.SELECT("UPDTADATE");
		sql.SELECT("ISCLOSE");
		sql.SELECT("ISDELETED");
		sql.SELECT("DELETEUSERID");
		sql.SELECT("DELETETIME");
		sql.SELECT("DESCRIPTION");
		sql.FROM("TB_CRM_TASK");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public String selectByExample(TbCrmTaskExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("TASKID");
		} else {
			sql.SELECT("TASKID");
		}
		sql.SELECT("OWNERUSERID");
		sql.SELECT("ABOUT_USER");
		sql.SELECT("SUBJECT");
		sql.SELECT("DUEDATE");
		sql.SELECT("STATUS");
		sql.SELECT("PRIORITY");
		sql.SELECT("SENDEMAIL");
		sql.SELECT("CREATORUSERID");
		sql.SELECT("CREATEDATE");
		sql.SELECT("UPDTADATE");
		sql.SELECT("ISCLOSE");
		sql.SELECT("ISDELETED");
		sql.SELECT("DELETEUSERID");
		sql.SELECT("DELETETIME");
		sql.FROM("TB_CRM_TASK");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		TbCrmTask record = (TbCrmTask) parameter.get("record");
		TbCrmTaskExample example = (TbCrmTaskExample) parameter.get("example");
		SQL sql = new SQL();
		sql.UPDATE("TB_CRM_TASK");
		if (record.getTaskid() != null) {
			sql.SET("TASKID = #{record.taskid,jdbcType=VARCHAR}");
		}
		if (record.getOwneruserid() != null) {
			sql.SET("OWNERUSERID = #{record.owneruserid,jdbcType=VARCHAR}");
		}
		if (record.getAboutUser() != null) {
			sql.SET("ABOUT_USER = #{record.aboutUser,jdbcType=VARCHAR}");
		}
		if (record.getSubject() != null) {
			sql.SET("SUBJECT = #{record.subject,jdbcType=VARCHAR}");
		}
		if (record.getDuedate() != null) {
			sql.SET("DUEDATE = #{record.duedate,jdbcType=TIMESTAMP}");
		}
		if (record.getStatus() != null) {
			sql.SET("STATUS = #{record.status,jdbcType=VARCHAR}");
		}
		if (record.getPriority() != null) {
			sql.SET("PRIORITY = #{record.priority,jdbcType=VARCHAR}");
		}
		if (record.getSendemail() != null) {
			sql.SET("SENDEMAIL = #{record.sendemail,jdbcType=VARCHAR}");
		}
		if (record.getCreatoruserid() != null) {
			sql.SET("CREATORUSERID = #{record.creatoruserid,jdbcType=VARCHAR}");
		}
		if (record.getCreatedate() != null) {
			sql.SET("CREATEDATE = #{record.createdate,jdbcType=TIMESTAMP}");
		}
		if (record.getUpdtadate() != null) {
			sql.SET("UPDTADATE = #{record.updtadate,jdbcType=TIMESTAMP}");
		}
		if (record.getIsclose() != null) {
			sql.SET("ISCLOSE = #{record.isclose,jdbcType=DECIMAL}");
		}
		if (record.getIsdeleted() != null) {
			sql.SET("ISDELETED = #{record.isdeleted,jdbcType=DECIMAL}");
		}
		if (record.getDeleteuserid() != null) {
			sql.SET("DELETEUSERID = #{record.deleteuserid,jdbcType=VARCHAR}");
		}
		if (record.getDeletetime() != null) {
			sql.SET("DELETETIME = #{record.deletetime,jdbcType=TIMESTAMP}");
		}
		if (record.getDescription() != null) {
			sql.SET("DESCRIPTION = #{record.description,jdbcType=BLOB}");
		}
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("TB_CRM_TASK");
		sql.SET("TASKID = #{record.taskid,jdbcType=VARCHAR}");
		sql.SET("OWNERUSERID = #{record.owneruserid,jdbcType=VARCHAR}");
		sql.SET("ABOUT_USER = #{record.aboutUser,jdbcType=VARCHAR}");
		sql.SET("SUBJECT = #{record.subject,jdbcType=VARCHAR}");
		sql.SET("DUEDATE = #{record.duedate,jdbcType=TIMESTAMP}");
		sql.SET("STATUS = #{record.status,jdbcType=VARCHAR}");
		sql.SET("PRIORITY = #{record.priority,jdbcType=VARCHAR}");
		sql.SET("SENDEMAIL = #{record.sendemail,jdbcType=VARCHAR}");
		sql.SET("CREATORUSERID = #{record.creatoruserid,jdbcType=VARCHAR}");
		sql.SET("CREATEDATE = #{record.createdate,jdbcType=TIMESTAMP}");
		sql.SET("UPDTADATE = #{record.updtadate,jdbcType=TIMESTAMP}");
		sql.SET("ISCLOSE = #{record.isclose,jdbcType=DECIMAL}");
		sql.SET("ISDELETED = #{record.isdeleted,jdbcType=DECIMAL}");
		sql.SET("DELETEUSERID = #{record.deleteuserid,jdbcType=VARCHAR}");
		sql.SET("DELETETIME = #{record.deletetime,jdbcType=TIMESTAMP}");
		sql.SET("DESCRIPTION = #{record.description,jdbcType=BLOB}");
		TbCrmTaskExample example = (TbCrmTaskExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public String updateByExample(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("TB_CRM_TASK");
		sql.SET("TASKID = #{record.taskid,jdbcType=VARCHAR}");
		sql.SET("OWNERUSERID = #{record.owneruserid,jdbcType=VARCHAR}");
		sql.SET("ABOUT_USER = #{record.aboutUser,jdbcType=VARCHAR}");
		sql.SET("SUBJECT = #{record.subject,jdbcType=VARCHAR}");
		sql.SET("DUEDATE = #{record.duedate,jdbcType=TIMESTAMP}");
		sql.SET("STATUS = #{record.status,jdbcType=VARCHAR}");
		sql.SET("PRIORITY = #{record.priority,jdbcType=VARCHAR}");
		sql.SET("SENDEMAIL = #{record.sendemail,jdbcType=VARCHAR}");
		sql.SET("CREATORUSERID = #{record.creatoruserid,jdbcType=VARCHAR}");
		sql.SET("CREATEDATE = #{record.createdate,jdbcType=TIMESTAMP}");
		sql.SET("UPDTADATE = #{record.updtadate,jdbcType=TIMESTAMP}");
		sql.SET("ISCLOSE = #{record.isclose,jdbcType=DECIMAL}");
		sql.SET("ISDELETED = #{record.isdeleted,jdbcType=DECIMAL}");
		sql.SET("DELETEUSERID = #{record.deleteuserid,jdbcType=VARCHAR}");
		sql.SET("DELETETIME = #{record.deletetime,jdbcType=TIMESTAMP}");
		TbCrmTaskExample example = (TbCrmTaskExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	public String updateByPrimaryKeySelective(TbCrmTask record) {
		SQL sql = new SQL();
		sql.UPDATE("TB_CRM_TASK");
		if (record.getOwneruserid() != null) {
			sql.SET("OWNERUSERID = #{owneruserid,jdbcType=VARCHAR}");
		}
		if (record.getAboutUser() != null) {
			sql.SET("ABOUT_USER = #{aboutUser,jdbcType=VARCHAR}");
		}
		if (record.getSubject() != null) {
			sql.SET("SUBJECT = #{subject,jdbcType=VARCHAR}");
		}
		if (record.getDuedate() != null) {
			sql.SET("DUEDATE = #{duedate,jdbcType=TIMESTAMP}");
		}
		if (record.getStatus() != null) {
			sql.SET("STATUS = #{status,jdbcType=VARCHAR}");
		}
		if (record.getPriority() != null) {
			sql.SET("PRIORITY = #{priority,jdbcType=VARCHAR}");
		}
		if (record.getSendemail() != null) {
			sql.SET("SENDEMAIL = #{sendemail,jdbcType=VARCHAR}");
		}
		if (record.getCreatoruserid() != null) {
			sql.SET("CREATORUSERID = #{creatoruserid,jdbcType=VARCHAR}");
		}
		if (record.getCreatedate() != null) {
			sql.SET("CREATEDATE = #{createdate,jdbcType=TIMESTAMP}");
		}
		if (record.getUpdtadate() != null) {
			sql.SET("UPDTADATE = #{updtadate,jdbcType=TIMESTAMP}");
		}
		if (record.getIsclose() != null) {
			sql.SET("ISCLOSE = #{isclose,jdbcType=DECIMAL}");
		}
		if (record.getIsdeleted() != null) {
			sql.SET("ISDELETED = #{isdeleted,jdbcType=DECIMAL}");
		}
		if (record.getDeleteuserid() != null) {
			sql.SET("DELETEUSERID = #{deleteuserid,jdbcType=VARCHAR}");
		}
		if (record.getDeletetime() != null) {
			sql.SET("DELETETIME = #{deletetime,jdbcType=TIMESTAMP}");
		}
		if (record.getDescription() != null) {
			sql.SET("DESCRIPTION = #{description,jdbcType=BLOB}");
		}
		sql.WHERE("TASKID = #{taskid,jdbcType=VARCHAR}");
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	protected void applyWhere(SQL sql, TbCrmTaskExample example, boolean includeExamplePhrase) {
		if (example == null) {
			return;
		}
		String parmPhrase1;
		String parmPhrase1_th;
		String parmPhrase2;
		String parmPhrase2_th;
		String parmPhrase3;
		String parmPhrase3_th;
		if (includeExamplePhrase) {
			parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		} else {
			parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		}
		StringBuilder sb = new StringBuilder();
		List<Criteria> oredCriteria = example.getOredCriteria();
		boolean firstCriteria = true;
		for (int i = 0; i < oredCriteria.size(); i++) {
			Criteria criteria = oredCriteria.get(i);
			if (criteria.isValid()) {
				if (firstCriteria) {
					firstCriteria = false;
				} else {
					sb.append(" or ");
				}
				sb.append('(');
				List<Criterion> criterions = criteria.getAllCriteria();
				boolean firstCriterion = true;
				for (int j = 0; j < criterions.size(); j++) {
					Criterion criterion = criterions.get(j);
					if (firstCriterion) {
						firstCriterion = false;
					} else {
						sb.append(" and ");
					}
					if (criterion.isNoValue()) {
						sb.append(criterion.getCondition());
					} else if (criterion.isSingleValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
						} else {
							sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,
									criterion.getTypeHandler()));
						}
					} else if (criterion.isBetweenValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
						} else {
							sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j,
									criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
						}
					} else if (criterion.isListValue()) {
						sb.append(criterion.getCondition());
						sb.append(" (");
						List<?> listItems = (List<?>) criterion.getValue();
						boolean comma = false;
						for (int k = 0; k < listItems.size(); k++) {
							if (comma) {
								sb.append(", ");
							} else {
								comma = true;
							}
							if (criterion.getTypeHandler() == null) {
								sb.append(String.format(parmPhrase3, i, j, k));
							} else {
								sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
							}
						}
						sb.append(')');
					}
				}
				sb.append(')');
			}
		}
		if (sb.length() > 0) {
			sql.WHERE(sb.toString());
		}
	}
}