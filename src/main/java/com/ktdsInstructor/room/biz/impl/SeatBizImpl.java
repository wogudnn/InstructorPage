package com.ktdsInstructor.room.biz.impl;

import com.ktdsInstructor.room.biz.SeatBiz;
import com.ktdsInstructor.room.dao.SeatDao;

public class SeatBizImpl implements SeatBiz {

	private SeatDao seatDao;
	
	public void setSeatDao(SeatDao seatDao) {
		this.seatDao = seatDao;
	}
	
}
