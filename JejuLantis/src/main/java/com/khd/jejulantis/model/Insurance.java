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
	private int car_kind_total;
	private String car_kind_withdraw_at;
	private Date car_kind_resist;
	
	//private long branch_no;
	private String branch_name;
	private String branch_tel;
	private String branch_fax;
	private String branch_local;
	private String branch_business_no;
	private String branch_bankaccount;
	private String branch_member_name;
	private String branch_member_tel;
	private String branch_member_tel2;
	private String branch_email;
	private String branch_logo;
	private long branch_comfee;
	private String branch_withdraw_at;
	private String branch_busspot;
	private String branch_bustime;
	private String branch_busgap;
	private String branch_boss;
	private String branch_today;
	private String branch_todaytime;
	private String branch_rule;
	private long branch_rating;
	private Date branch_resist;
	private String branch_lati;
	private String branch_long;
	
	private String car_name;
	private String car_manufacturer;
	private String car_fuel;
	private String car_type;
	private long car_passenger;
	private String car_trans;
	private long car_count;
	private String car_image;
	private long car_rating;
	private String car_best;
	private String car_md;
	private long car_total;
	private String car_withdraw_at;
	private Date car_resist;
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

	
	public Insurance(String manager_id, int insurance_no, int branch_no, int car_kind_no, int car_no,
			int insurance_price, String insurance_name, String insurance_limit, int insurance_burden_price,
			int insurance_limit_age, int insurance_limit_carrier, String insurance_withdraw_at, Date insurance_resist,
			int car_kind_count, int car_kind_price_week, int car_kind_price_weekend, int car_kind_price_holiday,
			int car_kind_price_h_holiday, String car_kind_navi, String car_kind_sensor, String car_kind_blackbox,
			String car_kind_bluetooth, String car_kind_sunroof, String car_kind_camera, String car_kind_nonsmoke,
			int car_kind_rating, int car_kind_total, String car_kind_withdraw_at, Date car_kind_resist,
			String branch_name, String branch_tel, String branch_fax, String branch_local, String branch_business_no,
			String branch_bankaccount, String branch_member_name, String branch_member_tel, String branch_member_tel2,
			String branch_email, String branch_logo, long branch_comfee, String branch_withdraw_at,
			String branch_busspot, String branch_bustime, String branch_busgap, String branch_boss, String branch_today,
			String branch_todaytime, String branch_rule, long branch_rating, Date branch_resist, String branch_lati,
			String branch_long, String car_name, String car_manufacturer, String car_fuel, String car_type,
			long car_passenger, String car_trans, long car_count, String car_image, long car_rating, String car_best,
			String car_md, long car_total, String car_withdraw_at, Date car_resist) {
		super();
		this.manager_id = manager_id;
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
		this.branch_name = branch_name;
		this.branch_tel = branch_tel;
		this.branch_fax = branch_fax;
		this.branch_local = branch_local;
		this.branch_business_no = branch_business_no;
		this.branch_bankaccount = branch_bankaccount;
		this.branch_member_name = branch_member_name;
		this.branch_member_tel = branch_member_tel;
		this.branch_member_tel2 = branch_member_tel2;
		this.branch_email = branch_email;
		this.branch_logo = branch_logo;
		this.branch_comfee = branch_comfee;
		this.branch_withdraw_at = branch_withdraw_at;
		this.branch_busspot = branch_busspot;
		this.branch_bustime = branch_bustime;
		this.branch_busgap = branch_busgap;
		this.branch_boss = branch_boss;
		this.branch_today = branch_today;
		this.branch_todaytime = branch_todaytime;
		this.branch_rule = branch_rule;
		this.branch_rating = branch_rating;
		this.branch_resist = branch_resist;
		this.branch_lati = branch_lati;
		this.branch_long = branch_long;
		this.car_name = car_name;
		this.car_manufacturer = car_manufacturer;
		this.car_fuel = car_fuel;
		this.car_type = car_type;
		this.car_passenger = car_passenger;
		this.car_trans = car_trans;
		this.car_count = car_count;
		this.car_image = car_image;
		this.car_rating = car_rating;
		this.car_best = car_best;
		this.car_md = car_md;
		this.car_total = car_total;
		this.car_withdraw_at = car_withdraw_at;
		this.car_resist = car_resist;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
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
	public String getCar_image() {
		return car_image;
	}
	public void setCar_image(String car_image) {
		this.car_image = car_image;
	}
	public long getCar_rating() {
		return car_rating;
	}
	public void setCar_rating(long car_rating) {
		this.car_rating = car_rating;
	}
	public String getCar_best() {
		return car_best;
	}
	public void setCar_best(String car_best) {
		this.car_best = car_best;
	}
	public String getCar_md() {
		return car_md;
	}
	public void setCar_md(String car_md) {
		this.car_md = car_md;
	}
	public long getCar_total() {
		return car_total;
	}
	public void setCar_total(long car_total) {
		this.car_total = car_total;
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
	public int getCar_kind_total() {
		return car_kind_total;
	}
	public void setCar_kind_total(int car_kind_total) {
		this.car_kind_total = car_kind_total;
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
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_tel() {
		return branch_tel;
	}
	public void setBranch_tel(String branch_tel) {
		this.branch_tel = branch_tel;
	}
	public String getBranch_fax() {
		return branch_fax;
	}
	public void setBranch_fax(String branch_fax) {
		this.branch_fax = branch_fax;
	}
	public String getBranch_local() {
		return branch_local;
	}
	public void setBranch_local(String branch_local) {
		this.branch_local = branch_local;
	}
	public String getBranch_business_no() {
		return branch_business_no;
	}
	public void setBranch_business_no(String branch_business_no) {
		this.branch_business_no = branch_business_no;
	}
	public String getBranch_bankaccount() {
		return branch_bankaccount;
	}
	public void setBranch_bankaccount(String branch_bankaccount) {
		this.branch_bankaccount = branch_bankaccount;
	}
	public String getBranch_member_name() {
		return branch_member_name;
	}
	public void setBranch_member_name(String branch_member_name) {
		this.branch_member_name = branch_member_name;
	}
	public String getBranch_member_tel() {
		return branch_member_tel;
	}
	public void setBranch_member_tel(String branch_member_tel) {
		this.branch_member_tel = branch_member_tel;
	}
	public String getBranch_member_tel2() {
		return branch_member_tel2;
	}
	public void setBranch_member_tel2(String branch_member_tel2) {
		this.branch_member_tel2 = branch_member_tel2;
	}
	public String getBranch_email() {
		return branch_email;
	}
	public void setBranch_email(String branch_email) {
		this.branch_email = branch_email;
	}
	public String getBranch_logo() {
		return branch_logo;
	}
	public void setBranch_logo(String branch_logo) {
		this.branch_logo = branch_logo;
	}
	public long getBranch_comfee() {
		return branch_comfee;
	}
	public void setBranch_comfee(long branch_comfee) {
		this.branch_comfee = branch_comfee;
	}
	public String getBranch_withdraw_at() {
		return branch_withdraw_at;
	}
	public void setBranch_withdraw_at(String branch_withdraw_at) {
		this.branch_withdraw_at = branch_withdraw_at;
	}
	public String getBranch_busspot() {
		return branch_busspot;
	}
	public void setBranch_busspot(String branch_busspot) {
		this.branch_busspot = branch_busspot;
	}
	public String getBranch_bustime() {
		return branch_bustime;
	}
	public void setBranch_bustime(String branch_bustime) {
		this.branch_bustime = branch_bustime;
	}
	public String getBranch_busgap() {
		return branch_busgap;
	}
	public void setBranch_busgap(String branch_busgap) {
		this.branch_busgap = branch_busgap;
	}
	public String getBranch_boss() {
		return branch_boss;
	}
	public void setBranch_boss(String branch_boss) {
		this.branch_boss = branch_boss;
	}
	public String getBranch_today() {
		return branch_today;
	}
	public void setBranch_today(String branch_today) {
		this.branch_today = branch_today;
	}
	public String getBranch_todaytime() {
		return branch_todaytime;
	}
	public void setBranch_todaytime(String branch_todaytime) {
		this.branch_todaytime = branch_todaytime;
	}
	public String getBranch_rule() {
		return branch_rule;
	}
	public void setBranch_rule(String branch_rule) {
		this.branch_rule = branch_rule;
	}
	public long getBranch_rating() {
		return branch_rating;
	}
	public void setBranch_rating(long branch_rating) {
		this.branch_rating = branch_rating;
	}
	public Date getBranch_resist() {
		return branch_resist;
	}
	public void setBranch_resist(Date branch_resist) {
		this.branch_resist = branch_resist;
	}
	public String getBranch_lati() {
		return branch_lati;
	}
	public void setBranch_lati(String branch_lati) {
		this.branch_lati = branch_lati;
	}
	public String getBranch_long() {
		return branch_long;
	}
	public void setBranch_long(String branch_long) {
		this.branch_long = branch_long;
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
