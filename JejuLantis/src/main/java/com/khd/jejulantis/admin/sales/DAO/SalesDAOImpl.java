package com.khd.jejulantis.admin.sales.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Sales;

@Repository
public class SalesDAOImpl implements SalesDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String nsSales = "query.sales";
	
	/*결제 24시간 이내 :수수료 없음 
	결제 24시간 이후 :수수료 30%
	대여 24시간 이내 :수수료 30%*/  
	@Override
	public List<Sales> totalSales(HashMap<String, Object> hash){
		List<Sales> sales = sqlSession.selectList(nsSales+".sales",hash);
		return sales;
	}
	
}
