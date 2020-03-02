package dao;

import java.util.ArrayList;

import main.java.com.web_dev_494.uGraduate.student.*;
import main.java.com.web_dev_494.uGraduate.student.Class;;
import org.springframework.jdbc.core.JdbcTemplate;    

public interface studentDAO {
	public void register(Student s);
	public void unregister(Student s);
	public ArrayList<Class> seeCompleted();
	public Class searchClasses(Class c);
	
	//see classes left till graduation
	//see completed classes
	//unregister
	//search classes
	//see available classes for registration 
}
