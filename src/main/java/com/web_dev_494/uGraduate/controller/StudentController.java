package com.web_dev_494.uGraduate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web_dev_494.uGraduate.entity.Student;
import com.web_dev_494.uGraduate.service.MajorService;
import com.web_dev_494.uGraduate.service.SectionService;
import com.web_dev_494.uGraduate.service.StudentService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	private StudentService studentService;
	private MajorService majorService;
	private SectionService sectionService;


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
	  
	@RequestMapping("/home")
	public String home(HttpServletRequest http){

		return "student_mappings/studentHome";
	}

	@RequestMapping("/register")
	public String registerStudent(Model model, @ModelAttribute("student") Student student){
		  model.addAttribute(student);
		  return "register-student-page";
	}
	    
	    
	    


}
