package com.javaserver.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JspBootController {
	
	@GetMapping("/")
	public String mainPage(Model model) {
		System.out.println("메인 페이지로 이동합니다.");
		String goHtml = "HTML 또는 JSP 로 문자열을 보냅니다";
		model.addAttribute("m1", goHtml);			// ${m1}
		return "main";			// main.jsp
	}
	
	@GetMapping("/next")
	public String nextPage(Model model, @RequestParam("input_name") String inputName) {
		System.out.println("next페이지로 이동");
		String next = "입력하여 다음 페이지로 이동하였습니다.";
		model.addAttribute("m2", next);				// ${m2}
		model.addAttribute("m3", inputName);
		return "next";				// next.jsp
	}
}
