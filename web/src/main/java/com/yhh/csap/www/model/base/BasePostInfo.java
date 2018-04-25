package com.yhh.csap.www.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;
import com.yhh.csap.core.CoreModel;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePostInfo<M extends BasePostInfo<M>> extends CoreModel<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}
	
	public Integer getId() {
		return getInt("id");
	}

	public void setTitle(String title) {
		set("title", title);
	}
	
	public String getTitle() {
		return getStr("title");
	}

	public void setContent(String content) {
		set("content", content);
	}
	
	public String getContent() {
		return getStr("content");
	}

	public void setScore(java.math.BigDecimal score) {
		set("score", score);
	}
	
	public java.math.BigDecimal getScore() {
		return get("score");
	}

	public void setCAt(java.util.Date cAt) {
		set("cAt", cAt);
	}
	
	public java.util.Date getCAt() {
		return get("cAt");
	}

	public void setMAt(java.util.Date mAt) {
		set("mAt", mAt);
	}
	
	public java.util.Date getMAt() {
		return get("mAt");
	}

	public void setDAt(java.util.Date dAt) {
		set("dAt", dAt);
	}
	
	public java.util.Date getDAt() {
		return get("dAt");
	}

	public void setCheckStatus(String checkStatus) {
		set("checkStatus", checkStatus);
	}
	
	public String getCheckStatus() {
		return getStr("checkStatus");
	}

	public void setStatus(String status) {
		set("status", status);
	}
	
	public String getStatus() {
		return getStr("status");
	}

	public void setOrigin(String origin) {
		set("origin", origin);
	}
	
	public String getOrigin() {
		return getStr("origin");
	}

	public void setCheckOperId(Integer checkOperId) {
		set("checkOperId", checkOperId);
	}
	
	public Integer getCheckOperId() {
		return getInt("checkOperId");
	}

	public void setLastReply(java.util.Date lastReply) {
		set("lastReply", lastReply);
	}
	
	public java.util.Date getLastReply() {
		return get("lastReply");
	}

	public void setCommentCount(Integer commentCount) {
		set("commentCount", commentCount);
	}
	
	public Integer getCommentCount() {
		return getInt("commentCount");
	}

	public void setIfTop(Integer ifTop) {
		set("ifTop", ifTop);
	}
	
	public Integer getIfTop() {
		return getInt("ifTop");
	}

	public void setOperId(Long operId) {
		set("operId", operId);
	}
	
	public Long getOperId() {
		return getLong("operId");
	}

	public void setViewCount(Long viewCount) {
		set("viewCount", viewCount);
	}
	
	public Long getViewCount() {
		return getLong("viewCount");
	}

	public void setLikeCount(Long likeCount) {
		set("likeCount", likeCount);
	}
	
	public Long getLikeCount() {
		return getLong("likeCount");
	}

	public void setTaxId(Long taxId) {
		set("taxId", taxId);
	}
	
	public Long getTaxId() {
		return getLong("taxId");
	}

	public void setCommentStatus(java.lang.String commentStatus) {
		set("commentStatus", commentStatus);
	}

	public java.lang.String getCommentStatus() {
		return getStr("commentStatus");
	}

	public void setPostStatus(java.lang.String postStatus) {
		set("postStatus", postStatus);
	}

	public java.lang.String getPostStatus() {
		return getStr("postStatus");
	}

	public void setIfEssence(java.lang.String ifEssence) {
		set("ifEssence", ifEssence);
	}

	public java.lang.String getIfEssence() {
		return getStr("ifEssence");
	}

}
