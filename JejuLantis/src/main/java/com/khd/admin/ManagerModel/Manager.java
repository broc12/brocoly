package com.khd.admin.ManagerModel;

import java.sql.Date;

public class Manager {		 
		long manager_no;
		String manager_id; 
		String manager_pwd;
		String manager_name;
		String manager_email;
		String manager_birth;
		String manager_tel1;
		String manager_tel2;
		String manager_withdraw_at;
		Date manager_resist_member;
		String main;
		String chart;
		String manager_reservstatus;
		String ars_reserv;
		String travelmanagement;
		String manager_review;
		String manager_notice;
		String manager_user;
		String manager_manager;
		String manager_company;
		String manager_carkind;
		String manager_d_carkind;
		String manager_carinfo;
		String manager_paystatus;
		String manager_salestatus;
		String banner;
		String coupon;
		String sms;
		String manager_insurance;
		
		public Manager(){}
		
		public Manager(String manager_id){
			this.manager_id=manager_id;
		}

		public Manager(long manager_no, String manager_id, String manager_pwd, String manager_name,
				String manager_email, String manager_birth, String manager_tel1, String manager_tel2,
				String manager_withdraw_at, Date manager_resist_member, String main, String chart,
				String manager_reservstatus, String ars_reserv, String travelmanagement, String manager_review,
				String manager_notice, String manager_user, String manager_manager, String manager_company,
				String manager_carkind, String manager_d_carkind, String manager_carinfo, String manager_paystatus,
				String manager_salestatus, String banner, String coupon, String sms, String manager_insurance) {
			super();
			this.manager_no = manager_no;
			this.manager_id = manager_id;
			this.manager_pwd = manager_pwd;
			this.manager_name = manager_name;
			this.manager_email = manager_email;
			this.manager_birth = manager_birth;
			this.manager_tel1 = manager_tel1;
			this.manager_tel2 = manager_tel2;
			this.manager_withdraw_at = manager_withdraw_at;
			this.manager_resist_member = manager_resist_member;
			this.main = main;
			this.chart = chart;
			this.manager_reservstatus = manager_reservstatus;
			this.ars_reserv = ars_reserv;
			this.travelmanagement = travelmanagement;
			this.manager_review = manager_review;
			this.manager_notice = manager_notice;
			this.manager_user = manager_user;
			this.manager_manager = manager_manager;
			this.manager_company = manager_company;
			this.manager_carkind = manager_carkind;
			this.manager_d_carkind = manager_d_carkind;
			this.manager_carinfo = manager_carinfo;
			this.manager_paystatus = manager_paystatus;
			this.manager_salestatus = manager_salestatus;
			this.banner = banner;
			this.coupon = coupon;
			this.sms = sms;
			this.manager_insurance = manager_insurance;
		}

		public long getManager_no() {
			return manager_no;
		}

		public void setManager_no(long manager_no) {
			this.manager_no = manager_no;
		}

		public String getManager_id() {
			return manager_id;
		}

		public void setManager_id(String manager_id) {
			this.manager_id = manager_id;
		}

		public String getManager_pwd() {
			return manager_pwd;
		}

		public void setManager_pwd(String manager_pwd) {
			this.manager_pwd = manager_pwd;
		}

		public String getManager_name() {
			return manager_name;
		}

		public void setManager_name(String manager_name) {
			this.manager_name = manager_name;
		}

		public String getManager_email() {
			return manager_email;
		}

		public void setManager_email(String manager_email) {
			this.manager_email = manager_email;
		}

		public String getManager_birth() {
			return manager_birth;
		}

		public void setManager_birth(String manager_birth) {
			this.manager_birth = manager_birth;
		}

		public String getManager_tel1() {
			return manager_tel1;
		}

		public void setManager_tel1(String manager_tel1) {
			this.manager_tel1 = manager_tel1;
		}

		public String getManager_tel2() {
			return manager_tel2;
		}

		public void setManager_tel2(String manager_tel2) {
			this.manager_tel2 = manager_tel2;
		}

		public String getManager_withdraw_at() {
			return manager_withdraw_at;
		}

		public void setManager_withdraw_at(String manager_withdraw_at) {
			this.manager_withdraw_at = manager_withdraw_at;
		}

		public Date getManager_resist_member() {
			return manager_resist_member;
		}

		public void setManager_resist_member(Date manager_resist_member) {
			this.manager_resist_member = manager_resist_member;
		}

		public String getMain() {
			return main;
		}

		public void setMain(String main) {
			this.main = main;
		}

		public String getChart() {
			return chart;
		}

		public void setChart(String chart) {
			this.chart = chart;
		}

		public String getManager_reservstatus() {
			return manager_reservstatus;
		}

		public void setManager_reservstatus(String manager_reservstatus) {
			this.manager_reservstatus = manager_reservstatus;
		}

		public String getArs_reserv() {
			return ars_reserv;
		}

		public void setArs_reserv(String ars_reserv) {
			this.ars_reserv = ars_reserv;
		}

		public String getTravelmanagement() {
			return travelmanagement;
		}

		public void setTravelmanagement(String travelmanagement) {
			this.travelmanagement = travelmanagement;
		}

		public String getManager_review() {
			return manager_review;
		}

		public void setManager_review(String manager_review) {
			this.manager_review = manager_review;
		}

		public String getManager_notice() {
			return manager_notice;
		}

		public void setManager_notice(String manager_notice) {
			this.manager_notice = manager_notice;
		}

		public String getManager_user() {
			return manager_user;
		}

		public void setManager_user(String manager_user) {
			this.manager_user = manager_user;
		}

		public String getManager_manager() {
			return manager_manager;
		}

		public void setManager_manager(String manager_manager) {
			this.manager_manager = manager_manager;
		}

		public String getManager_company() {
			return manager_company;
		}

		public void setManager_company(String manager_company) {
			this.manager_company = manager_company;
		}

		public String getManager_carkind() {
			return manager_carkind;
		}

		public void setManager_carkind(String manager_carkind) {
			this.manager_carkind = manager_carkind;
		}

		public String getManager_d_carkind() {
			return manager_d_carkind;
		}

		public void setManager_d_carkind(String manager_d_carkind) {
			this.manager_d_carkind = manager_d_carkind;
		}

		public String getManager_carinfo() {
			return manager_carinfo;
		}

		public void setManager_carinfo(String manager_carinfo) {
			this.manager_carinfo = manager_carinfo;
		}

		public String getManager_paystatus() {
			return manager_paystatus;
		}

		public void setManager_paystatus(String manager_paystatus) {
			this.manager_paystatus = manager_paystatus;
		}

		public String getManager_salestatus() {
			return manager_salestatus;
		}

		public void setManager_salestatus(String manager_salestatus) {
			this.manager_salestatus = manager_salestatus;
		}

		public String getBanner() {
			return banner;
		}

		public void setBanner(String banner) {
			this.banner = banner;
		}

		public String getCoupon() {
			return coupon;
		}

		public void setCoupon(String coupon) {
			this.coupon = coupon;
		}

		public String getSms() {
			return sms;
		}

		public void setSms(String sms) {
			this.sms = sms;
		}

		public String getManager_insurance() {
			return manager_insurance;
		}

		public void setManager_insurance(String manager_insurance) {
			this.manager_insurance = manager_insurance;
		}
		
		
		
}
