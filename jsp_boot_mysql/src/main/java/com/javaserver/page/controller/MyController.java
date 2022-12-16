package com.javaserver.page.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.javaserver.page.entity.Worker;
import com.javaserver.page.service.MyService;

@Controller
public class MyController {
	
	private MyService myService;
	
	public MyController(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@GetMapping("/")
	public String mainPage(Model model) {
		model.addAttribute("workers", myService.getAllRows());
		return "main";
		//return findPaginated(1, model);
	}
	
	@GetMapping("/new")
	public String createUser(Model model) {
		Worker worker = new Worker();
		model.addAttribute("worker", worker);
		return "create_user";
	}
	
	@PostMapping("/")
	public String saveUser(@ModelAttribute Worker worker) {
		myService.saveWorker(worker);
		return "redirect:/";			// GetMapping 의 / 로 되돌려보내기
	}
	
	@GetMapping("/edit/{id}")
	public String editUserForm(@PathVariable Long id, Model model) {
		model.addAttribute("worker", myService.getWorkerById(id));
		return "edit_user";
	}
	
	@PostMapping("/{id}")
	public String updateUser(@PathVariable Long id, @ModelAttribute("worker") Worker worker, Model model) {
		// 아이디로 데이터베이스에서 가져오기
		Worker existing = myService.getWorkerById(id);
		existing.setId(id);
		existing.setName(worker.getName());
		existing.setGender(worker.getGender());
		existing.setPhone(worker.getPhone());
		existing.setEmail(worker.getEmail());
		
		// 객체 업데이트
		myService.updateWorker(existing);
		return "redirect:/";
	}
	
	@GetMapping("/{id}")
	public String deleteUser(@PathVariable Long id) {
		myService.deleteWorkerById(id);
		return "redirect:/";
	}
	
//	@GetMapping("/page/{pageNo}")
//	public String findPaginated(@PathVariable (value="pageNo") int pageNo, Model model) {
//		int pageSize = 5;			// 한 페이지에 보여줄 갯수
//		Page<Worker> page = myService.findPaginated(pageNo, pageSize);
//		List<Worker> listWorkers = page.getContent();
//		
//		model.addAttribute("currentPage", pageNo);
//		model.addAttribute("totalPages", page.getTotalPages());
//		model.addAttribute("totalElements", page.getTotalElements());
//		model.addAttribute("workers", listWorkers);
//		return "main";
//	}
}


