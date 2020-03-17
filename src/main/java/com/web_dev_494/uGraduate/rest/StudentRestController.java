package com.web_dev_494.uGraduate.rest;

import com.web_dev_494.uGraduate.dao.StudentDAO;
import com.web_dev_494.uGraduate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private StudentDAO studentDAO;

    @Autowired
    public StudentRestController(StudentDAO studentDAO){
        this.studentDAO = studentDAO;
    }

    @GetMapping("/students")
    public List<Student> findAll(){
        return studentDAO.findAll();
    }

    @PostMapping("/students")
    public Student addStudent(@ModelAttribute("newStudent") Student student){
        student.setId(0);
        studentDAO.save(student);
        return student;
    }

}
