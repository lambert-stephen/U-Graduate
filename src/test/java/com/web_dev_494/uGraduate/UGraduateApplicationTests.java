package com.web_dev_494.uGraduate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UGraduateApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void contextLoads() {
	}

	//English Description Test Cases

	//All test will be written in JUnit

	 // when a student registers their name should appear in the database

	@Test
	public void registerTest() {
		// assertSame(registered_student_object, search database_for student name, id);
	}

	// when a class is searched, the classes should all appear in the database

	@Test
	public void searchTest() {
		// assertSame(name of class,search the database for class name)
	}

	// if a student unregisters, then the student should no longer be in the
		// database

	@Test
	public void unregisterTest() {
		// assertTrue(bool unregistered value, search student database for name and id);
	}

	// Number of seats should match num seats in the database

	@Test
	public void numStudentsTest() {
		assertSame(numSeats, allSeats);
	}

	// When a student is added, the students should appear in the database

	@Test
	public void addStudentTest() {
		assertSame(studentName, nameStudent);
	}

	// When a class is added, the class should appear in the database

	@Test
	public void addClassTest() {
		assertSame(className,search database for class);
	}

	// When a student is removed from a class, the student should not appear in the
		// database

	@Test
	public void removeStudentTest() {
		assertNotSame(nameStudent,search database for student);
	}

	• // When a class is removed, the class should not appear in the database

	@Test
	public void removeClassTest() {
		assertNotSame(className,search database for class);
	}

	// all majors in the database should appear when searched

	@Test
	public void allMajorsTest() {
		assertSame(majorName,search database for major);
	}

	// all colleges in the database should appear when searched

	@Test
	public void allCollegeTest() {
		assertSame(collegeName,search database for college);
	}

	// when class completion is updated, the database should show a true value

	@Test
	public void completionTest(){
		assertTrue(className,search database for a true value);
	}




}
