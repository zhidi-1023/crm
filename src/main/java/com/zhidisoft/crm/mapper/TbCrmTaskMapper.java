package com.zhidisoft.crm.mapper;

import com.zhidisoft.crm.entity.TbCrmTask;
import com.zhidisoft.crm.entity.TbCrmTaskExample;
import com.zhidisoft.crm.vo.TaskStatusVO;
import com.zhidisoft.crm.vo.TbCrmTaskVO;

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
import org.apache.ibatis.type.JdbcType;

public interface TbCrmTaskMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@SelectProvider(type = TbCrmTaskSqlProvider.class, method = "countByExample")
	long countByExample(TbCrmTaskExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@DeleteProvider(type = TbCrmTaskSqlProvider.class, method = "deleteByExample")
	int deleteByExample(TbCrmTaskExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@Delete({ "delete from TB_CRM_TASK", "where TASKID = #{taskid,jdbcType=VARCHAR}" })
	int deleteByPrimaryKey(String taskid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@Insert({ "insert into TB_CRM_TASK (TASKID, OWNERUSERID, ", "ABOUT_USER, SUBJECT, ", "DUEDATE, STATUS, ",
			"PRIORITY, SENDEMAIL, ", "CREATORUSERID, CREATEDATE, ", "UPDTADATE, ISCLOSE, ", "ISDELETED, DELETEUSERID, ",
			"DELETETIME, DESCRIPTION)", "values (#{taskid,jdbcType=VARCHAR}, #{owneruserid,jdbcType=VARCHAR}, ",
			"#{aboutUser,jdbcType=VARCHAR}, #{subject,jdbcType=VARCHAR}, ",
			"#{duedate,jdbcType=TIMESTAMP}, #{status,jdbcType=VARCHAR}, ",
			"#{priority,jdbcType=VARCHAR}, #{sendemail,jdbcType=VARCHAR}, ",
			"#{creatoruserid,jdbcType=VARCHAR}, #{createdate,jdbcType=TIMESTAMP}, ",
			"#{updtadate,jdbcType=TIMESTAMP}, #{isclose,jdbcType=DECIMAL}, ",
			"#{isdeleted,jdbcType=DECIMAL}, #{deleteuserid,jdbcType=VARCHAR}, ",
			"#{deletetime,jdbcType=TIMESTAMP}, #{description,jdbcType=BLOB})" })
/*	@SelectKey(statement = "select sys_guid() from dual", keyProperty = "taskid", before = true, resultType = String.class)
*/	@SelectKey(statement = "select REPLACE(UUID(),'-','')", keyProperty = "taskid", before = true, resultType = String.class)
	int insert(TbCrmTask record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@InsertProvider(type = TbCrmTaskSqlProvider.class, method = "insertSelective")
	//@SelectKey(statement = "select sys_guid() from dual", keyProperty = "taskid", before = true, resultType = String.class)
	@SelectKey(statement = "select REPLACE(UUID(),'-','')", keyProperty = "taskid", before = true, resultType = String.class)
	
	int insertSelective(TbCrmTask record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@SelectProvider(type = TbCrmTaskSqlProvider.class, method = "selectByExampleWithBLOBs")
	@Results({ @Result(column = "TASKID", property = "taskid", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "OWNERUSERID", property = "owneruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ABOUT_USER", property = "aboutUser", jdbcType = JdbcType.VARCHAR),
			@Result(column = "SUBJECT", property = "subject", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DUEDATE", property = "duedate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "STATUS", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "PRIORITY", property = "priority", jdbcType = JdbcType.VARCHAR),
			@Result(column = "SENDEMAIL", property = "sendemail", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CREATORUSERID", property = "creatoruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CREATEDATE", property = "createdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "UPDTADATE", property = "updtadate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ISCLOSE", property = "isclose", jdbcType = JdbcType.DECIMAL),
			@Result(column = "ISDELETED", property = "isdeleted", jdbcType = JdbcType.DECIMAL),
			@Result(column = "DELETEUSERID", property = "deleteuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DELETETIME", property = "deletetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "DESCRIPTION", property = "description", jdbcType = JdbcType.BLOB) })
	List<TbCrmTask> selectByExampleWithBLOBs(TbCrmTaskExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@SelectProvider(type = TbCrmTaskSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "TASKID", property = "taskid", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "OWNERUSERID", property = "owneruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ABOUT_USER", property = "aboutUser", jdbcType = JdbcType.VARCHAR),
			@Result(column = "SUBJECT", property = "subject", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DUEDATE", property = "duedate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "STATUS", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "PRIORITY", property = "priority", jdbcType = JdbcType.VARCHAR),
			@Result(column = "SENDEMAIL", property = "sendemail", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CREATORUSERID", property = "creatoruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CREATEDATE", property = "createdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "UPDTADATE", property = "updtadate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ISCLOSE", property = "isclose", jdbcType = JdbcType.DECIMAL),
			@Result(column = "ISDELETED", property = "isdeleted", jdbcType = JdbcType.DECIMAL),
			@Result(column = "DELETEUSERID", property = "deleteuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DELETETIME", property = "deletetime", jdbcType = JdbcType.TIMESTAMP) })
	List<TbCrmTask> selectByExample(TbCrmTaskExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@Select({ "select", "TASKID, OWNERUSERID, ABOUT_USER, SUBJECT, DUEDATE, STATUS, PRIORITY, SENDEMAIL, ",
			"CREATORUSERID, CREATEDATE, UPDTADATE, ISCLOSE, ISDELETED, DELETEUSERID, DELETETIME, ", "DESCRIPTION",
			"from TB_CRM_TASK", "where TASKID = #{taskid,jdbcType=VARCHAR}" })
	@Results({ @Result(column = "TASKID", property = "taskid", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "OWNERUSERID", property = "owneruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ABOUT_USER", property = "aboutUser", jdbcType = JdbcType.VARCHAR),
			@Result(column = "SUBJECT", property = "subject", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DUEDATE", property = "duedate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "STATUS", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "PRIORITY", property = "priority", jdbcType = JdbcType.VARCHAR),
			@Result(column = "SENDEMAIL", property = "sendemail", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CREATORUSERID", property = "creatoruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "CREATEDATE", property = "createdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "UPDTADATE", property = "updtadate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ISCLOSE", property = "isclose", jdbcType = JdbcType.DECIMAL),
			@Result(column = "ISDELETED", property = "isdeleted", jdbcType = JdbcType.DECIMAL),
			@Result(column = "DELETEUSERID", property = "deleteuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DELETETIME", property = "deletetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "DESCRIPTION", property = "description", jdbcType = JdbcType.BLOB) })
	TbCrmTask selectByPrimaryKey(String taskid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@UpdateProvider(type = TbCrmTaskSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") TbCrmTask record, @Param("example") TbCrmTaskExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@UpdateProvider(type = TbCrmTaskSqlProvider.class, method = "updateByExampleWithBLOBs")
	int updateByExampleWithBLOBs(@Param("record") TbCrmTask record, @Param("example") TbCrmTaskExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@UpdateProvider(type = TbCrmTaskSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") TbCrmTask record, @Param("example") TbCrmTaskExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@UpdateProvider(type = TbCrmTaskSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(TbCrmTask record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@Update({ "update TB_CRM_TASK", "set OWNERUSERID = #{owneruserid,jdbcType=VARCHAR},",
			"ABOUT_USER = #{aboutUser,jdbcType=VARCHAR},", "SUBJECT = #{subject,jdbcType=VARCHAR},",
			"DUEDATE = #{duedate,jdbcType=TIMESTAMP},", "STATUS = #{status,jdbcType=VARCHAR},",
			"PRIORITY = #{priority,jdbcType=VARCHAR},", "SENDEMAIL = #{sendemail,jdbcType=VARCHAR},",
			"CREATORUSERID = #{creatoruserid,jdbcType=VARCHAR},", "CREATEDATE = #{createdate,jdbcType=TIMESTAMP},",
			"UPDTADATE = #{updtadate,jdbcType=TIMESTAMP},", "ISCLOSE = #{isclose,jdbcType=DECIMAL},",
			"ISDELETED = #{isdeleted,jdbcType=DECIMAL},", "DELETEUSERID = #{deleteuserid,jdbcType=VARCHAR},",
			"DELETETIME = #{deletetime,jdbcType=TIMESTAMP},", "DESCRIPTION = #{description,jdbcType=BLOB}",
			"where TASKID = #{taskid,jdbcType=VARCHAR}" })
	int updateByPrimaryKeyWithBLOBs(TbCrmTask record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TB_CRM_TASK
	 * @mbg.generated  Tue Apr 24 11:03:32 CST 2018
	 */
	@Update({ "update TB_CRM_TASK", "set OWNERUSERID = #{owneruserid,jdbcType=VARCHAR},",
			"ABOUT_USER = #{aboutUser,jdbcType=VARCHAR},", "SUBJECT = #{subject,jdbcType=VARCHAR},",
			"DUEDATE = #{duedate,jdbcType=TIMESTAMP},", "STATUS = #{status,jdbcType=VARCHAR},",
			"PRIORITY = #{priority,jdbcType=VARCHAR},", "SENDEMAIL = #{sendemail,jdbcType=VARCHAR},",
			"CREATORUSERID = #{creatoruserid,jdbcType=VARCHAR},", "CREATEDATE = #{createdate,jdbcType=TIMESTAMP},",
			"UPDTADATE = #{updtadate,jdbcType=TIMESTAMP},", "ISCLOSE = #{isclose,jdbcType=DECIMAL},",
			"ISDELETED = #{isdeleted,jdbcType=DECIMAL},", "DELETEUSERID = #{deleteuserid,jdbcType=VARCHAR},",
			"DELETETIME = #{deletetime,jdbcType=TIMESTAMP}", "where TASKID = #{taskid,jdbcType=VARCHAR}" })
	int updateByPrimaryKey(TbCrmTask record);
	@Select({"<script>"
			/*+ "SELECT * "
			,"FROM (SELECT ROWNUM AS rowno,r.* "
			, " FROM("*/
			, "select t.*,u.username from tb_crm_task t left join tb_system_user u on t.owneruserid = u.id "
			," <where>"
			,"   <if test='searchText !=null'>"
					+ " taskId like '%${searchText}%'"				
			,"   </if>"
			/*,"   <if test='where1 !=null and where1==\"mytask\" '>"
					+ " owneruserid = '#{whereData1}'"				
			,"   </if>"*/
			/*,"   <if test='whereData1 !=null and whereData1=\"mycreate\" '>"
					+ " creatoruserid = '#{whereData1}'"				
			,"   </if>"*/
			/*,"   <if test='username !=null and uaername== \"\"'>"
					+ " u.username = #{username} "				
			,"   </if>"*/
			,"   <if test='date1 !=null and date1==\"week\"'>"
					+ " t.duedate between #{whereData1} and #{whereData2} "				
			,"   </if>"
			,"   <if test='status !=null'>"
					+ " t.status = #{status} "				
			,"   </if>"
			," </where>"
			," limit #{beginIndex},#{endIndex}"
			/*, " ) r"
			, " <![CDATA[ where ROWNUM <= #{endIndex} ]]>"
			," ) table_alias"
			, " WHERE table_alias.rowno > ${beginIndex}",*/
			,"</script>"})
	List<TbCrmTaskVO> findPage(@Param("beginIndex")Integer beginIndex,
								@Param("endIndex")Integer endIndex,
								@Param("searchText") String searchText 
								,@Param("status")String status ,
								@Param("date1")String date1,
								@Param("whereData1")Date whereData1,
								@Param("whereData2")Date whereData2, 
								@Param("where1")String where1, 
								@Param("username")String username
								);
	@Select({"<script>"
			/*+ "SELECT * "
			,"FROM (SELECT ROWNUM AS rowno,r.* "
			, " FROM("*/
			, "select u.USERNAME,"
		    ,  "(select count(t.TASKID) from TB_CRM_TASK t where t.CREATORUSERID = u.id) Allcount, "
		    , "(select count(t.TASKID) from TB_CRM_TASK t where t.CREATORUSERID = u.id and t.STATUS='not_start') not_start, "
		    , "(select count(t.TASKID) from TB_CRM_TASK t where t.CREATORUSERID = u.id and t.STATUS='delay') delays ,"
		    , "(select count(t.TASKID) from TB_CRM_TASK t where t.CREATORUSERID = u.id and t.STATUS='running') running,"
		    , "(select count(t.TASKID) from TB_CRM_TASK t where t.CREATORUSERID = u.id and t.STATUS='finished') finished ,"
		    , "(select count(t.TASKID) from TB_CRM_TASK t where t.CREATORUSERID = u.id and t.STATUS='closed') closed"
		    ,"from TB_SYSTEM_USER u"
			," <where>"
			,"   <if test='searchText !=null'>"
					+ " taskId like '%${searchText}%'"				
			,"   </if>"					
			," </where>"			
			/*, " ) r"
			, " <![CDATA[ where ROWNUM <= #{endIndex} ]]>"
			," ) table_alias"
			, " WHERE table_alias.rowno > ${beginIndex}",*/
			," limit #{beginIndex},#{endIndex}"
			,"</script>"})
	List<TaskStatusVO> listPage(@Param("beginIndex")Integer beginIndex,
								@Param("endIndex")Integer endIndex,
								@Param("searchText") String searchText 								
								);
								
}