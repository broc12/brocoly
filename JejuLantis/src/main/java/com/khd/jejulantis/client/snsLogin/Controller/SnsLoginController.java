package com.khd.jejulantis.client.snsLogin.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.google.api.Google;
import org.springframework.social.google.api.impl.GoogleTemplate;
import org.springframework.social.google.api.plus.Person;
import org.springframework.social.google.api.plus.PlusOperations;
import org.springframework.social.google.connect.GoogleConnectionFactory;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.oauth2.GrantType;
import org.springframework.social.oauth2.OAuth2Operations;
import org.springframework.social.oauth2.OAuth2Parameters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.khd.jejulantis.client.naverLogin.NaverLoginBO;
import com.khd.jejulantis.client.snsLogin.Service.SnsLoginService;
import com.khd.jejulantis.model.Member;


/**
 * Handles requests for the application home page.
 */

@Controller
public class SnsLoginController {
	private static final Logger logger = LoggerFactory.getLogger(SnsLoginController.class);
	/* GoogleLogin */
	@Autowired
	private GoogleConnectionFactory googleConnectionFactory;
	@Autowired
	private OAuth2Parameters googleOAuth2Parameters;
	/* NaverLoginBO */
	private NaverLoginBO naverLoginBO;
	private String apiResult = null;
	/* NaverLoginBO */
	private String FACEBOOK_CLIENT_ID= "661769470849271";
	private String FACEBOOK_CLIENT_SECRET_KEY = "28e620c9178f4dd6cba582567352f7aa";
	private String REDIRECT_URL="http://localhost:8080/jejulantis/facebookAccessToken.do";
	
	
	@Autowired
	SnsLoginService snsService;
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
		/*model.addAttribute("url", naverAuthUrl);*/

		/* 생성한 인증 URL을 View로 전달 */
		return "redirect:"+naverAuthUrl;
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
		 
		JSONObject jsonObject = (JSONObject) jsonParser.parse(apiResult);
		 
		JSONObject responseArray = (JSONObject) jsonObject.get("response");
 
		System.out.println("* BOOKS *");
		String id = (String)responseArray.get("id");
		String name = (String)responseArray.get("name");
		String email = (String)responseArray.get("email");
		String birthday = (String)responseArray.get("birthday");
		birthday = "1991/"+birthday;
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yy/MM/dd");
		snsLogin(id, "naver", name, email, birthday, session);
		return "rentcar/home";
	}
	

	@RequestMapping(value = "/googleLogin.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String googleLogin(Model model, HttpSession session) {

		OAuth2Operations oauthOperations = googleConnectionFactory.getOAuthOperations();
		String url = oauthOperations.buildAuthorizeUrl(GrantType.AUTHORIZATION_CODE, googleOAuth2Parameters);

		System.out.println("구글:" + url);

		model.addAttribute("google_url", url);

		return "redirect:"+url;
	}

	@RequestMapping(value = "/googleCallBack.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String googleCallback(Model model, @RequestParam String code, HttpSession session) throws IOException {
		System.out.println("여기는 googleCallback");
		boolean isInserted;

		OAuth2Operations oauthOperations = googleConnectionFactory.getOAuthOperations();
		AccessGrant accessGrant = oauthOperations.exchangeForAccess(code, googleOAuth2Parameters.getRedirectUri(), null); 
		String accessToken = accessGrant.getAccessToken(); 
		Long expireTime = accessGrant.getExpireTime();
		if (expireTime != null && expireTime < System.currentTimeMillis()) {
			accessToken = accessGrant.getRefreshToken();
			logger.info("accessToken is expired. refresh token = {}" , accessToken);
			
		}
		Connection<Google>connection = googleConnectionFactory.createConnection(accessGrant); 
		Google google = connection == null ? new GoogleTemplate(accessToken) : connection.getApi();
		PlusOperations plusOperations = google.plusOperations();
		Person person = plusOperations.getGoogleProfile();
		snsLogin(person.getId(), "google", person.getDisplayName(), null, null, session);
		Member member = snsService.checkMember(person.getId());
		
		return "rentcar/home";
	}
	@RequestMapping(value = "/facebookLogin.do")
	public String getfacebookSigninCode(HttpSession session) {
		logger.debug("facebookSignin");

		String facebookUrl = "https://www.facebook.com/v2.8/dialog/oauth?"+
						"client_id="+FACEBOOK_CLIENT_ID+
						"&redirect_uri=http://localhost:8080/jejulantis/facebookAccessToken.do"+
						"&scope=public_profile,email";

		return "redirect:"+facebookUrl;
	}	
	@RequestMapping(value = "/facebookAccessToken.do")
	public String getFacebookSignIn(String code, HttpSession session, String state) throws Exception {
		logger.debug("facebookAccessToken / code : "+code);
		String accessToken = requesFaceBooktAccesToken(session, code);
		JSONObject jsonObject = facebookUserDataLoadAndSave(accessToken, session);
		System.out.println("페북로그인 성공");
		snsLogin((String)jsonObject.get("id"), "facebook", (String)jsonObject.get("name"), (String)jsonObject.get("email"), null, session);
		return "rentcar/home";
		
	}
	private String requesFaceBooktAccesToken(HttpSession session, String code) throws Exception {
		String facebookUrl = "https://graph.facebook.com/v2.8/oauth/access_token?"+
						 	"client_id="+FACEBOOK_CLIENT_ID+
						 	"&redirect_uri="+REDIRECT_URL+
						 	"&client_secret="+FACEBOOK_CLIENT_SECRET_KEY+
						 	"&code="+code;
		System.out.println(facebookUrl);
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet getRequest = new HttpGet(facebookUrl);
		String rawJsonString = client.execute(getRequest, new BasicResponseHandler());
		logger.debug("facebookAccessToken / raw json : "+rawJsonString);
		System.out.println(rawJsonString);
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(rawJsonString);
		String faceBookAccessToken = (String) jsonObject.get("access_token");
		logger.debug("facebookAccessToken / accessToken : "+faceBookAccessToken);
		System.out.println(faceBookAccessToken);
		session.setAttribute("faceBookAccessToken", faceBookAccessToken);
		
		return faceBookAccessToken;
	}
	private JSONObject facebookUserDataLoadAndSave(String accessToken, HttpSession session) throws Exception {
	    String facebookUrl = "https://graph.facebook.com/me?"+
	            "access_token="+accessToken+
	            "&fields=id,name,email";

	    HttpClient client = HttpClientBuilder.create().build();
	    HttpGet getRequest = new HttpGet(facebookUrl);
	    String rawJsonString = client.execute(getRequest, new BasicResponseHandler());
	    logger.debug("facebookAccessToken / rawJson! : "+rawJsonString);

	    JSONParser jsonParser = new JSONParser();
	    JSONObject jsonObject = (JSONObject) jsonParser.parse(rawJsonString);
	    logger.debug("facebookUserDataLoadAndSave / raw json : "+jsonObject);
	    
	    return jsonObject;

		/* 가져온 데이터를 서비스에 맞춰 가공하는 로직*/
	}
	
	public String snsLogin(String id,String pwd, String name, String email, String birth, HttpSession session) {
		Member member = snsService.checkMember(id);
		boolean isInserted;
		if(member!=null) {
			System.out.println("id 있음 로그인하자");
			session.setAttribute("log", member);
			return "rentcar/home";
		}
		else {
			System.out.println("id 없음 회원가입하자");
			Member memberToJoin = new Member(0, id, null ,name, birth , "M", null, null, email ,"Y", "Y", null, "N", null);
			isInserted = snsService.joinMember(memberToJoin);
			System.out.println("회원가입 " + isInserted);
			if(isInserted) {
				session.setAttribute("log", memberToJoin);
				return "rentcar/home";
			}
		}return "rentcar/home";
	}
	
	@RequestMapping(value = "/kakaologin.do", method = RequestMethod.GET)
	public @ResponseBody String kakaologin(@RequestParam("token")String token,HttpSession session) {
		System.out.println(token);
		kakaouserme(token);
		return token;
	}
	
	public void kakaouserme(String token) {
		HttpURLConnection con = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			String apiURL = "https://kapi.kakao.com/v2/user/me";
			URL url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setUseCaches(false);
			con.setRequestMethod("GET");
			con.setRequestProperty("Authorization", "Bearer " + token);
			int responseCode = con.getResponseCode();
			if (responseCode == 200) { // 정상 호출
				isr = new InputStreamReader(con.getInputStream());
			} else { // 에러 발생
				isr = new InputStreamReader(con.getErrorStream());
			}
			br = new BufferedReader(isr);
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(br);
			System.out.println(jsonObj.toJSONString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(isr!=null)isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(con!=null)con.disconnect();
		}
	}
	
	@RequestMapping(value = "/kakaologout.do", method = RequestMethod.POST)
	public String kakaologout(@RequestParam("token")String token,HttpSession session) {
		System.out.println(token);
		kakaologout(token);
		return "redirect:/";
	}
	public void kakaologout(String token) {
		HttpURLConnection con = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			String apiURL = "https://kapi.kakao.com/v1/user/logout";
			URL url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setUseCaches(false);
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Bearer " + token);
			int responseCode = con.getResponseCode();
			if (responseCode == 200) { // 정상 호출
				isr = new InputStreamReader(con.getInputStream());
				System.out.println("200");
			} else { // 에러 발생
				isr = new InputStreamReader(con.getErrorStream());
				System.out.println("xxx");
			}
			br = new BufferedReader(isr);
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(br);
			System.out.println(jsonObj.toJSONString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(isr!=null)isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(con!=null)con.disconnect();
		}
	}
}


