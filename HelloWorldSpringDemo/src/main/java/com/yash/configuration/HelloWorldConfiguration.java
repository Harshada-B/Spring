package com.yash.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration//tells that this bean class is canfiguration class
@EnableWebMvc
@ComponentScan(basePackages="com.yash.controller")//package to scan for annotation component
public class HelloWorldConfiguration {
	@Bean
	public ViewResolver viewResolver(){
	InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
	viewResolver.setViewClass(JstlView.class);
	viewResolver.setPrefix("/WEB-INF/view/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
	}
}
