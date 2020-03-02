package main.java.com.web_dev_494.uGraduate.student;


import java.util.ArrayList;
import java.util.HashMap;

public class Major {
	private String name;   
	private ArrayList<Class> classes;

	
    public Major(String name){

        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
