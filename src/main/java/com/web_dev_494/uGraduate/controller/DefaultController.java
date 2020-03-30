package com.web_dev_494.uGraduate.controller;

import com.web_dev_494.uGraduate.entity.User;
import com.web_dev_494.uGraduate.security.UserSecurity;
import org.apache.jasper.security.SecurityUtil;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

// Use this to determine which route the user goes into (Rather than having separate login screens)

@Controller
public class DefaultController {

    // See UGraduateApplication for defaultsuccessurl
    @RequestMapping(value = {"/loginSuccess", "/"})
    public String loginRoute(HttpServletRequest request, @AuthenticationPrincipal User user){
        // if user is student, direct to student home, else

        System.out.println("*********** " + user.toString());
        System.out.println("--------------");
        System.out.println("--------------");

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
