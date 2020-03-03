package com.web_dev_494.uGraduate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String searchStudent(Model model){

        return "search-student-page";
    }

    @RequestMapping("/searchResults")
    public String searchResults(@RequestParam("searchValue") String searchValue, Model model){
        System.out.println("Search Value: " + searchValue);



        return "search-student-page";
    }

}
