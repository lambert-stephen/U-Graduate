package main.java.com.web_dev_494.uGraduate.student;

import java.util.ArrayList;
import java.util.HashMap;

public class Class {
	private String name;
	private String classID;
	ArrayList<Student> students;
	int seats;
	
	int seatsRemaining;
	int seatsTaken;
	
	//constructor
    public Class(String name, String classID){
        this.name = name;
        this.classID = classID;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //for seats
    public int getSeats() {
        return seats;
    }

    public void setSeats(Integer num) {
        this.seats = num;
    }
    
    //seats remaining
    public int getSeatsRemaining() {
        return seatsRemaining;
    }

    public void setSeatsRemaining(Integer num) {
        this.seatsRemaining = num;
    }
    
    //seats taken
    public int getSeatsTaken() {
        return seatsTaken;
    }

    public void setSeatsTaken(Integer num) {
        this.seatsTaken = num;
    }
    
    //adding a student adds them to the ArrayList
    public void addStudent(Student stud) {
    	students.add(stud);
    }
    
    //seats taken
    public int getclassID() {
        return seatsTaken;
    }

    public void setclassID(Integer num) {
        this.seatsTaken = num;
    }
}
