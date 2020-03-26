package com.web_dev_494.uGraduate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

// Use this to determine which route the user goes into (Rather than having separate login screens)

@Controller
public class DefaultController {

    // See UGraduateApplication for defaultsuccessurl
    @RequestMapping("/loginSuccess")
    public String loginRoute(HttpServletRequest request){
        // if user is student, direct to student home, else

        if(request.isUserInRole("STUDENT")){
            return "student_mappings/studentHome";
        }
        else if (request.isUserInRole("ADMIN")){
            return "advisor_mappings/admin-homepage";
        }
        else {
            return "login_failure";
        }
    }

}
