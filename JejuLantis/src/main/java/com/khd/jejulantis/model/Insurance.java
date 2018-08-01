package com.khd.jejulantis.model;

import java.sql.Date;

public class Insurance {
	private String manager_id;
	private int insurance_no;
	private int branch_no;
	private int car_kind_no;
	private int car_no;
	private int insurance_price;
	private String insurance_name;
	private String insurance_limit;
	private int insurance_burden_price;
	private int insurance_limit_age;
	private int insurance_limit_carrier;
	private String insurance_withdraw_at;
	private Date insurance_resist;
	public Insurance() {
		super();
	}
	public Insurance(int insurance_no, int branch_no, int car_kind_no, int car_no, int insurance_price,
			String insurance_name, String insurance_limit, int insurance_burden_price, int insurance_limit_age,
			int insurance_limit_carrier, String insurance_withdraw_at, Date insurance_resist, String manager_id) {
		super();
		this.insurance_no = insurance_no;
		this.branch_no = branch_no;
		this.car_kind_no = car_kind_no;
		this.car_no = car_no;
		this.insurance_price = insurance_price;
		this.insurance_name = insurance_name;
		this.insurance_limit = insurance_limit;
		this.insurance_burden_price = insurance_burden_price;
		this.insurance_limit_age = insurance_limit_age;
		this.insurance_limit_carrier = insurance_limit_carrier;
		this.insurance_withdraw_at = insurance_withdraw_at;
		this.insurance_resist = insurance_resist;
		this.manager_id = manager_id;
	}
	
	public String getManager_id() {
		return manager_id;
	}
	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
	public int getInsurance_no() {
		return insurance_no;
	}
	public void setInsurance_no(int insurance_no) {
		this.insurance_no = insurance_no;
	}
	public int getBranch_no() {
		return branch_no;
	}
	public void setBranch_no(int branch_no) {
		this.branch_no = branch_no;
	}
	public int getCar_kind_no() {
		return car_kind_no;
	}
	public void setCar_kind_no(int car_kind_no) {
		this.car_kind_no = car_kind_no;
	}
	public int getCar_no() {
		return car_no;
	}
	public void setCar_no(int car_no) {
		this.car_no = car_no;
	}
	public int getInsurance_price() {
		return insurance_price;
	}
	public void setInsurance_price(int insurance_price) {
		this.insurance_price = insurance_price;
	}
	public String getInsurance_name() {
		return insurance_name;
	}
	public void setInsurance_name(String insurance_name) {
		this.insurance_name = insurance_name;
	}
	public String getInsurance_limit() {
		return insurance_limit;
	}
	public void setInsurance_limit(String insurance_limit) {
		this.insurance_limit = insurance_limit;
	}
	public int getInsurance_burden_price() {
		return insurance_burden_price;
	}
	public void setInsurance_burden_price(int insurance_burden_price) {
		this.insurance_burden_price = insurance_burden_price;
	}
	public int getInsurance_limit_age() {
		return insurance_limit_age;
	}
	public void setInsurance_limit_age(int insurance_limit_age) {
		this.insurance_limit_age = insurance_limit_age;
	}
	public int getInsurance_limit_carrier() {
		return insurance_limit_carrier;
	}
	public void setInsurance_limit_carrier(int insurance_limit_carrier) {
		this.insurance_limit_carrier = insurance_limit_carrier;
	}
	public String getInsurance_withdraw_at() {
		return insurance_withdraw_at;
	}
	public void setInsurance_withdraw_at(String insurance_withdraw_at) {
		this.insurance_withdraw_at = insurance_withdraw_at;
	}
	public Date getInsurance_resist() {
		return insurance_resist;
	}
	public void setInsurance_resist(Date insurance_resist) {
		this.insurance_resist = insurance_resist;
	}
}
