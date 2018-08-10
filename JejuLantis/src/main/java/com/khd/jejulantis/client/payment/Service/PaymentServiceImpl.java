package com.khd.jejulantis.client.payment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.client.payment.DAO.PaymentDAO;
import com.khd.jejulantis.model.Payment;

@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	private PaymentDAO paymentDAO;
	
	@Override
	public Payment insertService(Payment payment) {
		paymentDAO.insert(payment);
		return payment;
	}
}
