package com.zhidisoft.crm.vo;

import java.util.Date;

import com.zhidisoft.crm.entity.TbCrmCustomer;

public class CustomerFromVO {

	private String NAME;
	private String ORIGIN;
	private String ADDRESS;
	private String ZIPCODE;
	private String INDUSTRY;
	private String ANNUALREVENUE;
	private String OWNERSHIP;
	private String RATING;
	private Date CREATETIME;
	private Date UPDATETIME;
	private int ISDELETED;
	private int ISLOCKED;
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getORIGIN() {
		return ORIGIN;
	}
	public void setORIGIN(String oRIGIN) {
		ORIGIN = oRIGIN;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getZIPCODE() {
		return ZIPCODE;
	}
	public void setZIPCODE(String zIPCODE) {
		ZIPCODE = zIPCODE;
	}
	public String getINDUSTRY() {
		return INDUSTRY;
	}
	public void setINDUSTRY(String iNDUSTRY) {
		INDUSTRY = iNDUSTRY;
	}
	public String getANNUALREVENUE() {
		return ANNUALREVENUE;
	}
	public void setANNUALREVENUE(String aNNUALREVENUE) {
		ANNUALREVENUE = aNNUALREVENUE;
	}
	public String getOWNERSHIP() {
		return OWNERSHIP;
	}
	public void setOWNERSHIP(String oWNERSHIP) {
		OWNERSHIP = oWNERSHIP;
	}
	public String getRATING() {
		return RATING;
	}
	public void setRATING(String rATING) {
		RATING = rATING;
	}
	public Date getCREATETIME() {
		return CREATETIME;
	}
	public void setCREATETIME(Date cREATETIME) {
		CREATETIME = cREATETIME;
	}
	public Date getUPDATETIME() {
		return UPDATETIME;
	}
	public void setUPDATETIME(Date uPDATETIME) {
		UPDATETIME = uPDATETIME;
	}
	public int getISDELETED() {
		return ISDELETED;
	}
	public void setISDELETED(int iSDELETED) {
		ISDELETED = iSDELETED;
	}
	public int getISLOCKED() {
		return ISLOCKED;
	}
	public void setISLOCKED(int iSLOCKED) {
		ISLOCKED = iSLOCKED;
	}
	public TbCrmCustomer toCustomer(){
		TbCrmCustomer crmCustomer = new TbCrmCustomer();
		crmCustomer.setName(NAME);
		crmCustomer.setOrigin(ORIGIN);
		crmCustomer.setAddress(ADDRESS);
		crmCustomer.setZipcode(ZIPCODE);
		crmCustomer.setIndustry(INDUSTRY);
		crmCustomer.setAnnualrevenue(ANNUALREVENUE);
		crmCustomer.setOwnership(OWNERSHIP);
		crmCustomer.setRating(RATING);
		crmCustomer.setCreatetime(CREATETIME);
		crmCustomer.setUpdatetime(UPDATETIME);
		crmCustomer.setIsdeleted((short)1);
		crmCustomer.setIslocked((short)0);
		return crmCustomer;
	}
}
