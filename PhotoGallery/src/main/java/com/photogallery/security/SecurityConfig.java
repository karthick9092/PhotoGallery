package com.photogallery.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import com.photogallery.loginservice.LoginServiceImpl;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	AuthSuccess authSuccess;
	
	@Autowired
	AuthFailure authFailure;
	
	@Autowired
	EntryPointUnauthorizedHandler unauthorizedHandler;
	
	@Autowired
	LoginServiceImpl LoginService; 

	@Autowired
	public void configAuthBuilder (AuthenticationManagerBuilder builder) throws Exception {
			
		/*builder.inMemoryAuthentication().withUser("logesh").password("123456").roles("user");*/
		builder.userDetailsService(LoginService);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
			.csrf().disable().	
			/*.exceptionHandling().
				authenticationEntryPoint(unauthorizedHandler).
			and().*/
			formLogin().
				successHandler(authSuccess).
				failureHandler(authFailure).	
			and().
			/*	authorizeRequests().
					antMatchers("/login.html")
					.permitAll().
			and().
				authorizeRequests().
					antMatchers("/basic-web-app/login")
					.permitAll().
			and().
				authorizeRequests().
					antMatchers("/angularjs/**").
					permitAll().
			and().
				authorizeRequests().
				antMatchers("/bootstrap/**").
				permitAll().
			and().
				authorizeRequests().
				antMatchers("/js/**").
				permitAll().
			 and().*/
				authorizeRequests()					
					.antMatchers("/**")
						.permitAll();
	}
}
