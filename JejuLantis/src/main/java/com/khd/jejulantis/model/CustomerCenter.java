package com.khd.jejulantis.model;

import java.util.*;

public class CustomerCenter {
	private long announ_no;
	private String announ_title;
	private String announ_content;
	private String announ_writer;
	private long announ_view;
	private Date announ_resist;
	
	public CustomerCenter() {}
	public CustomerCenter(long announ_no, String announ_title, String announ_content, String announ_writer,
			long announ_view, Date announ_resist) {
		this.announ_no = announ_no;
		this.announ_title = announ_title;
		this.announ_content = announ_content;
		this.announ_writer = announ_writer;
		this.announ_view = announ_view;
		this.announ_resist = announ_resist;
	}
	public long getAnnoun_no() {
		return announ_no;
	}
	public void setAnnoun_no(long announ_no) {
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
	public String getAnnoun_writer() {
		return announ_writer;
	}
	public void setAnnoun_writer(String announ_writer) {
		this.announ_writer = announ_writer;
	}
	public long getAnnoun_view() {
		return announ_view;
	}
	public void setAnnoun_view(long announ_view) {
		this.announ_view = announ_view;
	}
	public Date getAnnoun_resist() {
		return announ_resist;
	}
	public void setAnnoun_resist(Date announ_resist) {
		this.announ_resist = announ_resist;
	}
}
