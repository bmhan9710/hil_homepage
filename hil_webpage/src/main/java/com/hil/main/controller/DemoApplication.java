package com.hil.main.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication  // 외장 Tomcat으로 서비스하기 위해 SpringBootServletInitializer 상속 필요하다.
public class DemoApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}