package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@GetMapping("/hello")				// http://localhost:8080/hello
	public String hello(@RequestParam(value="name", defaultValue="World", required = true) String name, Model model) {
		String myWord = "Son";
		model.addAttribute("name", name);			// ${name} 에 넘김
		model.addAttribute("var", myWord);				// ${var} 로 넘김
		return "hello";				// hello.jsp
	}
	
	@GetMapping("/")					// http://localhost:8080
	public String basic(Model model) {
		String str = "index 시작페이지";
		model.addAttribute("jstl",str);				// ${jstl}
		return "index";					// index.jsp
	}
	
	@GetMapping("/result")
	public String result(HttpServletRequest httpServletRequest, Model model) {
		String input1 = httpServletRequest.getParameter("input1");
		model.addAttribute("send1", input1);
		return "result";
	}
}
