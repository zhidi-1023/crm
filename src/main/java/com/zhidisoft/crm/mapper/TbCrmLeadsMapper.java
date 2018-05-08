package com.zhidisoft.crm.mapper;

import com.zhidisoft.crm.entity.TbCrmLeads;
import com.zhidisoft.crm.entity.TbCrmLeadsExample;
import com.zhidisoft.crm.vo.LeadsVO;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface TbCrmLeadsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_LEADS
	 * @mbg.generated  Wed Apr 25 09:38:58 CST 2018
	 */
	@SelectProvider(type = TbCrmLeadsSqlProvider.class, method = "countByExample")
	long countByExample(TbCrmLeadsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_LEADS
	 * @mbg.generated  Wed Apr 25 09:38:58 CST 2018
	 */
	@DeleteProvider(type = TbCrmLeadsSqlProvider.class, method = "deleteByExample")
	int deleteByExample(TbCrmLeadsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_LEADS
	 * @mbg.generated  Wed Apr 25 09:38:58 CST 2018
	 */
	@Delete({ "delete from TB_CRM_LEADS", "where LEADSID = #{leadsid,jdbcType=VARCHAR}" })
	int deleteByPrimaryKey(String leadsid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_LEADS
	 * @mbg.generated  Wed Apr 25 09:38:58 CST 2018
	 */
	@Insert({ "insert into TB_CRM_LEADS (LEADSID, OWNERUSERID, ", "CREATORUSERID, NAME, ", "POSITION, CONTACTSNAME, ",
			"SALTNAME, MOBILE, ", "EMAIL, CREATETIME, ", "UPDATETIME, ISDELETED, ", "DELETEUSERID, DELETETIME, ",
			"ISTRANSFORMED, TRANSFORMUSERID, ", "CONTACTSID, CUSTOMERID, ", "BUSINESSID, NEXTSTEP, ",
			"NEXTSTEPTIME, HAVETIME, ", "ADDRESS, SOURCE, ", "LEADNOTE)",
			"values (#{leadsid,jdbcType=VARCHAR}, #{owneruserid,jdbcType=VARCHAR}, ",
			"#{creatoruserid,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
			"#{position,jdbcType=VARCHAR}, #{contactsname,jdbcType=VARCHAR}, ",
			"#{saltname,jdbcType=VARCHAR}, #{mobile,jdbcType=VARCHAR}, ",
			"#{email,jdbcType=VARCHAR}, #{createtime,jdbcType=TIMESTAMP}, ",
			"#{updatetime,jdbcType=TIMESTAMP}, #{isdeleted,jdbcType=DECIMAL}, ",
			"#{deleteuserid,jdbcType=VARCHAR}, #{deletetime,jdbcType=TIMESTAMP}, ",
			"#{istransformed,jdbcType=DECIMAL}, #{transformuserid,jdbcType=VARCHAR}, ",
			"#{contactsid,jdbcType=VARCHAR}, #{customerid,jdbcType=VARCHAR}, ",
			"#{businessid,jdbcType=VARCHAR}, #{nextstep,jdbcType=VARCHAR}, ",
			"#{nextsteptime,jdbcType=TIMESTAMP}, #{havetime,jdbcType=TIMESTAMP}, ",
			"#{address,jdbcType=VARCHAR}, #{source,jdbcType=VARCHAR}, ", "#{leadnote,jdbcType=VARCHAR})" })
	@SelectKey(statement = "select sys_guid() from dual", keyProperty = "leadsid", before = true, resultType = String.class)
	int insert(TbCrmLeads record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_LEADS
	 * @mbg.generated  Wed Apr 25 09:38:58 CST 2018
	 */
	@InsertProvider(type = TbCrmLeadsSqlProvider.class, method = "insertSelective")
	@SelectKey(statement = "select sys_guid() from dual", keyProperty = "leadsid", before = true, resultType = String.class)
	int insertSelective(TbCrmLeads record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_LEADS
	 * @mbg.generated  Wed Apr 25 09:38:58 CST 2018
	 */
	@SelectProvider(type = TbCrmLeadsSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "LEADSID", property = "leadsid", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "OWNERUSERID", property = "owneruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CREATORUSERID", property = "creatoruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "NAME", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "POSITION", property = "position", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CONTACTSNAME", property = "contactsname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "SALTNAME", property = "saltname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "MOBILE", property = "mobile", jdbcType = JdbcType.VARCHAR),
			@Result(column = "EMAIL", property = "email", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CREATETIME", property = "createtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "UPDATETIME", property = "updatetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ISDELETED", property = "isdeleted", jdbcType = JdbcType.DECIMAL),
			@Result(column = "DELETEUSERID", property = "deleteuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DELETETIME", property = "deletetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ISTRANSFORMED", property = "istransformed", jdbcType = JdbcType.DECIMAL),
			@Result(column = "TRANSFORMUSERID", property = "transformuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CONTACTSID", property = "contactsid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CUSTOMERID", property = "customerid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "BUSINESSID", property = "businessid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "NEXTSTEP", property = "nextstep", jdbcType = JdbcType.VARCHAR),
			@Result(column = "NEXTSTEPTIME", property = "nextsteptime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "HAVETIME", property = "havetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ADDRESS", property = "address", jdbcType = JdbcType.VARCHAR),
			@Result(column = "SOURCE", property = "source", jdbcType = JdbcType.VARCHAR),
			@Result(column = "LEADNOTE", property = "leadnote", jdbcType = JdbcType.VARCHAR) })
	List<TbCrmLeads> selectByExampleWithRowbounds(TbCrmLeadsExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_LEADS
	 * @mbg.generated  Wed Apr 25 09:38:58 CST 2018
	 */
	@SelectProvider(type = TbCrmLeadsSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "LEADSID", property = "leadsid", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "OWNERUSERID", property = "owneruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CREATORUSERID", property = "creatoruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "NAME", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "POSITION", property = "position", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CONTACTSNAME", property = "contactsname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "SALTNAME", property = "saltname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "MOBILE", property = "mobile", jdbcType = JdbcType.VARCHAR),
			@Result(column = "EMAIL", property = "email", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CREATETIME", property = "createtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "UPDATETIME", property = "updatetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ISDELETED", property = "isdeleted", jdbcType = JdbcType.DECIMAL),
			@Result(column = "DELETEUSERID", property = "deleteuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DELETETIME", property = "deletetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ISTRANSFORMED", property = "istransformed", jdbcType = JdbcType.DECIMAL),
			@Result(column = "TRANSFORMUSERID", property = "transformuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CONTACTSID", property = "contactsid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CUSTOMERID", property = "customerid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "BUSINESSID", property = "businessid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "NEXTSTEP", property = "nextstep", jdbcType = JdbcType.VARCHAR),
			@Result(column = "NEXTSTEPTIME", property = "nextsteptime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "HAVETIME", property = "havetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ADDRESS", property = "address", jdbcType = JdbcType.VARCHAR),
			@Result(column = "SOURCE", property = "source", jdbcType = JdbcType.VARCHAR),
			@Result(column = "LEADNOTE", property = "leadnote", jdbcType = JdbcType.VARCHAR) })
	List<TbCrmLeads> selectByExample(TbCrmLeadsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_LEADS
	 * @mbg.generated  Wed Apr 25 09:38:58 CST 2018
	 */
	@Select({ "select", "LEADSID, OWNERUSERID, CREATORUSERID, NAME, POSITION, CONTACTSNAME, SALTNAME, ",
			"MOBILE, EMAIL, CREATETIME, UPDATETIME, ISDELETED, DELETEUSERID, DELETETIME, ",
			"ISTRANSFORMED, TRANSFORMUSERID, CONTACTSID, CUSTOMERID, BUSINESSID, NEXTSTEP, ",
			"NEXTSTEPTIME, HAVETIME, ADDRESS, SOURCE, LEADNOTE", "from TB_CRM_LEADS",
			"where LEADSID = #{leadsid,jdbcType=VARCHAR}" })
	@Results({ @Result(column = "LEADSID", property = "leadsid", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "OWNERUSERID", property = "owneruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CREATORUSERID", property = "creatoruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "NAME", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "POSITION", property = "position", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CONTACTSNAME", property = "contactsname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "SALTNAME", property = "saltname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "MOBILE", property = "mobile", jdbcType = JdbcType.VARCHAR),
			@Result(column = "EMAIL", property = "email", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CREATETIME", property = "createtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "UPDATETIME", property = "updatetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ISDELETED", property = "isdeleted", jdbcType = JdbcType.DECIMAL),
			@Result(column = "DELETEUSERID", property = "deleteuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DELETETIME", property = "deletetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ISTRANSFORMED", property = "istransformed", jdbcType = JdbcType.DECIMAL),
			@Result(column = "TRANSFORMUSERID", property = "transformuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CONTACTSID", property = "contactsid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CUSTOMERID", property = "customerid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "BUSINESSID", property = "businessid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "NEXTSTEP", property = "nextstep", jdbcType = JdbcType.VARCHAR),
			@Result(column = "NEXTSTEPTIME", property = "nextsteptime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "HAVETIME", property = "havetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ADDRESS", property = "address", jdbcType = JdbcType.VARCHAR),
			@Result(column = "SOURCE", property = "source", jdbcType = JdbcType.VARCHAR),
			@Result(column = "LEADNOTE", property = "leadnote", jdbcType = JdbcType.VARCHAR) })
	TbCrmLeads selectByPrimaryKey(String leadsid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_LEADS
	 * @mbg.generated  Wed Apr 25 09:38:58 CST 2018
	 */
	@UpdateProvider(type = TbCrmLeadsSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") TbCrmLeads record, @Param("example") TbCrmLeadsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_LEADS
	 * @mbg.generated  Wed Apr 25 09:38:58 CST 2018
	 */
	@UpdateProvider(type = TbCrmLeadsSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") TbCrmLeads record, @Param("example") TbCrmLeadsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_LEADS
	 * @mbg.generated  Wed Apr 25 09:38:58 CST 2018
	 */
	@UpdateProvider(type = TbCrmLeadsSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(TbCrmLeads record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_LEADS
	 * @mbg.generated  Wed Apr 25 09:38:58 CST 2018
	 */
	@Update({ "update TB_CRM_LEADS", "set OWNERUSERID = #{owneruserid,jdbcType=VARCHAR},",
			"CREATORUSERID = #{creatoruserid,jdbcType=VARCHAR},", "NAME = #{name,jdbcType=VARCHAR},",
			"POSITION = #{position,jdbcType=VARCHAR},", "CONTACTSNAME = #{contactsname,jdbcType=VARCHAR},",
			"SALTNAME = #{saltname,jdbcType=VARCHAR},", "MOBILE = #{mobile,jdbcType=VARCHAR},",
			"EMAIL = #{email,jdbcType=VARCHAR},", "CREATETIME = #{createtime,jdbcType=TIMESTAMP},",
			"UPDATETIME = #{updatetime,jdbcType=TIMESTAMP},", "ISDELETED = #{isdeleted,jdbcType=DECIMAL},",
			"DELETEUSERID = #{deleteuserid,jdbcType=VARCHAR},", "DELETETIME = #{deletetime,jdbcType=TIMESTAMP},",
			"ISTRANSFORMED = #{istransformed,jdbcType=DECIMAL},",
			"TRANSFORMUSERID = #{transformuserid,jdbcType=VARCHAR},", "CONTACTSID = #{contactsid,jdbcType=VARCHAR},",
			"CUSTOMERID = #{customerid,jdbcType=VARCHAR},", "BUSINESSID = #{businessid,jdbcType=VARCHAR},",
			"NEXTSTEP = #{nextstep,jdbcType=VARCHAR},", "NEXTSTEPTIME = #{nextsteptime,jdbcType=TIMESTAMP},",
			"HAVETIME = #{havetime,jdbcType=TIMESTAMP},", "ADDRESS = #{address,jdbcType=VARCHAR},",
			"SOURCE = #{source,jdbcType=VARCHAR},", "LEADNOTE = #{leadnote,jdbcType=VARCHAR}",
			"where LEADSID = #{leadsid,jdbcType=VARCHAR}" })
	int updateByPrimaryKey(TbCrmLeads record);
	@Select({"<script>"
			+ "SELECT * "
			,"FROM (SELECT ROWNUM AS rowno,r.* "
			, " FROM("
			, "select l.*,username from TB_CRM_LEADS l inner JOIN TB_SYSTEM_USER u on l.OWNERUSERID = u.id"
			," <where>"
			/*,"   <if test='1==1'>"
					+ " l.isdeleted = '0'"
			,"   </if>"*/
			,"   <if test='searchText !=null'>"
					+ "and name like '%${searchText}%'"
			,"   </if>"
			,"   <if test='where1 !=null and where1 == \"week\"'>"
					+ " and l.createtime between #{dateBegin} and #{dateEnd}"
			,"   </if>"
			,"   <if test='where1 !=null and where1 == \"today\"'>"
					+ " and l.nextsteptime = #{dateEnd}"
			,"   </if>"
			,"   <if test='where1 !=null and where1 == \"thisweek\"'>"
					+ " and l.nextsteptime between #{dateBegin} and #{dateEnd}"
			,"   </if>"
			,"   <if test='where1 !=null and where1 == \"thismonth\"'>"
					+ " and l.nextsteptime between #{dateBegin} and #{dateEnd}"
			,"   </if>"
			,"   <if test='where1 !=null and where1 == \"nocontact7\"'>"
					+ " and l.nextsteptime between #{dateBegin} and #{dateEnd}"
			,"   </if>"
			,"   <if test='where1 !=null and where1 == \"nocontact15\"'>"
					+ " and l.nextsteptime between #{dateBegin} and #{dateEnd}"
			,"   </if>"
			,"   <if test='where1 !=null and where1 == \"nocontact30\"'>"
					+ " and l.nextsteptime between #{dateBegin} and #{dateEnd}"
			,"   </if>"
			,"   <if test='where1 !=null and where1 == \"update\"'>"
					+ " and l.updatetime between #{dateBegin} and #{dateEnd}"
			,"   </if>"
			," </where>" 
			, " ) r"
			, " <![CDATA[ where ROWNUM <= #{endIndex} ]]>"
			," ) table_alias"
			, " WHERE table_alias.rowno > ${beginIndex}",
			"</script>"})	
    List<LeadsVO> selectByPage(@Param("beginIndex")Integer beginIndex,
    		@Param("endIndex")Integer endIndex,
    		@Param("searchText")String searchText,
    		@Param("where1")String where1,
    		@Param("dateBegin")Date dateBegin,
    		@Param("dateEnd")Date dateEnd);
	
}