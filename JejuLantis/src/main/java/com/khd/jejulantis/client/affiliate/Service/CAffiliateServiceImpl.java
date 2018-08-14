package com.khd.jejulantis.client.affiliate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.client.affiliate.DAO.CAffiliateDao;
import com.khd.jejulantis.model.Affiliate;

@Service
public class CAffiliateServiceImpl implements CAffiliateService {
	@Autowired
	CAffiliateDao caffDao;
	@Override
	public void insertService(Affiliate affiliate) {
		caffDao.affiliateInsert(affiliate);
	}
}
