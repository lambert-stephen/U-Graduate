package com.web_dev_494.uGraduate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/advisor")
@Controller
public class AdvisorController {

    @RequestMapping("/login")
    public String home(){
        return "admin-homepage";
    }

    @RequestMapping("/addStudent")
    public String addStudent(){

        return "add-student-page";
    }

    @RequestMapping("/searchStudent")
    public String searchStudent(){

        return "search-student-page";
    }


}
