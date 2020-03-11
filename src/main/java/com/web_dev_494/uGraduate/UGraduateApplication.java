package com.web_dev_494.uGraduate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class UGraduateApplication extends SpringBootServletInitializer {

	/*
	private static void test(){
		String jdbcUrl = "jdbc:mysql://localhost:3306/student_directory?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		String username = "dev";
		String password = "dev";
		try{

			System.out.println("connecting to database " + jdbcUrl);
			Connection myConnection = DriverManager.getConnection(jdbcUrl, username, password);
			System.out.println("Connection successful!!!");
		}
		catch (Exception exc){
			System.out.println("FAILLLLLLLLL*********************************");
			exc.printStackTrace();
		}
	}

	 */

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(UGraduateApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(UGraduateApplication.class, args);
		//test();
	}

}

@EnableWebSecurity
class SecurityConfig extends WebSecurityConfigurerAdapter{

	// this is needed for bcrypt
	private final PasswordEncoder pwEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

	@Bean
	UserDetailsService authentication(){

		//builds a user for functionality
		UserDetails defaultAdmin = User.builder()
				.username("admin")
				.password(pwEncoder.encode("12345qwert"))
				.roles("ADMIN", "USER")
				.build();

		UserDetails defaultTest = User.builder()
				.username("test")
				.password(pwEncoder.encode("12345qwert"))
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(defaultAdmin, defaultTest);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().mvcMatchers("/admin/**").hasRole("ADMIN")
				.and().authorizeRequests().anyRequest().authenticated()
				.and().formLogin().and().httpBasic();

		http.formLogin().defaultSuccessUrl("/advisor/login", true);
	}

}