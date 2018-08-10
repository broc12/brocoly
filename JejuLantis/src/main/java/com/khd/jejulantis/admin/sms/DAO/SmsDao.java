package com.khd.jejulantis.admin.sms.DAO;

import java.util.List;

import com.khd.jejulantis.model.Member;

public interface SmsDao {

	List<Member> emailSenderList();
	List<Member> list();
}
