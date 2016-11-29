package com.ktdsInstructor.board.biz.impl;

import com.ktdsInstructor.board.biz.BoardBiz;
import com.ktdsInstructor.board.dao.BoardDao;

public class BoardBizImpl implements BoardBiz {

	private BoardDao boardDao;
	
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
}
