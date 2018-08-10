package com.khd.jejulantis.client.snsLogin.Service;

import java.util.List;

import com.khd.jejulantis.model.*;

public interface SnsLoginService {
	Member checkMember(String id);
	boolean joinMember(Member memberToJoin);
}
