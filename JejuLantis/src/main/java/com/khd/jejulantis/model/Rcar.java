package com.khd.jejulantis.model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.List;

public class Rcar implements Serializable{

	String car_name;
	String car_manufacturer;
	String car_type;
	long car_passenger;
	String car_fuel;
	long mtot;
	long actot;
	List<Blist> blist;
	public Rcar() {}
	public Rcar(String car_name, String car_manufacturer, String car_type, long car_passenger,String car_fuel, long mtot,
			long actot, List<Blist> blist) {
		super();
		this.car_name = car_name;
		this.car_manufacturer = car_manufacturer;
		this.car_type = car_type;
		this.car_passenger = car_passenger;
		this.car_fuel = car_fuel;
		this.mtot = mtot;
		this.actot = actot;
		this.blist = blist;
	}
	public String getCar_name() {
		return car_name;
	}
	public String getCar_manufacturer() {
		return car_manufacturer;
	}
	public String getCar_type() {
		return car_type;
	}
	public long getCar_passenger() {
		return car_passenger;
	}
	public String getCar_fuel() {
		return car_fuel;
	}
	public long getMtot() {
		return mtot;
	}
	public long getActot() {
		return actot;
	}
	public List<Blist> getBlist() {
		return blist;
	}
	public String getMtotView() {
		DecimalFormat df = new DecimalFormat("#,##0");
		return df.format(mtot);
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public void setCar_manufacturer(String car_manufacturer) {
		this.car_manufacturer = car_manufacturer;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public void setCar_passenger(long car_passenger) {
		this.car_passenger = car_passenger;
	}
	public void setCar_fuel(String car_fuel) {
		this.car_fuel = car_fuel;
	}
	public void setMtot(long mtot) {
		this.mtot = mtot;
	}
	public void setActot(long actot) {
		this.actot = actot;
	}
	public void setBlist(List<Blist> blist) {
		this.blist = blist;
	}
	
}
