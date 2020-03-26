package com.web_dev_494.uGraduate.security;

import com.web_dev_494.uGraduate.entity.Admin;
import com.web_dev_494.uGraduate.entity.Authorities;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public class AdminSecurity extends Admin implements UserDetails {


    private Admin admin;

    public AdminSecurity(Admin admin){
        this.admin = admin;
    }

    @Override
    public String getPassword() {
        return this.admin.getPassword();
    }

    @Override
    public String getUsername() {
        return this.admin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public List<Authorities> getAuthorities() {
        return this.admin.getAuthorities();
    }

    public void setAuthorities(List<Authorities> authorities) {
        this.admin.setAuthorities(authorities);
    }
}
