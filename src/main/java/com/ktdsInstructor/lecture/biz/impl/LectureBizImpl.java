package com.ktdsInstructor.lecture.biz.impl;

import com.ktdsInstructor.lecture.biz.LectureBiz;
import com.ktdsInstructor.lecture.dao.LectureDao;

public class LectureBizImpl implements LectureBiz {

	private LectureDao lectureDao;
	
	public void setLectureDao(LectureDao lectureDao) {
		this.lectureDao = lectureDao;
	}
	
}
