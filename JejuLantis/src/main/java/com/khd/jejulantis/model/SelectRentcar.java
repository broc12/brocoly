package com.khd.jejulantis.model;

public class SelectRentcar {
	
	long car_kind_no;
	long branch_no;
	long car_no;
	long totalrent;
	long totalinsurance;
	long totalprice;
	long car_kind_price_week;
	long car_kind_price_weekend;
	String car_kind_navi;
	String car_kind_sensor;
	String car_kind_blackbox;
	String car_kind_bluetooth;
	String car_kind_sunroof;
	String car_kind_camera;
	String car_kind_nonsmoke;
	long car_kind_rating;
	long insurance_no;
	long insurance_price;
	String insurance_name;
	String insurance_limit;
	long insurance_burden_price;
	long insurance_limit_age;
	long insurance_limit_carrier;
	Branch branch;
	Car car;
	
	public SelectRentcar() {}

	public SelectRentcar(long car_kind_no, long branch_no, long car_no, long totalrent, long totalinsurance,
			long totalprice, long car_kind_price_week, long car_kind_price_weekend, String car_kind_navi,
			String car_kind_sensor, String car_kind_blackbox, String car_kind_bluetooth, String car_kind_sunroof,
			String car_kind_camera, String car_kind_nonsmoke, long car_kind_rating, long insurance_no,
			long insurance_price, String insurance_name, String insurance_limit, long insurance_burden_price,
			long insurance_limit_age, long insurance_limit_carrier, Branch branch, Car car) {
		this.car_kind_no = car_kind_no;
		this.branch_no = branch_no;
		this.car_no = car_no;
		this.totalrent = totalrent;
		this.totalinsurance = totalinsurance;
		this.totalprice = totalprice;
		this.car_kind_price_week = car_kind_price_week;
		this.car_kind_price_weekend = car_kind_price_weekend;
		this.car_kind_navi = car_kind_navi;
		this.car_kind_sensor = car_kind_sensor;
		this.car_kind_blackbox = car_kind_blackbox;
		this.car_kind_bluetooth = car_kind_bluetooth;
		this.car_kind_sunroof = car_kind_sunroof;
		this.car_kind_camera = car_kind_camera;
		this.car_kind_nonsmoke = car_kind_nonsmoke;
		this.car_kind_rating = car_kind_rating;
		this.insurance_no = insurance_no;
		this.insurance_price = insurance_price;
		this.insurance_name = insurance_name;
		this.insurance_limit = insurance_limit;
		this.insurance_burden_price = insurance_burden_price;
		this.insurance_limit_age = insurance_limit_age;
		this.insurance_limit_carrier = insurance_limit_carrier;
		this.branch = branch;
		this.car = car;
	}

	public long getCar_kind_no() {
		return car_kind_no;
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

	public long getCar_no() {
		return car_no;
	}

	public void setCar_no(long car_no) {
		this.car_no = car_no;
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

	public long getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(long totalprice) {
		this.totalprice = totalprice;
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

	public long getCar_kind_rating() {
		return car_kind_rating;
	}

	public void setCar_kind_rating(long car_kind_rating) {
		this.car_kind_rating = car_kind_rating;
	}

	public long getInsurance_no() {
		return insurance_no;
	}

	public void setInsurance_no(long insurance_no) {
		this.insurance_no = insurance_no;
	}

	public long getInsurance_price() {
		return insurance_price;
	}

	public void setInsurance_price(long insurance_price) {
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

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
}
