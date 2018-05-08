package com.zhidisoft.crm.mapper;

import com.zhidisoft.crm.entity.TbCrmContract;
import com.zhidisoft.crm.entity.TbCrmContractExample;
import com.zhidisoft.crm.vo.ContractVO;

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

public interface TbCrmContractMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @SelectProvider(type=TbCrmContractSqlProvider.class, method="countByExample")
    long countByExample(TbCrmContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @DeleteProvider(type=TbCrmContractSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbCrmContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @Delete({
        "delete from TB_CRM_CONTRACT",
        "where CONTRACTID = #{contractid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String contractid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @Insert({
        "insert into TB_CRM_CONTRACT (CONTRACTID, CONTRACTNUMBER, ",
        "BUSINESSID, PRICE, ",
        "DUETIME, OWNERUSERID, ",
        "CREATORUSERID, DESCRIPTION, ",
        "CREATETIME, UPDATETIME, ",
        "STARTDATE, ENDDATE, ",
        "STATUS, ISDELETED, ",
        "DELETEUSERID, DELETETIME, ",
        "CONTRACTCONTENT)",
        "values (#{contractid,jdbcType=VARCHAR}, #{contractnumber,jdbcType=VARCHAR}, ",
        "#{businessid,jdbcType=VARCHAR}, #{price,jdbcType=DECIMAL}, ",
        "#{duetime,jdbcType=TIMESTAMP}, #{owneruserid,jdbcType=VARCHAR}, ",
        "#{creatoruserid,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{updatetime,jdbcType=TIMESTAMP}, ",
        "#{startdate,jdbcType=TIMESTAMP}, #{enddate,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=VARCHAR}, #{isdeleted,jdbcType=DECIMAL}, ",
        "#{deleteuserid,jdbcType=VARCHAR}, #{deletetime,jdbcType=TIMESTAMP}, ",
        "#{contractcontent,jdbcType=BLOB})"
    })
 /*   @SelectKey(statement="select sys_guid() from dual", keyProperty="contractid", before=true, resultType=String.class)*/
    @SelectKey(statement="select REPLACE(UUID(),'-','')", keyProperty="contractid", before=true, resultType=String.class)
    int insert(TbCrmContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @InsertProvider(type=TbCrmContractSqlProvider.class, method="insertSelective")
 /*   @SelectKey(statement="select sys_guid() from dual", keyProperty="contractid", before=true, resultType=String.class)*/
    @SelectKey(statement="select REPLACE(UUID(),'-','')", keyProperty="contractid", before=true, resultType=String.class)
    int insertSelective(TbCrmContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @SelectProvider(type=TbCrmContractSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="CONTRACTID", property="contractid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CONTRACTNUMBER", property="contractnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUSINESSID", property="businessid", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="DUETIME", property="duetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OWNERUSERID", property="owneruserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATORUSERID", property="creatoruserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATETIME", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATETIME", property="updatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STARTDATE", property="startdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ENDDATE", property="enddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISDELETED", property="isdeleted", jdbcType=JdbcType.DECIMAL),
        @Result(column="DELETEUSERID", property="deleteuserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETETIME", property="deletetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CONTRACTCONTENT", property="contractcontent", jdbcType=JdbcType.BLOB)
    })
    List<TbCrmContract> selectByExampleWithBLOBs(TbCrmContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @SelectProvider(type=TbCrmContractSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CONTRACTID", property="contractid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CONTRACTNUMBER", property="contractnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUSINESSID", property="businessid", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="DUETIME", property="duetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OWNERUSERID", property="owneruserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATORUSERID", property="creatoruserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATETIME", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATETIME", property="updatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STARTDATE", property="startdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ENDDATE", property="enddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISDELETED", property="isdeleted", jdbcType=JdbcType.DECIMAL),
        @Result(column="DELETEUSERID", property="deleteuserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETETIME", property="deletetime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TbCrmContract> selectByExample(TbCrmContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @Select({
        "select",
        "CONTRACTID, CONTRACTNUMBER, BUSINESSID, PRICE, DUETIME, OWNERUSERID, CREATORUSERID, ",
        "DESCRIPTION, CREATETIME, UPDATETIME, STARTDATE, ENDDATE, STATUS, ISDELETED, ",
        "DELETEUSERID, DELETETIME, CONTRACTCONTENT",
        "from TB_CRM_CONTRACT",
        "where CONTRACTID = #{contractid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="CONTRACTID", property="contractid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CONTRACTNUMBER", property="contractnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUSINESSID", property="businessid", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="DUETIME", property="duetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OWNERUSERID", property="owneruserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATORUSERID", property="creatoruserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATETIME", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATETIME", property="updatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STARTDATE", property="startdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ENDDATE", property="enddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISDELETED", property="isdeleted", jdbcType=JdbcType.DECIMAL),
        @Result(column="DELETEUSERID", property="deleteuserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETETIME", property="deletetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CONTRACTCONTENT", property="contractcontent", jdbcType=JdbcType.BLOB)
    })
    TbCrmContract selectByPrimaryKey(String contractid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @UpdateProvider(type=TbCrmContractSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbCrmContract record, @Param("example") TbCrmContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @UpdateProvider(type=TbCrmContractSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") TbCrmContract record, @Param("example") TbCrmContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @UpdateProvider(type=TbCrmContractSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TbCrmContract record, @Param("example") TbCrmContractExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @UpdateProvider(type=TbCrmContractSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbCrmContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @Update({
        "update TB_CRM_CONTRACT",
        "set CONTRACTNUMBER = #{contractnumber,jdbcType=VARCHAR},",
          "BUSINESSID = #{businessid,jdbcType=VARCHAR},",
          "PRICE = #{price,jdbcType=DECIMAL},",
          "DUETIME = #{duetime,jdbcType=TIMESTAMP},",
          "OWNERUSERID = #{owneruserid,jdbcType=VARCHAR},",
          "CREATORUSERID = #{creatoruserid,jdbcType=VARCHAR},",
          "DESCRIPTION = #{description,jdbcType=VARCHAR},",
          "CREATETIME = #{createtime,jdbcType=TIMESTAMP},",
          "UPDATETIME = #{updatetime,jdbcType=TIMESTAMP},",
          "STARTDATE = #{startdate,jdbcType=TIMESTAMP},",
          "ENDDATE = #{enddate,jdbcType=TIMESTAMP},",
          "STATUS = #{status,jdbcType=VARCHAR},",
          "ISDELETED = #{isdeleted,jdbcType=DECIMAL},",
          "DELETEUSERID = #{deleteuserid,jdbcType=VARCHAR},",
          "DELETETIME = #{deletetime,jdbcType=TIMESTAMP},",
          "CONTRACTCONTENT = #{contractcontent,jdbcType=BLOB}",
        "where CONTRACTID = #{contractid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(TbCrmContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_CONTRACT
     *
     * @mbg.generated Wed Apr 25 10:14:37 CST 2018
     */
    @Update({
        "update TB_CRM_CONTRACT",
        "set CONTRACTNUMBER = #{contractnumber,jdbcType=VARCHAR},",
          "BUSINESSID = #{businessid,jdbcType=VARCHAR},",
          "PRICE = #{price,jdbcType=DECIMAL},",
          "DUETIME = #{duetime,jdbcType=TIMESTAMP},",
          "OWNERUSERID = #{owneruserid,jdbcType=VARCHAR},",
          "CREATORUSERID = #{creatoruserid,jdbcType=VARCHAR},",
          "DESCRIPTION = #{description,jdbcType=VARCHAR},",
          "CREATETIME = #{createtime,jdbcType=TIMESTAMP},",
          "UPDATETIME = #{updatetime,jdbcType=TIMESTAMP},",
          "STARTDATE = #{startdate,jdbcType=TIMESTAMP},",
          "ENDDATE = #{enddate,jdbcType=TIMESTAMP},",
          "STATUS = #{status,jdbcType=VARCHAR},",
          "ISDELETED = #{isdeleted,jdbcType=DECIMAL},",
          "DELETEUSERID = #{deleteuserid,jdbcType=VARCHAR},",
          "DELETETIME = #{deletetime,jdbcType=TIMESTAMP}",
        "where CONTRACTID = #{contractid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TbCrmContract record);
    /**
     * 分页查询
     * @param beginIndex
     * @param endIndex
     * @param searchText
     * @return
     */
   /* @Select({"<script>"
            + "SELECT * "
            ,"FROM (SELECT ROWNUM AS rowno,r.* "
            , " FROM("
            , "SELECT CON.*,cus.name,cont.CONTACTSNAME from TB_CRM_CONTRACT con "
            , "INNER JOIN TB_CRM_BUSINESS bus on BUS.BUSINESSID = CON.BUSINESSID"
            , "inner join TB_CRM_CUSTOMER cus on cus.customerid= bus.customerid "
            , "INNER JOIN TB_CRM_CONTACTS cont on cont.CONTACTSID=bus.CONTACTSID"
            ," <where>"
            ,"   <if test='searchText !=null'>"
                    , " contractNumber like '%${searchText}%'"
            ,"   </if>"
            ," </where>"
            , " ) r"
            , " <![CDATA[ where ROWNUM <= #{endIndex} ]]>"
            ," ) table_alias"
            , " WHERE table_alias.rowno > ${beginIndex}",
            "</script>"})
    List<ContractVO> findPage(@Param("beginIndex")Integer beginIndex,@Param("endIndex")Integer endIndex,@Param("searchText") String searchText);*/
    @Select({"<script>"
            , "SELECT CON.*,cus.name,cont.CONTACTSNAME from TB_CRM_CONTRACT con "
            , "INNER JOIN TB_CRM_BUSINESS bus on BUS.BUSINESSID = CON.BUSINESSID"
            , "inner join TB_CRM_CUSTOMER cus on cus.customerid= bus.customerid "
            , "INNER JOIN TB_CRM_CONTACTS cont on cont.CONTACTSID=bus.CONTACTSID"
            ," <where>"
            ,"   <if test='searchText !=null'>"
                    , " contractNumber like '%${searchText}%'"
            ,"   </if>"
            ," </where>"
        	," limit #{beginIndex},#{endIndex}"
			,"</script>"})	
    List<ContractVO> findPage(@Param("beginIndex")Integer beginIndex,@Param("endIndex")Integer endIndex,@Param("searchText") String searchText);
     
}