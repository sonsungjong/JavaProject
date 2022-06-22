package com.example.table;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class InputApplication {

	public static void main(String[] args) {
		SpringApplication.run(InputApplication.class, args);
		System.out.println("실행 완료");
	}

}
