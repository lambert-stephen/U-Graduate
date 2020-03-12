package com.web_dev_494.uGraduate.entity;
import javax.persistence.*;

import java.util.HashMap;

@Entity
@Table(name="UniClass")
public class UniClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "classId")
	private int classId;
	
	@Column(name = "className")
	private String className;
	
	@Column(name = "homeMajor")
	private Major homeMajor;
	
	UniClass(){};
	UniClass(int classId,String className, Major homeMajor){
		this.classId = classId;
		this.homeMajor = homeMajor;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Major getHomeMajor() {
		return homeMajor;
	}
	public void setHomeMajor(Major homeMajor) {
		this.homeMajor = homeMajor;
	}
	
	

}