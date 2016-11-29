package com.ktdsInstructor.room.service.impl;

import com.ktdsInstructor.room.biz.RoomBiz;
import com.ktdsInstructor.room.service.RoomService;

public class RoomServiceImpl implements RoomService {

	private RoomBiz roomBiz;

	public void setRoomBiz(RoomBiz roomBiz) {
		this.roomBiz = roomBiz;
	}
	
	
}
