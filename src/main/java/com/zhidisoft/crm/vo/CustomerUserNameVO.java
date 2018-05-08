package com.zhidisoft.crm.vo;

import java.util.Date;

public class CustomerUserNameVO {
	private  String own_username;
	private  String create_username;
	private  String del_username;
	 private String customerid;
	    private String owneruserid;
	    private String creatoruserid;
	    private String name;
	    private String origin;
	    private String address;
	    public String getOwn_username() {
			return own_username;
		}
		public void setOwn_username(String own_username) {
			this.own_username = own_username;
		}
		public String getCreate_username() {
			return create_username;
		}
		public void setCreate_username(String create_username) {
			this.create_username = create_username;
		}
		public String getDel_username() {
			return del_username;
		}
		public void setDel_username(String del_username) {
			this.del_username = del_username;
		}
		public String getCustomerid() {
			return customerid;
		}
		public void setCustomerid(String customerid) {
			this.customerid = customerid;
		}
		public String getOwneruserid() {
			return owneruserid;
		}
		public void setOwneruserid(String owneruserid) {
			this.owneruserid = owneruserid;
		}
		public String getCreatoruserid() {
			return creatoruserid;
		}
		public void setCreatoruserid(String creatoruserid) {
			this.creatoruserid = creatoruserid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOrigin() {
			return origin;
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getZipcode() {
			return zipcode;
		}
		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}
		public String getIndustry() {
			return industry;
		}
		public void setIndustry(String industry) {
			this.industry = industry;
		}
		public String getAnnualrevenue() {
			return annualrevenue;
		}
		public void setAnnualrevenue(String annualrevenue) {
			this.annualrevenue = annualrevenue;
		}
		public String getOwnership() {
			return ownership;
		}
		public void setOwnership(String ownership) {
			this.ownership = ownership;
		}
		public String getRating() {
			return rating;
		}
		public void setRating(String rating) {
			this.rating = rating;
		}
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
		public Short getIsdeleted() {
			return isdeleted;
		}
		public void setIsdeleted(Short isdeleted) {
			this.isdeleted = isdeleted;
		}
		public Short getIslocked() {
			return islocked;
		}
		public void setIslocked(Short islocked) {
			this.islocked = islocked;
		}
		public String getDeleteuserid() {
			return deleteuserid;
		}
		public void setDeleteuserid(String deleteuserid) {
			this.deleteuserid = deleteuserid;
		}
		public Date getDeletetime() {
			return deletetime;
		}
		public void setDeletetime(Date deletetime) {
			this.deletetime = deletetime;
		}
		private String zipcode;
	    private String industry;
	    private String annualrevenue;
	    private String ownership;
	    private String rating;
	    private Date createtime;
	    private Date updatetime;
	    private Short isdeleted;
	    private Short islocked;
	    private String deleteuserid;
	    private Date deletetime;
}
