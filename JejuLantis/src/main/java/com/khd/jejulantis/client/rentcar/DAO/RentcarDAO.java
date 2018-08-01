package com.khd.jejulantis.client.rentcar.DAO;

import java.util.Date;
import java.util.List;

import com.khd.jejulantis.model.Rcar;
import com.khd.jejulantis.model.SearchRequirements;

public interface RentcarDAO {
	
	public List<Rcar> rentcarList(SearchRequirements requirements);
	public Date currenttimeStamp();
	public Date timeStamp();
}
