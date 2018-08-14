package com.khd.jejulantis.admin.reserv.DAO;

import java.util.List;

import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarkindDetail;
import com.khd.jejulantis.model.Reserv;

public interface MyReservDAO {
	List<Reserv>list(long branch_no);
	Reserv reservfull(long rent_reserv_no);
	List<CarInfo>info(long branch_no);
	List<CarkindDetail>kind();
	List<CarInfo>myCarNo(long car_no);
}
