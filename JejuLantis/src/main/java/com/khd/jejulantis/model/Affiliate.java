package com.khd.jejulantis.model;

import java.sql.Date;

public class Affiliate {
	private long affiliate_no;
	private String affiliate_branch_name;
	private String affiliate_member_name;
	private String affiliate_member_email;
	private long affiliate_member_tel;
	private String affiliate_title;
	private String affiliate_content;
	private Date affiliate_date;
	public Affiliate() {
		
	}
	public Affiliate(long affiliate_no, String affiliate_branch_name, String affiliate_member_name,
			String affiliate_member_email, long affiliate_member_tel,
			String affiliate_title, String affiliate_content, Date affiliate_date) {
		super();
		this.affiliate_no = affiliate_no;
		this.affiliate_branch_name = affiliate_branch_name;
		this.affiliate_member_name = affiliate_member_name;
		this.affiliate_member_email = affiliate_member_email;
		this.affiliate_member_tel = affiliate_member_tel;
		this.affiliate_title = affiliate_title;
		this.affiliate_content = affiliate_content;
		this.affiliate_date = affiliate_date;
	}
	public long getAffiliate_no() {
		return affiliate_no;
	}
	public void setAffiliate_no(long affiliate_no) {
		this.affiliate_no = affiliate_no;
	}
	public String getAffiliate_branch_name() {
		return affiliate_branch_name;
	}
	public void setAffiliate_branch_name(String affiliate_branch_name) {
		this.affiliate_branch_name = affiliate_branch_name;
	}
	public String getAffiliate_member_name() {
		return affiliate_member_name;
	}
	public void setAffiliate_member_name(String affiliate_member_name) {
		this.affiliate_member_name = affiliate_member_name;
	}
	public String getAffiliate_member_email() {
		return affiliate_member_email;
	}
	public void setAffiliate_member_email(String affiliate_member_email) {
		this.affiliate_member_email = affiliate_member_email;
	}
	public long getAffiliate_member_tel() {
		return affiliate_member_tel;
	}
	public void setAffiliate_member_tel(long affiliate_member_tel) {
		this.affiliate_member_tel = affiliate_member_tel;
	}
	public String getAffiliate_title() {
		return affiliate_title;
	}
	public void setAffiliate_title(String affiliate_title) {
		this.affiliate_title = affiliate_title;
	}
	public String getAffiliate_content() {
		return affiliate_content;
	}
	public void setAffiliate_content(String affiliate_content) {
		this.affiliate_content = affiliate_content;
	}
	public Date getAffiliate_date() {
		return affiliate_date;
	}
	public void setAffiliate_date(Date affiliate_date) {
		this.affiliate_date = affiliate_date;
	}
	
	
}
