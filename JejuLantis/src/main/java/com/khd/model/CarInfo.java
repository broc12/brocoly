package com.khd.model;

import java.sql.*;


public class CarInfo {
	private int car_info_no;
	private int car_kind_no;
	private int branch_no;
	private String car_info_rent_at;
	private String car_info_rent_state;
	private Date car_info_resist;
	
	public CarInfo() {}

	public CarInfo(int car_info_no, int car_kind_no, int branch_no, String car_info_rent_at, String car_info_rent_state,
			Date car_info_resist) {
		super();
		this.car_info_no = car_info_no;
		this.car_kind_no = car_kind_no;
		this.branch_no = branch_no;
		this.car_info_rent_at = car_info_rent_at;
		this.car_info_rent_state = car_info_rent_state;
		this.car_info_resist = car_info_resist;
	}

	public int getCar_info_no() {
		return car_info_no;
	}

	public void setCar_info_no(int car_info_no) {
		this.car_info_no = car_info_no;
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

	public String getCar_info_rent_state() {
		return car_info_rent_state;
	}

	public void setCar_info_rent_state(String car_info_rent_state) {
		this.car_info_rent_state = car_info_rent_state;
	}

	public Date getCar_info_resist() {
		return car_info_resist;
	}

	public void setCar_info_resist(Date car_info_resist) {
		this.car_info_resist = car_info_resist;
	}	
	
	
}
