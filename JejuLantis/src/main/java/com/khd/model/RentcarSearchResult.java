package com.khd.model;

import java.io.Serializable;

public class RentcarSearchResult implements Serializable{

	long car_kind_no;
	String car_kind_name;
	String car_kind_manufactur;
	long car_kind_passenger;
	String car_kind_type;
	String car_kind_fuel;
	String car_kind_trans;
	String branch_name;
	long car_kind_price_week;
	long insurance_price;
	String insurance_limit;
	String car_info_blackbox;
	String car_info_bluetooth;
	String car_info_non_smoking_veh;
	String car_info_rear_camera;
	String car_info_rear_sensors;
	String car_info_navi;
	String car_info_sunruff;
    
	public RentcarSearchResult() {}
	public RentcarSearchResult(long car_kind_no, String car_kind_name, String car_kind_manufactur,
			long car_kind_passenger, String car_kind_type, String car_kind_fuel, String car_kind_trans,
			String branch_name, long car_kind_price_week, long insurance_price, String insurance_limit,
			String car_info_blackbox, String car_info_bluetooth, String car_info_non_smoking_veh,
			String car_info_rear_camera, String car_info_rear_sensors, String car_info_navi, String car_info_sunruff) {
		this.car_kind_no = car_kind_no;
		this.car_kind_name = car_kind_name;
		this.car_kind_manufactur = car_kind_manufactur;
		this.car_kind_passenger = car_kind_passenger;
		this.car_kind_type = car_kind_type;
		this.car_kind_fuel = car_kind_fuel;
		this.car_kind_trans = car_kind_trans;
		this.branch_name = branch_name;
		this.car_kind_price_week = car_kind_price_week;
		this.insurance_price = insurance_price;
		this.insurance_limit = insurance_limit;
		this.car_info_blackbox = car_info_blackbox;
		this.car_info_bluetooth = car_info_bluetooth;
		this.car_info_non_smoking_veh = car_info_non_smoking_veh;
		this.car_info_rear_camera = car_info_rear_camera;
		this.car_info_rear_sensors = car_info_rear_sensors;
		this.car_info_navi = car_info_navi;
		this.car_info_sunruff = car_info_sunruff;
	}
	
	public long getCar_kind_no() {
		return car_kind_no;
	}
	public void setCar_kind_no(long car_kind_no) {
		this.car_kind_no = car_kind_no;
	}
	public String getCar_kind_name() {
		return car_kind_name;
	}
	public void setCar_kind_name(String car_kind_name) {
		this.car_kind_name = car_kind_name;
	}
	public String getCar_kind_manufactur() {
		return car_kind_manufactur;
	}
	public void setCar_kind_manufactur(String car_kind_manufactur) {
		this.car_kind_manufactur = car_kind_manufactur;
	}
	public long getCar_kind_passenger() {
		return car_kind_passenger;
	}
	public void setCar_kind_passenger(long car_kind_passenger) {
		this.car_kind_passenger = car_kind_passenger;
	}
	public String getCar_kind_type() {
		return car_kind_type;
	}
	public void setCar_kind_type(String car_kind_type) {
		this.car_kind_type = car_kind_type;
	}
	public String getCar_kind_fuel() {
		return car_kind_fuel;
	}
	public void setCar_kind_fuel(String car_kind_fuel) {
		this.car_kind_fuel = car_kind_fuel;
	}
	public String getCar_kind_trans() {
		return car_kind_trans;
	}
	public void setCar_kind_trans(String car_kind_trans) {
		this.car_kind_trans = car_kind_trans;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public long getCar_kind_price_week() {
		return car_kind_price_week;
	}
	public void setCar_kind_price_week(long car_kind_price_week) {
		this.car_kind_price_week = car_kind_price_week;
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
	public String getCar_info_blackbox() {
		return car_info_blackbox;
	}
	public void setCar_info_blackbox(String car_info_blackbox) {
		this.car_info_blackbox = car_info_blackbox;
	}
	public String getCar_info_bluetooth() {
		return car_info_bluetooth;
	}
	public void setCar_info_bluetooth(String car_info_bluetooth) {
		this.car_info_bluetooth = car_info_bluetooth;
	}
	public String getCar_info_non_smoking_veh() {
		return car_info_non_smoking_veh;
	}
	public void setCar_info_non_smoking_veh(String car_info_non_smoking_veh) {
		this.car_info_non_smoking_veh = car_info_non_smoking_veh;
	}
	public String getCar_info_rear_camera() {
		return car_info_rear_camera;
	}
	public void setCar_info_rear_camera(String car_info_rear_camera) {
		this.car_info_rear_camera = car_info_rear_camera;
	}
	public String getCar_info_rear_sensors() {
		return car_info_rear_sensors;
	}
	public void setCar_info_rear_sensors(String car_info_rear_sensors) {
		this.car_info_rear_sensors = car_info_rear_sensors;
	}
	public String getCar_info_navi() {
		return car_info_navi;
	}
	public void setCar_info_navi(String car_info_navi) {
		this.car_info_navi = car_info_navi;
	}
	public String getCar_info_sunruff() {
		return car_info_sunruff;
	}
	public void setCar_info_sunruff(String car_info_sunruff) {
		this.car_info_sunruff = car_info_sunruff;
	}
	
	public String getCar_info_blackboxjsp() {
		if(car_info_bluetooth.equals("y")) {
			return "블랙박스";
		}else {
			return "";
		}
	}
	public String getCar_info_bluetoothjsp() {
		if(car_info_bluetooth.equals("y")) {
			return "블루투스";
		}else {
			return "";
		}
	}
	public String getCar_info_non_smoking_vehjsp() {
		if(car_info_bluetooth.equals("y")) {
			return "금연 차량";
		}else {
			return "";
		}
	}
	public String getCar_info_rear_camerajsp() {
		if(car_info_bluetooth.equals("y")) {
			return "후방 카메라";
		}else {
			return "";
		}
	}
	public String getCar_info_rear_sensorsjsp() {
		if(car_info_bluetooth.equals("y")) {
			return "후방 센서";
		}else {
			return "";
		}
	}
	public String getCar_info_navijsp() {
		if(car_info_bluetooth.equals("y")) {
			return "네비게이션";
		}else {
			return "";
		}
	}
	public String getCar_info_sunruffjsp() {
		if(car_info_bluetooth.equals("y")) {
			return "선루프";
		}else {
			return "";
		}
	}
}
