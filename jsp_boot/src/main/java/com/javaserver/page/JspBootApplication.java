package com.javaserver.page;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JspBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspBootApplication.class, args);
		System.out.println("SpringBoot JSP 사용");
	}

}
