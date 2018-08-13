package com.khd.jejulantis.client.snsLogin.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.admin.carInfo.DAO.CarInfoDao;
import com.khd.jejulantis.client.snsLogin.Dao.NaverLoginDao;
import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarInfoInsert;
import com.khd.jejulantis.model.CarInfoSelect;
import com.khd.jejulantis.model.Member;

@Service
public class SnsLoginServiceImpl implements SnsLoginService {

	@Autowired
	NaverLoginDao naverLoginDao;
	
	public Member checkMember(String id) {
		return naverLoginDao.checkMember(id);
	}
	public boolean joinMember(Member memberToJoin) {
		return naverLoginDao.joinMember(memberToJoin);
	}
}
