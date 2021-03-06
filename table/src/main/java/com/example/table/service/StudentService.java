package com.example.table.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.table.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
	
	Page<Student> findPaginated(int pageNo, int pageSize);
}
