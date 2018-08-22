package com.khd.jejulantis.admin.sales.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.sales.DAO.SalesDAO;

@Service
public class SalesServiceImpl implements SalesService {

	@Autowired
	private SalesDAO salesDAO;
	
	@Override
	public void totalSales(long branch_no) {
		salesDAO.totalSales(branch_no);
	}

}
