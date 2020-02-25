package com.web_dev_494.uGraduate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/everyone")
    public String homePage(){

        return "Everyone has access";
    }

    @GetMapping("/admin")
    public String adminHome(){
        return "Administrator access only";
    }

}
