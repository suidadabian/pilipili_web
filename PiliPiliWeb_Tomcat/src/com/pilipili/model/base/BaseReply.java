package com.pilipili.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseReply<M extends BaseReply<M>> extends Model<M> implements IBean {

	public M setId(Long id) {
		set("id", id);
		return (M)this;
	}
	
	public Long getId() {
		return getLong("id");
	}

	public M setUserId(Long userId) {
		set("userId", userId);
		return (M)this;
	}
	
	public Long getUserId() {
		return getLong("userId");
	}

	public M setCommentId(Long commentId) {
		set("commentId", commentId);
		return (M)this;
	}
	
	public Long getCommentId() {
		return getLong("commentId");
	}

	public M setReply(String reply) {
		set("reply", reply);
		return (M)this;
	}
	
	public String getReply() {
		return getStr("reply");
	}

	public M setDate(java.util.Date date) {
		set("date", date);
		return (M)this;
	}
	
	public java.util.Date getDate() {
		return get("date");
	}

}