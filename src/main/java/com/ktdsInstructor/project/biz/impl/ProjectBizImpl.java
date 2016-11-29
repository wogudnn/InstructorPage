package com.ktdsInstructor.project.biz.impl;

import com.ktdsInstructor.project.biz.ProjectBiz;
import com.ktdsInstructor.project.dao.ProjectDao;

public class ProjectBizImpl implements ProjectBiz {

	private ProjectDao projectDao;
	
	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}
	
}
