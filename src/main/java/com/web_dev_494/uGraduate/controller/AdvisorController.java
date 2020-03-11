package com.web_dev_494.uGraduate.controller;

import com.web_dev_494.uGraduate.dao.StudentDAO;
import com.web_dev_494.uGraduate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

// TODO: fix the mappings to add student, find student by id, etc

@Controller
@RequestMapping("/advisor")
public class AdvisorController {
    private StudentDAO studentDAO;

    @Autowired
    public AdvisorController(StudentDAO studentDAO){
        this.studentDAO = studentDAO;
    }

    @RequestMapping("/login")
    public String home(){
        return "admin-homepage";
    }

    @RequestMapping("/searchStudent")
    public String searchStudent(Model model){
        Integer student = new Integer(0);
        model.addAttribute(student);
        return "search-student-page";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Model model){
        Student student = new Student();
        model.addAttribute(student);
        return "add-student-page";
    }

    @PostMapping("/addedStudent")
    public Student addStudent(@ModelAttribute("student") Student student){

        student.setId(0);
        studentDAO.save(student);
        return student;
    }
/*

    @RequestMapping("/searchResults")
    public String searchResults(@RequestParam("searchValue") String searchValue, Model model){
        System.out.println("Search Value: " + searchValue);

        List<Student> students;

        students = studentDAO.findAll();

        model.addAttribute("students", students);
        return "search-results-page";
    }
*/

}
