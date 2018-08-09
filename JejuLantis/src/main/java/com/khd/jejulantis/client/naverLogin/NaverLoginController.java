package com.khd.jejulantis.client.naverLogin;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.google.connect.GoogleConnectionFactory;
import org.springframework.social.oauth2.GrantType;
import org.springframework.social.oauth2.OAuth2Operations;
import org.springframework.social.oauth2.OAuth2Parameters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.khd.jejulantis.client.naverLogin.NaverLoginBO;
import com.khd.jejulantis.client.naverLogin.Service.NaverLoginService;
import com.khd.jejulantis.model.Member;

/**
 * Handles requests for the application home page.
 */
@Controller
public class NaverLoginController {

	/* NaverLoginBO */
	private NaverLoginBO naverLoginBO;
	private String apiResult = null;
	
	@Autowired
	NaverLoginService naverService;
	@Autowired
	private void setNaverLoginBO(NaverLoginBO naverLoginBO) {
		this.naverLoginBO = naverLoginBO;
	}

	//로그인 첫 화면 요청 메소드
	@RequestMapping(value = "/naverLogin.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String login(Model model, HttpSession session) {
		
		/* 네이버아이디로 인증 URL을 생성하기 위하여 naverLoginBO클래스의 getAuthorizationUrl메소드 호출 */
		String naverAuthUrl = naverLoginBO.getAuthorizationUrl(session);
		
		//https://nid.naver.com/oauth2.0/authorize?response_type=code&client_id=sE***************&
		//redirect_uri=http%3A%2F%2F211.63.89.90%3A8090%2Flogin_project%2Fcallback&state=e68c269c-5ba9-4c31-85da-54c16c658125
		System.out.println("네이버:" + naverAuthUrl);
		
		//네이버 
		model.addAttribute("url", naverAuthUrl);

		/* 생성한 인증 URL을 View로 전달 */
		return "rentcar/naverLogin/login";
	}

	//네이버 로그인 성공시 callback호출 메소드
	@RequestMapping(value = "/callBack.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String callback(Model model, @RequestParam String code, @RequestParam String state, HttpSession session, HttpServletResponse response)
			throws IOException, org.json.simple.parser.ParseException, ParseException {
		System.out.println("여기는 callback");
		OAuth2AccessToken oauthToken;
        oauthToken = naverLoginBO.getAccessToken(session, code, state);
        boolean isInserted;
        //로그인 사용자 정보를 읽어온다.
	    apiResult = naverLoginBO.getUserProfile(oauthToken);  //여기 사용자 정보가 들어있음, 이 정보로멤버가입시켜야함
		model.addAttribute("result", apiResult);			  //가입하고 자동 로그인, 나중에 또 왔을때 id 조회해서 있으면 바로 로그인
		System.out.println(apiResult.toString());

        JSONParser jsonParser = new JSONParser();
		 
		//JSON데이터를 넣어 JSON Object 로 만들어 준다.
		JSONObject jsonObject = (JSONObject) jsonParser.parse(apiResult);
		 
		//books의 배열을 추출
		JSONObject responseArray = (JSONObject) jsonObject.get("response");
 
		System.out.println("* BOOKS *");
		String id = (String)responseArray.get("id");
		String name = (String)responseArray.get("name");
		String email = (String)responseArray.get("email");
		String birthday = (String)responseArray.get("birthday");
		System.out.println("id 값은 " + id);
		System.out.println("name 값은 " + name);
		System.out.println("email 값은 " + email);
		System.out.println("birthday 값은 " + birthday);
		birthday = "1991/"+birthday;
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yy/MM/dd");
		Member member = naverService.checkMember(id);
		if(member!=null) {
			System.out.println("id 있음 로그인하자");
			member.setMember_id(member.getMember_name());
			session.setAttribute("log", member);
			return "rentcar/home";
		}
		else {
			System.out.println("id 없음 회원가입하자");
			Member memberToJoin = new Member(0, id, null, name, birthday, "M", "서울", "000000", email,"Y", "Y", null, "N", null);
			isInserted = naverService.joinMember(memberToJoin);
			System.out.println("회원가입 " + isInserted);
			memberToJoin.setMember_id(memberToJoin.getMember_name());
			if(isInserted) {
				session.setAttribute("log", memberToJoin);
				return "rentcar/home";
			}
		}
        /* 네이버 로그인 성공 페이지 View 호출 */
		return "rentcar/naverLogin/naverSuccess";
	}
}

