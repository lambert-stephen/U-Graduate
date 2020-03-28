package com.web_dev_494.uGraduate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="section")
public class Section {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "crn_")
	 private int CRN;

	 @Column(name = "class_name")
	 private String className;

	 @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
                           CascadeType.DETACH, CascadeType.REFRESH})
	 @JoinColumn(name="professor_id")
	 private Professor professor;

	 @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
			              CascadeType.DETACH, CascadeType.REFRESH})
	 @JoinColumn(name = "major_id")
	 private Major major;

	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name = "student_section",
			joinColumns = @JoinColumn(name = "crn_"),
			inverseJoinColumns = @JoinColumn(name = "student_id")
	)
	private List<Student> students;


	 public Section(){

	 }

	 //how to handle assigning the students array list
	 public Section(String className, int CRN){
		 this.className = className;
		 this.CRN = CRN;
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

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student){
	 	if(students == null){
	 		students = new ArrayList<>();
		}

	 	students.add(student);


	}

	@Override
	public String toString() {
		return "Section{" +
				"CRN=" + CRN +
				", className='" + className + '\'' +
				'}';
	}
}
