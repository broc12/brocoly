package com.khd.jejulantis.admin.sales.service;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.sales.DAO.SalesDAO;
import com.khd.jejulantis.model.Sales;

@Service
public class SalesServiceImpl implements SalesService {

	@Autowired
	private SalesDAO salesDAO;
	
	@Override
	public List<Sales> totalSales(HashMap<String, Object> hash) {
		return salesDAO.totalSales(hash);
	}

}
