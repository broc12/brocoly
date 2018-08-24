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
import com.khd.jejulantis.model.Manager;

public class managerSecurityService implements UserDetailsService{

	@Autowired
	ManagerService managerService;
	private Manager manager;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	@Override
	public UserDetails loadUserByUsername(String manager_id) throws UsernameNotFoundException {

		Manager manager = managerService.getUsersByID(manager_id);
	     System.out.println("id: "+manager_id);
		if (manager == null) {
			System.out.println("id1: "+manager_id);
		         throw new UsernameNotFoundException("No user found with username" + manager.getManager_id());
		}	 
		Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		System.out.println("id2: "+manager_id);
	     roles.add(new SimpleGrantedAuthority("ROLE_ADMIN"));	
	     System.out.println("id3: "+manager_id);
	    UserDetails user = new User(manager_id,manager.getManager_pwd() , roles);
	    System.out.println("id4: "+manager_id);
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
