package com.peazh.pro1;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

// 저 괄호 안에 없으면 boardservice라는 타입을 가지는데 저렇게 적어주면
// 서비스의 이름을 지정해줌(이름 : boardSerivce) 저 이름으로 불릴거야~
@Service("boardService")
public class BoardService {
	
	@Inject
	@Named("boardDAO")
	private BoardDAO boardDAO;
	
	// 보드 리스트 불러오는 메서드
	public List<Map<String, Object>> boardList(){
		return boardDAO.boardList();
	}
	
	public BoardDTO detail(String bno) {
		return boardDAO.detail(bno);
	}

}
