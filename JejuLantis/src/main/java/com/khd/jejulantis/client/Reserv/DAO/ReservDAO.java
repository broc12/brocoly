package com.khd.jejulantis.client.Reserv.DAO;

import java.util.List;

import com.khd.jejulantis.model.Reserv;

public interface ReservDAO {
	Reserv insert(Reserv reserv);
	List<Reserv>list(long member_no);
	Reserv reservList(long rent_reserv_no);
}
