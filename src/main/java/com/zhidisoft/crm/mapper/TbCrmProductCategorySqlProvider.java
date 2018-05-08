package com.zhidisoft.crm.mapper;

import com.zhidisoft.crm.entity.TbCrmProductCategory;
import com.zhidisoft.crm.entity.TbCrmProductCategoryExample.Criteria;
import com.zhidisoft.crm.entity.TbCrmProductCategoryExample.Criterion;
import com.zhidisoft.crm.entity.TbCrmProductCategoryExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TbCrmProductCategorySqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    public String countByExample(TbCrmProductCategoryExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_CRM_PRODUCT_CATEGORY");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    public String deleteByExample(TbCrmProductCategoryExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_CRM_PRODUCT_CATEGORY");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    public String insertSelective(TbCrmProductCategory record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_CRM_PRODUCT_CATEGORY");
        
        if (record.getCategoryid() != null) {
            sql.VALUES("CATEGORYID", "#{categoryid,jdbcType=VARCHAR}");
        }
        
        if (record.getParentid() != null) {
            sql.VALUES("PARENTID", "#{parentid,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("DESCRIPTION", "#{description,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    public String selectByExample(TbCrmProductCategoryExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CATEGORYID");
        } else {
            sql.SELECT("CATEGORYID");
        }
        sql.SELECT("PARENTID");
        sql.SELECT("NAME");
        sql.SELECT("DESCRIPTION");
        sql.FROM("TB_CRM_PRODUCT_CATEGORY");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TbCrmProductCategory record = (TbCrmProductCategory) parameter.get("record");
        TbCrmProductCategoryExample example = (TbCrmProductCategoryExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_CRM_PRODUCT_CATEGORY");
        
        if (record.getCategoryid() != null) {
            sql.SET("CATEGORYID = #{record.categoryid,jdbcType=VARCHAR}");
        }
        
        if (record.getParentid() != null) {
            sql.SET("PARENTID = #{record.parentid,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_CRM_PRODUCT_CATEGORY");
        
        sql.SET("CATEGORYID = #{record.categoryid,jdbcType=VARCHAR}");
        sql.SET("PARENTID = #{record.parentid,jdbcType=VARCHAR}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        
        TbCrmProductCategoryExample example = (TbCrmProductCategoryExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    public String updateByPrimaryKeySelective(TbCrmProductCategory record) {
        SQL sql = new SQL();
        sql.UPDATE("TB_CRM_PRODUCT_CATEGORY");
        
        if (record.getParentid() != null) {
            sql.SET("PARENTID = #{parentid,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("DESCRIPTION = #{description,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("CATEGORYID = #{categoryid,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    protected void applyWhere(SQL sql, TbCrmProductCategoryExample example, boolean includeExamplePhrase) {
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
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
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