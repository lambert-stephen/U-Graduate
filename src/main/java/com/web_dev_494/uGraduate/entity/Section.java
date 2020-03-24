package com.web_dev_494.uGraduate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="section")
public class Section {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "crn")
	 private int CRN;

	 @Column(name = "class_name")
	 private String className;

	 @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
                           CascadeType.DETACH, CascadeType.REFRESH})
     @JoinColumn(name="professor_id")
	 private Professor professor;

	 
	 public Section(){

	 }

	 //how to handle assigning the students array list
	 public Section(String className){
		 this.className = className;
	 }
	 
	public int getCRN() {
		return CRN;
	}
	public void setCRN(int cRN) {
		CRN = cRN;
	}

	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Section{" +
				"CRN=" + CRN +
				", className='" + className + '\'' +
				'}';
	}
}
