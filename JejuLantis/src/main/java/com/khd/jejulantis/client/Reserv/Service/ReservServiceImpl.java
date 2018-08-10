package com.khd.jejulantis.client.Reserv.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.client.Reserv.DAO.ReservDAO;
import com.khd.jejulantis.model.Reserv;

@Service
public class ReservServiceImpl implements ReservService{
	@Autowired
	private ReservDAO reservDAO;
	
	@Override
	public void insertService(Reserv reserv) {
		reservDAO.insert(reserv);
	}
}
