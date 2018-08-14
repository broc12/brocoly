package com.khd.jejulantis.client.Reserv.Service;

import java.util.List;

import com.khd.jejulantis.model.Reserv;

public interface ReservService {
	Reserv insertService(Reserv reserv);
	List<Reserv>listService(long member_no);
	Reserv reservListService(long rent_reserv_no);
}
