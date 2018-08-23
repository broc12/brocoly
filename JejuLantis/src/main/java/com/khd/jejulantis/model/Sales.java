package com.khd.jejulantis.model;

import java.sql.Date;

public class Sales {
	private String salesDate;
	private long totalPayment;
	private long countPayment;
	private long totalNCancle;
	private long totalNCount;
	private long totalPCancle;
	private long totalPCount;
	public Sales() {}
	public Sales(String salesDate, long totalPayment, long countPayment, long totalNCancle, long totalNCount,
			long totalPCancle, long totalPCount) {
		super();
		this.salesDate = salesDate;
		this.totalPayment = totalPayment;
		this.countPayment = countPayment;
		this.totalNCancle = totalNCancle;
		this.totalNCount = totalNCount;
		this.totalPCancle = totalPCancle;
		this.totalPCount = totalPCount;
	}
	public String getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}
	public long getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(long totalPayment) {
		this.totalPayment = totalPayment;
	}
	public long getCountPayment() {
		return countPayment;
	}
	public void setCountPayment(long countPayment) {
		this.countPayment = countPayment;
	}
	public long getTotalNCancle() {
		return totalNCancle;
	}
	public void setTotalNCancle(long totalNCancle) {
		this.totalNCancle = totalNCancle;
	}
	public long getTotalNCount() {
		return totalNCount;
	}
	public void setTotalNCount(long totalNCount) {
		this.totalNCount = totalNCount;
	}
	public long getTotalPCancle() {
		return totalPCancle;
	}
	public void setTotalPCancle(long totalPCancle) {
		this.totalPCancle = totalPCancle;
	}
	public long getTotalPCount() {
		return totalPCount;
	}
	public void setTotalPCount(long totalPCount) {
		this.totalPCount = totalPCount;
	};
	public long getNetSales() {
		long netSales = getTotalPayment()-(getTotalNCancle()+getTotalPCancle());
		return netSales;
	}
	
}
