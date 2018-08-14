package com.khd.jejulantis.admin.reserv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.reserv.DAO.MyReservDAO;
import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarkindDetail;
import com.khd.jejulantis.model.Reserv;

@Service
public class MyReservServiceImpl implements MyReservService{
	@Autowired
	private MyReservDAO myreservDAO;
	
	@Override
	public List<Reserv>listService(long branch_no){
		return myreservDAO.list(branch_no);
	}
	@Override
	public Reserv reservfullService(long rent_reserv_no) {
		return myreservDAO.reservfull(rent_reserv_no);
	}
	@Override
	public List<CarInfo>infoService(long branch_no){
		return myreservDAO.info(branch_no);
	}
	@Override
	public List<CarkindDetail>kindService(){
		return myreservDAO.kind();
	}
	@Override
	public List<CarInfo>myCarNoService(long car_no){
		return myreservDAO.myCarNo(car_no);
	}
}
