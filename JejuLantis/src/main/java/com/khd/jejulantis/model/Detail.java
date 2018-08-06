package com.khd.jejulantis.model;

import java.sql.Date;

public class Detail {
	private long member_no;
	private String detail_no;
	private long coupon_no;
	private Date detail_start;
	private Date detail_end;
	private Date detail_resist;
	private String detail_use;
	public Detail() {
	}
	public Detail(long member_no, String detail_no, long coupon_no, Date detail_start, Date detail_end,
			Date detail_resist, String detail_use) {
		this.member_no = member_no;
		this.detail_no = detail_no;
		this.coupon_no = coupon_no;
		this.detail_start = detail_start;
		this.detail_end = detail_end;
		this.detail_resist = detail_resist;
		this.detail_use = detail_use;
	}
	public long getMember_no() {
		return member_no;
	}
	public void setMember_no(long member_no) {
		this.member_no = member_no;
	}
	public String getDetail_no() {
		return detail_no;
	}
	public void setDetail_no(String detail_no) {
		this.detail_no = detail_no;
	}
	public long getCoupon_no() {
		return coupon_no;
	}
	public void setCoupon_no(long coupon_no) {
		this.coupon_no = coupon_no;
	}
	public Date getDetail_start() {
		return detail_start;
	}
	public void setDetail_start(Date detail_start) {
		this.detail_start = detail_start;
	}
	public Date getDetail_end() {
		return detail_end;
	}
	public void setDetail_end(Date detail_end) {
		this.detail_end = detail_end;
	}
	public Date getDetail_resist() {
		return detail_resist;
	}
	public void setDetail_resist(Date detail_resist) {
		this.detail_resist = detail_resist;
	}
	public String getDetail_use() {
		return detail_use;
	}
	public void setDetail_use(String detail_use) {
		this.detail_use = detail_use;
	}
	
}
