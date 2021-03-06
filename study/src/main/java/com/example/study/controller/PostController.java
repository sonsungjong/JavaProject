package com.example.study.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.model.SearchParam;

// PostController은 주로 사용자 입력에 따른 동작을 처리할 때 사용 (Form, 검색)

@RestController
public class PostController {
	
	// @RequestMapping(method=RequestMethod.POST, path="/postMethod")
	@PostMapping("/postMethod")
	public SearchParam postMethod(@RequestBody SearchParam searchParam) {
		
		return searchParam;
	}
	
}
