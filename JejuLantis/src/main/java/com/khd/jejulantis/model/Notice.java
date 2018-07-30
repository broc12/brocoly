package com.khd.jejulantis.model;

import java.sql.Date;

public class Notice {
	private long announce_no;
	private String announce_title;
	private String announce_content;
	private long announce_hits;
	private String announce_top;
	private Date announce_resist;
	private long manager_no;
	public Notice() {
	}
	public Notice(long announce_no, String announce_title, String announce_content, long announce_hits,
			String announce_top, Date announce_resist, long manager_no) {
		this.announce_no = announce_no;
		this.announce_title = announce_title;
		this.announce_content = announce_content;
		this.announce_hits = announce_hits;
		this.announce_top = announce_top;
		this.announce_resist = announce_resist;
		this.manager_no = manager_no;
	}
	public long getAnnounce_no() {
		return announce_no;
	}
	public void setAnnounce_no(long announce_no) {
		this.announce_no = announce_no;
	}
	public String getAnnounce_title() {
		return announce_title;
	}
	public void setAnnounce_title(String announce_title) {
		this.announce_title = announce_title;
	}
	public String getAnnounce_content() {
		return announce_content;
	}
	public void setAnnounce_content(String announce_content) {
		this.announce_content = announce_content;
	}
	public long getAnnounce_hits() {
		return announce_hits;
	}
	public void setAnnounce_hits(long announce_hits) {
		this.announce_hits = announce_hits;
	}
	public String getAnnounce_top() {
		return announce_top;
	}
	public void setAnnounce_top(String announce_top) {
		this.announce_top = announce_top;
	}
	public Date getAnnounce_resist() {
		return announce_resist;
	}
	public void setAnnounce_resist(Date announce_resist) {
		this.announce_resist = announce_resist;
	}
	public long getManager_no() {
		return manager_no;
	}
	public void setManager_no(long manager_no) {
		this.manager_no = manager_no;
	}
	
}
