package com.khd.jejulantis.model;


public class CarInfoInsert {
	private int car_kind_no;
	private int car_no;
	private String car_manufacturer;
	private String car_name;
	private String car_fuel;
	private String car_kind_navi;
	private String car_kind_sensor;
	private String car_kind_blackbox;
	private String car_kind_bluetooth;
	private String car_kind_sunroof;
	private String car_kind_camera;
	private String car_kind_nonsmoke;
	
	public CarInfoInsert() {}

	public CarInfoInsert(int car_kind_no, int car_no, String car_manufacturer, String car_name, String car_fuel,
			String car_kind_navi, String car_kind_sensor, String car_kind_blackbox, String car_kind_bluetooth,
			String car_kind_sunroof, String car_kind_camera, String car_kind_nonsmoke) {
		super();
		this.car_kind_no = car_kind_no;
		this.car_no = car_no;
		this.car_manufacturer = car_manufacturer;
		this.car_name = car_name;
		this.car_fuel = car_fuel;
		this.car_kind_navi = car_kind_navi;
		this.car_kind_sensor = car_kind_sensor;
		this.car_kind_blackbox = car_kind_blackbox;
		this.car_kind_bluetooth = car_kind_bluetooth;
		this.car_kind_sunroof = car_kind_sunroof;
		this.car_kind_camera = car_kind_camera;
		this.car_kind_nonsmoke = car_kind_nonsmoke;
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

	public String getCar_manufacturer() {
		return car_manufacturer;
	}

	public void setCar_manufacturer(String car_manufacturer) {
		this.car_manufacturer = car_manufacturer;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public String getCar_fuel() {
		return car_fuel;
	}

	public void setCar_fuel(String car_fuel) {
		this.car_fuel = car_fuel;
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

}
