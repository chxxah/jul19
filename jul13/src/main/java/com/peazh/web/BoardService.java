package com.peazh.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 비즈니스 로직 담당
// 컨트롤러랑 연결하기

@Service
public class BoardService {
	
	//DAO와 연결하기
	@Autowired
	private BoardDAO boardDAO;
	
	public List<BoardDTO> boardList() {
		return boardDAO.boardList();
	}

}
