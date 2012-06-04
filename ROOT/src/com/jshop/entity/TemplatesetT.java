package com.jshop.entity;

// Generated 2012-6-4 11:26:05 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * TemplatesetT generated by hbm2java
 */
public class TemplatesetT implements java.io.Serializable {

	private String tsid;
	private String templateurl;
	private String systemcontent;
	private Date createtime;
	private String creatorid;
	private String buildhtmlpath;
	private String sign;
	private String status;
	private String themeid;
	private String themename;

	public TemplatesetT() {
	}

	public TemplatesetT(String tsid, String templateurl, String systemcontent,
			Date createtime, String creatorid, String buildhtmlpath, String sign) {
		this.tsid = tsid;
		this.templateurl = templateurl;
		this.systemcontent = systemcontent;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.buildhtmlpath = buildhtmlpath;
		this.sign = sign;
	}

	public TemplatesetT(String tsid, String templateurl, String systemcontent,
			Date createtime, String creatorid, String buildhtmlpath,
			String sign, String status, String themeid, String themename) {
		this.tsid = tsid;
		this.templateurl = templateurl;
		this.systemcontent = systemcontent;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.buildhtmlpath = buildhtmlpath;
		this.sign = sign;
		this.status = status;
		this.themeid = themeid;
		this.themename = themename;
	}

	public String getTsid() {
		return this.tsid;
	}

	public void setTsid(String tsid) {
		this.tsid = tsid;
	}

	public String getTemplateurl() {
		return this.templateurl;
	}

	public void setTemplateurl(String templateurl) {
		this.templateurl = templateurl;
	}

	public String getSystemcontent() {
		return this.systemcontent;
	}

	public void setSystemcontent(String systemcontent) {
		this.systemcontent = systemcontent;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public String getBuildhtmlpath() {
		return this.buildhtmlpath;
	}

	public void setBuildhtmlpath(String buildhtmlpath) {
		this.buildhtmlpath = buildhtmlpath;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getThemeid() {
		return this.themeid;
	}

	public void setThemeid(String themeid) {
		this.themeid = themeid;
	}

	public String getThemename() {
		return this.themename;
	}

	public void setThemename(String themename) {
		this.themename = themename;
	}

}
