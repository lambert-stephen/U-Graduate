package com.web_dev_494.uGraduate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Section")
public class Section {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "CRN")
	 private int CRN;
	 
	 @Column(name = "name")
	private String sectionName;
	 
	 @Column(name = "uniClass")
	private UniClass uniClass;
	 
	 @Column(name = "professor")
	private Professor professor;
	 
	 @Column(name = "students")
	private ArrayList<Student> students; 
	 
	 
	 Section() {};
	 //how to handle assigning the students array list
	 Section(int CRN, String name, UniClass uniClass, Professor professor){
		 this.CRN = CRN;
		 this.sectionName = name;
		 this.uniClass = uniClass;
		 this.professor = professor; 	 
	 }
	 
	public int getCRN() {
		return CRN;
	}
	public void setCRN(int cRN) {
		CRN = cRN;
	}
	public String getName() {
		return sectionName;
	}
	public void setName(String name) {
		this.sectionName = name;
	}
	public UniClass getUniClass() {
		return uniClass;
	}
	public void setUniClass(UniClass uniClass) {
		this.uniClass = uniClass;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	 
	 
	 

}
