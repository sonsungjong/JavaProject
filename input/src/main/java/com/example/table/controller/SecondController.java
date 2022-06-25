package com.example.table.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecondController {
	@PostMapping("/plus")
	public String plusFunc(Model model, @RequestParam("first_num") String num1, @RequestParam("second_num") String num2) {
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);
		model.addAttribute("send_result",result);
		return "oper/result";
	}
	
	@PostMapping("/minus")
	public String minusFunc(Model model, @RequestParam("first_num") String num1, @RequestParam("second_num") String num2) {
		int result = Integer.parseInt(num1) - Integer.parseInt(num2);
		model.addAttribute("send_result",result);
		return "oper/result";
	}
	
	@PostMapping("/multiplication")
	public String mulFunc(Model model, @RequestParam("first_num") String num1, @RequestParam("second_num") String num2) {
		int result = Integer.parseInt(num1) * Integer.parseInt(num2);
		model.addAttribute("send_result",result);
		return "oper/result";
	}
	
	@PostMapping("/division")
	public String divFunc(Model model, @RequestParam("first_num") String num1, @RequestParam("second_num") String num2) {
		int result = Integer.parseInt(num1) / Integer.parseInt(num2);
		model.addAttribute("send_result",result);
		return "oper/result";
	}
	
	@GetMapping("/before")				// localhost:8080/back
	public String backfunc() {
		//return "oper/double_input";
		return "redirect:/oper";
	}
}
