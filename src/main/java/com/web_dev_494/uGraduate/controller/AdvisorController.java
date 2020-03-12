package com.web_dev_494.uGraduate.controller;

import com.web_dev_494.uGraduate.dao.StudentDAO;
import com.web_dev_494.uGraduate.entity.Student;
import com.web_dev_494.uGraduate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// TODO: fix the mappings to add student, find student by id, etc

@Controller
@RequestMapping("/advisor")
public class AdvisorController {

    private StudentService studentService;

    @Autowired
    public AdvisorController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping("/login")
    public String home(){
        return "admin-homepage";
    }

    @RequestMapping("/searchStudent")
    public String searchStudent(Model model){
        return "search-student-page";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Model model){
        Student student = new Student();
        model.addAttribute(student);
        return "add-student-page";
    }

    @PostMapping("/addedStudent")
    public String addStudent(@ModelAttribute("student") Student student){

        student.setId(0);
        studentService.save(student);
        return "add-results-page";
    }

    //---------------------------------------------------------------

    @RequestMapping("/students")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @RequestMapping("/studentById")
    public String getStudent(@RequestParam("studentId") int studentId, Model model){

        Student student = studentService.findById(studentId);
        if(student == null){
            throw new RuntimeException("Student not found - " + studentId);
        }
        model.addAttribute("student", student);
        return "search-results-page-id";
    }

    @RequestMapping("/studentAll")
    public Student addStudentAction(@ModelAttribute("newStudent") Student student){
        studentService.save(student);
        return student;
    }
}
