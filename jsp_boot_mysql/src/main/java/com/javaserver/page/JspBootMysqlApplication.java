package com.javaserver.page;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JspBootMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspBootMysqlApplication.class, args);
		System.out.println("게시판 SpringBoot + JSP + MySQL + JPA");
	}

}
