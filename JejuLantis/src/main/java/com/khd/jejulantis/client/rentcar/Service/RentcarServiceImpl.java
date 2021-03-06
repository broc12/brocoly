package com.khd.jejulantis.client.rentcar.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.client.rentcar.DAO.RentcarDAO;
import com.khd.jejulantis.model.Rcar;
import com.khd.jejulantis.model.SearchRequirements;
import com.khd.jejulantis.model.SelectRentcar;
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
	@Override
	public SelectRentcar confirmrentcarService(SearchRequirements requirements) {
		return rentcardao.confirmrentcar(requirements);
	}
	@Override
	public SelectRentcar inputrentcarService(SearchRequirements requirements) {
		
		return rentcardao.inputrentcar(requirements);
	}
}
