package com.khd.CarkindController;

import java.util.Date;

public class Carkind {
	
	//
	private String branch_name;
	//0719
	private String car_kind_no;
	private int branch_no;
	private int insurance_no;
	private String insurance_name;
	private String car_no;
	private int car_kind_count;
	private int car_kind_price_week;
	private int car_kind_price_weekend;
	private int car_kind_price_1;
	private int car_kind_price_2;
	private String car_kind_navi;
	private String car_kind_sensor;
	private String car_kind_blackbox;
	private String car_kind_bluetooth;
	private String car_kind_sunroof;
	private String car_kind_camera;
	private String car_kind_nonsmoke;
	private String car_kind_resist;
	//
	private String car_kind_image;
	private int car_kind_passenger;
	private String car_kind_trans;
	private String car_kind_manufactur;
	private String car_kind_fuel;
	private String car_kind_name;
	private String car_kind_type;
	//
	public Carkind() {}
	

	public Carkind(int insurance_no, String insurance_name) {
		super();
		this.insurance_no = insurance_no;
		this.insurance_name = insurance_name;
	}
	//CAR_KIND INSERT
	public Carkind(String car_kind_no, int branch_no, int insurance_no, String car_no, 
			int car_kind_count, int car_kind_price_week, int car_kind_price_weekend, int car_kind_price_1,
			int car_kind_price_2, String car_kind_navi, String car_kind_sensor, String car_kind_blackbox,
			String car_kind_bluetooth, String car_kind_sunroof, String car_kind_camera, String car_kind_nonsmoke,
			String car_kind_resist) {
		super();
		this.car_kind_no = car_kind_no;
		this.car_no = car_no;
		this.branch_no = branch_no;
		this.insurance_no = insurance_no;
		this.car_kind_resist = car_kind_resist;
		this.car_kind_count = car_kind_count;
		this.car_kind_price_week = car_kind_price_week;
		this.car_kind_price_weekend = car_kind_price_weekend;
		this.car_kind_price_1 = car_kind_price_1;
		this.car_kind_price_2 = car_kind_price_2;
		this.car_kind_navi = car_kind_navi;
		this.car_kind_sensor = car_kind_sensor;
		this.car_kind_blackbox = car_kind_blackbox;
		this.car_kind_bluetooth = car_kind_bluetooth;
		this.car_kind_sunroof = car_kind_sunroof;
		this.car_kind_camera = car_kind_camera;
		this.car_kind_nonsmoke = car_kind_nonsmoke;
	}

	public Carkind(String branch_name, String car_kind_no, String car_no, int branch_no, int insurance_no,
			String car_kind_manufactur, String car_kind_fuel, String car_kind_name, String car_kind_type,
			String car_kind_resist, int car_kind_passenger, String car_kind_trans, int car_kind_count,
			String car_kind_image, int car_kind_price_week, int car_kind_price_weekend, int car_kind_price_1,
			int car_kind_price_2, String car_kind_navi, String car_kind_sensor, String car_kind_blackbox,
			String car_kind_bluetooth, String car_kind_sunroof, String car_kind_camera, String car_kind_nonsmoke) {
		super();
		this.branch_name = branch_name;
		this.car_kind_no = car_kind_no;
		this.car_no = car_no;
		this.branch_no = branch_no;
		this.insurance_no = insurance_no;
		this.car_kind_manufactur = car_kind_manufactur;
		this.car_kind_fuel = car_kind_fuel;
		this.car_kind_name = car_kind_name;
		this.car_kind_type = car_kind_type;
		this.car_kind_resist = car_kind_resist;
		this.car_kind_passenger = car_kind_passenger;
		this.car_kind_trans = car_kind_trans;
		this.car_kind_count = car_kind_count;
		this.car_kind_image = car_kind_image;
		this.car_kind_price_week = car_kind_price_week;
		this.car_kind_price_weekend = car_kind_price_weekend;
		this.car_kind_price_1 = car_kind_price_1;
		this.car_kind_price_2 = car_kind_price_2;
		this.car_kind_navi = car_kind_navi;
		this.car_kind_sensor = car_kind_sensor;
		this.car_kind_blackbox = car_kind_blackbox;
		this.car_kind_bluetooth = car_kind_bluetooth;
		this.car_kind_sunroof = car_kind_sunroof;
		this.car_kind_camera = car_kind_camera;
		this.car_kind_nonsmoke = car_kind_nonsmoke;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getCar_kind_no() {
		return car_kind_no;
	}
	public void setCar_kind_no(String car_kind_no) {
		this.car_kind_no = car_kind_no;
	}
	public String getCar_no() {
		return car_no;
	}
	public void setCar_no(String car_no) {
		this.car_no = car_no;
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
	public String getCar_kind_manufactur() {
		return car_kind_manufactur;
	}
	public void setCar_kind_manufactur(String car_kind_manufactur) {
		this.car_kind_manufactur = car_kind_manufactur;
	}
	public String getCar_kind_fuel() {
		return car_kind_fuel;
	}
	public void setCar_kind_fuel(String car_kind_fuel) {
		this.car_kind_fuel = car_kind_fuel;
	}
	public String getCar_kind_name() {
		return car_kind_name;
	}
	public void setCar_kind_name(String car_kind_name) {
		this.car_kind_name = car_kind_name;
	}
	public String getCar_kind_type() {
		return car_kind_type;
	}
	public void setCar_kind_type(String car_kind_type) {
		this.car_kind_type = car_kind_type;
	}
	public String getCar_kind_resist() {
		return car_kind_resist;
	}
	public void setCar_kind_resist(String car_kind_resist) {
		this.car_kind_resist = car_kind_resist;
	}
	public int getCar_kind_passenger() {
		return car_kind_passenger;
	}
	public void setCar_kind_passenger(int car_kind_passenger) {
		this.car_kind_passenger = car_kind_passenger;
	}
	public String getCar_kind_trans() {
		return car_kind_trans;
	}
	public void setCar_kind_trans(String car_kind_trans) {
		this.car_kind_trans = car_kind_trans;
	}
	public int getCar_kind_count() {
		return car_kind_count;
	}
	public void setCar_kind_count(int car_kind_count) {
		this.car_kind_count = car_kind_count;
	}
	public String getCar_kind_image() {
		return car_kind_image;
	}
	public void setCar_kind_image(String car_kind_image) {
		this.car_kind_image = car_kind_image;
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
	public int getCar_kind_price_1() {
		return car_kind_price_1;
	}
	public void setCar_kind_price_1(int car_kind_price_1) {
		this.car_kind_price_1 = car_kind_price_1;
	}
	public int getCar_kind_price_2() {
		return car_kind_price_2;
	}
	public void setCar_kind_price_2(int car_kind_price_2) {
		this.car_kind_price_2 = car_kind_price_2;
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
	public String getInsurance_name() {
		return insurance_name;
	}
	public void setInsurance_name(String insurance_name) {
		this.insurance_name = insurance_name;
	}
}
