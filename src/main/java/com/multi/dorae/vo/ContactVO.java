package com.multi.dorae.vo;

import com.multi.dorae.Enums.HelpCategory;

public class ContactVO {
	private long id;
	private long m_number;
	private HelpCategory helpCategory;
	private String title;
	private String content;
	private long admin_id;
	private String answer;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getM_number() {
		return m_number;
	}
	public void setM_number(long m_number) {
		this.m_number = m_number;
	}
	public HelpCategory getHelpCategory() {
		return helpCategory;
	}
	public void setHelpCategory(HelpCategory helpCategory) {
		this.helpCategory = helpCategory;
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
	public long getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(long admin_id) {
		this.admin_id = admin_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "ContactVO [id=" + id + ", m_number=" + m_number + ", helpCategory=" + helpCategory + ", title=" + title
				+ ", content=" + content + ", admin_id=" + admin_id + ", answer=" + answer + "]";
	}
	
	
	
	
	
}
