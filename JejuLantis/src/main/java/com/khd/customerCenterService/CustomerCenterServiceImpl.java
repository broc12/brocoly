package com.khd.customerCenterService;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.customerCenterDAO.CustomerCenterDao;
import com.khd.model.CustomerCenter;

@Service
public class CustomerCenterServiceImpl implements CustomerCenterService {

	@Autowired
	CustomerCenterDao customerCenterDao;
	
	@Override
	public List<CustomerCenter> list(HashMap map) {
		return customerCenterDao.list(map);
	}
	@Override
	public long totalNum() {
		return customerCenterDao.totalNum();
	}

}
