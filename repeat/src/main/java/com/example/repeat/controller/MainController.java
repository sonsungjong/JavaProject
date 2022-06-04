package com.example.repeat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/")
	public String home(Model model) {
		String str = "Spring Boot";
		model.addAttribute("msg", str);
		return "index";
	}
	
	@GetMapping("/result")
	public String inputshow(Model model, @RequestParam("input-name") String name) {
		model.addAttribute("myText", name);
		return "result";
	}
}
