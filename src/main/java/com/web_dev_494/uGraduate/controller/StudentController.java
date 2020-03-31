package com.web_dev_494.uGraduate.controller;

import com.web_dev_494.uGraduate.entity.Section;
import com.web_dev_494.uGraduate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web_dev_494.uGraduate.entity.Student;
import com.web_dev_494.uGraduate.service.MajorService;
import com.web_dev_494.uGraduate.service.SectionService;
import com.web_dev_494.uGraduate.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	private StudentService studentService;
	private MajorService majorService;
	private SectionService sectionService;
	private Student student;


	@Autowired
	public StudentController(StudentService studentService, MajorService m, SectionService s){
		this.studentService = studentService;
		this.majorService = m;
		this.sectionService = s;
	}

	//student should be able to.. login
	//register
	//see what major they are in
	//see what classes they are enrolled in
	//see what classes they finished
	//see what classes they have left
	//register 
	  
	@RequestMapping("/home")
	public String home(HttpServletRequest http){

		return "student_mappings/studentHome";
	}

	@RequestMapping("/register")
	public String registerStudent(Model model, @ModelAttribute("student") Student student){
		  model.addAttribute(student);

		  return "register-student-page";
	}

	private int convertMajor(String name){
		switch (name) {
			case "Computer Science":
				return 1;
			case "Psychology":
				return 2;
			case "Industrial Design":
				return 3;
		case "Business":
				return 4;
			case "Economics":
				return 5;
		}
		return -1;
	}
	    
	@RequestMapping("/courselist")
	public String showCourses(Model model, @AuthenticationPrincipal User user){

		student = studentService.findByUsername(user.getUsername());
		model.addAttribute("student", student);

		List<Section> sections = sectionService.findByMajor(convertMajor(student.getMajor()));
		model.addAttribute("sections", sections);
		return "student_mappings/course-list";
	}

	@RequestMapping("/addSection")
	public String addSection(Model model, @AuthenticationPrincipal User user){
		student = studentService.findByUsername(user.getUsername());
		model.addAttribute(student);
		return "";
	}
}
