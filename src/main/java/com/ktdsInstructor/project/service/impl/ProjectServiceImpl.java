package com.ktdsInstructor.project.service.impl;

import com.ktdsInstructor.project.biz.ProjectBiz;
import com.ktdsInstructor.project.service.ProjectService;

public class ProjectServiceImpl implements ProjectService{

	private ProjectBiz projectBiz;
	
	public void setProjectBiz(ProjectBiz projectBiz) {
		this.projectBiz = projectBiz;
	}
	
}
