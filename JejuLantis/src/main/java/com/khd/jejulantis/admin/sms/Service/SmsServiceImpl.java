package com.khd.jejulantis.admin.sms.Service;

import java.util.List;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.khd.jejulantis.model.Member;
@Service
public class SmsServiceImpl implements SmsService {
	@Autowired
	private JavaMailSender mailSender;
	@Override
	public void mailsendAllService(List<Member> tomail, String title, String content) {
		String setfrom = "gml7814@gmail.com"; //관리자 이메일 
		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
			messageHelper.addTo((InternetAddress) tomail); // 보낼 사람의 이메일 여러명
			messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
			messageHelper.setText(content);  // 메일 내용     
			mailSender.send(message);
		} catch(Exception e){
			System.out.println(e);
		}
	}
	@Override
	public void mailsendService(String tomail, String title, String content) {
		String setfrom = "gml7814@gmail.com"; //관리자 이메일
		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
			messageHelper.addTo(tomail);	 // 보낼 사람의 이메일
			messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
			messageHelper.setText(content);  // 메일 내용     
			mailSender.send(message);
		} catch(Exception e){
			System.out.println(e);
		}
	}
}
