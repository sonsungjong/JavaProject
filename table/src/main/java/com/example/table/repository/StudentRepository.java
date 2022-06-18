package com.example.table.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.table.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
