package com.khd.jejulantis.client.naverLogin.Dao;

import java.util.List;

import com.khd.jejulantis.model.CarInfo;
import com.khd.jejulantis.model.CarInfoInsert;
import com.khd.jejulantis.model.CarInfoSelect;
import com.khd.jejulantis.model.Member;

public interface NaverLoginDao {
	Member checkMember(String id);
	boolean joinMember(Member memberToJoin);
}
