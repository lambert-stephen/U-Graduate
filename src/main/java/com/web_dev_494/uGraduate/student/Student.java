package com.web_dev_494.uGraduate.student;

import java.util.HashMap;

public class Student {

    private String name;
    private String major;
    private int studentID;
    private HashMap<String, Boolean> registerList;
    private HashMap<String, Boolean> completeList;

    public Student(){
        
    }

    public Student(String name, String major, int studentID){

        this.name = name;
        this.major = major;
        this.studentID = studentID;

        registerList = new HashMap<>();
        completeList = new HashMap<>();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


}
