package com.v.Config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	private DataSource loginDs;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(loginDs);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		//http.authorizeRequests().anyRequest().authenticated();
		
		http.authorizeRequests()
		.antMatchers("/").authenticated()
		.antMatchers("/admin/**").hasRole("ADMIN")
		.antMatchers("/personel/**").hasAnyRole("ADMIN","PERSONEL")
		.antMatchers("/users/**").hasRole("ADMIN");
		
		
		http.formLogin().loginPage("/loginform")
		.loginProcessingUrl("/authenticateTheUser")
		.permitAll();
		
		http.logout().permitAll();
		
		http.exceptionHandling().accessDeniedPage("/access-denied");
	}

}