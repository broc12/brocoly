package com.khd.jejulantis.admin.reserv.Service;

import java.util.List;

import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarkindDetail;
import com.khd.jejulantis.model.Reserv;

public interface MyReservService {
	List<Reserv>listService(long branch_no);
	Reserv reservfullService(long rent_reserv_no);
	List<CarInfo>infoService(long branch_no);
	List<CarkindDetail>kindService();
	List<CarInfo>myCarNoService(long car_no);
	void updateService(Reserv reserv);
}
