package com.peazh.pro1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
	
	// 처음 로딩했을 때 나올 화면 : index.jsp
	@GetMapping(value = { "/", "/index"} )
	public String index() {
		return "index"; // 데이터 붙임 없이 index.jsp 페이지만 보여줌
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/ourstory")
	public String ourstory() {
		return "ourstory";
	}
	
	@GetMapping("/notice")
	public String notice() {
		return "notice";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
}
