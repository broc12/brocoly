package com.khd.jejulantis.client.paymentCancle.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentCancleDAOImpl implements PaymentCancleDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String nsPayment = "query.payment";
	private String nsReserve = "query.reserv";
	
	/*결제 24시간 이내 :수수료 없음 
	결제 24시간 이후 :수수료 30%
	대여 24시간 이내 :수수료 30%*/  
	@Override
	public long cancleReserve(long rent_reserv_no, long rent_payment_no) {
		System.out.println("rent_reserv_no "+ rent_reserv_no );
		System.out.println("rent_payment_no "+ rent_payment_no );
		sqlSession.update(nsReserve+".cancleReserve",rent_reserv_no); //여기서 cancle_At이랑 cancle_date바꾸기
		sqlSession.update(nsPayment+".canclePayment",rent_payment_no); //여기서 payment cancle date sysdate로 변경
		String goodsType = sqlSession.selectOne(nsPayment+".judgeGoodsType",rent_payment_no);
		int timeDifference = sqlSession.selectOne(nsReserve+".timeDifference",rent_reserv_no); //time differnce = 대여~시간 이내 startDate - cancleDate
		int afterPaymentTime = sqlSession.selectOne(nsReserve+".afterPaymentTime",rent_reserv_no); //afterPayment = 결제시간 이후 SYSDATE - reserve resist
		long refundPrice = sqlSession.selectOne(nsPayment+".totalPrice",rent_payment_no);
		if(goodsType.equals("Y")) {
			if(timeDifference<72) {
				refundPrice = Math.round(refundPrice*0.7); 
				sqlSession.update(nsPayment+".chargePenalty",rent_payment_no);
				System.out.println("페널티 적용");
			}
		}
		else {
			if(timeDifference<24 && afterPaymentTime > 24) {
				 refundPrice = Math.round(refundPrice*0.7); 
				 sqlSession.update(nsPayment+".chargePenalty",rent_payment_no);
				 System.out.println("페널티 적용");
			}
		}
		HashMap<String, Object> hashPay = new HashMap<String, Object>();
			hashPay.put("rent_payment_no", rent_payment_no);
			hashPay.put("refundPrice", refundPrice);
		sqlSession.update(nsPayment+".updatePaymentRefundPrice",hashPay);
		return refundPrice;
	}
	
}
