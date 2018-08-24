package com.khd.jejulantis.client.member.Service;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;

import com.khd.jejulantis.admin.sms.Service.SmsService;
import com.khd.jejulantis.client.member.Dao.MemberDaoImpl;
import com.khd.jejulantis.model.Member;
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	@Autowired
	MemberDaoImpl memberDao = new MemberDaoImpl();
	@Autowired
	private SmsService sservice;
	@Override
	public boolean joinService(Member member) {
		return memberDao.join(member);
	}
	@Override
	public int idcheck(String member_id) {
		return memberDao.check(member_id);
	}
//	@Override
//	public int modify(Member member) {
//		return memberDao.modify(member);
//	}
//	
	@Override
			public List<Member>newListService(){
				return memberDao.newList();
			}
	@Override
	public Member mypageService(String member_id) {
		// TODO Auto-generated method stub
		return memberDao.mypage(member_id);	 
	}
//	@Override
//	public boolean modifyService(HashMap<String, String> hm) {
//		// TODO Auto-generated method stub
//		return memberDao.modify(hm);
//	}
//	
	@Override
	public Member modifyService(Member member) {
	
		return memberDao.modify(member);
	}
//	@Override
//	public Member deleteService(Member member) {
//		return memberDao.delete(member);
//	}
	@Override
	public int deleteService(String member_id) {
		// TODO Auto-generated method stub
		return memberDao.delete(member_id);
	}
	
	// ���̵� ã��
	@Override
	public String find_id(String member_email) throws Exception {
		return memberDao.find_id(member_email);	
	}
	// ��й�ȣ ã��
		@Override
		public String find_pwd(String member_id) throws Exception {
			return memberDao.find_pwd(member_id);	
		}
		@Override
		public int emailcheck(String member_email) {
			return memberDao.echeck(member_email);
		}
		@Override
		public List<Member> memberListService() {
			return memberDao.memberList();
		}
		@Override
		public Member memgetUsersByID(String member_id) {
			return memberDao.memgetUsersByID(member_id);
		}
		@Override
		public Member securityloginCheck(Member member) {
			return memberDao.securityloginCheck(member);
		}
		@Override
		public void changePwd(Member member) {
			memberDao.change_pw(member);
			
		}
		@Override
		public void find_pw(HttpServletResponse response, Member member,@RequestParam("member_id")String member_id,@RequestParam("member_email")String member_email,
				Model md) throws IOException {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
//			if(manager.check_id(member.getId()) == 0) {
//				out.print("아이디가 없습니다.");
//				out.close();
//			}
			if(idcheck(member.getMember_id()) == 0) {
				out.print("아이디가 없습니다.");
				out.close();
			}
			if(emailcheck(member.getMember_email()) == 0) {
				out.print("이메일이 없습니다.");
				out.close();
			}
		
//			String manager_email = manager.getManager_id();
//			 String manager_pwd = managerService.find_pwd(manager_id);
			// 가입에 사용한 이메일이 아니면		
			else {
				// 임시 비밀번호 생성
				String pw = "";
				for (int i = 0; i < 12; i++) {
					pw += (char) ((Math.random() * 26) + 97);
				}
				
				member.setMember_pwd(pw);
				String member_pwd = member.getMember_pwd();
				if(StringUtils.hasText(member_pwd)) {
					String bCryptString = passwordEncoder.encode(member_pwd);
					member.setMember_pwd(bCryptString);
				}
				// 비밀번호 변경
				memberDao.update_pw(member);
				String member_email1 = member.getMember_email();
//				String manager_pwd = manager.getManager_pwd();
				// 비밀번호 변경 메일 발송
				System.out.println("member_email" + member_email1);
				 sservice.mailsendService(member_email1, "비밀번호입니다.", "새로운비밀번호입니다. " + member_pwd);
				out.print("이메일로 임시 비밀번호를 발송하였습니다.");
				out.close();
			}
		}
	
//	@Override
//	public int deletemodify(String id) {
//		// TODO Auto-generated method stub
//		return memberDao.delete(id);
//	}
	

//	@Override
//	public boolean findService(Member member) {
//		return memberDao.find(member);
//	}
//
//	@Override
//	public boolean confirmService(Member member) {
//		return memberDao.confirm(member);
//	}
}