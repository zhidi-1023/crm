package com.zhidisoft.crm.mapper;

import com.zhidisoft.crm.entity.TbSystemUser;
import com.zhidisoft.crm.entity.TbSystemUserExample.Criteria;
import com.zhidisoft.crm.entity.TbSystemUserExample.Criterion;
import com.zhidisoft.crm.entity.TbSystemUserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TbSystemUserSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public String countByExample(TbSystemUserExample example) {
		SQL sql = new SQL();
		sql.SELECT("count(*)").FROM("TB_SYSTEM_USER");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public String deleteByExample(TbSystemUserExample example) {
		SQL sql = new SQL();
		sql.DELETE_FROM("TB_SYSTEM_USER");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public String insertSelective(TbSystemUser record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("TB_SYSTEM_USER");
		sql.VALUES("ID", "#{id,jdbcType=VARCHAR}");
		if (record.getCreatetime() != null) {
			sql.VALUES("CREATETIME", "#{createtime,jdbcType=TIMESTAMP}");
		}
		if (record.getEmail() != null) {
			sql.VALUES("EMAIL", "#{email,jdbcType=VARCHAR}");
		}
		if (record.getPassword() != null) {
			sql.VALUES("PASSWORD", "#{password,jdbcType=VARCHAR}");
		}
		if (record.getPhone() != null) {
			sql.VALUES("PHONE", "#{phone,jdbcType=VARCHAR}");
		}
		if (record.getSalt() != null) {
			sql.VALUES("SALT", "#{salt,jdbcType=VARCHAR}");
		}
		if (record.getSortnum() != null) {
			sql.VALUES("SORTNUM", "#{sortnum,jdbcType=DECIMAL}");
		}
		if (record.getStatus() != null) {
			sql.VALUES("STATUS", "#{status,jdbcType=DECIMAL}");
		}
		if (record.getUpdatetime() != null) {
			sql.VALUES("UPDATETIME", "#{updatetime,jdbcType=TIMESTAMP}");
		}
		if (record.getUsernote() != null) {
			sql.VALUES("USERNOTE", "#{usernote,jdbcType=VARCHAR}");
		}
		if (record.getUsername() != null) {
			sql.VALUES("USERNAME", "#{username,jdbcType=VARCHAR}");
		}
		if (record.getCreateby() != null) {
			sql.VALUES("CREATEBY", "#{createby,jdbcType=VARCHAR}");
		}
		if (record.getUpdateby() != null) {
			sql.VALUES("UPDATEBY", "#{updateby,jdbcType=VARCHAR}");
		}
		if (record.getRoleId() != null) {
			sql.VALUES("ROLE_ID", "#{roleId,jdbcType=VARCHAR}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public String selectByExample(TbSystemUserExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("ID");
		} else {
			sql.SELECT("ID");
		}
		sql.SELECT("CREATETIME");
		sql.SELECT("EMAIL");
		sql.SELECT("PASSWORD");
		sql.SELECT("PHONE");
		sql.SELECT("SALT");
		sql.SELECT("SORTNUM");
		sql.SELECT("STATUS");
		sql.SELECT("UPDATETIME");
		sql.SELECT("USERNOTE");
		sql.SELECT("USERNAME");
		sql.SELECT("CREATEBY");
		sql.SELECT("UPDATEBY");
		sql.SELECT("ROLE_ID");
		sql.FROM("TB_SYSTEM_USER");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		TbSystemUser record = (TbSystemUser) parameter.get("record");
		TbSystemUserExample example = (TbSystemUserExample) parameter.get("example");
		SQL sql = new SQL();
		sql.UPDATE("TB_SYSTEM_USER");
		if (record.getId() != null) {
			sql.SET("ID = #{record.id,jdbcType=VARCHAR}");
		}
		if (record.getCreatetime() != null) {
			sql.SET("CREATETIME = #{record.createtime,jdbcType=TIMESTAMP}");
		}
		if (record.getEmail() != null) {
			sql.SET("EMAIL = #{record.email,jdbcType=VARCHAR}");
		}
		if (record.getPassword() != null) {
			sql.SET("PASSWORD = #{record.password,jdbcType=VARCHAR}");
		}
		if (record.getPhone() != null) {
			sql.SET("PHONE = #{record.phone,jdbcType=VARCHAR}");
		}
		if (record.getSalt() != null) {
			sql.SET("SALT = #{record.salt,jdbcType=VARCHAR}");
		}
		if (record.getSortnum() != null) {
			sql.SET("SORTNUM = #{record.sortnum,jdbcType=DECIMAL}");
		}
		if (record.getStatus() != null) {
			sql.SET("STATUS = #{record.status,jdbcType=DECIMAL}");
		}
		if (record.getUpdatetime() != null) {
			sql.SET("UPDATETIME = #{record.updatetime,jdbcType=TIMESTAMP}");
		}
		if (record.getUsernote() != null) {
			sql.SET("USERNOTE = #{record.usernote,jdbcType=VARCHAR}");
		}
		if (record.getUsername() != null) {
			sql.SET("USERNAME = #{record.username,jdbcType=VARCHAR}");
		}
		if (record.getCreateby() != null) {
			sql.SET("CREATEBY = #{record.createby,jdbcType=VARCHAR}");
		}
		if (record.getUpdateby() != null) {
			sql.SET("UPDATEBY = #{record.updateby,jdbcType=VARCHAR}");
		}
		if (record.getRoleId() != null) {
			sql.SET("ROLE_ID = #{record.roleId,jdbcType=VARCHAR}");
		}
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public String updateByExample(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("TB_SYSTEM_USER");
		sql.SET("ID = #{record.id,jdbcType=VARCHAR}");
		sql.SET("CREATETIME = #{record.createtime,jdbcType=TIMESTAMP}");
		sql.SET("EMAIL = #{record.email,jdbcType=VARCHAR}");
		sql.SET("PASSWORD = #{record.password,jdbcType=VARCHAR}");
		sql.SET("PHONE = #{record.phone,jdbcType=VARCHAR}");
		sql.SET("SALT = #{record.salt,jdbcType=VARCHAR}");
		sql.SET("SORTNUM = #{record.sortnum,jdbcType=DECIMAL}");
		sql.SET("STATUS = #{record.status,jdbcType=DECIMAL}");
		sql.SET("UPDATETIME = #{record.updatetime,jdbcType=TIMESTAMP}");
		sql.SET("USERNOTE = #{record.usernote,jdbcType=VARCHAR}");
		sql.SET("USERNAME = #{record.username,jdbcType=VARCHAR}");
		sql.SET("CREATEBY = #{record.createby,jdbcType=VARCHAR}");
		sql.SET("UPDATEBY = #{record.updateby,jdbcType=VARCHAR}");
		sql.SET("ROLE_ID = #{record.roleId,jdbcType=VARCHAR}");
		TbSystemUserExample example = (TbSystemUserExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	public String updateByPrimaryKeySelective(TbSystemUser record) {
		SQL sql = new SQL();
		sql.UPDATE("TB_SYSTEM_USER");
		if (record.getCreatetime() != null) {
			sql.SET("CREATETIME = #{createtime,jdbcType=TIMESTAMP}");
		}
		if (record.getEmail() != null) {
			sql.SET("EMAIL = #{email,jdbcType=VARCHAR}");
		}
		if (record.getPassword() != null) {
			sql.SET("PASSWORD = #{password,jdbcType=VARCHAR}");
		}
		if (record.getPhone() != null) {
			sql.SET("PHONE = #{phone,jdbcType=VARCHAR}");
		}
		if (record.getSalt() != null) {
			sql.SET("SALT = #{salt,jdbcType=VARCHAR}");
		}
		if (record.getSortnum() != null) {
			sql.SET("SORTNUM = #{sortnum,jdbcType=DECIMAL}");
		}
		if (record.getStatus() != null) {
			sql.SET("STATUS = #{status,jdbcType=DECIMAL}");
		}
		if (record.getUpdatetime() != null) {
			sql.SET("UPDATETIME = #{updatetime,jdbcType=TIMESTAMP}");
		}
		if (record.getUsernote() != null) {
			sql.SET("USERNOTE = #{usernote,jdbcType=VARCHAR}");
		}
		if (record.getUsername() != null) {
			sql.SET("USERNAME = #{username,jdbcType=VARCHAR}");
		}
		if (record.getCreateby() != null) {
			sql.SET("CREATEBY = #{createby,jdbcType=VARCHAR}");
		}
		if (record.getUpdateby() != null) {
			sql.SET("UPDATEBY = #{updateby,jdbcType=VARCHAR}");
		}
		if (record.getRoleId() != null) {
			sql.SET("ROLE_ID = #{roleId,jdbcType=VARCHAR}");
		}
		sql.WHERE("ID = #{id,jdbcType=VARCHAR}");
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_SYSTEM_USER
	 * @mbg.generated  Mon Apr 16 15:36:27 CST 2018
	 */
	protected void applyWhere(SQL sql, TbSystemUserExample example, boolean includeExamplePhrase) {
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