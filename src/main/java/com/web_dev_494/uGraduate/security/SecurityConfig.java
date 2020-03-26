package com.web_dev_494.uGraduate.security;

// Security Configuration class. Updates roles and assigns security to classpaths
// TODO: Move this into its own class and call methods off the instance. REMEMBER DEPENDENCY INJECTION

import com.web_dev_494.uGraduate.repo.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
// Order here is important. In order to have multiple mvcmatchers on different map heirarchies
class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    // this is needed for bcrypt hashing
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
    }


    // TODO: Fix xss. vulnerable if using /advisor/XSSEXAMPLE
    // Configures roles on endpoints
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        // this first line is making sure all /admin/ mappings can only be used by "ADMIN" users
        http
                .authorizeRequests()
                .mvcMatchers("/advisor/**").hasRole("ADMIN")
                .mvcMatchers("/student/**").hasRole("STUDENT")
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic()
                .and()
                .formLogin()
                .defaultSuccessUrl("/loginSuccess", true);

    }
}
