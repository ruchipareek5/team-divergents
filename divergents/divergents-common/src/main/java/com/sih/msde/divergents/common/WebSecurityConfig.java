package com.sih.msde.divergents.common;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.web.csrf.CookieCsrfTokenRepository;



	@Configuration
	@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
	public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//		@Override
//		protected void configure(HttpSecurity http) throws Exception {
//			// @formatter:off
//			http
//					.httpBasic().and()
//					.authorizeRequests()
//					.antMatchers("/index.html","/chart","/chart.html","/partials/home-carousel.html", "/viewQpPage.html","/","/csrFundingPublicUser.html","/tendersRfpsPublicUser.html","/findTrainingCenter.html","/webinarsPublicUser.html", "/skillGapStudyPublicUser.html","/reportIssue.html", "/login.html","/loginUrl","/skillIndiaSignup").permitAll()
//					.anyRequest().authenticated()
//					.and()
//					.csrf()
//					.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//							.and()
//						    .logout();
//			// @formatter:on
//		}
		 @Override
		    protected void configure(HttpSecurity http) throws Exception {
		     http.csrf().disable();   
			 http.authorizeRequests().anyRequest().permitAll();
		    }
		
	}


