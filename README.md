# {{TEAMNAME}} Final Project

TODO: Fill out this file with the following information


## Description

TODO: An English language description of what your application does, intended for a developer
audience. Pretend this is the real `README.md` for your app that will show up on GitHub: what do you
want people to know about it? What does it do? Why should they use it/check it out/hack on it? This
should be approximately two paragraphs. Take a look at the description of your favorite software
repository for inspiration.

## Authors

TODO: List group members, each group member must EITHER be marked "web programming novice" OR list a
specialization - you don't need to implement it all yourself, but you do need to be in charge of
getting it described and added. Your expertise self-evaluation is completely on the honor system.

For instance:

| Member | Web dev level | Specialization |
| --- | --- | --- |
| Ned the Novice | web programming novice | |
| Isaac the Intermediate | Took IT 202, built something in php once | I want to learn about website performance so I will be adding performance tests and keeping a performance log. |
| Edith the Expert | Interned as a web dev for the last 2 semesters | I will containerize the app and configure it to run within Kubernetes, integrate it with a CI/CD platform so that the deployed version is updated once all tests pass, and I will run a load test with several synthetic long-session users to demonstrate rolling updates to the code. |

## Deliverables for checkpoint 2

Outline in English what the deliverables will be for checkpoint 2. Provide a concise list that is
amenable to being translated into specific tests. Pro-tip: if you write that concise list here, you
should be able to easily translate it into a collection of test suites.

For each specialization, you must list specific checkpoints that are relevant to that particular specialization.

## Deliverables for checkpoint 4
•	English Description Test Cases

•	All test will be written in JUnit

•	//when a student registers their name should appear in the database

	@Test
	public void registerTest(){
		//assertSame(registered_student_object, search database_for student name, id);
	}
	
•	//when a class is searched, the classes should all appear in the database

	@Test
	public void searchTest(){
		//assertSame(name of class,search the database for class name)
	}
	
•	//if a student unregisters, then the student should no longer be in the database

	@Test
	public void unregisterTest() {
		//assertTrue(bool unregistered value, search student database for name and id);
	}
	
•	//Number of seats should match num seats in the database

	@Test
	public void numStudentsTest() {
		assertSame(numSeats,allSeats);
	}
	
•	//When a student is added, the students should appear in the database

	@Test
	public void addStudentTest() {
		assertSame(studentName,nameStudent);
	}
	
•	//When a class is added, the class should appear in the database

	@Test
	public void addClassTest() {
		assertSame(className,search database for class);
	}
	
•	//When a student is removed from a class, the student should not appear in the database

	@Test
	public void removeStudentTest() {
		assertNotSame(nameStudent,search database for student);
	}
	
•	//When a class is removed, the class should not appear in the database

	@Test
	public void removeClassTest() {
		assertNotSame(className,search database for class);
	}
	
•	//all majors in the database should appear when searched

	@Test
	public void allMajorsTest() {
		assertSame(majorName,search database for major);
	}
	
•	//all colleges in the database should appear when searched

	@Test
	public void allCollegeTest() {
		assertSame(collegeName,search database for college);
	}
	
•	//when class completion is updated, the database should show a true value

	@Test
	public void completionTest(){
		assertTrue(className,search database for a true value);
	}


## Deliverables for final project

Outline in English what the deliverables will be for the final checkpoint. This will should be
similar to the **Description** above, but written out as an explicit checklist rather than a human
readable description. Reminder that this is not *due* until checkpoint 4, but failing to plan is
planning to fail.

For each specialization, you must list specific checkpoints that are relevant to that particular specialization.

## Specialization deliverables

For each student/team adding a specialization, name that specialization and describe what
functionality you will be adding.

# Installation

By the time you get to the end of the final project, this section should have a full set of
instructions for how to spin up your app.
