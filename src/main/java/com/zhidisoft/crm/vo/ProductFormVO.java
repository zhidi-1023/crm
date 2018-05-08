package com.zhidisoft.crm.vo;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import com.zhidisoft.crm.entity.TbCrmProduct;

public class ProductFormVO {
	private String name;
	private Date developmenttime;
	@NotEmpty(message = "开发团队不能为空")
	private String developmentteam;
	private BigDecimal suggestedprice;
	private String categoryid;
	private BigDecimal costprice;
	private String creatoruserid;
	private String link;
	private String description;
    private Date createtime;
    private Date updatetime;


	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDevelopmenttime() {
		return developmenttime;
	}

	public void setDevelopmenttime(Date developmenttime) {
		this.developmenttime = developmenttime;
	}

	public String getDevelopmentteam() {
		return developmentteam;
	}

	public void setDevelopmentteam(String developmentteam) {
		this.developmentteam = developmentteam;
	}

	public BigDecimal getSuggestedprice() {
		return suggestedprice;
	}

	public void setSuggestedprice(BigDecimal suggestedprice) {
		this.suggestedprice = suggestedprice;
	}

	public String getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public BigDecimal getCostprice() {
		return costprice;
	}

	public void setCostprice(BigDecimal costprice) {
		this.costprice = costprice;
	}

	public String getCreatoruserid() {
		return creatoruserid;
	}

	public void setCreatoruserid(String creatoruserid) {
		this.creatoruserid = creatoruserid;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TbCrmProduct toProduct() {
		TbCrmProduct product = new TbCrmProduct();
		product.setCategoryid(categoryid);
		product.setCostprice(costprice);
		product.setDescription(description);
		product.setDevelopmentteam(developmentteam);
		product.setDevelopmenttime(developmenttime);
		product.setLink(link);
		product.setName(name);
		product.setSuggestedprice(suggestedprice);
		product.setCreatoruserid(creatoruserid);
		product.setCreatetime(createtime);
		product.setUpdatetime(updatetime);
		return product;

	}
}
