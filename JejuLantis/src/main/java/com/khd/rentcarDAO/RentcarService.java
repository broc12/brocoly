package com.khd.rentcarDAO;

import java.util.Date;
import java.util.List;

import com.khd.model.Rcar;
import com.khd.model.RentcarSearchResult;
import com.khd.model.SearchRequirements;

public interface RentcarService {

	public List<Rcar> rentcarListService(SearchRequirements requirements);
	public List<Rcar> searchService();
	public Date timeStampService();
}
