package com.peazh.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
	// 서비스와 연결하기
	// 보드서비스의 객체가 boardService안으로 들어감
	@Autowired
	private BoardService boardService;
	
	//사용자가 board라고 호출하면 동작할 맵핑 메서드 생성
	@GetMapping("/board")
	public ModelAndView board() {
		
		ModelAndView mv = new ModelAndView("board"); //jsp 파일명
		
		// 서비스 일 시키기
		List<BoardDTO> list = boardService.boardList();
		
		mv.addObject("list", list);
		
		return mv; 
	}
	
	
	@GetMapping("/board2")
	public String board2(Model model) {
		model.addAttribute("name", "채여름");
		
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		for (int i = 1; i < 11; i++) {
			BoardDTO dto = new BoardDTO(i, "제목입니다", "채여름", "2023-07-13", i);
			list.add(dto);
		}
		
		
		model.addAttribute("list", list);
		
		
		return "board2";
	}
	
	
	
	
	
	
	
}
