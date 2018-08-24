package com.khd.jejulantis.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.khd.jejulantis.admin.manager.Service.ManagerService;
import com.khd.jejulantis.client.member.Service.MemberService;
import com.khd.jejulantis.model.Manager;
import com.khd.jejulantis.model.Member;

public class memberSecurityService implements UserDetailsService{
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	@Autowired
	MemberService memberService;
	private Manager member;
	
	@Override
	public UserDetails loadUserByUsername(String member_id) throws UsernameNotFoundException {

		Member member = memberService.memgetUsersByID(member_id);
	     System.out.println("id: "+member_id);
		if (member == null) {
			System.out.println("id1: "+member_id);
		         throw new UsernameNotFoundException("No user found with username" + member.getMember_id());
		}	 
		Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		System.out.println("id2: "+member_id);
	     roles.add(new SimpleGrantedAuthority("ROLE_USER"));	
	     System.out.println("id3: "+member_id);
	    UserDetails user = new User(member_id,member.getMember_pwd(), roles);
	    System.out.println("id4: "+member_id);
           return user;
	}

}
//public class SecurityService implements AuthenticationProvider {
//    @Autowired
//    ManagerService managerService;
//    
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//          
//      String user_id = (String)authentication.getPrincipal(); //아이디 받기
//      String user_pw = (String)authentication.getCredentials(); //비밀번호 받기
//          
//      UserDetail UserDetail = new UserDetail(); //
//       
//        /*
//        *     DB작업 및 로그인과 관련된 처리를 한다.
//        *     만약 <form-login>의 default=target-url 속성에 보내고싶은 값이 있을 때는
//        *     CustomUserDetail에 세팅을하고 아래에서 CustomUserDetail의 객체를 set해준다.
//        */       
//
//
//      //권한 설정하기 해당 사항에 맞는 권한을 선택하여 이용한다.
//      List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
//    if(false){ 
//     
//      roles.add(new SimpleGrantedAuthority("IS_AUTHENTICATED_ANONYMOUSLY"));
//
//      } else if(true ){
//    
//      roles.add(new SimpleGrantedAuthority("ROLE_USER"));
//
//      }
//        
//      //아이디, 비밀번호, 권한, customUserDetail 값 세팅
//      UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(user_id, user_pw, roles);
//      result.setDetails(UserDetail);
//          
//      return result;
//    }
//    @Override
//    public boolean supports(Class<?> authentication) {
//          return authentication.equals(UsernamePasswordAuthenticationToken.class);
//    }
//}
