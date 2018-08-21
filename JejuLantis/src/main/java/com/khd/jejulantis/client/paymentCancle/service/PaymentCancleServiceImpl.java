package com.khd.jejulantis.client.paymentCancle.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.client.paymentCancle.DAO.PaymentCancleDAO;

@Service
public class PaymentCancleServiceImpl implements PaymentCancleService {

	@Autowired
	private PaymentCancleDAO paymentCancleDAO;
	@Override
	public long cancleReserve(long rent_reserv_no, long rent_payment_no) {
		return paymentCancleDAO.cancleReserve(rent_reserv_no,rent_payment_no);
	}

}
