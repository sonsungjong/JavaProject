package com.example.table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.table.entity.Student;
import com.example.table.repository.StudentRepository;

@SpringBootApplication
public class TableApplication /* implements CommandLineRunner */{

	public static void main(String[] args) {
		SpringApplication.run(TableApplication.class, args);
		System.out.println("게시판 시작");
	}

//	@Autowired
//	private StudentRepository studentRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		Student student1 = new Student("Sungjong", "Son", "tbxmtbfm@naver.com1");
//		studentRepository.save(student1);
//				
//		Student student2 = new Student("Sample2", "Son", "tbxmtbfm@naver.com2");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Sample3", "Son", "tbxmtbfm@naver.com3");
//		studentRepository.save(student3);
//	}

}
