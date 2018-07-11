package com.khd.model;

import java.io.Serializable;
import java.util.List;

public class Rcar implements Serializable{

	String car_kind_name;
	String car_kind_manufactur;
	String car_kind_type;
	long car_kind_passenger;
	String car_kind_fuel;
	List<Blist> blist;
	public Rcar() {}
	public Rcar(String car_kind_name, String car_kind_manufactur, String car_kind_type, long car_kind_passenger,
			String car_kind_fuel, List<Blist> blist) {
		this.car_kind_name = car_kind_name;
		this.car_kind_manufactur = car_kind_manufactur;
		this.car_kind_type = car_kind_type;
		this.car_kind_passenger = car_kind_passenger;
		this.car_kind_fuel = car_kind_fuel;
		this.blist = blist;
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
	public List<Blist> getBlist() {
		return blist;
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
	public void setBlist(List<Blist> blist) {
		this.blist = blist;
	}
	
	
}
