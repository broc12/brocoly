package com.khd.jejulantis.client.Reserv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.client.Reserv.DAO.ReservDAO;
import com.khd.jejulantis.model.Reserv;

@Service
public class ReservServiceImpl implements ReservService{
	@Autowired
	private ReservDAO reservDAO;
	
	@Override
	public Reserv insertService(Reserv reserv) {
		return reservDAO.insert(reserv);
	}
	@Override
	public List<Reserv>listService(long member_no){
		return reservDAO.list(member_no);
	}
	@Override
	public Reserv reservListService(long rent_reserv_no) {
		return reservDAO.reservList(rent_reserv_no);
	}
}
