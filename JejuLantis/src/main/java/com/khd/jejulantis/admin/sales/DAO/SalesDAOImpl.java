package com.khd.jejulantis.admin.sales.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SalesDAOImpl implements SalesDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String nsPayment = "query.payment";
	private String nsReserve = "query.reserv";
	
	/*결제 24시간 이내 :수수료 없음 
	결제 24시간 이후 :수수료 30%
	대여 24시간 이내 :수수료 30%*/  
	@Override
	public void totalSales(long branch_no){
		int countPayment = sqlSession.selectOne(nsPayment+".countPayment",branch_no);
		int pricePayment = sqlSession.selectOne(nsPayment+".pricePayment",branch_no);
		int countNCancle = sqlSession.selectOne(nsPayment+".countNCancle",branch_no);
		int priceNCancle = sqlSession.selectOne(nsPayment+".priceNCancle",branch_no);
		int countPCancle = sqlSession.selectOne(nsPayment+".countPCancle",branch_no);
		int pricePCancle = sqlSession.selectOne(nsPayment+".pricePCancle",branch_no);
		/*날짜별 결제 횟수/총액d , 일반취소횟수/총액 , 페널티취소횟수/총액, 총매출, 순매출*/
	}
	
}
