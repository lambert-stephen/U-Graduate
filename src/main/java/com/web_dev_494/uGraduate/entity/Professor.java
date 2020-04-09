package com.web_dev_494.uGraduate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="professor")
public class Professor {

     @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "professor_id")
	 private int professorId;
	 
	 @Column(name = "professor_name")
	 private String name;

	 @OneToMany(mappedBy = "professor",
	 			cascade = {CascadeType.DETACH, CascadeType.MERGE,
						   CascadeType.DETACH, CascadeType.REFRESH})
	 private List<Section> sections;

	 //constructors
	 public Professor(){};

	 public Professor(int professorId, String name){
		 this.professorId = professorId;
		 this.name = name;
	 }
	 
	 //getters and setters
	 public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorID) {
		this.professorId = professorID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public void add(Section section){
	 	if(this.sections == null){
	 		this.sections = new ArrayList<>();
		}

	 	this.sections.add(section);
	 	section.setProfessor(this);
	}

	@Override
	public String toString() {
		return "Professor{" +
				"professorId=" + professorId +
				", name='" + name + '\'' +
				", sections=" + sections +
				'}';
	}
}
