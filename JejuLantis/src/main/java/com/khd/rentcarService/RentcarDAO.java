package com.khd.rentcarService;

import java.util.List;

import com.khd.model.RentcarSearchResult;

public interface RentcarDAO {

	public List<RentcarSearchResult> search();
}
