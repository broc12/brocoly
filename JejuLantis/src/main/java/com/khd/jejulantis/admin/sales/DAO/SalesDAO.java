package com.khd.jejulantis.admin.sales.DAO;

import java.util.HashMap;
import java.util.List;

import com.khd.jejulantis.model.Sales;

public interface SalesDAO {
	public List<Sales> totalSales(HashMap<String, Object> hash);
}
