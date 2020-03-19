package com.web_dev_494.uGraduate.dao;
import com.web_dev_494.uGraduate.entity.Section;

public interface SectionDAO {
	
	//read: find by CRN
	 public Section find(int CRN);
	 
	//create:  adding a section
	 public void addSection(Section s);
	 
	//update:  deletes by CRN
	 public void deleteSection(int CRN);
	//delete: 
	
}
