package com.nanna.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfig {

	
	
	
	@Bean
	public UserDetailsService userDetailsService() {
		
		
		var uds = new InMemoryUserDetailsManager();
		var u1 = User.withUsername("nanna")
				.password("nanna32100")
				.authorities("read")
				.build();
		uds.createUser(u1);
		return uds ;
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() { 
		return  NoOpPasswordEncoder.getInstance();
	}
	
	
	
}
