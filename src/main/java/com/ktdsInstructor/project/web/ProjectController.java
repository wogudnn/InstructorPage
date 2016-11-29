package com.ktdsInstructor.project.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ktdsInstructor.lecture.service.LectureService;
import com.ktdsInstructor.project.service.ProjectService;
import com.ktdsInstructor.user.service.UserService;

import lecture.schema.LecturesSchema;
import project.schema.TeamsSchema;

@Controller
public class ProjectController {

	private ProjectService projectService;
	private LectureService lectureService;
	private UserService userService;
	
	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}
	
	@RequestMapping("/instructor/addTeam")
	public ModelAndView viewAddTeamPage(){
		
		LecturesSchema lecture = lectureService.getLectureById("abcd");
		
		ModelAndView view = new ModelAndView();
		view.setViewName("/addTeam");
		view.addObject("users", lecture.getUser());
		return view;
	}
	
	@RequestMapping("/instructor/doAddTeam")
	public String doAddTeamAction(String teamName, String[] userId){
		TeamsSchema team = new TeamsSchema();
		team.setTeamName(teamName);
		team.setCreatedDate(new Date());
		
		
		return "redirect:/";
	}
	
	
	
}
