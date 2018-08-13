package com.khd.jejulantis.admin.affiliate.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.khd.jejulantis.model.Affiliate;

public class AffiliateDaoImpl implements AffiliateDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns_affiliate = "query.affiliate";
	@Override
	public List<Affiliate> affiliateList() {
		List<Affiliate> affiliateList = sqlSession.selectList(ns_affiliate+".affiliateList");
		return affiliateList;
	}
}
