package com.khd.jejulantis.model;

import java.sql.Date;

public class Reserv {
	private long rent_reserv_no;
	private long branch_no;
	private long car_no;
	private long car_kind_no;
	private long insurance_no;
	private long car_info_no;
	private long member_no;
	private long rent_payment_no;
	private Date rent_reserv_start;
	private Date rent_reserv_end;
	private String rent_reserv_license_no;
	private String rent_reserv_license_kind;
	private Date rent_reserv_license_day;
	private String rent_reserv_driver_name;
	private String rent_reserv_driver_birth;
	private String rent_reserv_driver_tel;
	private String rent_reserv_driver_addr;
	private String rent_reserv_cancel_able;
	private String rent_reserv_cancel_at;
	private String rent_reserv_cancel_reason;
	private Date rent_reserv_cancel_date;
	private Date rent_reserv_resist;
	private long rent_payment_km;
	private long rent_payment_fuel;
	Car car;
	Branch branch;
	Payment payment;
	Insurance insurance;
	Member member;
	CarInfo carinfo;
	
	public Reserv() {
	}

	public Reserv(long rent_reserv_no, long branch_no, long car_no, long car_kind_no, long insurance_no,
			long car_info_no, long member_no, long rent_payment_no, Date rent_reserv_start, Date rent_reserv_end,
			String rent_reserv_license_no, String rent_reserv_license_kind, Date rent_reserv_license_day,
			String rent_reserv_driver_name, String rent_reserv_driver_birth, String rent_reserv_driver_tel,
			String rent_reserv_driver_addr, String rent_reserv_cancel_able, String rent_reserv_cancel_at,
			String rent_reserv_cancel_reason, Date rent_reserv_cancel_date, Date rent_reserv_resist,
			long rent_payment_km, long rent_payment_fuel, Car car, Branch branch, Payment payment, Insurance insurance,
			Member member, CarInfo carinfo) {
		this.rent_reserv_no = rent_reserv_no;
		this.branch_no = branch_no;
		this.car_no = car_no;
		this.car_kind_no = car_kind_no;
		this.insurance_no = insurance_no;
		this.car_info_no = car_info_no;
		this.member_no = member_no;
		this.rent_payment_no = rent_payment_no;
		this.rent_reserv_start = rent_reserv_start;
		this.rent_reserv_end = rent_reserv_end;
		this.rent_reserv_license_no = rent_reserv_license_no;
		this.rent_reserv_license_kind = rent_reserv_license_kind;
		this.rent_reserv_license_day = rent_reserv_license_day;
		this.rent_reserv_driver_name = rent_reserv_driver_name;
		this.rent_reserv_driver_birth = rent_reserv_driver_birth;
		this.rent_reserv_driver_tel = rent_reserv_driver_tel;
		this.rent_reserv_driver_addr = rent_reserv_driver_addr;
		this.rent_reserv_cancel_able = rent_reserv_cancel_able;
		this.rent_reserv_cancel_at = rent_reserv_cancel_at;
		this.rent_reserv_cancel_reason = rent_reserv_cancel_reason;
		this.rent_reserv_cancel_date = rent_reserv_cancel_date;
		this.rent_reserv_resist = rent_reserv_resist;
		this.rent_payment_km = rent_payment_km;
		this.rent_payment_fuel = rent_payment_fuel;
		this.car = car;
		this.branch = branch;
		this.payment = payment;
		this.insurance = insurance;
		this.member = member;
		this.carinfo = carinfo;
	}

	public long getRent_reserv_no() {
		return rent_reserv_no;
	}

	public void setRent_reserv_no(long rent_reserv_no) {
		this.rent_reserv_no = rent_reserv_no;
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

	public long getCar_kind_no() {
		return car_kind_no;
	}

	public void setCar_kind_no(long car_kind_no) {
		this.car_kind_no = car_kind_no;
	}

	public long getInsurance_no() {
		return insurance_no;
	}

	public void setInsurance_no(long insurance_no) {
		this.insurance_no = insurance_no;
	}

	public long getCar_info_no() {
		return car_info_no;
	}

	public void setCar_info_no(long car_info_no) {
		this.car_info_no = car_info_no;
	}

	public long getMember_no() {
		return member_no;
	}

	public void setMember_no(long member_no) {
		this.member_no = member_no;
	}

	public long getRent_payment_no() {
		return rent_payment_no;
	}

	public void setRent_payment_no(long rent_payment_no) {
		this.rent_payment_no = rent_payment_no;
	}

	public Date getRent_reserv_start() {
		return rent_reserv_start;
	}

	public void setRent_reserv_start(Date rent_reserv_start) {
		this.rent_reserv_start = rent_reserv_start;
	}

	public Date getRent_reserv_end() {
		return rent_reserv_end;
	}

	public void setRent_reserv_end(Date rent_reserv_end) {
		this.rent_reserv_end = rent_reserv_end;
	}

	public String getRent_reserv_license_no() {
		return rent_reserv_license_no;
	}

	public void setRent_reserv_license_no(String rent_reserv_license_no) {
		this.rent_reserv_license_no = rent_reserv_license_no;
	}

	public String getRent_reserv_license_kind() {
		return rent_reserv_license_kind;
	}

	public void setRent_reserv_license_kind(String rent_reserv_license_kind) {
		this.rent_reserv_license_kind = rent_reserv_license_kind;
	}

	public Date getRent_reserv_license_day() {
		return rent_reserv_license_day;
	}

	public void setRent_reserv_license_day(Date rent_reserv_license_day) {
		this.rent_reserv_license_day = rent_reserv_license_day;
	}

	public String getRent_reserv_driver_name() {
		return rent_reserv_driver_name;
	}

	public void setRent_reserv_driver_name(String rent_reserv_driver_name) {
		this.rent_reserv_driver_name = rent_reserv_driver_name;
	}

	public String getRent_reserv_driver_birth() {
		return rent_reserv_driver_birth;
	}

	public void setRent_reserv_driver_birth(String rent_reserv_driver_birth) {
		this.rent_reserv_driver_birth = rent_reserv_driver_birth;
	}

	public String getRent_reserv_driver_tel() {
		return rent_reserv_driver_tel;
	}

	public void setRent_reserv_driver_tel(String rent_reserv_driver_tel) {
		this.rent_reserv_driver_tel = rent_reserv_driver_tel;
	}

	public String getRent_reserv_driver_addr() {
		return rent_reserv_driver_addr;
	}

	public void setRent_reserv_driver_addr(String rent_reserv_driver_addr) {
		this.rent_reserv_driver_addr = rent_reserv_driver_addr;
	}

	public String getRent_reserv_cancel_able() {
		return rent_reserv_cancel_able;
	}

	public void setRent_reserv_cancel_able(String rent_reserv_cancel_able) {
		this.rent_reserv_cancel_able = rent_reserv_cancel_able;
	}

	public String getRent_reserv_cancel_at() {
		return rent_reserv_cancel_at;
	}

	public void setRent_reserv_cancel_at(String rent_reserv_cancel_at) {
		this.rent_reserv_cancel_at = rent_reserv_cancel_at;
	}

	public String getRent_reserv_cancel_reason() {
		return rent_reserv_cancel_reason;
	}

	public void setRent_reserv_cancel_reason(String rent_reserv_cancel_reason) {
		this.rent_reserv_cancel_reason = rent_reserv_cancel_reason;
	}

	public Date getRent_reserv_cancel_date() {
		return rent_reserv_cancel_date;
	}

	public void setRent_reserv_cancel_date(Date rent_reserv_cancel_date) {
		this.rent_reserv_cancel_date = rent_reserv_cancel_date;
	}

	public Date getRent_reserv_resist() {
		return rent_reserv_resist;
	}

	public void setRent_reserv_resist(Date rent_reserv_resist) {
		this.rent_reserv_resist = rent_reserv_resist;
	}

	public long getRent_payment_km() {
		return rent_payment_km;
	}

	public void setRent_payment_km(long rent_payment_km) {
		this.rent_payment_km = rent_payment_km;
	}

	public long getRent_payment_fuel() {
		return rent_payment_fuel;
	}

	public void setRent_payment_fuel(long rent_payment_fuel) {
		this.rent_payment_fuel = rent_payment_fuel;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public CarInfo getCarinfo() {
		return carinfo;
	}

	public void setCarinfo(CarInfo carinfo) {
		this.carinfo = carinfo;
	}
	
	
}
