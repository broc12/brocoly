package com.khd.jejulantis.client.coupon.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.client.coupon.DAO.DetailDAO;
import com.khd.jejulantis.model.Detail;

@Service
public class DetailServiceImpl implements DetailService{
	@Autowired
	private DetailDAO couponDAO;
	
	@Override
	public List<Detail>listService(String member_id){
		return couponDAO.list(member_id);
	}
}
