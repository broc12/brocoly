package com.khd.jejulantis.admin.affiliate.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.affiliate.DAO.AffiliateDao;
import com.khd.jejulantis.model.Affiliate;
@Service
public class AffiliateServiceImpl implements AffiliateService {
	@Autowired
	AffiliateDao affDao;
	@Override
	public List<Affiliate> affiliateListService() {
		return affDao.affiliateList();
	}
	@Override
	public void affiliateDeleteService(long affiliate_no) {
		affDao.affiliateDelete(affiliate_no);
	}
	@Override
	public List<Affiliate> affiliateContentListService(long affiliate_no) {
		return affDao.affiliateContentList(affiliate_no);
	}
}
