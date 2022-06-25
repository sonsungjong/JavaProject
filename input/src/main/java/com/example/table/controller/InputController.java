package com.example.table.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {
	
	@GetMapping("/")					// localhost:8080/
	public String myfunc(Model model) {
		String my_str = "안녕하세요";
		model.addAttribute("sendText", my_str);
		return "index";					// index.html
	}
	
	@GetMapping("/result")				// localhost:8080/result
	public String inputfunc(Model model, @RequestParam("input-name") String name) {
		model.addAttribute("nextText", name);
		return "next";				// next.html
	}
	
	@GetMapping("/back")				// localhost:8080/back
	public String backfunc() {
		return "redirect:/";				// localhost:8080/
	}
	
	@GetMapping("/oper")
	public String operPage() {
		return "oper/double_input";
	}
}
