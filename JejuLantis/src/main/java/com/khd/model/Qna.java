package com.khd.model;

import java.sql.Date;

public class Qna {
	private long qna_no;
	private long qna_group;
	private int qna_lev;
	private String qna_name;
	private String qna_email;
	private String qna_tel;
	private String qna_title;
	private String qna_content;
	private String qna_pwd;
	private int qna_secret;
	private int qna_answer_check;
	private Date qna_resist;
	private String qna_resist_id;

	public Qna() {}

	public Qna(long qna_no, long qna_group, int qna_lev, String qna_name, String qna_email, String qna_tel,
			String qna_title, String qna_content, String qna_pwd, int qna_secret, int qna_answer_check, Date qna_resist,
			String qna_resist_id) {
		super();
		this.qna_no = qna_no;
		this.qna_group = qna_group;
		this.qna_lev = qna_lev;
		this.qna_name = qna_name;
		this.qna_email = qna_email;
		this.qna_tel = qna_tel;
		this.qna_title = qna_title;
		this.qna_content = qna_content;
		this.qna_pwd = qna_pwd;
		this.qna_secret = qna_secret;
		this.qna_answer_check = qna_answer_check;
		this.qna_resist = qna_resist;
		this.qna_resist_id = qna_resist_id;
	}

	public long getQna_no() {
		return qna_no;
	}

	public void setQna_no(long qna_no) {
		this.qna_no = qna_no;
	}

	public long getQna_group() {
		return qna_group;
	}

	public void setQna_group(long qna_group) {
		this.qna_group = qna_group;
	}

	public int getQna_lev() {
		return qna_lev;
	}

	public void setQna_lev(int qna_lev) {
		this.qna_lev = qna_lev;
	}

	public String getQna_name() {
		return qna_name;
	}

	public void setQna_name(String qna_name) {
		this.qna_name = qna_name;
	}

	public String getQna_email() {
		return qna_email;
	}

	public void setQna_email(String qna_email) {
		this.qna_email = qna_email;
	}

	public String getQna_tel() {
		return qna_tel;
	}

	public void setQna_tel(String qna_tel) {
		this.qna_tel = qna_tel;
	}

	public String getQna_title() {
		return qna_title;
	}

	public void setQna_title(String qna_title) {
		this.qna_title = qna_title;
	}

	public String getQna_content() {
		return qna_content;
	}

	public void setQna_content(String qna_content) {
		this.qna_content = qna_content;
	}

	public String getQna_pwd() {
		return qna_pwd;
	}

	public void setQna_pwd(String qna_pwd) {
		this.qna_pwd = qna_pwd;
	}

	public int getQna_secret() {
		return qna_secret;
	}

	public void setQna_secret(int qna_secret) {
		this.qna_secret = qna_secret;
	}

	public int getQna_answer_check() {
		return qna_answer_check;
	}
	public String getQna_answer_checkString() {
		if(qna_answer_check==0)
			return "답변대기";
		else if(qna_answer_check==1)
			return "답변완료";
		else if(qna_answer_check==2)
		return "";
		else return "";
	}

	public void setQna_answer_check(int qna_answer_check) {
		this.qna_answer_check = qna_answer_check;
	}

	public Date getQna_resist() {
		return qna_resist;
	}

	public void setQna_resist(Date qna_resist) {
		this.qna_resist = qna_resist;
	}

	public String getQna_resist_id() {
		return qna_resist_id;
	}

	public void setQna_resist_id(String qna_resist_id) {
		this.qna_resist_id = qna_resist_id;
	}

	
}
