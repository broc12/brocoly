package com.khd.rentcarService;

import java.util.Date;
import java.util.List;

import com.khd.model.Rcar;
import com.khd.model.RentcarSearchResult;
import com.khd.model.SearchRequirements;

public interface RentcarDAO {
	
	public List<Rcar> rentcarList(SearchRequirements requirements);
	public List<Rcar> search();
	public Date timeStamp();
}
