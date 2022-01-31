package com.proyect.User.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.proyect.User.security.JWTAuthorizationFilter;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable()
			.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)//añadimos un filtro para insterseptar las peticiones
			.authorizeRequests()
			// cambiar permisos 
			.antMatchers(HttpMethod.POST, "/user").anonymous()
			.antMatchers(HttpMethod.POST, "/user/add").anonymous()
			.antMatchers(HttpMethod.POST, "/user/login").permitAll()
			.anyRequest().authenticated();
			
	}
}
