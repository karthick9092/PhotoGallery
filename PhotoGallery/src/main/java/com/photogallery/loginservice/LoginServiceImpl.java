package com.photogallery.loginservice;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class LoginServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String name)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println(name);
		return null;
	}

}
