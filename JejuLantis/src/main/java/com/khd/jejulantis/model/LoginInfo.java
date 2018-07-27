
	package com.khd.jejulantis.model;

	import java.sql.Date;

	public class LoginInfo {
		String member_no;
		String id; 
		String pwd; 
		String name;
		Date birth; 
		String sex; 
		String sclc; 
		String member_local; 
		String tel; 
		String email; 
		String sms_at; 
		String resist_member;
		String member_whithdraw_at;
		Date whithdraw_date;
		
		public LoginInfo() {}
		
		public LoginInfo(String id) {
			this.id = id;
		}
		
		public LoginInfo(String member_no, String id, String pwd, String name, Date birth, String sex, String sclc,
				String member_local, String tel, String email, String sms_at, String resist_member,
				String member_whithdraw_at, Date whithdraw_date) {
			super();
			this.member_no = member_no;
			this.id = id;
			this.pwd = pwd;
			this.name = name;
			this.birth = birth;
			this.sex = sex;
			this.sclc = sclc;
			this.member_local = member_local;
			this.tel = tel;
			this.email = email;
			this.sms_at = sms_at;
			this.resist_member = resist_member;
			this.member_whithdraw_at = member_whithdraw_at;
			this.whithdraw_date = whithdraw_date;
		}

		public String getMember_no() {
			return member_no;
		}

		public void setMember_no(String member_no) {
			this.member_no = member_no;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getBirth() {
			return birth;
		}

		public void setBirth(Date birth) {
			this.birth = birth;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getSclc() {
			return sclc;
		}

		public void setSclc(String sclc) {
			this.sclc = sclc;
		}

		public String getMember_local() {
			return member_local;
		}

		public void setMember_local(String member_local) {
			this.member_local = member_local;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSms_at() {
			return sms_at;
		}

		public void setSms_at(String sms_at) {
			this.sms_at = sms_at;
		}

		public String getResist_member() {
			return resist_member;
		}

		public void setResist_member(String resist_member) {
			this.resist_member = resist_member;
		}

		public String getMember_whithdraw_at() {
			return member_whithdraw_at;
		}

		public void setMember_whithdraw_at(String member_whithdraw_at) {
			this.member_whithdraw_at = member_whithdraw_at;
		}

		public Date getWhithdraw_date() {
			return whithdraw_date;
		}

		public void setWhithdraw_date(Date whithdraw_date) {
			this.whithdraw_date = whithdraw_date;
		}
		
		
		
	}
