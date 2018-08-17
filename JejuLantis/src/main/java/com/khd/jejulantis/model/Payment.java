package com.khd.jejulantis.model;

import java.sql.Date;

public class Payment {
	private long rent_payment_no;
	private long rent_payment_total_price;
	private long rent_payment_insurance_price;
	private long rent_payment_carkind_price;
	private long rent_payment_discount;
	private String rent_payment_way;
	private Date rent_payment_comp_date;
	private String rent_payment_ing;
	private Date rent_payment_cancel_date;
	private Date rent_payment_resist;
	private String rent_payment_goods_type;
	private long rent_payment_refund_price;
	public Payment() {
	}
	
	public Payment(long rent_payment_no, long rent_payment_total_price, long rent_payment_insurance_price,
			long rent_payment_carkind_price, long rent_payment_discount, String rent_payment_way,
			Date rent_payment_comp_date, String rent_payment_ing, Date rent_payment_cancel_date,
			Date rent_payment_resist, String rent_payment_goods_type, long rent_payment_refund_price) {
		this.rent_payment_no = rent_payment_no;
		this.rent_payment_total_price = rent_payment_total_price;
		this.rent_payment_insurance_price = rent_payment_insurance_price;
		this.rent_payment_carkind_price = rent_payment_carkind_price;
		this.rent_payment_discount = rent_payment_discount;
		this.rent_payment_way = rent_payment_way;
		this.rent_payment_comp_date = rent_payment_comp_date;
		this.rent_payment_ing = rent_payment_ing;
		this.rent_payment_cancel_date = rent_payment_cancel_date;
		this.rent_payment_resist = rent_payment_resist;
		this.rent_payment_goods_type = rent_payment_goods_type;
		this.rent_payment_refund_price = rent_payment_refund_price;
	}
	
	public long getRent_payment_refund_price() {
		return rent_payment_refund_price;
	}

	public void setRent_payment_refund_price(long rent_payment_refund_price) {
		this.rent_payment_refund_price = rent_payment_refund_price;
	}

	public long getRent_payment_no() {
		return rent_payment_no;
	}
	public void setRent_payment_no(long rent_payment_no) {
		this.rent_payment_no = rent_payment_no;
	}
	public long getRent_payment_total_price() {
		return rent_payment_total_price;
	}
	public void setRent_payment_total_price(long rent_payment_total_price) {
		this.rent_payment_total_price = rent_payment_total_price;
	}
	public long getRent_payment_insurance_price() {
		return rent_payment_insurance_price;
	}
	public void setRent_payment_insurance_price(long rent_payment_insurance_price) {
		this.rent_payment_insurance_price = rent_payment_insurance_price;
	}
	public long getRent_payment_carkind_price() {
		return rent_payment_carkind_price;
	}
	public void setRent_payment_carkind_price(long rent_payment_carkind_price) {
		this.rent_payment_carkind_price = rent_payment_carkind_price;
	}
	public long getRent_payment_discount() {
		return rent_payment_discount;
	}
	public void setRent_payment_discount(long rent_payment_discount) {
		this.rent_payment_discount = rent_payment_discount;
	}
	public String getRent_payment_way() {
		return rent_payment_way;
	}
	public void setRent_payment_way(String rent_payment_way) {
		this.rent_payment_way = rent_payment_way;
	}
	public Date getRent_payment_comp_date() {
		return rent_payment_comp_date;
	}
	public void setRent_payment_comp_date(Date rent_payment_comp_date) {
		this.rent_payment_comp_date = rent_payment_comp_date;
	}
	public String getRent_payment_ing() {
		return rent_payment_ing;
	}
	public void setRent_payment_ing(String rent_payment_ing) {
		this.rent_payment_ing = rent_payment_ing;
	}
	public Date getRent_payment_cancel_date() {
		return rent_payment_cancel_date;
	}
	public void setRent_payment_cancel_date(Date rent_payment_cancel_date) {
		this.rent_payment_cancel_date = rent_payment_cancel_date;
	}
	public Date getRent_payment_resist() {
		return rent_payment_resist;
	}
	public void setRent_payment_resist(Date rent_payment_resist) {
		this.rent_payment_resist = rent_payment_resist;
	}
	public String getRent_payment_goods_type() {
		return rent_payment_goods_type;
	}
	public void setRent_payment_goods_type(String rent_payment_goods_type) {
		this.rent_payment_goods_type = rent_payment_goods_type;
	}
	
}
