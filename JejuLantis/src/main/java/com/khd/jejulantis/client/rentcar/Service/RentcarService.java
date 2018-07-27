package com.khd.jejulantis.client.rentcar.Service;

import java.util.Date;
import java.util.List;

import com.khd.jejulantis.model.Rcar;
import com.khd.jejulantis.model.RentcarSearchResult;
import com.khd.jejulantis.model.SearchRequirements;

public interface RentcarService {

	public List<Rcar> rentcarListService(SearchRequirements requirements);
	public Date currenttimeStampService();
	public Date timeStampService();
}
