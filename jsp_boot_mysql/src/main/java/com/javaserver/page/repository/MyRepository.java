package com.javaserver.page.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaserver.page.entity.Worker;

public interface MyRepository extends JpaRepository<Worker, Long>{

}
