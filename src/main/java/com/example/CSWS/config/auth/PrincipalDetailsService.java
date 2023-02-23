package com.example.CSWS.config.auth;

import com.example.CSWS.entityAndDto.user.User;
import com.example.CSWS.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

// @Service
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService{

	private final UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("PrincipalDetailsService : 진입");
		User user = userRepository.findByUsername(username).stream().findFirst().orElse(null);	// Optional<Object> 를 Object 로 변경

		return new PrincipalDetails(user);	// 여기서 return 되면 session 에 들어감 -> 권한 관리를 위해서만 사용됨
	}
}
