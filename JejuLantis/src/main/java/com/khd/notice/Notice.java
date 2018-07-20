package com.khd.notice;

import java.sql.Date;

public class Notice {
	private String announ_no;
	private String announ_title;
	private String announ_content;
	private Date announ_resist;
	private int announ_count;
	private String announ_writer;
	private String announ_top;
	public Notice() {
	}
	public Notice(String announ_no, String announ_title, String announ_content, Date announ_resist, int announ_count,
			String announ_writer, String announ_top) {
		this.announ_no = announ_no;
		this.announ_title = announ_title;
		this.announ_content = announ_content;
		this.announ_resist = announ_resist;
		this.announ_count = announ_count;
		this.announ_writer = announ_writer;
		this.announ_top = announ_top;
	}
	public String getAnnoun_no() {
		return announ_no;
	}
	public void setAnnoun_no(String announ_no) {
		this.announ_no = announ_no;
	}
	public String getAnnoun_title() {
		return announ_title;
	}
	public void setAnnoun_title(String announ_title) {
		this.announ_title = announ_title;
	}
	public String getAnnoun_content() {
		return announ_content;
	}
	public void setAnnoun_content(String announ_content) {
		this.announ_content = announ_content;
	}
	public Date getAnnoun_resist() {
		return announ_resist;
	}
	public void setAnnoun_resist(Date announ_resist) {
		this.announ_resist = announ_resist;
	}
	public int getAnnoun_count() {
		return announ_count;
	}
	public void setAnnoun_count(int announ_count) {
		this.announ_count = announ_count;
	}
	public String getAnnoun_writer() {
		return announ_writer;
	}
	public void setAnnoun_writer(String announ_writer) {
		this.announ_writer = announ_writer;
	}
	public String getAnnoun_top() {
		return announ_top;
	}
	public void setAnnoun_top(String announ_top) {
		this.announ_top = announ_top;
	}
	
}
