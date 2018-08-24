package com.khd.jejulantis.admin.manager.Service;

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

import com.khd.jejulantis.admin.manager.DAO.ManagerDao;
import com.khd.jejulantis.admin.sms.Service.SmsService;
import com.khd.jejulantis.model.Branch;
import com.khd.jejulantis.model.Manager;
import com.khd.jejulantis.model.Member;

@Service
public class ManagerServiceImpl implements ManagerService {
	@Autowired
	private SmsService sservice;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	@Autowired
	ManagerDao managerDao; 
	
	@Override
	public boolean joinService(Manager manager) {		
		return managerDao.join(manager);
	}

	@Override
	public List<Branch> postService(String branch) {	 
		return managerDao.post(branch);
	}

	@Override
	public int idcheck(String manager_id) {
		return managerDao.idcheck(manager_id);
	}

	@Override
	public int emailcheck(String manager_email) {
		return managerDao.emailcheck(manager_email);
	}

	@Override
	public Manager loginCheck(Manager manager) {
		return managerDao.loginCheck(manager);
	}

	@Override
	public Manager mypageService(String manager_id) {		
		return managerDao.mypage(manager_id);
	}

	@Override
	public Manager modifyService(Manager manager) {
		// TODO Auto-generated method stub
		return managerDao.modify(manager);
	}

	@Override
	public int managerdeleteService(String manager_id) {
		return managerDao.managerdelete(manager_id);
	}

	@Override
	public String find_id(String manager_email) {
		return managerDao.managerfind_id(manager_email);
	}

	@Override
	public String find_pwd(String manager_id) {
		return managerDao.managerfind_pwd(manager_id);
	}

	@Override
	public Manager getUsersByID(String manager_id) {
		return managerDao.managergetUsersByID(manager_id);
		
	}

	@Override
	public Manager securityloginCheck(Manager manager) {
		return managerDao.managersecurityloginCheck(manager);
	}

	// 비밀번호 찾기
		@Override
		public void find_pw(HttpServletResponse response, Manager manager, @RequestParam("manager_id") String manager_id,  @RequestParam("manager_eamil") String manager_eamil,Model md) throws IOException {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
//			if(manager.check_id(member.getId()) == 0) {
//				out.print("아이디가 없습니다.");
//				out.close();
//			}
			if(idcheck(manager.getManager_id()) == 0) {
				out.print("아이디가 없습니다.");
				out.close();
			}
			if(emailcheck(manager.getManager_email()) == 0) {
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
				
				manager.setManager_pwd(pw);
				String manager_pwd = manager.getManager_pwd();
				if(StringUtils.hasText(manager_pwd)) {
					String bCryptString = passwordEncoder.encode(manager_pwd);
					manager.setManager_pwd(bCryptString);
				}
				// 비밀번호 변경
				managerDao.update_pw(manager);
				String manager_email = manager.getManager_email();
//				String manager_pwd = manager.getManager_pwd();
				// 비밀번호 변경 메일 발송
				System.out.println("manager_email" + manager_email);
				 sservice.mailsendService(manager_email, "비밀번호입니다.", "새로운비밀번호입니다. " + manager_pwd);
				out.print("이메일로 임시 비밀번호를 발송하였습니다.");
				out.close();
			}
		}

		@Override
		public void changePwd(Manager manager) {
			managerDao.change_pw(manager);		
		}

	
	
}
