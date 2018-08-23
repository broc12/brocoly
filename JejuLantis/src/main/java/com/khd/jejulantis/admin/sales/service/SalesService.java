package com.khd.jejulantis.admin.sales.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.khd.jejulantis.model.Sales;


public interface SalesService {
	
	public List<Sales> totalSales(HashMap<String, Object> hash);
}
