package com.zhidisoft.crm.mapper;

import com.zhidisoft.crm.entity.TbCrmContacts;
import com.zhidisoft.crm.entity.TbCrmContactsExample.Criteria;
import com.zhidisoft.crm.entity.TbCrmContactsExample.Criterion;
import com.zhidisoft.crm.entity.TbCrmContactsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TbCrmContactsSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_CONTACTS
	 * @mbg.generated  Thu May 03 11:23:26 CST 2018
	 */
	public String countByExample(TbCrmContactsExample example) {
		SQL sql = new SQL();
		sql.SELECT("count(*)").FROM("TB_CRM_CONTACTS");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_CONTACTS
	 * @mbg.generated  Thu May 03 11:23:26 CST 2018
	 */
	public String deleteByExample(TbCrmContactsExample example) {
		SQL sql = new SQL();
		sql.DELETE_FROM("TB_CRM_CONTACTS");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_CONTACTS
	 * @mbg.generated  Thu May 03 11:23:26 CST 2018
	 */
	public String insertSelective(TbCrmContacts record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("TB_CRM_CONTACTS");
		sql.VALUES("CONTACTSID", "#{contactsid,jdbcType=VARCHAR}");
		if (record.getCreatoruserid() != null) {
			sql.VALUES("CREATORUSERID", "#{creatoruserid,jdbcType=VARCHAR}");
		}
		if (record.getName() != null) {
			sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
		}
		if (record.getPost() != null) {
			sql.VALUES("POST", "#{post,jdbcType=VARCHAR}");
		}
		if (record.getDepartment() != null) {
			sql.VALUES("DEPARTMENT", "#{department,jdbcType=VARCHAR}");
		}
		if (record.getSex() != null) {
			sql.VALUES("SEX", "#{sex,jdbcType=DECIMAL}");
		}
		if (record.getSaltname() != null) {
			sql.VALUES("SALTNAME", "#{saltname,jdbcType=VARCHAR}");
		}
		if (record.getTelephone() != null) {
			sql.VALUES("TELEPHONE", "#{telephone,jdbcType=VARCHAR}");
		}
		if (record.getEmail() != null) {
			sql.VALUES("EMAIL", "#{email,jdbcType=VARCHAR}");
		}
		if (record.getQqno() != null) {
			sql.VALUES("QQNO", "#{qqno,jdbcType=VARCHAR}");
		}
		if (record.getAddress() != null) {
			sql.VALUES("ADDRESS", "#{address,jdbcType=VARCHAR}");
		}
		if (record.getZipcode() != null) {
			sql.VALUES("ZIPCODE", "#{zipcode,jdbcType=VARCHAR}");
		}
		if (record.getDescription() != null) {
			sql.VALUES("DESCRIPTION", "#{description,jdbcType=VARCHAR}");
		}
		if (record.getCreatetime() != null) {
			sql.VALUES("CREATETIME", "#{createtime,jdbcType=TIMESTAMP}");
		}
		if (record.getUpdatdtime() != null) {
			sql.VALUES("UPDATDTIME", "#{updatdtime,jdbcType=TIMESTAMP}");
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
		if (record.getCustomerid() != null) {
			sql.VALUES("CUSTOMERID", "#{customerid,jdbcType=VARCHAR}");
		}
		if (record.getFirstcontactsid() != null) {
			sql.VALUES("FIRSTCONTACTSID", "#{firstcontactsid,jdbcType=VARCHAR}");
		}
		if (record.getIsfirst() != null) {
			sql.VALUES("ISFIRST", "#{isfirst,jdbcType=DECIMAL}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_CONTACTS
	 * @mbg.generated  Thu May 03 11:23:26 CST 2018
	 */
	public String selectByExample(TbCrmContactsExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("CONTACTSID");
		} else {
			sql.SELECT("CONTACTSID");
		}
		sql.SELECT("CREATORUSERID");
		sql.SELECT("NAME");
		sql.SELECT("POST");
		sql.SELECT("DEPARTMENT");
		sql.SELECT("SEX");
		sql.SELECT("SALTNAME");
		sql.SELECT("TELEPHONE");
		sql.SELECT("EMAIL");
		sql.SELECT("QQNO");
		sql.SELECT("ADDRESS");
		sql.SELECT("ZIPCODE");
		sql.SELECT("DESCRIPTION");
		sql.SELECT("CREATETIME");
		sql.SELECT("UPDATDTIME");
		sql.SELECT("ISDELETED");
		sql.SELECT("DELETEUSERID");
		sql.SELECT("DELETETIME");
		sql.SELECT("CUSTOMERID");
		sql.SELECT("FIRSTCONTACTSID");
		sql.SELECT("ISFIRST");
		sql.FROM("TB_CRM_CONTACTS");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_CONTACTS
	 * @mbg.generated  Thu May 03 11:23:26 CST 2018
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		TbCrmContacts record = (TbCrmContacts) parameter.get("record");
		TbCrmContactsExample example = (TbCrmContactsExample) parameter.get("example");
		SQL sql = new SQL();
		sql.UPDATE("TB_CRM_CONTACTS");
		if (record.getContactsid() != null) {
			sql.SET("CONTACTSID = #{record.contactsid,jdbcType=VARCHAR}");
		}
		if (record.getCreatoruserid() != null) {
			sql.SET("CREATORUSERID = #{record.creatoruserid,jdbcType=VARCHAR}");
		}
		if (record.getName() != null) {
			sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
		}
		if (record.getPost() != null) {
			sql.SET("POST = #{record.post,jdbcType=VARCHAR}");
		}
		if (record.getDepartment() != null) {
			sql.SET("DEPARTMENT = #{record.department,jdbcType=VARCHAR}");
		}
		if (record.getSex() != null) {
			sql.SET("SEX = #{record.sex,jdbcType=DECIMAL}");
		}
		if (record.getSaltname() != null) {
			sql.SET("SALTNAME = #{record.saltname,jdbcType=VARCHAR}");
		}
		if (record.getTelephone() != null) {
			sql.SET("TELEPHONE = #{record.telephone,jdbcType=VARCHAR}");
		}
		if (record.getEmail() != null) {
			sql.SET("EMAIL = #{record.email,jdbcType=VARCHAR}");
		}
		if (record.getQqno() != null) {
			sql.SET("QQNO = #{record.qqno,jdbcType=VARCHAR}");
		}
		if (record.getAddress() != null) {
			sql.SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
		}
		if (record.getZipcode() != null) {
			sql.SET("ZIPCODE = #{record.zipcode,jdbcType=VARCHAR}");
		}
		if (record.getDescription() != null) {
			sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
		}
		if (record.getCreatetime() != null) {
			sql.SET("CREATETIME = #{record.createtime,jdbcType=TIMESTAMP}");
		}
		if (record.getUpdatdtime() != null) {
			sql.SET("UPDATDTIME = #{record.updatdtime,jdbcType=TIMESTAMP}");
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
		if (record.getCustomerid() != null) {
			sql.SET("CUSTOMERID = #{record.customerid,jdbcType=VARCHAR}");
		}
		if (record.getFirstcontactsid() != null) {
			sql.SET("FIRSTCONTACTSID = #{record.firstcontactsid,jdbcType=VARCHAR}");
		}
		if (record.getIsfirst() != null) {
			sql.SET("ISFIRST = #{record.isfirst,jdbcType=DECIMAL}");
		}
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_CONTACTS
	 * @mbg.generated  Thu May 03 11:23:26 CST 2018
	 */
	public String updateByExample(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("TB_CRM_CONTACTS");
		sql.SET("CONTACTSID = #{record.contactsid,jdbcType=VARCHAR}");
		sql.SET("CREATORUSERID = #{record.creatoruserid,jdbcType=VARCHAR}");
		sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
		sql.SET("POST = #{record.post,jdbcType=VARCHAR}");
		sql.SET("DEPARTMENT = #{record.department,jdbcType=VARCHAR}");
		sql.SET("SEX = #{record.sex,jdbcType=DECIMAL}");
		sql.SET("SALTNAME = #{record.saltname,jdbcType=VARCHAR}");
		sql.SET("TELEPHONE = #{record.telephone,jdbcType=VARCHAR}");
		sql.SET("EMAIL = #{record.email,jdbcType=VARCHAR}");
		sql.SET("QQNO = #{record.qqno,jdbcType=VARCHAR}");
		sql.SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
		sql.SET("ZIPCODE = #{record.zipcode,jdbcType=VARCHAR}");
		sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
		sql.SET("CREATETIME = #{record.createtime,jdbcType=TIMESTAMP}");
		sql.SET("UPDATDTIME = #{record.updatdtime,jdbcType=TIMESTAMP}");
		sql.SET("ISDELETED = #{record.isdeleted,jdbcType=DECIMAL}");
		sql.SET("DELETEUSERID = #{record.deleteuserid,jdbcType=VARCHAR}");
		sql.SET("DELETETIME = #{record.deletetime,jdbcType=TIMESTAMP}");
		sql.SET("CUSTOMERID = #{record.customerid,jdbcType=VARCHAR}");
		sql.SET("FIRSTCONTACTSID = #{record.firstcontactsid,jdbcType=VARCHAR}");
		sql.SET("ISFIRST = #{record.isfirst,jdbcType=DECIMAL}");
		TbCrmContactsExample example = (TbCrmContactsExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_CONTACTS
	 * @mbg.generated  Thu May 03 11:23:26 CST 2018
	 */
	public String updateByPrimaryKeySelective(TbCrmContacts record) {
		SQL sql = new SQL();
		sql.UPDATE("TB_CRM_CONTACTS");
		if (record.getCreatoruserid() != null) {
			sql.SET("CREATORUSERID = #{creatoruserid,jdbcType=VARCHAR}");
		}
		if (record.getName() != null) {
			sql.SET("NAME = #{name,jdbcType=VARCHAR}");
		}
		if (record.getPost() != null) {
			sql.SET("POST = #{post,jdbcType=VARCHAR}");
		}
		if (record.getDepartment() != null) {
			sql.SET("DEPARTMENT = #{department,jdbcType=VARCHAR}");
		}
		if (record.getSex() != null) {
			sql.SET("SEX = #{sex,jdbcType=DECIMAL}");
		}
		if (record.getSaltname() != null) {
			sql.SET("SALTNAME = #{saltname,jdbcType=VARCHAR}");
		}
		if (record.getTelephone() != null) {
			sql.SET("TELEPHONE = #{telephone,jdbcType=VARCHAR}");
		}
		if (record.getEmail() != null) {
			sql.SET("EMAIL = #{email,jdbcType=VARCHAR}");
		}
		if (record.getQqno() != null) {
			sql.SET("QQNO = #{qqno,jdbcType=VARCHAR}");
		}
		if (record.getAddress() != null) {
			sql.SET("ADDRESS = #{address,jdbcType=VARCHAR}");
		}
		if (record.getZipcode() != null) {
			sql.SET("ZIPCODE = #{zipcode,jdbcType=VARCHAR}");
		}
		if (record.getDescription() != null) {
			sql.SET("DESCRIPTION = #{description,jdbcType=VARCHAR}");
		}
		if (record.getCreatetime() != null) {
			sql.SET("CREATETIME = #{createtime,jdbcType=TIMESTAMP}");
		}
		if (record.getUpdatdtime() != null) {
			sql.SET("UPDATDTIME = #{updatdtime,jdbcType=TIMESTAMP}");
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
		if (record.getCustomerid() != null) {
			sql.SET("CUSTOMERID = #{customerid,jdbcType=VARCHAR}");
		}
		if (record.getFirstcontactsid() != null) {
			sql.SET("FIRSTCONTACTSID = #{firstcontactsid,jdbcType=VARCHAR}");
		}
		if (record.getIsfirst() != null) {
			sql.SET("ISFIRST = #{isfirst,jdbcType=DECIMAL}");
		}
		sql.WHERE("CONTACTSID = #{contactsid,jdbcType=VARCHAR}");
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_CONTACTS
	 * @mbg.generated  Thu May 03 11:23:26 CST 2018
	 */
	protected void applyWhere(SQL sql, TbCrmContactsExample example, boolean includeExamplePhrase) {
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