package com.yhh.csap.mt.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;
import com.yhh.csap.core.CoreModel;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDoctorInfo<M extends BaseDoctorInfo<M>> extends CoreModel<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}
	
	public Integer getId() {
		return getInt("id");
	}

	public void setName(String name) {
		set("name", name);
	}
	
	public String getName() {
		return getStr("name");
	}

	public void setAvatar(String avatar) {
		set("avatar", avatar);
	}
	
	public String getAvatar() {
		return getStr("avatar");
	}

	public void setSummary(String summary) {
		set("summary", summary);
	}
	
	public String getSummary() {
		return getStr("summary");
	}

	public void setSex(Integer sex) {
		set("sex", sex);
	}
	
	public Integer getSex() {
		return getInt("sex");
	}

	public void setTel1(String tel1) {
		set("tel1", tel1);
	}
	
	public String getTel1() {
		return getStr("tel1");
	}

	public void setEmail(String email) {
		set("email", email);
	}
	
	public String getEmail() {
		return getStr("email");
	}

	public void setHospital(Integer hospital) {
		set("hospital", hospital);
	}
	
	public Integer getHospital() {
		return getInt("hospital");
	}

	public void setLicenseNo(String licenseNo) {
		set("licenseNo", licenseNo);
	}
	
	public String getLicenseNo() {
		return getStr("licenseNo");
	}

	public void setWeixin(String weixin) {
		set("weixin", weixin);
	}
	
	public String getWeixin() {
		return getStr("weixin");
	}

	public void setTel2(String tel2) {
		set("tel2", tel2);
	}
	
	public String getTel2() {
		return getStr("tel2");
	}

	public void setTel3(String tel3) {
		set("tel3", tel3);
	}
	
	public String getTel3() {
		return getStr("tel3");
	}

	public void setIntroduction(String introduction) {
		set("introduction", introduction);
	}
	
	public String getIntroduction() {
		return getStr("introduction");
	}

	public void setCAt(java.util.Date cAt) {
		set("cAt", cAt);
	}
	
	public java.util.Date getCAt() {
		return get("cAt");
	}

	public void setDAt(java.util.Date dAt) {
		set("dAt", dAt);
	}
	
	public java.util.Date getDAt() {
		return get("dAt");
	}

	public void setMAt(java.util.Date mAt) {
		set("mAt", mAt);
	}
	
	public java.util.Date getMAt() {
		return get("mAt");
	}

	public void setOperId(Integer operId) {
		set("operId", operId);
	}
	
	public Integer getOperId() {
		return getInt("operId");
	}

	public void setUserId(Integer userId) {
		set("userId", userId);
	}
	
	public Integer getUserId() {
		return getInt("userId");
	}

	public void setIfTop(java.lang.String ifTop) {
		set("ifTop", ifTop);
	}

	public java.lang.String getIfTop() {
		return getStr("ifTop");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}

	public java.lang.String getStatus() {
		return getStr("status");
	}


	public void setCommentStatus(java.lang.String commentStatus) {
		set("commentStatus", commentStatus);
	}

	public java.lang.String getCommentStatus() {
		return getStr("commentStatus");
	}

	public void setCommentCount(java.lang.Integer commentCount) {
		set("commentCount", commentCount);
	}

	public java.lang.Integer getCommentCount() {
		return getInt("commentCount");
	}

	public void setCommentTime(java.util.Date commentTime) {
		set("commentTime", commentTime);
	}

	public java.util.Date getCommentTime() {
		return get("commentTime");
	}

	public void setCollectCount(java.lang.Integer collectCount) {
		set("collectCount", collectCount);
	}

	public java.lang.Integer getCollectCount() {
		return getInt("collectCount");
	}

	public void setLaudCount(java.lang.Integer laudCount) {
		set("laudCount", laudCount);
	}

	public java.lang.Integer getLaudCount() {
		return getInt("laudCount");
	}

	public void setViewCount(java.lang.Integer viewCount) {
		set("viewCount", viewCount);
	}

	public java.lang.Integer getViewCount() {
		return getInt("viewCount");
	}
}
