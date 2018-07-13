package com.khd.rentcarDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.model.RentcarSearchResult;
import com.khd.rentcarService.RentcarDAO;
@Service
public class RentcarServiceImpl implements RentcarService {

	@Autowired
	RentcarDAO rentcardao;
	
	@Override
	public List searchService() {
		
		return rentcardao.search();
	}
	@Override
	public List searchcarService() {
		
		return rentcardao.searchcar();
	}

}
