package com.khd.jejulantis.client.affiliate.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Affiliate;
	
@Repository
public class CAffiliateDaoImpl implements CAffiliateDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns_affiliate = "query.affiliate";
	@Override
	public void affiliateInsert(Affiliate affiliate) {
		sqlSession.insert(ns_affiliate+".affiliateInsert", affiliate);
	}

}
