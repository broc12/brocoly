package com.khd.jejulantis.model;

import java.sql.Date;

public class Member {
	
	long member_no;
	String member_id;
	String member_pwd;
	String member_name;
	java.sql.Date member_birth;
	String member_sex;
	String member_local;
	String member_tel;
	String member_email;
	String member_sms_at;
	String member_email_at;
	java.sql.Date member_resist_member;
	String member_withdraw_at;
	java.sql.Date member_withdraw_date;
	
	public Member() {}
	public Member(String member_id) {
		this.member_id = member_id;
	}
	public Member(long member_no, String member_id, String member_pwd, String member_name, Date member_birth,
			String member_sex, String member_local, String member_tel, String member_email, String member_sms_at,
			String member_email_at, Date member_resist_member, String member_withdraw_at, Date member_withdraw_date) {
		super();
		this.member_no = member_no;
		this.member_id = member_id;
		this.member_pwd = member_pwd;
		this.member_name = member_name;
		this.member_birth = member_birth;
		this.member_sex = member_sex;
		this.member_local = member_local;
		this.member_tel = member_tel;
		this.member_email = member_email;
		this.member_sms_at = member_sms_at;
		this.member_email_at = member_email_at;
		this.member_resist_member = member_resist_member;
		this.member_withdraw_at = member_withdraw_at;
		this.member_withdraw_date = member_withdraw_date;
	}
	public long getMember_no() {
		return member_no;
	}
	public void setMember_no(long member_no) {
		this.member_no = member_no;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pwd() {
		return member_pwd;
	}
	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public Date getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(Date member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_sex() {
		return member_sex;
	}
	public void setMember_sex(String member_sex) {
		this.member_sex = member_sex;
	}
	public String getMember_local() {
		return member_local;
	}
	public void setMember_local(String member_local) {
		this.member_local = member_local;
	}
	public String getMember_tel() {
		return member_tel;
	}
	public void setMember_tel(String member_tel) {
		this.member_tel = member_tel;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getMember_sms_at() {
		if(member_sms_at == null) {
			return "N";
		}else {
			return member_sms_at;
		}
	}
	public void setMember_sms_at(String member_sms_at) {
		this.member_sms_at = member_sms_at;
	}
	public String getMember_email_at() {
		if(member_email_at == null) {
			return "N";
		}else {
			return member_email_at;
		}
	}
	public void setMember_email_at(String member_email_at) {
		this.member_email_at = member_email_at;
	}
	public Date getMember_resist_member() {
		return member_resist_member;
	}
	public void setMember_resist_member(Date member_resist_member) {
		this.member_resist_member = member_resist_member;
	}
	public String getMember_withdraw_at() {
		if(member_withdraw_at == null) {
			return "N";
		}else {
			return member_withdraw_at;
		}
	}
	public void setMember_withdraw_at(String member_withdraw_at) {
		this.member_withdraw_at = member_withdraw_at;
	}
	public Date getMember_withdraw_date() {
		return member_withdraw_date;
	}
	public void setMember_withdraw_date(Date member_withdraw_date) {
		this.member_withdraw_date = member_withdraw_date;
	}	
}
