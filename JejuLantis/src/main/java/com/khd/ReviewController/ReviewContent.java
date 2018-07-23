package com.khd.ReviewController;

import java.sql.Date;

public class ReviewContent {
	private String member_name;
	private String branch_name;
	private String name;
	private String car_kind_name;
	private String car_kind_fuel;
	private String car_kind_type;
	private Date rent_reserv_start;
	private Date rent_reserv_end;
	private String car_kind_image;
	//관리자페이지 이용후기 상세보기 
	private String rent_review_no;
	private String rent_reserv_no;
	private String driver_no;
	private String rent_payment_no;
	private String member_no;
	private String car_info_no;
	private String car_kind_no;
	private String branch_no;
	private String insurance_no;
	private String rent_review_title;
	private String rent_review_content;
	private String rent_review_rating_car;
	private Date rent_review_date;
	
	public ReviewContent() {}
	//관리자페이지 이용후기 상세보기 
	public ReviewContent(String member_name, String rent_review_no, Date rent_review_date, String branch_name,
			String name, String rent_review_rating_car, String rent_review_content, String car_kind_name,
			String car_kind_fuel, String car_kind_type, Date rent_reserv_start, Date rent_reserv_end,
			String car_kind_image) {
		super();
		this.member_name = member_name;
		this.rent_review_no = rent_review_no;
		this.rent_review_date = rent_review_date;
		this.branch_name = branch_name;
		this.name = name;
		this.rent_review_rating_car = rent_review_rating_car;
		this.rent_review_content = rent_review_content;
		this.car_kind_name = car_kind_name;
		this.car_kind_fuel = car_kind_fuel;
		this.car_kind_type = car_kind_type;
		this.rent_reserv_start = rent_reserv_start;
		this.rent_reserv_end = rent_reserv_end;
		this.car_kind_image = car_kind_image;
	}
	public ReviewContent(String rent_review_no, String rent_reserv_no, String driver_no, String rent_payment_no,
			String member_no, String car_info_no, String car_kind_no, String branch_no, String insurance_no,
			String rent_review_title, String rent_review_content, String rent_review_rating_car,
			Date rent_review_date) {
		super();
		this.rent_review_no = rent_review_no;
		this.rent_reserv_no = rent_reserv_no;
		this.driver_no = driver_no;
		this.rent_payment_no = rent_payment_no;
		this.member_no = member_no;
		this.car_info_no = car_info_no;
		this.car_kind_no = car_kind_no;
		this.branch_no = branch_no;
		this.insurance_no = insurance_no;
		this.rent_review_title = rent_review_title;
		this.rent_review_content = rent_review_content;
		this.rent_review_rating_car = rent_review_rating_car;
		this.rent_review_date = rent_review_date;
	}


	public String getRent_reserv_no() {
		return rent_reserv_no;
	}


	public void setRent_reserv_no(String rent_reserv_no) {
		this.rent_reserv_no = rent_reserv_no;
	}


	public String getDriver_no() {
		return driver_no;
	}


	public void setDriver_no(String driver_no) {
		this.driver_no = driver_no;
	}


	public String getRent_payment_no() {
		return rent_payment_no;
	}


	public void setRent_payment_no(String rent_payment_no) {
		this.rent_payment_no = rent_payment_no;
	}


	public String getMember_no() {
		return member_no;
	}


	public void setMember_no(String member_no) {
		this.member_no = member_no;
	}


	public String getCar_info_no() {
		return car_info_no;
	}


	public void setCar_info_no(String car_info_no) {
		this.car_info_no = car_info_no;
	}


	public String getCar_kind_no() {
		return car_kind_no;
	}


	public void setCar_kind_no(String car_kind_no) {
		this.car_kind_no = car_kind_no;
	}


	public String getBranch_no() {
		return branch_no;
	}


	public void setBranch_no(String branch_no) {
		this.branch_no = branch_no;
	}


	public String getInsurance_no() {
		return insurance_no;
	}


	public void setInsurance_no(String insurance_no) {
		this.insurance_no = insurance_no;
	}


	public String getRent_review_title() {
		return rent_review_title;
	}


	public void setRent_review_title(String rent_review_title) {
		this.rent_review_title = rent_review_title;
	}


	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getRent_review_no() {
		return rent_review_no;
	}
	public void setRent_review_no(String rent_review_no) {
		this.rent_review_no = rent_review_no;
	}
	public Date getRent_review_date() {
		return rent_review_date;
	}
	public void setRent_review_date(Date rent_review_date) {
		this.rent_review_date = rent_review_date;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRent_review_rating_car() {
		return rent_review_rating_car;
	}
	public void setRent_review_rating_car(String rent_review_rating_car) {
		this.rent_review_rating_car = rent_review_rating_car;
	}
	public String getRent_review_content() {
		return rent_review_content;
	}
	public void setRent_review_content(String rent_review_content) {
		this.rent_review_content = rent_review_content;
	}
	public String getCar_kind_name() {
		return car_kind_name;
	}
	public void setCar_kind_name(String car_kind_name) {
		this.car_kind_name = car_kind_name;
	}
	public String getCar_kind_fuel() {
		return car_kind_fuel;
	}
	public void setCar_kind_fuel(String car_kind_fuel) {
		this.car_kind_fuel = car_kind_fuel;
	}
	public String getCar_kind_type() {
		return car_kind_type;
	}
	public void setCar_kind_type(String car_kind_type) {
		this.car_kind_type = car_kind_type;
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
	public String getCar_kind_image() {
		return car_kind_image;
	}
	public void setCar_kind_image(String car_kind_image) {
		this.car_kind_image = car_kind_image;
	}
}
