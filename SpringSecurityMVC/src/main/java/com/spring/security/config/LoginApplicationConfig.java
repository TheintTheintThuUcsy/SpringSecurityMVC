package com.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/** 
  * Code Explaination
  * 1.@EnableWebMvc is used to enable Spring MVC Application Features
  * 2.@ComponentScan is equled to "<content:component-scan>" in Spring XML configuration
  * 3.@Import is used to import the Spring Security Configuration Class into the class.
  * **/
@EnableWebMvc
@Configuration
@ComponentScan({"com.spring.*"})
@Import(value = {LoginSecurityConfig.class})
public class LoginApplicationConfig {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
