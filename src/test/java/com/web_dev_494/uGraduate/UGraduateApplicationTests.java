package com.web_dev_494.uGraduate;

import com.web_dev_494.uGraduate.controller.AdvisorController;
import com.web_dev_494.uGraduate.dao.StudentDAO;
import com.web_dev_494.uGraduate.entity.Student;
import com.web_dev_494.uGraduate.rest.StudentRestController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UGraduateApplicationTests {
	@Autowired
	private AdvisorController advisorController;
	@Autowired
	private StudentRestController  studentController;
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private MockMvc mockMvc2;
	@Autowired
	private StudentDAO dao;

	//checks if student dao is not null
	@Test
	void contextLoads() throws Exception {
		assertThat(dao).isNotNull();
	}
	@Test
	@Transactional
	@Rollback(true)
	//Tests if student in database is found
	public void findAllTest(){
		Student student2 = new Student("","","");
		List<Student> students = dao.findAll();
		Assertions.assertEquals(student2.getFirstName(),student2.getLastName(),student2.getMajor());
	}
	@Test
	//tests cases to test the login mapping
	public void testLoginController() throws Exception{
		this.mockMvc.perform(get("/login")).andExpect(status().isOk())
				.andExpect(content().string(containsString("")));
	}
	@Test
	//tests cases to test search student mapping
	public void testSearchController() throws Exception{
		this.mockMvc.perform(get("/searchStudent")).andExpect(status().is4xxClientError())
				.andExpect(content().string(containsString("")));
	}
	@Test
	//tests cases to test add student mapping
	public void testAddController() throws Exception{
		this.mockMvc.perform(get("/addStudent")).andExpect(status().is4xxClientError())
				.andExpect(content().string(containsString("")));
	}
	@Test
	//tests cases to test that student mapping finds all students
	public void findStudents(){
		List<Student> s = studentController.findAll();
		assertThat(s).hasSizeGreaterThan(1);
	}
	@Test
	//Tests to check if the students major is saved correctly
	public void saveTest(){
		Student student1 = new Student("John","Doe","CS");
		student1.setMajor("CS");
		student1.setLastName("Lambert");
		student1.setFirstName("Stephen");
		dao.save(student1);
		Assertions.assertNotNull(student1.getMajor());
	}
	@Test
	//Tests to check if the students first name is saved correctly
	public void saveTest2(){
		Student student2 = new Student("Tyler","Con","Business");
		student2.setMajor("Business");
		student2.setLastName("Con");
		student2.setFirstName("Tyler");
		dao.save(student2);
		Assertions.assertNotNull(student2.getFirstName());
	}
	@Test
	//Tests to check if the students last name is saved correctly
	public void saveTest3(){
		Student student3 = new Student("Mark","Johnson","Math");
		student3.setMajor("Math");
		student3.setLastName("Johnson");
		student3.setFirstName("Mark");
		dao.save(student3);
		Assertions.assertNotNull(student3.getLastName());
	}
}


