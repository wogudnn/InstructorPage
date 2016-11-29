package com.ktdsuniv.lecture.service.impl;

import com.ktdsuniv.lecture.biz.LectureBiz;
import com.ktdsuniv.lecture.service.LectureService;

import lecture.schema.LecturesSchema;

public class LectureServiceImpl implements LectureService {

	private LectureBiz lectureBiz;
	
	public void setLectureBiz(LectureBiz lectureBiz) {
		this.lectureBiz = lectureBiz;
	}

	@Override
	public LecturesSchema getLectureById(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
