package main.java.com.web_dev_494.uGraduate.student;

import java.util.ArrayList;

public class College {
	private String name;
	private ArrayList<Major> majors;
	
	//constructor
    public College(String name){

        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
