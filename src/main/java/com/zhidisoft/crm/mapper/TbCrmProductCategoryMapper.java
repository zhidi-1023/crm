package com.zhidisoft.crm.mapper;

import com.zhidisoft.crm.entity.TbCrmProductCategory;
import com.zhidisoft.crm.entity.TbCrmProductCategoryExample;
import com.zhidisoft.crm.entity.TbCrmProductImages;

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
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface TbCrmProductCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    @SelectProvider(type=TbCrmProductCategorySqlProvider.class, method="countByExample")
    long countByExample(TbCrmProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    @DeleteProvider(type=TbCrmProductCategorySqlProvider.class, method="deleteByExample")
    int deleteByExample(TbCrmProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    @Delete({
        "delete from TB_CRM_PRODUCT_CATEGORY",
        "where CATEGORYID = #{categoryid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String categoryid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    @Insert({
        "insert into TB_CRM_PRODUCT_CATEGORY (CATEGORYID, PARENTID, ",
        "NAME, DESCRIPTION)",
        "values (#{categoryid,jdbcType=VARCHAR}, #{parentid,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR})"
    })
    int insert(TbCrmProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    @InsertProvider(type=TbCrmProductCategorySqlProvider.class, method="insertSelective")
    int insertSelective(TbCrmProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    @SelectProvider(type=TbCrmProductCategorySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CATEGORYID", property="categoryid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PARENTID", property="parentid", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR)
    })
    List<TbCrmProductCategory> selectByExampleWithRowbounds(TbCrmProductCategoryExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    @SelectProvider(type=TbCrmProductCategorySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CATEGORYID", property="categoryid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PARENTID", property="parentid", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR)
    })
    List<TbCrmProductCategory> selectByExample(TbCrmProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    @Select({
        "select",
        "CATEGORYID, PARENTID, NAME, DESCRIPTION",
        "from TB_CRM_PRODUCT_CATEGORY",
        "where CATEGORYID = #{categoryid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="CATEGORYID", property="categoryid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PARENTID", property="parentid", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR)
    })
    TbCrmProductCategory selectByPrimaryKey(String categoryid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    @UpdateProvider(type=TbCrmProductCategorySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbCrmProductCategory record, @Param("example") TbCrmProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    @UpdateProvider(type=TbCrmProductCategorySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TbCrmProductCategory record, @Param("example") TbCrmProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    @UpdateProvider(type=TbCrmProductCategorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbCrmProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_CATEGORY
     *
     * @mbg.generated Thu Apr 26 09:49:36 CST 2018
     */
    @Update({
        "update TB_CRM_PRODUCT_CATEGORY",
        "set PARENTID = #{parentid,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "DESCRIPTION = #{description,jdbcType=VARCHAR}",
        "where CATEGORYID = #{categoryid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TbCrmProductCategory record);
    
    /**
	 * 手动 分页 ORACLE
	 * 判断日期
	 *  <![CDATA[ 注意 < 转义
	 */
	@Select({"<script>"
			+ "SELECT * "
			,"FROM (SELECT ROWNUM AS rowno,r.* "
			, " FROM("
			, "select * from crm.tb_crm_product_images "
			," <where>"
			,"   <if test='searchText !=null'>"
					+ " name like '%${searchText}%'"
			,"   </if>"
			,"   <if test='where1 !=null and where1 == \"week\"'>"
					+ " developmenttime between #{whereData1} and #{whereData2}"
			,"   </if>"
			," </where>"
			, " ) r"
			, " <![CDATA[ where ROWNUM <= #{endIndex} ]]>"
			," ) table_alias"
			, " WHERE table_alias.rowno > ${beginIndex}",
			"</script>"})
	List<TbCrmProductCategory> findPage(@Param("beginIndex")Integer beginIndex,
								@Param("endIndex")Integer endIndex,
								@Param("searchText") String searchText,
								@Param("where1")String where1,
								@Param("whereData1")Date whereData1,
								@Param("whereData2")Date whereData2
			);
}