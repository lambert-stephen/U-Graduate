package dao;

import java.util.ArrayList;

import main.java.com.web_dev_494.uGraduate.student.Class;
import main.java.com.web_dev_494.uGraduate.student.Student;

public class StudentDAOimpl implements studentDAO {


	
	@Override
	public void register(Student s) {
		String sql = "INSERT INTO student (studentID, name, major) VALUES('" + s.getStudentID() + "," + s.getName() +"," + s.getMajor() + "')";

	}

	@Override
	public void unregister(Student s) {
		String sql = "DELETE FROM student WHERE studentID=" + s.getStudentID()+ "'";
	
	}

	@Override
	public ArrayList<Class> seeCompleted() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM student WHERE ";

	}

	@Override
	public Class searchClasses(Class c) {
		String sql = "SELECT * FROM class WHERE classID =" + c.getclassID()+ "'";

		// TODO Auto-generated method stub

	}

}
