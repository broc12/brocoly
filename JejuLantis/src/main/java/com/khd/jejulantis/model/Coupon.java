package com.khd.jejulantis.model;

import java.sql.Date;

public class Coupon {
	private long coupon_no;
	private String coupon_name;
	private String coupon_way;
	private long coupon_discount;
	private Date coupon_start;
	private Date coupon_end;
	private Date coupon_resist;
	public Coupon() {
	}
	public Coupon(long coupon_no, String coupon_name, String coupon_way, long coupon_discount, Date coupon_start,
			Date coupon_end, Date coupon_resist) {
		this.coupon_no = coupon_no;
		this.coupon_name = coupon_name;
		this.coupon_way = coupon_way;
		this.coupon_discount = coupon_discount;
		this.coupon_start = coupon_start;
		this.coupon_end = coupon_end;
		this.coupon_resist = coupon_resist;
	}
	public long getCoupon_no() {
		return coupon_no;
	}
	public void setCoupon_no(long coupon_no) {
		this.coupon_no = coupon_no;
	}
	public String getCoupon_name() {
		return coupon_name;
	}
	public void setCoupon_name(String coupon_name) {
		this.coupon_name = coupon_name;
	}
	public String getcoupon_way() {
		return coupon_way;
	}
	public void setcoupon_way(String coupon_way) {
		this.coupon_way = coupon_way;
	}
	public long getcoupon_discount() {
		return coupon_discount;
	}
	public void setcoupon_discount(long coupon_discount) {
		this.coupon_discount = coupon_discount;
	}
	public Date getcoupon_start() {
		return coupon_start;
	}
	public void setcoupon_start(Date coupon_start) {
		this.coupon_start = coupon_start;
	}
	public Date getcoupon_end() {
		return coupon_end;
	}
	public void setcoupon_end(Date coupon_end) {
		this.coupon_end = coupon_end;
	}
	public Date getcoupon_resist() {
		return coupon_resist;
	}
	public void setcoupon_resist(Date coupon_resist) {
		this.coupon_resist = coupon_resist;
	}
	
}
