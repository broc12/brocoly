package com.khd.jejulantis.model;

import java.sql.*;


public class CarInfo {
	private int car_info_no;
	private int car_no;
	private int car_kind_no;
	private int branch_no;
	private String car_info_rent_at;
	private String car_info_state;
	private String car_info_withdraw_at;
	private String car_info_back_no;
	private Date car_info_resist;
	
	public CarInfo() {}

	public CarInfo(int car_info_no, int car_no, int car_kind_no, int branch_no, String car_info_rent_at,
			String car_info_state, String car_info_withdraw_at, String car_info_back_no, Date car_info_resist) {
		super();
		this.car_info_no = car_info_no;
		this.car_no = car_no;
		this.car_kind_no = car_kind_no;
		this.branch_no = branch_no;
		this.car_info_rent_at = car_info_rent_at;
		this.car_info_state = car_info_state;
		this.car_info_withdraw_at = car_info_withdraw_at;
		this.car_info_back_no = car_info_back_no;
		this.car_info_resist = car_info_resist;
	}

	public int getCar_info_no() {
		return car_info_no;
	}

	public void setCar_info_no(int car_info_no) {
		this.car_info_no = car_info_no;
	}

	public int getCar_no() {
		return car_no;
	}

	public void setCar_no(int car_no) {
		this.car_no = car_no;
	}

	public int getCar_kind_no() {
		return car_kind_no;
	}

	public void setCar_kind_no(int car_kind_no) {
		this.car_kind_no = car_kind_no;
	}

	public int getBranch_no() {
		return branch_no;
	}

	public void setBranch_no(int branch_no) {
		this.branch_no = branch_no;
	}

	public String getCar_info_rent_at() {
		return car_info_rent_at;
	}

	public void setCar_info_rent_at(String car_info_rent_at) {
		this.car_info_rent_at = car_info_rent_at;
	}

	public String getCar_info_state() {
		return car_info_state;
	}

	public void setCar_info_state(String car_info_state) {
		this.car_info_state = car_info_state;
	}

	public String getCar_info_withdraw_at() {
		return car_info_withdraw_at;
	}

	public void setCar_info_withdraw_at(String car_info_withdraw_at) {
		this.car_info_withdraw_at = car_info_withdraw_at;
	}

	public String getCar_info_back_no() {
		return car_info_back_no;
	}

	public void setCar_info_back_no(String car_info_back_no) {
		this.car_info_back_no = car_info_back_no;
	}

	public Date getCar_info_resist() {
		return car_info_resist;
	}

	public void setCar_info_resist(Date car_info_resist) {
		this.car_info_resist = car_info_resist;
	}

}
