package com.ktdsInstructor.room.web;

import org.springframework.stereotype.Controller;

import com.ktdsInstructor.room.service.impl.SeatServiceImpl;

@Controller
public class SeatController {

	private SeatServiceImpl seatService;

	public void setSeatService(SeatServiceImpl seatService) {
		this.seatService = seatService;
	}

}
