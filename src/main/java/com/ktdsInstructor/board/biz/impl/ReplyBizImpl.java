package com.ktdsInstructor.board.biz.impl;

import com.ktdsInstructor.board.biz.ReplyBiz;
import com.ktdsInstructor.board.dao.ReplyDao;

public class ReplyBizImpl implements ReplyBiz {

	private ReplyDao replyDao;
	
	public void setReplyDao(ReplyDao replyDao) {
		this.replyDao = replyDao;
	}
	
}
