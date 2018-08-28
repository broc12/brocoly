package com.khd.jejulantis.model;

import java.util.Date;

public class CarkindDetail {
	
	
	private String branch_name;
	
	private long insurance_no;
	private long insurance_price;
	private String insurance_name;
	private String insurance_limit;
	private long insurance_burden_price;
	private long insurance_limit_age;
	private long insurance_limit_carrier;
	private String insurance_withdraw_at;
	private Date insurance_resist;
	
	private long car_no;
	private String car_name;
	private String car_manufacturer;
	private String car_fuel;
	private String car_type;
	private long car_passenger;
	private String car_trans;
	private long car_count;
	private String car_image;
	private double car_rating;
	private String car_withdraw_at; 
	private Date car_resist;
	
	private String branch_member_name;
	private long car_kind_no;
	private long branch_no;
	//car_no
	//insurance_no
	private long car_kind_count;
	private long car_kind_price_week;
	private long car_kind_price_weekend;
	private long car_kind_price_holiday;
	private long car_kind_price_h_holiday;
	private String car_kind_navi;
	private String car_kind_sensor;
	private String car_kind_blackbox;
	private String car_kind_bluetooth;
	private String car_kind_sunroof;
	private String car_kind_camera;
	private String car_kind_nonsmoke;
	private double car_kind_rating;
	private long car_kind_total;
	private String car_kind_withdraw_at;
	private Date car_kind_resist;
	public CarkindDetail() {}
	

	public CarkindDetail(long insurance_no, String insurance_name) {
		super();
		this.insurance_no = insurance_no;
		this.insurance_name = insurance_name;
	}
	//CAR_KIND INSERT
	
	public CarkindDetail(long car_kind_no, long branch_no, long car_no,
			long car_kind_price_week, long car_kind_price_weekend, long car_kind_price_holiday,
			long car_kind_price_h_holiday,  long car_kind_count, 
			String car_kind_navi, String car_kind_sensor, String car_kind_blackbox,
			String car_kind_bluetooth, String car_kind_sunroof, String car_kind_camera, String car_kind_nonsmoke,
			double car_kind_rating, long car_kind_total, String car_kind_withdraw_at, Date car_kind_resist) {
		super();
		this.car_kind_no = car_kind_no;
		this.branch_no = branch_no;
		this.car_no = car_no;
		//this.insurance_no = insurance_no;
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
		this.car_kind_total = car_kind_total;
		this.car_kind_withdraw_at = car_kind_withdraw_at;
		this.car_kind_resist = car_kind_resist;
	}


	public CarkindDetail(long insurance_no, long insurance_price, String insurance_name, String insurance_limit,
			long insurance_burden_price, long insurance_limit_age, long insurance_limit_carrier,
			String insurance_withdraw_at, Date insurance_resist, long car_no, String car_name, String car_manufacturer,
			String car_fuel, String car_type, long car_passenger, String car_trans, long car_count, String car_image,
			double car_rating, String car_withdraw_at, Date car_resist, long car_kind_no, long branch_no, long car_kind_count,
			long car_kind_price_week, long car_kind_price_weekend, long car_kind_price_holiday,
			long car_kind_price_h_holiday, String car_kind_navi, String car_kind_sensor, String car_kind_blackbox,
			String car_kind_bluetooth, String car_kind_sunroof, String car_kind_camera, String car_kind_nonsmoke,
			double car_kind_rating, String car_kind_withdraw_at, Date car_kind_resist) {
		super();
		this.insurance_no = insurance_no;
		this.insurance_price = insurance_price;
		this.insurance_name = insurance_name;
		this.insurance_limit = insurance_limit;
		this.insurance_burden_price = insurance_burden_price;
		this.insurance_limit_age = insurance_limit_age;
		this.insurance_limit_carrier = insurance_limit_carrier;
		this.insurance_withdraw_at = insurance_withdraw_at;
		this.insurance_resist = insurance_resist;
		this.car_no = car_no;
		this.car_name = car_name;
		this.car_manufacturer = car_manufacturer;
		this.car_fuel = car_fuel;
		this.car_type = car_type;
		this.car_passenger = car_passenger;
		this.car_trans = car_trans;
		this.car_count = car_count;
		this.car_image = car_image;
		this.car_rating = car_rating;
		this.car_withdraw_at = car_withdraw_at;
		this.car_resist = car_resist;
		this.car_kind_no = car_kind_no;
		this.branch_no = branch_no;
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


	public CarkindDetail(long insurance_no, long branch_no, long insurance_price, String insurance_name,
			String insurance_limit, long insurance_burden_price, long insurance_limit_age, long insurance_limit_carrier,
			String insurance_withdraw_at, Date insurance_resist) {
		super();
		this.insurance_no = insurance_no;
		this.branch_no = branch_no;
		this.insurance_price = insurance_price;
		this.insurance_name = insurance_name;
		this.insurance_limit = insurance_limit;
		this.insurance_burden_price = insurance_burden_price;
		this.insurance_limit_age = insurance_limit_age;
		this.insurance_limit_carrier = insurance_limit_carrier;
		this.insurance_withdraw_at = insurance_withdraw_at;
		this.insurance_resist = insurance_resist;
	}


	public CarkindDetail(long car_no, String car_name, String car_manufacturer, String car_fuel, String car_type,
			long car_passenger, String car_trans, long car_count, String car_image, double car_rating,
			String car_withdraw_at, Date car_resist) {
		super();
		this.car_no = car_no;
		this.car_name = car_name;
		this.car_manufacturer = car_manufacturer;
		this.car_fuel = car_fuel;
		this.car_type = car_type;
		this.car_passenger = car_passenger;
		this.car_trans = car_trans;
		this.car_count = car_count;
		this.car_image = car_image;
		this.car_rating = car_rating;
		this.car_withdraw_at = car_withdraw_at;
		this.car_resist = car_resist;
	}


	


	public CarkindDetail(String branch_name, long insurance_no, long insurance_price, String insurance_name,
			String insurance_limit, long insurance_burden_price, long insurance_limit_age, long insurance_limit_carrier,
			String insurance_withdraw_at, Date insurance_resist, long car_no, String car_name, String car_manufacturer,
			String car_fuel, String car_type, long car_passenger, String car_trans, long car_count, String car_image,
			double car_rating, String car_withdraw_at, Date car_resist, String branch_member_name, long car_kind_no,
			long branch_no, long car_kind_count, long car_kind_price_week, long car_kind_price_weekend,
			long car_kind_price_holiday, long car_kind_price_h_holiday, String car_kind_navi, String car_kind_sensor,
			String car_kind_blackbox, String car_kind_bluetooth, String car_kind_sunroof, String car_kind_camera,
			String car_kind_nonsmoke, double car_kind_rating, long car_kind_total, String car_kind_withdraw_at,
			Date car_kind_resist) {
		super();
		this.branch_name = branch_name;
		this.insurance_no = insurance_no;
		this.insurance_price = insurance_price;
		this.insurance_name = insurance_name;
		this.insurance_limit = insurance_limit;
		this.insurance_burden_price = insurance_burden_price;
		this.insurance_limit_age = insurance_limit_age;
		this.insurance_limit_carrier = insurance_limit_carrier;
		this.insurance_withdraw_at = insurance_withdraw_at;
		this.insurance_resist = insurance_resist;
		this.car_no = car_no;
		this.car_name = car_name;
		this.car_manufacturer = car_manufacturer;
		this.car_fuel = car_fuel;
		this.car_type = car_type;
		this.car_passenger = car_passenger;
		this.car_trans = car_trans;
		this.car_count = car_count;
		this.car_image = car_image;
		this.car_rating = car_rating;
		this.car_withdraw_at = car_withdraw_at;
		this.car_resist = car_resist;
		this.branch_member_name = branch_member_name;
		this.car_kind_no = car_kind_no;
		this.branch_no = branch_no;
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
		this.car_kind_total = car_kind_total;
		this.car_kind_withdraw_at = car_kind_withdraw_at;
		this.car_kind_resist = car_kind_resist;
	}


	public String getBranch_member_name() {
		return branch_member_name;
	}


	public void setBranch_member_name(String branch_member_name) {
		this.branch_member_name = branch_member_name;
	}


	public long getCar_kind_total() {
		return car_kind_total;
	}


	public void setCar_kind_total(long car_kind_total) {
		this.car_kind_total = car_kind_total;
	}


	public String getBranch_name() {
		return branch_name;
	}


	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}


	public long getInsurance_price() {
		return insurance_price;
	}


	public void setInsurance_price(long insurance_price) {
		this.insurance_price = insurance_price;
	}


	public String getInsurance_limit() {
		return insurance_limit;
	}


	public void setInsurance_limit(String insurance_limit) {
		this.insurance_limit = insurance_limit;
	}


	public long getInsurance_burden_price() {
		return insurance_burden_price;
	}


	public void setInsurance_burden_price(long insurance_burden_price) {
		this.insurance_burden_price = insurance_burden_price;
	}


	public long getInsurance_limit_age() {
		return insurance_limit_age;
	}


	public void setInsurance_limit_age(long insurance_limit_age) {
		this.insurance_limit_age = insurance_limit_age;
	}


	public long getInsurance_limit_carrier() {
		return insurance_limit_carrier;
	}


	public void setInsurance_limit_carrier(long insurance_limit_carrier) {
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


	public long getCar_passenger() {
		return car_passenger;
	}


	public void setCar_passenger(long car_passenger) {
		this.car_passenger = car_passenger;
	}


	public String getCar_trans() {
		return car_trans;
	}


	public void setCar_trans(String car_trans) {
		this.car_trans = car_trans;
	}


	public long getCar_count() {
		return car_count;
	}


	public void setCar_count(long car_count) {
		this.car_count = car_count;
	}


	public long getCar_kind_no() {
		return car_kind_no;
	}

	
	public String getCar_image() {
		return car_image;
	}


	public void setCar_image(String car_image) {
		this.car_image = car_image;
	}


	public double getCar_rating() {
		return car_rating;
	}


	public void setCar_rating(double car_rating) {
		this.car_rating = car_rating;
	}


	public String getCar_withdraw_at() {
		return car_withdraw_at;
	}


	public void setCar_withdraw_at(String car_withdraw_at) {
		this.car_withdraw_at = car_withdraw_at;
	}


	public Date getCar_resist() {
		return car_resist;
	}


	public void setCar_resist(Date car_resist) {
		this.car_resist = car_resist;
	}


	public String getCar_manufacturer() {
		return car_manufacturer;
	}


	public void setCar_manufacturer(String car_manufacturer) {
		this.car_manufacturer = car_manufacturer;
	}


	public String getCar_fuel() {
		return car_fuel;
	}


	public void setCar_fuel(String car_fuel) {
		this.car_fuel = car_fuel;
	}


	public String getCar_type() {
		return car_type;
	}


	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}


	public String getCar_name() {
		return car_name;
	}


	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}


	public void setCar_kind_no(long car_kind_no) {
		this.car_kind_no = car_kind_no;
	}


	public long getBranch_no() {
		return branch_no;
	}


	public void setBranch_no(long branch_no) {
		this.branch_no = branch_no;
	}


	public long getInsurance_no() {
		return insurance_no;
	}


	public void setInsurance_no(long insurance_no) {
		this.insurance_no = insurance_no;
	}


	public long getCar_no() {
		return car_no;
	}


	public void setCar_no(long car_no) {
		this.car_no = car_no;
	}


	public long getCar_kind_count() {
		return car_kind_count;
	}


	public void setCar_kind_count(long car_kind_count) {
		this.car_kind_count = car_kind_count;
	}


	public long getCar_kind_price_week() {
		return car_kind_price_week;
	}


	public void setCar_kind_price_week(long car_kind_price_week) {
		this.car_kind_price_week = car_kind_price_week;
	}


	public long getCar_kind_price_weekend() {
		return car_kind_price_weekend;
	}


	public void setCar_kind_price_weekend(long car_kind_price_weekend) {
		this.car_kind_price_weekend = car_kind_price_weekend;
	}


	public long getCar_kind_price_holiday() {
		return car_kind_price_holiday;
	}


	public void setCar_kind_price_holiday(long car_kind_price_holiday) {
		this.car_kind_price_holiday = car_kind_price_holiday;
	}


	public long getCar_kind_price_h_holiday() {
		return car_kind_price_h_holiday;
	}


	public void setCar_kind_price_h_holiday(long car_kind_price_h_holiday) {
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


	public double getCar_kind_rating() {
		return car_kind_rating;
	}


	public void setCar_kind_rating(double car_kind_rating) {
		this.car_kind_rating = car_kind_rating;
	}


	public String getCar_kind_withdraw_at() {
		return car_kind_withdraw_at;
	}


	public void setCar_kind_withdraw_at(String car_kind_withdraw_at) {
		this.car_kind_withdraw_at = car_kind_withdraw_at;
	}


	public Date getCar_kind_resist() {
		return car_kind_resist;
	}


	public void setCar_kind_resist(Date car_kind_resist) {
		this.car_kind_resist = car_kind_resist;
	}


	public String getInsurance_name() {
		return insurance_name;
	}


	public void setInsurance_name(String insurance_name) {
		this.insurance_name = insurance_name;
	}


	
}
