package com.web_dev_494.uGraduate.repo;

import com.web_dev_494.uGraduate.entity.Admin;
import com.web_dev_494.uGraduate.security.AdminSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AdminRepo adminRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // TODO: Now do it with the student :( Lesson learned, code to the interface

        Admin admin = adminRepo.findByUsername(username);
        if (admin == null){
            throw new UsernameNotFoundException("Unknown Username/Password");
        }
        return new AdminSecurity(admin);

    }
}
