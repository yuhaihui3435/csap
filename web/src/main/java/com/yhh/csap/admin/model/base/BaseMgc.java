package com.yhh.csap.admin.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMgc<M extends BaseMgc<M>> extends Model<M> implements IBean {

	public void setTxt(String txt) {
		set("txt", txt);
	}
	
	public String getTxt() {
		return getStr("txt");
	}

	public void setId(Integer id) {
		set("id", id);
	}
	
	public Integer getId() {
		return getInt("id");
	}

}
