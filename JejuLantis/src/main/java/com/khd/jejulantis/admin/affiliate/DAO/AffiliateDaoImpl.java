package com.khd.jejulantis.admin.affiliate.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Affiliate;
@Repository
public class AffiliateDaoImpl implements AffiliateDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns_affiliate = "query.affiliate";
	@Override
	public List<Affiliate> affiliateList() {
		List<Affiliate> affiliateList = sqlSession.selectList(ns_affiliate+".affiliateList");
		return affiliateList;
	}
	@Override
	public void affiliateDelete(long affiliate_no) {
		sqlSession.delete(ns_affiliate+".affiliateDelete", affiliate_no);
	}
	@Override
	public List<Affiliate> affiliateContentList(long affiliate_no) {
		List<Affiliate> affiliateContentList = sqlSession.selectList(ns_affiliate+".affiliateList", affiliate_no);
		return affiliateContentList;
	}
}
