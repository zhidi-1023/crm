package com.zhidisoft.crm.mapper;

import com.zhidisoft.crm.entity.TbCrmMessage;
import com.zhidisoft.crm.entity.TbCrmMessageExample;
import com.zhidisoft.crm.vo.MessListVO;

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

public interface TbCrmMessageMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@SelectProvider(type = TbCrmMessageSqlProvider.class, method = "countByExample")
	long countByExample(TbCrmMessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@DeleteProvider(type = TbCrmMessageSqlProvider.class, method = "deleteByExample")
	int deleteByExample(TbCrmMessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@Delete({ "delete from TB_CRM_MESSAGE", "where MESSAGEID = #{messageid,jdbcType=VARCHAR}" })
	int deleteByPrimaryKey(String messageid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@Insert({ "insert into TB_CRM_MESSAGE (MESSAGEID, TOUSERID, ", "FROMUSERID, READTIME, ", "SENDTIME, STATUS, ",
			"CONTENT)", "values (#{messageid,jdbcType=VARCHAR}, #{touserid,jdbcType=VARCHAR}, ",
			"#{fromuserid,jdbcType=VARCHAR}, #{readtime,jdbcType=TIMESTAMP}, ",
			"#{sendtime,jdbcType=TIMESTAMP}, #{status,jdbcType=DECIMAL}, ", "#{content,jdbcType=CLOB})" })
	int insert(TbCrmMessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@InsertProvider(type = TbCrmMessageSqlProvider.class, method = "insertSelective")
	@SelectKey(statement = "select sys_guid() from dual", keyProperty = "messageid", before = true, resultType = String.class)
	int insertSelective(TbCrmMessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@SelectProvider(type = TbCrmMessageSqlProvider.class, method = "selectByExampleWithBLOBs")
	@Results({ @Result(column = "MESSAGEID", property = "messageid", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "TOUSERID", property = "touserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "FROMUSERID", property = "fromuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "READTIME", property = "readtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "SENDTIME", property = "sendtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "STATUS", property = "status", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CONTENT", property = "content", jdbcType = JdbcType.CLOB) })
	List<TbCrmMessage> selectByExampleWithBLOBsWithRowbounds(TbCrmMessageExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@SelectProvider(type = TbCrmMessageSqlProvider.class, method = "selectByExampleWithBLOBs")
	@Results({ @Result(column = "MESSAGEID", property = "messageid", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "TOUSERID", property = "touserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "FROMUSERID", property = "fromuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "READTIME", property = "readtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "SENDTIME", property = "sendtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "STATUS", property = "status", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CONTENT", property = "content", jdbcType = JdbcType.CLOB) })
	List<TbCrmMessage> selectByExampleWithBLOBs(TbCrmMessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@SelectProvider(type = TbCrmMessageSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "MESSAGEID", property = "messageid", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "TOUSERID", property = "touserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "FROMUSERID", property = "fromuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "READTIME", property = "readtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "SENDTIME", property = "sendtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "STATUS", property = "status", jdbcType = JdbcType.DECIMAL) })
	List<TbCrmMessage> selectByExampleWithRowbounds(TbCrmMessageExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@SelectProvider(type = TbCrmMessageSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "MESSAGEID", property = "messageid", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "TOUSERID", property = "touserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "FROMUSERID", property = "fromuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "READTIME", property = "readtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "SENDTIME", property = "sendtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "STATUS", property = "status", jdbcType = JdbcType.DECIMAL) })
	List<TbCrmMessage> selectByExample(TbCrmMessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@Select({ "select", "MESSAGEID, TOUSERID, FROMUSERID, READTIME, SENDTIME, STATUS, CONTENT", "from TB_CRM_MESSAGE",
			"where MESSAGEID = #{messageid,jdbcType=VARCHAR}" })
	@Results({ @Result(column = "MESSAGEID", property = "messageid", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "TOUSERID", property = "touserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "FROMUSERID", property = "fromuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "READTIME", property = "readtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "SENDTIME", property = "sendtime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "STATUS", property = "status", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CONTENT", property = "content", jdbcType = JdbcType.CLOB) })
	TbCrmMessage selectByPrimaryKey(String messageid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@UpdateProvider(type = TbCrmMessageSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") TbCrmMessage record, @Param("example") TbCrmMessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@UpdateProvider(type = TbCrmMessageSqlProvider.class, method = "updateByExampleWithBLOBs")
	int updateByExampleWithBLOBs(@Param("record") TbCrmMessage record, @Param("example") TbCrmMessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@UpdateProvider(type = TbCrmMessageSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") TbCrmMessage record, @Param("example") TbCrmMessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@UpdateProvider(type = TbCrmMessageSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(TbCrmMessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@Update({ "update TB_CRM_MESSAGE", "set TOUSERID = #{touserid,jdbcType=VARCHAR},",
			"FROMUSERID = #{fromuserid,jdbcType=VARCHAR},", "READTIME = #{readtime,jdbcType=TIMESTAMP},",
			"SENDTIME = #{sendtime,jdbcType=TIMESTAMP},", "STATUS = #{status,jdbcType=DECIMAL},",
			"CONTENT = #{content,jdbcType=CLOB}", "where MESSAGEID = #{messageid,jdbcType=VARCHAR}" })
	int updateByPrimaryKeyWithBLOBs(TbCrmMessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_MESSAGE
	 * @mbg.generated  Tue Apr 24 11:15:01 CST 2018
	 */
	@Update({ "update TB_CRM_MESSAGE", "set TOUSERID = #{touserid,jdbcType=VARCHAR},",
			"FROMUSERID = #{fromuserid,jdbcType=VARCHAR},", "READTIME = #{readtime,jdbcType=TIMESTAMP},",
			"SENDTIME = #{sendtime,jdbcType=TIMESTAMP},", "STATUS = #{status,jdbcType=DECIMAL}",
			"where MESSAGEID = #{messageid,jdbcType=VARCHAR}" })
	int updateByPrimaryKey(TbCrmMessage record);
	
	 @Select({ "<script>" 
				+ "SELECT * "
				, "FROM (SELECT ROWNUM AS rowno,r.* "
				, " FROM("
				,"select m.*,u.username from TB_CRM_MESSAGE m left join TB_SYSTEM_USER u on m.fromuserid = u.id"
				, " <where>"
				,"   <if test='searchText !=null and searchText!=\"\" '>"
				+ " username like '%${searchText}%'"
				, "   </if>", " </where>"
				, " ) r"
				," <![CDATA[ where ROWNUM <= #{endIndex} ]]>"
				, " ) table_alias"
				, " WHERE table_alias.rowno > ${beginIndex}"
				,"</script>" })
	 List<MessListVO> findPage(@Param("beginIndex") Integer beginIndex, @Param("endIndex") Integer endIndex,
				@Param("searchText") String searchText);
	 
	 
	 
	 @Select({
		 "select m.*,u.username from TB_CRM_MESSAGE m left join TB_SYSTEM_USER u on m.fromuserid = u.id where MESSAGEID = #{messageid,jdbcType=VARCHAR}"
	 })
	 MessListVO finduser(@Param("messageid") String messageid);
	 
	 @Select({
		 "<script>" 
		 	, "select count(*) from TB_CRM_MESSAGE m left join TB_SYSTEM_USER u on m.fromuserid = u.id "
			, " <where>"
			,"   <if test='searchText !=null and searchText!=\"\" '>"
			+ " username like '%${searchText}%'"
			, "   </if>", " </where>"
			,"</script>"
	 })
	 long findcont(@Param("searchText") String searchText);
	 
	 
	}




