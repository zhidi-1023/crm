package com.zhidisoft.crm.mapper;

import com.zhidisoft.crm.entity.TbCrmProduct;
import com.zhidisoft.crm.entity.TbCrmProductImages;
import com.zhidisoft.crm.entity.TbCrmProductImagesExample;

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

public interface TbCrmProductImagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_IMAGES
     *
     * @mbg.generated Thu Apr 26 09:47:15 CST 2018
     */
    @SelectProvider(type=TbCrmProductImagesSqlProvider.class, method="countByExample")
    long countByExample(TbCrmProductImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_IMAGES
     *
     * @mbg.generated Thu Apr 26 09:47:15 CST 2018
     */
    @DeleteProvider(type=TbCrmProductImagesSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbCrmProductImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_IMAGES
     *
     * @mbg.generated Thu Apr 26 09:47:15 CST 2018
     */
    @Delete({
        "delete from TB_CRM_PRODUCT_IMAGES",
        "where IMAGESID = #{imagesid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String imagesid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_IMAGES
     *
     * @mbg.generated Thu Apr 26 09:47:15 CST 2018
     */
    @Insert({
        "insert into TB_CRM_PRODUCT_IMAGES (IMAGESID, PRODUCTID, ",
        "ISMAIN, NAME, SAVENAME, ",
        "IMAGESIZE, PATH, ",
        "CREATETIME, SORTNUM)",
        "values (#{imagesid,jdbcType=VARCHAR}, #{productid,jdbcType=VARCHAR}, ",
        "#{ismain,jdbcType=DECIMAL}, #{name,jdbcType=VARCHAR}, #{savename,jdbcType=VARCHAR}, ",
        "#{imagesize,jdbcType=VARCHAR}, #{path,jdbcType=VARCHAR}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{sortnum,jdbcType=DECIMAL})"
    })
    int insert(TbCrmProductImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_IMAGES
     *
     * @mbg.generated Thu Apr 26 09:47:15 CST 2018
     */
    @InsertProvider(type=TbCrmProductImagesSqlProvider.class, method="insertSelective")
    int insertSelective(TbCrmProductImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_IMAGES
     *
     * @mbg.generated Thu Apr 26 09:47:15 CST 2018
     */
    @SelectProvider(type=TbCrmProductImagesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="IMAGESID", property="imagesid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PRODUCTID", property="productid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISMAIN", property="ismain", jdbcType=JdbcType.DECIMAL),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="SAVENAME", property="savename", jdbcType=JdbcType.VARCHAR),
        @Result(column="IMAGESIZE", property="imagesize", jdbcType=JdbcType.VARCHAR),
        @Result(column="PATH", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATETIME", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SORTNUM", property="sortnum", jdbcType=JdbcType.DECIMAL)
    })
    List<TbCrmProductImages> selectByExampleWithRowbounds(TbCrmProductImagesExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_IMAGES
     *
     * @mbg.generated Thu Apr 26 09:47:15 CST 2018
     */
    @SelectProvider(type=TbCrmProductImagesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="IMAGESID", property="imagesid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PRODUCTID", property="productid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISMAIN", property="ismain", jdbcType=JdbcType.DECIMAL),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="SAVENAME", property="savename", jdbcType=JdbcType.VARCHAR),
        @Result(column="IMAGESIZE", property="imagesize", jdbcType=JdbcType.VARCHAR),
        @Result(column="PATH", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATETIME", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SORTNUM", property="sortnum", jdbcType=JdbcType.DECIMAL)
    })
    List<TbCrmProductImages> selectByExample(TbCrmProductImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_IMAGES
     *
     * @mbg.generated Thu Apr 26 09:47:15 CST 2018
     */
    @Select({
        "select",
        "IMAGESID, PRODUCTID, ISMAIN, NAME, SAVENAME, IMAGESIZE, PATH, CREATETIME, SORTNUM",
        "from TB_CRM_PRODUCT_IMAGES",
        "where IMAGESID = #{imagesid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="IMAGESID", property="imagesid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PRODUCTID", property="productid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISMAIN", property="ismain", jdbcType=JdbcType.DECIMAL),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="SAVENAME", property="savename", jdbcType=JdbcType.VARCHAR),
        @Result(column="IMAGESIZE", property="imagesize", jdbcType=JdbcType.VARCHAR),
        @Result(column="PATH", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATETIME", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SORTNUM", property="sortnum", jdbcType=JdbcType.DECIMAL)
    })
    TbCrmProductImages selectByPrimaryKey(String imagesid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_IMAGES
     *
     * @mbg.generated Thu Apr 26 09:47:15 CST 2018
     */
    @UpdateProvider(type=TbCrmProductImagesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbCrmProductImages record, @Param("example") TbCrmProductImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_IMAGES
     *
     * @mbg.generated Thu Apr 26 09:47:15 CST 2018
     */
    @UpdateProvider(type=TbCrmProductImagesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TbCrmProductImages record, @Param("example") TbCrmProductImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_IMAGES
     *
     * @mbg.generated Thu Apr 26 09:47:15 CST 2018
     */
    @UpdateProvider(type=TbCrmProductImagesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbCrmProductImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CRM_PRODUCT_IMAGES
     *
     * @mbg.generated Thu Apr 26 09:47:15 CST 2018
     */
    @Update({
        "update TB_CRM_PRODUCT_IMAGES",
        "set PRODUCTID = #{productid,jdbcType=VARCHAR},",
          "ISMAIN = #{ismain,jdbcType=DECIMAL},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "SAVENAME = #{savename,jdbcType=VARCHAR},",
          "IMAGESIZE = #{imagesize,jdbcType=VARCHAR},",
          "PATH = #{path,jdbcType=VARCHAR},",
          "CREATETIME = #{createtime,jdbcType=TIMESTAMP},",
          "SORTNUM = #{sortnum,jdbcType=DECIMAL}",
        "where IMAGESID = #{imagesid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TbCrmProductImages record);
    
    /**
	 * 手动 分页 ORACLE
	 * 判断日期
	 *  <![CDATA[ 注意 < 转义
	 */
	@Select({"<script>"
			+ "SELECT * "
			,"FROM (SELECT ROWNUM AS rowno,r.* "
			, " FROM("
			, "select * from crm.tb_crm_product_category "
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
	List<TbCrmProductImages> findPage(@Param("beginIndex")Integer beginIndex,
								@Param("endIndex")Integer endIndex,
								@Param("searchText") String searchText,
								@Param("where1")String where1,
								@Param("whereData1")Date whereData1,
								@Param("whereData2")Date whereData2
			);
}