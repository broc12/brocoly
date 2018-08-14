package com.khd.jejulantis.admin.affiliate.DAO;

import java.util.List;

import com.khd.jejulantis.model.Affiliate;

public interface AffiliateDao {
	List<Affiliate> affiliateList();
	void affiliateDelete(long affiliate_no);
	List<Affiliate> affiliateContentList(long affiliate_no);
}
