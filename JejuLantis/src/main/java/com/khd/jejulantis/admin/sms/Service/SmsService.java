package com.khd.jejulantis.admin.sms.Service;

import java.util.List;

import com.khd.jejulantis.model.Member;

public interface SmsService {
	void mailsendAllService(List<Member> email, String title, String content);
	void mailsendService(String email, String title, String content);
}
