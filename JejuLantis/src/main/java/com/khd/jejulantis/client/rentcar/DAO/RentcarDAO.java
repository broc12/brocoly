package com.khd.jejulantis.client.rentcar.DAO;

import java.util.Date;
import java.util.List;

import com.khd.jejulantis.model.Rcar;
import com.khd.jejulantis.model.SearchRequirements;
import com.khd.jejulantis.model.SelectRentcar;

public interface RentcarDAO {
	
	public List<Rcar> rentcarList(SearchRequirements requirements);
	public SelectRentcar confirmrentcar(SearchRequirements requirements);
	public Date currenttimeStamp();
	public Date timeStamp();
}
