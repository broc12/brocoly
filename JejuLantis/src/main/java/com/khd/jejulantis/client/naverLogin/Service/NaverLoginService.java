package com.khd.jejulantis.client.naverLogin.Service;

import java.util.List;

import com.khd.jejulantis.model.*;

public interface NaverLoginService {
	Member checkMember(String id);
	boolean joinMember(Member memberToJoin);
}
