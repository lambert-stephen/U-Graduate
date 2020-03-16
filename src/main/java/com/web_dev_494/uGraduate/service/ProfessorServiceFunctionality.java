package com.web_dev_494.uGraduate.service;

import org.springframework.stereotype.Repository;

import com.web_dev_494.uGraduate.dao.ProfessorDAO;
import com.web_dev_494.uGraduate.dao.SectionDAO;
import com.web_dev_494.uGraduate.entity.Professor;

@Repository
public class ProfessorServiceFunctionality implements ProfessorService {
	
	ProfessorDAO professorDAO;

	@Override
	public void saveProfessor(Professor p) {
		professorDAO.saveProfessor(p);
		
	}

	@Override
	public Professor findProfessor(int professorId) {
		professorDAO.findProfessor(professorId);
		return null;
	}

	@Override
	public void deleteProfessor(int professorId) {
		professorDAO.deleteProfessor(professorId);
	}

	@Override
	public void addProfessor(Professor p) {
		// TODO Auto-generated method stub
		
	}
	

}
