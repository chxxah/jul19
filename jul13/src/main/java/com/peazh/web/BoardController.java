package com.peazh.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	//사용자가 board라고 호출하면 동작할 맵핑 메서드 생성
	@GetMapping("/board")
	public String board() {
		return "board"; //jsp 파일명
	}
}
