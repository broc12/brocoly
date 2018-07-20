package com.khd.ReviewController;

import java.sql.Date;

public class ReviewContent {
	private String rCount;
	private String rent_review_no;
	private Date rent_review_date;
	private String branch_name;
	private String name;
	private String rent_review_rating_car;
	private String rent_review_content;
	private String car_kind_name;
	private String car_kind_fuel;
	private String car_kind_type;
	private Date rent_reserv_start;
	private Date rent_reserv_end;
	
	
	public ReviewContent() {
		
	}


	public ReviewContent(String rCount, String rent_review_no, Date rent_review_date, String branch_name, String name,
			String rent_review_rating_car, String rent_review_content, String car_kind_name, String car_kind_fuel,
			String car_kind_type, Date rent_reserv_start, Date rent_reserv_end) {
		super();
		this.rCount = rCount;
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
	}


	public String getrCount() {
		return rCount;
	}


	public void setrCount(String rCount) {
		this.rCount = rCount;
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

	
	
	
}
