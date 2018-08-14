package com.khd.jejulantis.admin.affiliate.Service;

import java.util.List;

import com.khd.jejulantis.model.Affiliate;

public interface AffiliateService {
	List<Affiliate> affiliateListService();
	void affiliateDeleteService(long affiliate_no);
	List<Affiliate> affiliateContentListService(long affiliate_no);
}
