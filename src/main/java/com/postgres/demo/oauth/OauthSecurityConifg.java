//package com.postgres.demo.oauth;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class OauthSecurityConifg extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//        .antMatcher("/**").authorizeRequests()
//        .antMatchers(new String[]{"/students/all", "/students/find/{id}"}).permitAll()
//        .anyRequest().authenticated()
//        .and()
//        .oauth2Login();
//	}
//	
//	
//
//}
