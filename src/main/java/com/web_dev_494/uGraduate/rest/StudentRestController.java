package com.web_dev_494.uGraduate.rest;

import com.web_dev_494.uGraduate.dao.StudentDAO;
import com.web_dev_494.uGraduate.entity.Student;
import com.web_dev_494.uGraduate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private StudentService studentService;

    @Autowired
    public StudentRestController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/student")
    public Student getStudent(@RequestParam("studentId") int studentId){

        Student student = studentService.findById(studentId);
        if(student == null){
            throw new RuntimeException("Student not found - " + studentId);
        }
        return student;
    }

    @PostMapping("/students")
    public Student addStudent(@ModelAttribute("newStudent") Student student){
        studentService.save(student);
        return student;
    }

}
