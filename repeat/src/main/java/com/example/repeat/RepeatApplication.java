package com.example.repeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class RepeatApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepeatApplication.class, args);
		System.out.println("repeat 실행!");
	}

}
