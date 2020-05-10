package com.v.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication().withUser(users.username("volkan").password("volkan").roles("ADMIN"))
										.withUser(users.username("ali").password("ali").roles("PERSONEL"))
										.withUser(users.username("admin").password("admin").roles("ADMIN","PERSONEL"))
										.withUser(users.username("mehmet").password("mehmet").roles("PERSONEL"));
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		//http.authorizeRequests().anyRequest().authenticated();
		
		http.authorizeRequests()
		.antMatchers("/").authenticated()
		.antMatchers("/admin/**").hasRole("ADMIN")
		.antMatchers("/personel/**").hasAnyRole("ADMIN","PERSONEL");
		
		http.formLogin().loginPage("/loginform")
		.loginProcessingUrl("/authenticateTheUser")
		.permitAll();
		
		http.logout().permitAll();
		
		http.exceptionHandling().accessDeniedPage("/access-denied");
	}

}
