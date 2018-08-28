package com.khd.jejulantis.model;

import java.sql.Date;

public class Car {
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
	private String car_best;
	private String car_md;
	private long car_total;
	private String car_withdraw_at;
	private Date car_resist;
	public Car() {
	}
	public Car(long car_no, String car_name, String car_manufacturer, String car_fuel, String car_type,
			long car_passenger, String car_trans, long car_count, String car_image, long car_rating, String car_best,
			String car_md, long car_total, String car_withdraw_at, Date car_resist) {
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
		this.car_best = car_best;
		this.car_md = car_md;
		this.car_total = car_total;
		this.car_withdraw_at = car_withdraw_at;
		this.car_resist = car_resist;
	}
	public long getCar_no() {
		return car_no;
	}
	public void setCar_no(long car_no) {
		this.car_no = car_no;
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
	public double getCar_rating() {
		return car_rating;
	}
	public void setCar_rating(double car_rating) {
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
	
}
