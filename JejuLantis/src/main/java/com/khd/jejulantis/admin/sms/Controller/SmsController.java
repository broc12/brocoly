package com.khd.jejulantis.admin.sms.Controller;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khd.jejulantis.admin.sms.Service.SmsService;
import com.khd.jejulantis.model.Member;

@Controller 
public class SmsController { 
//	@Autowired
//	private JavaMailSender mailSender;
	@Autowired
	private SmsService sservice;
	@RequestMapping(value = "admin/smsList.do") 
	public String mailSending() {
		return "admin/sms/smsInsert";
	}
	@RequestMapping(value = "admin/mailSenderOk.do") 
	public void mailSendingOk( 
			@RequestParam("tomail")String tomail,
			@RequestParam("title")String title, 
			@RequestParam("content")String content) {
		System.out.println("시작");
		List<Member> tomails = null;
		sservice.mailsendAllService(tomails, title, content);
		sservice.mailsendService(tomail, title, content);
//	    String tomail  = "gml7814@naver.com";
//	    String title   = "나......의 아름다운......정원";
//	    String content = "반가워 ㅎㅎ";
//	    String tomail  = request.getParameter("tomail");     // 받는 사람 이메일
//	    String title   = request.getParameter("title");      // 제목
//	    String content = request.getParameter("content");    // 내용
//	    try {
//			MimeMessage message = mailSender.createMimeMessage();
//			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
//			messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
//			messageHelper.addTo("gml7814@naver.com");
//			messageHelper.addTo("gml7814@gmail.com");
//			messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
//			messageHelper.setText(content);  // 메일 내용     
//			mailSender.send(message);
//		} catch(Exception e){
//			System.out.println(e);
//		}
	}
}
