package com.khd.jejulantis.model;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Blist implements Serializable{

	String branch_name;
	long car_kind_price_week;
	long insurance_price;
	long totalrent;
	long totalinsurance;
	String insurance_limit;
	long tot;
	long branch_no;
	long car_no;
	long insurance_no;
	long car_kind_no;
	String car_kind_navi;
	String car_kind_sensor;
	String car_kind_bluetooth;
	String car_kind_blackbox;
	String car_kind_sunroof;
	String car_kind_camera;
	String car_kind_nonsmoke;
	String car_kind_rating;
	String car_kind_count;
	
	public Blist() {}
	public Blist(String branch_name, long car_kind_price_week, long insurance_price, long totalrent,
			long totalinsurance, String insurance_limit, long tot, long branch_no, long car_no, long insurance_no,
			long car_kind_no, String car_kind_navi, String car_kind_sensor, String car_kind_bluetooth,
			String car_kind_blackbox, String car_kind_sunroof, String car_kind_camera, String car_kind_nonsmoke,
			String car_kind_rating, String car_kind_count) {
		this.branch_name = branch_name;
		this.car_kind_price_week = car_kind_price_week;
		this.insurance_price = insurance_price;
		this.totalrent = totalrent;
		this.totalinsurance = totalinsurance;
		this.insurance_limit = insurance_limit;
		this.tot = tot;
		this.branch_no = branch_no;
		this.car_no = car_no;
		this.insurance_no = insurance_no;
		this.car_kind_no = car_kind_no;
		this.car_kind_navi = car_kind_navi;
		this.car_kind_sensor = car_kind_sensor;
		this.car_kind_bluetooth = car_kind_bluetooth;
		this.car_kind_blackbox = car_kind_blackbox;
		this.car_kind_sunroof = car_kind_sunroof;
		this.car_kind_camera = car_kind_camera;
		this.car_kind_nonsmoke = car_kind_nonsmoke;
		this.car_kind_rating = car_kind_rating;
		this.car_kind_count = car_kind_count;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public long getCar_kind_price_week() {
		return car_kind_price_week;
	}
	public long getInsurance_price() {
		return insurance_price;
	}
	public String getInsurance_limit() {
		return insurance_limit;
	}
	public long getTot() {
		return tot;
	}
	public long getBranch_no() {
		return branch_no;
	}
	public long getCar_no() {
		return car_no;
	}
	public long getInsurance_no() {
		return insurance_no;
	}
	public long getCar_kind_no() {
		return car_kind_no;
	}
	public String getCar_kind_navi() {
		return car_kind_navi;
	}
	public String getCar_kind_sensor() {
		return car_kind_sensor;
	}
	public String getCar_kind_bluetooth() {
		return car_kind_bluetooth;
	}
	public String getCar_kind_blackbox() {
		return car_kind_blackbox;
	}
	public String getCar_kind_sunroof() {
		return car_kind_sunroof;
	}
	public String getCar_kind_camera() {
		return car_kind_camera;
	}
	public String getCar_kind_nonsmoke() {
		return car_kind_nonsmoke;
	}
	public String getCar_kind_price_weekView() {
		return format(car_kind_price_week);
	}
	public String getInsurance_priceView() {
		return format(insurance_price);
	}
	public String getTotView() {
		return format(tot);
	}
	public String format(long number) {
		DecimalFormat df = new DecimalFormat("#,##0");
		return df.format(number);
	}
	public String getCar_kind_naviView() {
		if(car_kind_navi.equals("Y")) {
			return "네비게이션";
		}else {
			return "";
		}
	}
	public String getCar_kind_sensorView() {
		if(car_kind_sensor.equals("Y")) {
			return "후방센서";
		}else {
			return "";
		}
	}
	public String getCar_kind_bluetoothView() {
		if(car_kind_bluetooth.equals("Y")) {
			return "블루투스";
		}else {
			return "";
		}
	}
	public String getCar_kind_blackboxView() {
		if(car_kind_blackbox.equals("Y")) {
			return "블랙박스";
		}else {
			return "";
		}
	}
	public String getCar_kind_sunroofView() {
		if(car_kind_sunroof.equals("Y")) {
			return "선루프";
		}else {
			return "";
		}
	}
	public String getCar_kind_cameraView() {
		if(car_kind_camera.equals("Y")) {
			return "후방카메라";
		}else {
			return "";
		}
	}
	public String getCar_kind_nonsmokeView() {
		if(car_kind_nonsmoke.equals("Y")) {
			return "금연차량";
		}else {
			return "";
		}
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public void setCar_kind_price_week(long car_kind_price_week) {
		this.car_kind_price_week = car_kind_price_week;
	}
	public void setInsurance_price(long insurance_price) {
		this.insurance_price = insurance_price;
	}
	public void setInsurance_limit(String insurance_limit) {
		this.insurance_limit = insurance_limit;
	}
	public void setTot(long tot) {
		this.tot = tot;
	}
	public void setBranch_no(long branch_no) {
		this.branch_no = branch_no;
	}
	public void setCar_no(long car_no) {
		this.car_no = car_no;
	}
	public void setInsurance_no(long insurance_no) {
		this.insurance_no = insurance_no;
	}
	public void setCar_kind_no(long car_kind_no) {
		this.car_kind_no = car_kind_no;
	}
	public void setCar_kind_navi(String car_kind_navi) {
		this.car_kind_navi = car_kind_navi;
	}
	public void setCar_kind_sensor(String car_kind_sensor) {
		this.car_kind_sensor = car_kind_sensor;
	}
	public void setCar_kind_bluetooth(String car_kind_bluetooth) {
		this.car_kind_bluetooth = car_kind_bluetooth;
	}
	public void setCar_kind_blackbox(String car_kind_blackbox) {
		this.car_kind_blackbox = car_kind_blackbox;
	}
	public void setCar_kind_sunroof(String car_kind_sunroof) {
		this.car_kind_sunroof = car_kind_sunroof;
	}
	public void setCar_kind_camera(String car_kind_camera) {
		this.car_kind_camera = car_kind_camera;
	}
	public void setCar_kind_nonsmoke(String car_kind_nonsmoke) {
		this.car_kind_nonsmoke = car_kind_nonsmoke;
	}
	public long getTotalrent() {
		return totalrent;
	}
	public void setTotalrent(long totalrent) {
		this.totalrent = totalrent;
	}
	public long getTotalinsurance() {
		return totalinsurance;
	}
	public void setTotalinsurance(long totalinsurance) {
		this.totalinsurance = totalinsurance;
	}
	public String getCar_kind_rating() {
		return car_kind_rating;
	}
	public void setCar_kind_rating(String car_kind_rating) {
		this.car_kind_rating = car_kind_rating;
	}
	public String getCar_kind_count() {
		return car_kind_count;
	}
	public void setCar_kind_count(String car_kind_count) {
		this.car_kind_count = car_kind_count;
	}
	
}
