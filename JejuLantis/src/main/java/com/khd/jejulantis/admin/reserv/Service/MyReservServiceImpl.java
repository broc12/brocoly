package com.khd.jejulantis.admin.reserv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.reserv.DAO.MyReservDAO;
import com.khd.jejulantis.model.Reserv;

@Service
public class MyReservServiceImpl implements MyReservService{
	@Autowired
	private MyReservDAO myreservDAO;
	
	@Override
	public List<Reserv>listService(long branch_no){
		return myreservDAO.list(branch_no);
	}
}
