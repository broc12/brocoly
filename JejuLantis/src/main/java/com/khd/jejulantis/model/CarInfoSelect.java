package com.khd.jejulantis.model;

import java.sql.*;


public class CarInfoSelect {
	
	private String branch_name;
	private String car_name;
	private String car_fuel;
	private String car_info_rent_at; 
	private String car_info_state;
	private String car_info_back_no;
	private int car_info_no;
	
	public CarInfoSelect() {}

	public CarInfoSelect(String branch_name, String car_name, String car_fuel, String car_info_rent_at,
			String car_info_state, String car_info_back_no, int car_info_no) {
		super();
		this.branch_name = branch_name;
		this.car_name = car_name;
		this.car_fuel = car_fuel;
		this.car_info_rent_at = car_info_rent_at;
		this.car_info_state = car_info_state;
		this.car_info_back_no = car_info_back_no;
		this.car_info_no = car_info_no;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public String getCar_fuel() {
		return car_fuel;
	}

	public void setCar_fuel(String car_fuel) {
		this.car_fuel = car_fuel;
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

	public String getCar_info_back_no() {
		return car_info_back_no;
	}

	public void setCar_info_back_no(String car_info_back_no) {
		this.car_info_back_no = car_info_back_no;
	}

	public int getCar_info_no() {
		return car_info_no;
	}

	public void setCar_info_no(int car_info_no) {
		this.car_info_no = car_info_no;
	}


}
