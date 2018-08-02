package com.khd.jejulantis.model;

import java.sql.*;


public class CarInfoSelect {
	
	private String branch_name;
	private String car_name;
	private String CAR_INFO_RENT_AT;
	private String CAR_INFO_STATE;
	private int CAR_INFO_BACK_NO;
	private int CAR_INFO_NO;
	
	public CarInfoSelect() {}

	public CarInfoSelect(String branch_name, String car_name, String cAR_INFO_RENT_AT, String cAR_INFO_STATE,
			int cAR_INFO_BACK_NO, int cAR_INFO_NO) {
		super();
		this.branch_name = branch_name;
		this.car_name = car_name;
		CAR_INFO_RENT_AT = cAR_INFO_RENT_AT;
		CAR_INFO_STATE = cAR_INFO_STATE;
		CAR_INFO_BACK_NO = cAR_INFO_BACK_NO;
		CAR_INFO_NO = cAR_INFO_NO;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public String getCAR_INFO_RENT_AT() {
		return CAR_INFO_RENT_AT;
	}

	public void setCAR_INFO_RENT_AT(String cAR_INFO_RENT_AT) {
		CAR_INFO_RENT_AT = cAR_INFO_RENT_AT;
	}

	public String getCAR_INFO_STATE() {
		return CAR_INFO_STATE;
	}

	public void setCAR_INFO_STATE(String cAR_INFO_STATE) {
		CAR_INFO_STATE = cAR_INFO_STATE;
	}

	public int getCAR_INFO_BACK_NO() {
		return CAR_INFO_BACK_NO;
	}

	public void setCAR_INFO_BACK_NO(int cAR_INFO_BACK_NO) {
		CAR_INFO_BACK_NO = cAR_INFO_BACK_NO;
	}

	public int getCAR_INFO_NO() {
		return CAR_INFO_NO;
	}

	public void setCAR_INFO_NO(int cAR_INFO_NO) {
		CAR_INFO_NO = cAR_INFO_NO;
	}

}
