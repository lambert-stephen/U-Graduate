package com.web_dev_494.uGraduate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

@SpringBootApplication
public class UGraduateApplication {

	public static void main(String[] args) {
		SpringApplication.run(UGraduateApplication.class, args);
	}

}

@EnableWebSecurity
class SecurityConfig extends WebSecurityConfigurerAdapter{

	private final PasswordEncoder pwEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

	@Bean
	UserDetailsService authentication(){
		UserDetails defaultAdmin = User.builder()
				.username("admin")
				.password(pwEncoder.encode("12345qwert!@#$%QWERT"))
				.roles("ADMIN", "USER")
				.build();

		UserDetails defaultTest = User.builder()
				.username("test")
				.password(pwEncoder.encode("12345qwert!@#$%QWERT"))
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(defaultAdmin, defaultTest);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().mvcMatchers("/admin/**").hasRole("ADMIN")
				.and().authorizeRequests().anyRequest().authenticated()
				.and().formLogin().and().httpBasic();
	}
}