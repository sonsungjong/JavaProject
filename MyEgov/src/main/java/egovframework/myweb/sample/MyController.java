package egovframework.myweb.sample;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping(value="/index.do")
	public String home(Model model) {
		model.addAttribute("gugu1","구구단");
		return "index";
	}
	
	@RequestMapping(value="gugu.do")
	public String gugu_result(int num, Model model) {
		String result = "";
//		for(int i=1;i<10;i++) {
//			result += num+"x"+i+"="+num*i+"<br>";
//		}
		for(int i=2;i<10;i++) {
			if(num != i) {
				continue;
			}
			for(int j=1;j<10;j++) {
				result += i+"x"+j+"="+i*j+"<br>";
			}
			result += "<br>";
		}
		model.addAttribute("result", result);
		return "sample/result";
	}
	
}
