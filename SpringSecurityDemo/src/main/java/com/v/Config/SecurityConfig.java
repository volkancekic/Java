package com.v.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		UserBuilder users=User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
		.withUser(users.username("volkan").password("volkan").roles("ADMIN"))
		.withUser(users.username("ali").password("ali").roles("PERSONEL"))
		.withUser(users.username("mehmet").password("mehmet").roles("PERSONEL"));
		
		
		
		// TODO Auto-generated method stub
		//super.configure(auth);
	}

}
