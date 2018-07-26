package com.khd.carkindDetail;

import java.util.Date;

public class CarkindDetail {
	
	//
	//private String branch_name;
	//0719
	private int car_kind_no;
	private int branch_no;
	private int insurance_no;
	private int car_no;
	private int car_kind_count;
	private int car_kind_price_week;
	private int car_kind_price_weekend;
	private int car_kind_price_holiday;
	private int car_kind_price_h_holiday;
	private String car_kind_navi;
	private String car_kind_sensor;
	private String car_kind_blackbox;
	private String car_kind_bluetooth;
	private String car_kind_sunroof;
	private String car_kind_camera;
	private String car_kind_nonsmoke;
	private int car_kind_rating;
	private String car_kind_withdraw_at;
	private String car_kind_resist;

	private String insurance_name;
	public CarkindDetail() {}
	

	public CarkindDetail(int insurance_no, String insurance_name) {
		super();
		this.insurance_no = insurance_no;
		this.insurance_name = insurance_name;
	}
	//CAR_KIND INSERT


	public int getCar_kind_no() {
		return car_kind_no;
	}


	public CarkindDetail(String car_kind_withdraw_at, int branch_no, int insurance_no, int car_no, int car_kind_count,
			int car_kind_price_week, int car_kind_price_weekend, int car_kind_price_holiday,
			int car_kind_price_h_holiday, String car_kind_navi, String car_kind_sensor, String car_kind_blackbox,
			String car_kind_bluetooth, String car_kind_sunroof, String car_kind_camera, String car_kind_nonsmoke,
			int car_kind_rating, int car_kind_no, String car_kind_resist) {
		super();
		this.car_kind_no = car_kind_no;
		this.branch_no = branch_no;
		this.insurance_no = insurance_no;
		this.car_no = car_no;
		this.car_kind_count = car_kind_count;
		this.car_kind_price_week = car_kind_price_week;
		this.car_kind_price_weekend = car_kind_price_weekend;
		this.car_kind_price_holiday = car_kind_price_holiday;
		this.car_kind_price_h_holiday = car_kind_price_h_holiday;
		this.car_kind_navi = car_kind_navi;
		this.car_kind_sensor = car_kind_sensor;
		this.car_kind_blackbox = car_kind_blackbox;
		this.car_kind_bluetooth = car_kind_bluetooth;
		this.car_kind_sunroof = car_kind_sunroof;
		this.car_kind_camera = car_kind_camera;
		this.car_kind_nonsmoke = car_kind_nonsmoke;
		this.car_kind_rating = car_kind_rating;
		this.car_kind_withdraw_at = car_kind_withdraw_at;
		this.car_kind_resist = car_kind_resist;
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


	public int getInsurance_no() {
		return insurance_no;
	}


	public void setInsurance_no(int insurance_no) {
		this.insurance_no = insurance_no;
	}


	public int getCar_no() {
		return car_no;
	}


	public void setCar_no(int car_no) {
		this.car_no = car_no;
	}


	public int getCar_kind_count() {
		return car_kind_count;
	}


	public void setCar_kind_count(int car_kind_count) {
		this.car_kind_count = car_kind_count;
	}


	public int getCar_kind_price_week() {
		return car_kind_price_week;
	}


	public void setCar_kind_price_week(int car_kind_price_week) {
		this.car_kind_price_week = car_kind_price_week;
	}


	public int getCar_kind_price_weekend() {
		return car_kind_price_weekend;
	}


	public void setCar_kind_price_weekend(int car_kind_price_weekend) {
		this.car_kind_price_weekend = car_kind_price_weekend;
	}


	public int getCar_kind_price_holiday() {
		return car_kind_price_holiday;
	}


	public void setCar_kind_price_holiday(int car_kind_price_holiday) {
		this.car_kind_price_holiday = car_kind_price_holiday;
	}


	public int getCar_kind_price_h_holiday() {
		return car_kind_price_h_holiday;
	}


	public void setCar_kind_price_h_holiday(int car_kind_price_h_holiday) {
		this.car_kind_price_h_holiday = car_kind_price_h_holiday;
	}


	public String getCar_kind_navi() {
		return car_kind_navi;
	}


	public void setCar_kind_navi(String car_kind_navi) {
		this.car_kind_navi = car_kind_navi;
	}


	public String getCar_kind_sensor() {
		return car_kind_sensor;
	}


	public void setCar_kind_sensor(String car_kind_sensor) {
		this.car_kind_sensor = car_kind_sensor;
	}


	public String getCar_kind_blackbox() {
		return car_kind_blackbox;
	}


	public void setCar_kind_blackbox(String car_kind_blackbox) {
		this.car_kind_blackbox = car_kind_blackbox;
	}


	public String getCar_kind_bluetooth() {
		return car_kind_bluetooth;
	}


	public void setCar_kind_bluetooth(String car_kind_bluetooth) {
		this.car_kind_bluetooth = car_kind_bluetooth;
	}


	public String getCar_kind_sunroof() {
		return car_kind_sunroof;
	}


	public void setCar_kind_sunroof(String car_kind_sunroof) {
		this.car_kind_sunroof = car_kind_sunroof;
	}


	public String getCar_kind_camera() {
		return car_kind_camera;
	}


	public void setCar_kind_camera(String car_kind_camera) {
		this.car_kind_camera = car_kind_camera;
	}


	public String getCar_kind_nonsmoke() {
		return car_kind_nonsmoke;
	}


	public void setCar_kind_nonsmoke(String car_kind_nonsmoke) {
		this.car_kind_nonsmoke = car_kind_nonsmoke;
	}


	public int getCar_kind_rating() {
		return car_kind_rating;
	}


	public void setCar_kind_rating(int car_kind_rating) {
		this.car_kind_rating = car_kind_rating;
	}


	public String getCar_kind_withdraw_at() {
		return car_kind_withdraw_at;
	}


	public void setCar_kind_withdraw_at(String car_kind_withdraw_at) {
		this.car_kind_withdraw_at = car_kind_withdraw_at;
	}


	public String getCar_kind_resist() {
		return car_kind_resist;
	}


	public void setCar_kind_resist(String car_kind_resist) {
		this.car_kind_resist = car_kind_resist;
	}


	public String getInsurance_name() {
		return insurance_name;
	}


	public void setInsurance_name(String insurance_name) {
		this.insurance_name = insurance_name;
	}


	
}
