package com.ktdsInstructor.board.service.impl;

import com.ktdsInstructor.board.biz.ReplyBiz;
import com.ktdsInstructor.board.service.ReplyService;

public class ReplyServiceImpl implements ReplyService {

	private ReplyBiz replyBiz;
	
	public void setReplyBiz(ReplyBiz replyBiz) {
		this.replyBiz = replyBiz;
	}
	
}
