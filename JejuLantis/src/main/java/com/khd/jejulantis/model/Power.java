package com.khd.jejulantis.model;

public class Power {
	long manager_no;
	String manager_id;
	String manager_name;
	String manager_main;
	String manager_chart;
	String manager_reservstatus;
	String manager_ars_reserv;
	String manager_travelmanagement;
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
	String manager_banner;
	String manager_coupon;
	String manager_sms;
	String manager_insurance;	
	String branch_name;
	
	public Power() {
	}

	public Power(long manager_no, String manager_id, String manager_name, String manager_main, String manager_chart,
			String manager_reservstatus, String manager_ars_reserv, String manager_travelmanagement,
			String manager_review, String manager_notice, String manager_user, String manager_manager,
			String manager_company, String manager_carkind, String manager_d_carkind, String manager_carinfo,
			String manager_paystatus, String manager_salestatus, String manager_banner, String manager_coupon,
			String manager_sms, String manager_insurance, String branch_name) {
		this.manager_no = manager_no;
		this.manager_id = manager_id;
		this.manager_name = manager_name;
		this.manager_main = manager_main;
		this.manager_chart = manager_chart;
		this.manager_reservstatus = manager_reservstatus;
		this.manager_ars_reserv = manager_ars_reserv;
		this.manager_travelmanagement = manager_travelmanagement;
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
		this.manager_banner = manager_banner;
		this.manager_coupon = manager_coupon;
		this.manager_sms = manager_sms;
		this.manager_insurance = manager_insurance;
		this.branch_name = branch_name;
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

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public String getManager_main() {
		if(manager_main == null) {
			return "N";
		}else {
			return manager_main;
		}
	}

	public void setManager_main(String manager_main) {
		this.manager_main = manager_main;
	}

	public String getManager_chart() {
		if(manager_chart == null) {
			return "N";
		}else {
			return manager_chart;
		}
	}

	public void setManager_chart(String manager_chart) {
		this.manager_chart = manager_chart;
	}

	public String getManager_reservstatus() {
		if(manager_chart == null) {
			return "N";
		}else {
			return manager_reservstatus;
		}
	}

	public void setManager_reservstatus(String manager_reservstatus) {
		this.manager_reservstatus = manager_reservstatus;
	}

	public String getManager_ars_reserv() {
		if(manager_ars_reserv == null){
			return "N";
		}else {
			return manager_ars_reserv;
		}
	}

	public void setManager_ars_reserv(String manager_ars_reserv) {
		this.manager_ars_reserv = manager_ars_reserv;
	}

	public String getManager_travelmanagement() {
		if(manager_travelmanagement == null) {
			return "N";
		}else {
			return manager_travelmanagement;
		}
	}

	public void setManager_travelmanagement(String manager_travelmanagement) {
		this.manager_travelmanagement = manager_travelmanagement;
	}

	public String getManager_review() {
		if(manager_review == null) {
			return "N";
		}else {
			return manager_review;
		}
	}

	public void setManager_review(String manager_review) {
		this.manager_review = manager_review;
	}

	public String getManager_notice() {
		if(manager_notice == null) {
			return "N";
		}else {
			return manager_notice;
		}
	}

	public void setManager_notice(String manager_notice) {
		this.manager_notice = manager_notice;
	}

	public String getManager_user() {
		if(manager_user == null) {
			return "N";
		}else {
			return manager_user;
		}
	}

	public void setManager_user(String manager_user) {
		this.manager_user = manager_user;
	}

	public String getManager_manager() {
		if(manager_manager == null) {
			return "N";
		}else {
			return manager_manager;
		}
	}

	public void setManager_manager(String manager_manager) {
		this.manager_manager = manager_manager;
	}

	public String getManager_company() {
		if(manager_company == null) {
			return "N";
		}else {
			return manager_company;
		}
	}

	public void setManager_company(String manager_company) {
		this.manager_company = manager_company;
	}

	public String getManager_carkind() {
		if(manager_carkind == null) {
			return "N";
		}else {
			return manager_carkind;
		}
	}

	public void setManager_carkind(String manager_carkind) {
		this.manager_carkind = manager_carkind;
	}

	public String getManager_d_carkind() {
		if(manager_d_carkind == null) {
			return "N";
		}else {
			return manager_d_carkind;
		}
	}

	public void setManager_d_carkind(String manager_d_carkind) {
		this.manager_d_carkind = manager_d_carkind;
	}

	public String getManager_carinfo() {
		if(manager_carinfo == null) {
			return "N";
		}else {
			return manager_carinfo;
		}
	}

	public void setManager_carinfo(String manager_carinfo) {
		this.manager_carinfo = manager_carinfo;
	}

	public String getManager_paystatus() {
		if(manager_paystatus == null) {
			return "N";
		}else {
			return manager_paystatus;
		}
	}

	public void setManager_paystatus(String manager_paystatus) {
		this.manager_paystatus = manager_paystatus;
	}

	public String getManager_salestatus() {
		if(manager_salestatus == null) {
			return "N";
		}else {
			return manager_salestatus;
		}
	}

	public void setManager_salestatus(String manager_salestatus) {
		this.manager_salestatus = manager_salestatus;
	}

	public String getManager_banner() {
		if(manager_banner == null) {
			return "N";
		}else {
			return manager_banner;
		}
	}

	public void setManager_banner(String manager_banner) {
		this.manager_banner = manager_banner;
	}

	public String getManager_coupon() {
		if(manager_coupon == null) {
			return "N";
		}else {
			return manager_coupon;
		}
	}

	public void setManager_coupon(String manager_coupon) {
		this.manager_coupon = manager_coupon;
	}

	public String getManager_sms() {
		if(manager_sms == null) {
			return "N";
		}else {
			return manager_sms;
		}
	}

	public void setManager_sms(String manager_sms) {
		this.manager_sms = manager_sms;
	}

	public String getManager_insurance() {
		if(manager_insurance == null) {
			return "N";
		}else {
			return manager_insurance;
		}
	}

	public void setManager_insurance(String manager_insurance) {
		this.manager_insurance = manager_insurance;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	
}
