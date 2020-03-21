package com.web_dev_494.uGraduate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoggoutController {

    // TODO: Send/read cookies for authentication

    @RequestMapping("/")
    public String homePage1(){
        return "uGraduate";
    }

    @RequestMapping("/home")
    public String homePage2(){
        return "uGraduate";
    }



}
