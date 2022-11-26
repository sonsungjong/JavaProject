package com.example.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/")			// 주소창에 localhost:8080/ 입력하면
	public String indexPage() {
		return "index";			// index.html 파일을 열어라
	}
	
	@GetMapping("/oper")		// localhost:8080/oper
	public String oper(Model model, 
			@RequestParam("id") String id,
			@RequestParam("pw") String pw
			) {
		String msg = "";
		if (!(id.equals("hello"))) {
			msg = "일치하는 아이디가 없습니다.";
		}else if(!(pw.equals("world"))) {
			msg = "비밀번호가 일치하지 않습니다.";
		}else {
			msg = "로그인 성공!";
			model.addAttribute("result",msg);
			return "oper2";			// oper2.html 열어라
		}
		model.addAttribute("result",msg);		// result라는 키워드로 화면에 보내기
		return "oper";			// oper.html 열어라
	}
	
}
