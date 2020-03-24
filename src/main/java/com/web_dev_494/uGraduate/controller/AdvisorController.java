package com.web_dev_494.uGraduate.controller;

import com.web_dev_494.uGraduate.entity.Major;
import com.web_dev_494.uGraduate.entity.Professor;
import com.web_dev_494.uGraduate.entity.Section;
import com.web_dev_494.uGraduate.entity.Student;
import com.web_dev_494.uGraduate.service.MajorService;
import com.web_dev_494.uGraduate.service.ProfessorService;
import com.web_dev_494.uGraduate.service.SectionService;
import com.web_dev_494.uGraduate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


// All endpoints starting with /advisor/**
// REMEMBER: Don't hardcode context path in the jsp files.. use ${pageContext.request.contextPath}
@Controller
@RequestMapping("/advisor")
public class AdvisorController {

    // Instances of the Service Class to run the HQL queries
    private StudentService studentService;
    private MajorService majorService;
    private ProfessorService professorService;
    private SectionService sectionService;

    // Constructor Injection
    @Autowired
    public AdvisorController(StudentService studentService, MajorService majorService,
                             ProfessorService professorService, SectionService sectionService){
        this.studentService = studentService;
        this.majorService = majorService;
        this.professorService = professorService;
        this.sectionService = sectionService;
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

    @RequestMapping("/testQueries")
    public String testQ(Model model){

        // Saves a new Major!
        /*
        Major major = new Major(0, "Underwater Basket Weaving");
        majorService.save(major);
        */

        // Finds a list of Majors
        /*
        List<Major> majors = majorService.findAll();
        model.addAttribute("majors", majors);
        */

        //Major major = majorService.findById(1);
        //model.addAttribute("majors", major);

        /*

        // Joining works now!

        Professor testProf = new Professor(0, "Mike");
        professorService.saveProfessor(testProf);

        Section testSection = new Section("CS 107");
        testProf.add(testSection);
        sectionService.addSection(testSection);

        */

        Professor tmpProf = professorService.findById(2);
        System.out.println(tmpProf.getName());
        System.out.println(tmpProf.getSections());

        return "test/test";
    }


    @RequestMapping("/XSSExample")
    public String xss(){
        return "xss";
    }

    @RequestMapping("/XSSExample-next")
    public String xssNext(@RequestParam("inputValue") String input, Model model){

        model.addAttribute("input", input);
        return "xss-next";
    }

}
