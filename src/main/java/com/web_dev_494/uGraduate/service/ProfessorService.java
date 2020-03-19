package com.web_dev_494.uGraduate.service;

import com.web_dev_494.uGraduate.entity.Professor;

public interface ProfessorService {
	//update
	public void saveProfessor(Professor p);
	//find
	public Professor findProfessor(int professorId);
	//delete
	public void deleteProfessor(int professorId);
	//read
	public void addProfessor(Professor p);
	
}
