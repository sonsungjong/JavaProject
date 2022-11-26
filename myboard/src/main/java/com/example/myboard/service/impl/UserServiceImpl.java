package com.example.myboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.myboard.model.User;
import com.example.myboard.repository.UserRepository;
import com.example.myboard.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository user;
	
	public UserServiceImpl(UserRepository user) {
		super();
		this.user = user;
	}

	// 전체 보여주기
	public List<User> getAllUser() {
		return user.findAll();			// 상속받은 인터페이스의 함수를 오버라이딩
	}

	public User getUserById(Long id) {
		return user.findById(id).get();
	}

	public User saveUser(User user) {			// 새로 저장하기
		return this.user.save(user);
	}

	public User updateUser(User user) {			// 변경하기
		return this.user.save(user);
	}

	public void deleteUserById(Long id) {
		user.deleteById(id);
	}
	
	public Page<User> findPaginated(int no, int totalNo) {
		Pageable pageable = PageRequest.of(no-1, totalNo);			// -1해주는 이유 : 1페이지는 0번방에
		return user.findAll(pageable);
	}	
}



