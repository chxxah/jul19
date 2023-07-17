package com.peazh.pro1;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	// Autowired(스프링에서 제공) 말고 Resource로 연결
	@Resource(name="boardService")
	private BoardService boardService;

	@GetMapping("/board")
	public String board(Model model) {
		// 서비스에서 값 가져오기 (가져오려면 연동해야 함)
		model.addAttribute("list", boardService.boardList());
		
		return "board";
	}
	
	//he
	// 파라미터로 들어오는 값 잡기
	@GetMapping("/detail")// model은 jsp에 값을 붙이기 위해서 넣었습니다.
	public String detail(HttpServletRequest request, Model model) {
		String bno = request.getParameter("bno");
		BoardDTO dto = boardService.detail(bno);
		model.addAttribute("dto", dto);
		
		return "detail";
	}
	
}
