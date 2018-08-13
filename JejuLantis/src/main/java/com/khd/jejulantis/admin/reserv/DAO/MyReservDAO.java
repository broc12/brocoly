package com.khd.jejulantis.admin.reserv.DAO;

import java.util.List;

import com.khd.jejulantis.model.Reserv;

public interface MyReservDAO {
	List<Reserv>list(long branch_no);
	Reserv reservfull(long rent_reserv_no);
}
