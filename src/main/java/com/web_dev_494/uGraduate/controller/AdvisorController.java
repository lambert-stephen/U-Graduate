package com.web_dev_494.uGraduate.controller;

import com.web_dev_494.uGraduate.entity.Student;
import com.web_dev_494.uGraduate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
@RequestMapping("/advisor")
public class AdvisorController {

    private StudentService studentService;

    @Autowired
    public AdvisorController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping("/home")
    public String home(){
        return "advisor_mappings/admin-homepage";
    }

    @RequestMapping("/searchStudent")
    public String searchStudent(Model model){
        return "advisor_mappings/search-student-page";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Model model){
        Student student = new Student();
        model.addAttribute(student);
        return "advisor_mappings/add-student-page";
    }

    @PostMapping("/addedStudent")
    public String addStudent(@ModelAttribute("student") Student student){

        student.setId(0);
        studentService.save(student);
        return "advisor_mappings/add-results-page";
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
        return "advisor_mappings/search-results-page-id";
    }

    @RequestMapping("/studentByName")
    public String getStudentName(@RequestParam("studentName") String studentName, Model model){

        List<Student> students = studentService.findByName(studentName);
        model.addAttribute("students", students);

        return "advisor_mappings/search-results-page";
    }

}
