package com.ktdsInstructor.room.biz.impl;

import com.ktdsInstructor.room.biz.RoomBiz;
import com.ktdsInstructor.room.dao.RoomDao;

public class RoomBizImpl implements RoomBiz {

	private RoomDao roomDao;

	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

}
