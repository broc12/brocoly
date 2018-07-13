package com.khd.model;

import java.io.Serializable;

public class Blist implements Serializable{

	String branch_name;
	String car_kind_name;
	String car_kind_manufactur;
	String car_kind_type;
	long car_kind_passenger;
	String car_kind_fuel;
	long car_kind_price_week;
	long insurance_price;
	long tot;
	Blist(){}
	public Blist(String branch_name, String car_kind_name, String car_kind_manufactur, String car_kind_type,
			long car_kind_passenger, String car_kind_fuel, long car_kind_price_week, long insurance_price, long tot) {
		super();
		this.branch_name = branch_name;
		this.car_kind_name = car_kind_name;
		this.car_kind_manufactur = car_kind_manufactur;
		this.car_kind_type = car_kind_type;
		this.car_kind_passenger = car_kind_passenger;
		this.car_kind_fuel = car_kind_fuel;
		this.car_kind_price_week = car_kind_price_week;
		this.insurance_price = insurance_price;
		this.tot = tot;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public String getCar_kind_name() {
		return car_kind_name;
	}
	public String getCar_kind_manufactur() {
		return car_kind_manufactur;
	}
	public String getCar_kind_type() {
		return car_kind_type;
	}
	public long getCar_kind_passenger() {
		return car_kind_passenger;
	}
	public String getCar_kind_fuel() {
		return car_kind_fuel;
	}
	public long getCar_kind_price_week() {
		return car_kind_price_week;
	}
	public long getInsurance_price() {
		return insurance_price;
	}
	public long getTot() {
		return tot;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public void setCar_kind_name(String car_kind_name) {
		this.car_kind_name = car_kind_name;
	}
	public void setCar_kind_manufactur(String car_kind_manufactur) {
		this.car_kind_manufactur = car_kind_manufactur;
	}
	public void setCar_kind_type(String car_kind_type) {
		this.car_kind_type = car_kind_type;
	}
	public void setCar_kind_passenger(long car_kind_passenger) {
		this.car_kind_passenger = car_kind_passenger;
	}
	public void setCar_kind_fuel(String car_kind_fuel) {
		this.car_kind_fuel = car_kind_fuel;
	}
	public void setCar_kind_price_week(long car_kind_price_week) {
		this.car_kind_price_week = car_kind_price_week;
	}
	public void setInsurance_price(long insurance_price) {
		this.insurance_price = insurance_price;
	}
	public void setTot(long tot) {
		this.tot = tot;
	}
	
	
}
