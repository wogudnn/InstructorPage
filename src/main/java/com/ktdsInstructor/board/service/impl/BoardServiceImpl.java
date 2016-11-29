package com.ktdsInstructor.board.service.impl;

import com.ktdsInstructor.board.biz.BoardBiz;
import com.ktdsInstructor.board.service.BoardService;

public class BoardServiceImpl implements BoardService {

	private BoardBiz boardBiz;
	
	public void setBoardBiz(BoardBiz boardBiz) {
		this.boardBiz = boardBiz;
	}
	
}
