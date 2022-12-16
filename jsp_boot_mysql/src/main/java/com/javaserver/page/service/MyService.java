package com.javaserver.page.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.javaserver.page.entity.Worker;

public interface MyService {
	List<Worker> getAllRows();
	
	Worker saveWorker(Worker worker);
	
	Worker getWorkerById(Long id);
	
	Worker updateWorker(Worker worker);
	
	void deleteWorkerById(Long id);
	
	Page<Worker> findPaginated(int pageNo, int pageSize);
}
