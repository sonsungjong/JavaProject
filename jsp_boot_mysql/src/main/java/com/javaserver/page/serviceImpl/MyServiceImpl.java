package com.javaserver.page.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.javaserver.page.entity.Worker;
import com.javaserver.page.repository.MyRepository;
import com.javaserver.page.service.MyService;

@Service
public class MyServiceImpl implements MyService{

	@Autowired
	private MyRepository myRepository;

	public MyServiceImpl(MyRepository myRepository) {
		super();
		this.myRepository = myRepository;
	}

	@Override
	public List<Worker> getAllRows() {
		return myRepository.findAll();
	}

	@Override
	public Worker saveWorker(Worker worker) {
		return myRepository.save(worker);
	}

	@Override
	public Worker getWorkerById(Long id) {
		return myRepository.findById(id).get();
	}

	@Override
	public Worker updateWorker(Worker worker) {
		return myRepository.save(worker);
	}

	@Override
	public void deleteWorkerById(Long id) {
		myRepository.deleteById(id);
	}

	@Override
	public Page<Worker> findPaginated(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return myRepository.findAll(pageable);
	}
	
	
	
}
