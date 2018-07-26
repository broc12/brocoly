package com.khd.rentcarDAO;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.model.Rcar;
import com.khd.model.RentcarSearchResult;
import com.khd.model.SearchRequirements;
import com.khd.rentcarService.RentcarDAO;
@Service
public class RentcarServiceImpl implements RentcarService {

	@Autowired
	RentcarDAO rentcardao;
	
	@Override
	public List<Rcar> rentcarListService(SearchRequirements requirements) {
		return rentcardao.rentcarList(requirements);
	}	
	@Override
	public Date currenttimeStampService() {
		return rentcardao.currenttimeStamp();
	}
	@Override
	public Date timeStampService() {
		return rentcardao.timeStamp();
	}
}
