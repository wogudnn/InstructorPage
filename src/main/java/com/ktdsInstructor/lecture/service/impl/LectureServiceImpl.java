package com.ktdsInstructor.lecture.service.impl;

import com.ktdsInstructor.lecture.biz.LectureBiz;
import com.ktdsInstructor.lecture.service.LectureService;

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
