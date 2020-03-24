package com.web_dev_494.uGraduate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
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
public class UGraduateApplication extends SpringBootServletInitializer {

	// This is needed to deploy on AWS. Please don't touch this
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(UGraduateApplication.class);
	}

	// Initializes Spring Boot. Also, don't touch this
	public static void main(String[] args) {
		SpringApplication.run(UGraduateApplication.class, args);
		//test();
	}

}

// Security Configuration class. Updates roles and assigns security to classpaths
// TODO: Move this into its own class and call methods off the instance. REMEMBER DEPENDENCY INJECTION
@Configuration
@EnableWebSecurity
// Order here is important. In order to have multiple mvcmatchers on different map heirarchies
class SecurityConfig extends WebSecurityConfigurerAdapter{

	// this is needed for bcrypt hashing
	private final PasswordEncoder pwEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

	// Bean used to create roles for spring security
	@Bean
	UserDetailsService authentication(){

		//builds a user for functionality
		UserDetails defaultAdmin = User.builder()
				.username("admin") // Literally the username you use to login
				.password(pwEncoder.encode("admin")) // encodes password into bcrypt
				.roles("ADVISOR") // These roles will be added to the user.builder
				.build();

		UserDetails defaultTest = User.builder()
				.username("student")
				.password(pwEncoder.encode("student"))
				.roles("STUDENT")
				.build();

		return new InMemoryUserDetailsManager(defaultAdmin, defaultTest);
	}

	// TODO: Fix xss. vulnerable if using /advisor/XSSEXAMPLE
	// Configures roles on endpoints
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		// this first line is making sure all /admin/ mappings can only be used by "ADMIN" users
		http
				.authorizeRequests()
					.mvcMatchers("/advisor/**").hasRole("ADVISOR")
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
/*

@Configuration
@Order(2)
class adminConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception{

		// Sends to spring login screen on /advisor only allowing "ADVISOR" role

		http.authorizeRequests().antMatchers("/student/**").hasRole("STUDENT")
				//.and().
				//authorizeRequests().anyRequest().authenticated()
				.and().formLogin().and().httpBasic()
				.and().formLogin().defaultSuccessUrl("/student/login", true);

	}
}

@Configuration
@Order(3)
class studentConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception{

		http.authorizeRequests()
				.antMatchers("/", "/home" ).permitAll();
	}
}
*/
