package com.pilipili.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseLightpicture<M extends BaseLightpicture<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setUserId(java.lang.Long userId) {
		set("userId", userId);
		return (M)this;
	}
	
	public java.lang.Long getUserId() {
		return getLong("userId");
	}

	public M setUrl(java.lang.String url) {
		set("url", url);
		return (M)this;
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}

	public M setDate(java.util.Date date) {
		set("date", date);
		return (M)this;
	}
	
	public java.util.Date getDate() {
		return get("date");
	}

	public M setShare(java.lang.Integer share) {
		set("share", share);
		return (M)this;
	}
	
	public java.lang.Integer getShare() {
		return getInt("share");
	}

	public M setScale(java.lang.Float scale) {
		set("scale", scale);
		return (M)this;
	}
	
	public java.lang.Float getScale() {
		return getFloat("scale");
	}

	public M setDeletehash(java.lang.String deletehash) {
		set("deletehash", deletehash);
		return (M)this;
	}
	
	public java.lang.String getDeletehash() {
		return getStr("deletehash");
	}

}
