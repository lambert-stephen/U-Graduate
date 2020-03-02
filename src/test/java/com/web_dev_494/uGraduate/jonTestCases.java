Using the JUnit Testing Framework

/*Student*/

#Register
//when a student registers, their name should appear in the database
@Test
public void registerTest(){
	assertSame(registered student object, seach database for student name, id);
}

#Search class
//when a class is searched, the classes should all appear in the database
@Test
public void searchTest(){ //test if class exists in database
	assertSame(name of class,search the database for class name)
}

#See all the classes until graduation
//the student object holds classes left to complete and compares against classes in which the grade of F or NULL was earned with classes that are required.
@Test
public void testClassesLeft() {
	assertEquals(selected class's grade, grade earned was F or NULL);
}

#Unregister
//if a student unregisters, then the student should no longer be in the database
 @Test
   public void unregisterTest() {	   
      assertTrue(bool unregistered value, search student database for name and id);
}

#See available classes for registration
//the student object holds classes left to complete and compares against previous classes in which the grade of F, D, C or NULL was earned. 
@Test
public void testAvailableClasses() {
	assertEquals(selected class's grade, grade earned was F, D, C, or NULL);
}

#Retake the class
//check to see if a grade is found for the selected class. If a value of NULL, F, D, or C is found, then it's possible to retake. Else, nope.avi
@Test
publlc void testRetakingClass() {
	assertEquals(selected class's grade, grade earned was F, D, C, or NULL);
}

#No. of Seats
//if the number of seats for a selected class is 0, then you are unable to register
@Test
public void testNumberSeatOfClass() {
	assertEquals(!0, selected class total number of open seats);
}

/*Admins*/

#Add students
//create or modify a person as a student
@Test
public void testAddStudent() {
	assertTrue(selected person, make into a student);
	//should return true or false on success of modification into student
}

#Add Classes
//create classes that students can register into
@Test
public void testAddClass() {
	assertTrue(selected class, class creation);
	//should return true or false on success of creation of class
}

#Remove classes, students
//if selected class or student is not found in database, return true
@Test
public void testRemoval() {
	assertTrue(selected class or student to remove, check database if class or student exists);
}

#Update class completion
//if both of the above are true, then the class completion for that student was a success
@Test
public void testClassCompletion() {
	assertTrue(student grade in a certain class, database also shows student grade from that class);
}

#Update classes
//compare previous date modified with the old class before update.
@Test
public void testUpdateClass() {
	assertTrue(selected class date, !class data from database);
	//if both modification dates are different, then modification of the class's database was successful.
}

#Add other admins
//check database to see if user is an admin after addition or modification of a user
@Test
public void testAddAdmin() {
	assertTrue(selected user is converted to an admin, check the database to see if the user is now an admin);
}

#Remove other admins
//check database to see if user is no longer an admin after modification of a user
@Test
public void testAddAdmin() {
	assertTrue(selected user is not an admin, check the database to see if the user is not an admin);
}

/*Major*/

#All majors
• College

@Test
pubilc void testCorrectMajor() {
	assertTrue(selected student major, major that holds all the classes for it
}

#All colleges
• Class

@Test
pubilc void testCorrectCollege() {
	assertTrue(selected student college, college that holds all the majors for it
}

#Hold roster list
@Test
public void testHoldRosterList() {
	assertTrue(check database is roster exists, actual roster is shown here to compared);
}


#modify roster
//if both modification dates are different, then modification of the class's database was successful.
@Test
public void testModifyRoster() {
	assertTrue(check roster modification date, !check modification date from database)
}
