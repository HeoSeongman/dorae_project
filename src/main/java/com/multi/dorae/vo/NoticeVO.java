package com.multi.dorae.vo;

public class NoticeVO {
	
	private long id;
	private long admin_id;
	private String title;
	private String content;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(long admin_id) {
		this.admin_id = admin_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "NoticeVO [id=" + id + ", admin_id=" + admin_id + ", title=" + title + ", content=" + content + "]";
	}
	
	
	
	
}
