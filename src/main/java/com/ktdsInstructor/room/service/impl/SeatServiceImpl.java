package com.ktdsInstructor.room.service.impl;

import com.ktdsInstructor.room.biz.SeatBiz;
import com.ktdsInstructor.room.service.SeatService;

public class SeatServiceImpl implements SeatService {

	private SeatBiz seatBiz;
	
	public void setSeatBiz(SeatBiz seatBiz) {
		this.seatBiz = seatBiz;
	}
	
}
