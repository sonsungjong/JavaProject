package com.example.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.model.SearchParam;

@RestController
public class GetController {
	
	@RequestMapping("/getMethod")
	public String getRequest() {
		// http://localhost:8080/getMethod
		return "Hi getMethod";
	}
	
	// @RequestMapping(method=RequestMethod.GET, path="/postMethod")
	@GetMapping("/getParameter")
	public String getParameter(@RequestParam String id, @RequestParam String password) {
		// http://localhost:8080/getParameter?id=1234&password=yyyymmdd
		System.out.println("id : "+id);
		System.out.println("password"+password);
		
		return id+password;
	}
	
	@GetMapping("/getMultiParameter")
	public String getMultiParameter(SearchParam searchParam) {
		// http://localhost:8080/getMultiParameter?account=abcd&email=study@gmail.com&page=10
		System.out.println(searchParam.getAccount());
		System.out.println(searchParam.getEmail());
		System.out.println(searchParam.getPage());
		
		return "OK";
	}
	
	@GetMapping("/getMultiParameter2")
	public SearchParam getMultiParameter2(SearchParam searchParam) {
		// http://localhost:8080/getMultiParameter2?account=abcd&email=study@gmail.com&page=10
		System.out.println(searchParam.getAccount());
		System.out.println(searchParam.getEmail());
		System.out.println(searchParam.getPage());
		
		// {"account":"", "email":"", "page":0}
		return searchParam;				// 객체를 리턴하면 json형태로 반환
	}
}
	