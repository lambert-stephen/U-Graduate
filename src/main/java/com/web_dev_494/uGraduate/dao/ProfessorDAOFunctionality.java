package com.web_dev_494.uGraduate.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.web_dev_494.uGraduate.entity.Professor;

public class ProfessorDAOFunctionality implements ProfessorDAO {
	 private EntityManager entityManager;
	 
	  @Autowired
	    public ProfessorDAOFunctionality(EntityManager entityManager){
	        this.entityManager = entityManager;
	    }
	 
	  
	@Override
	public void saveProfessor(Professor p) {
		Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(p);	
	}

	@Override
	public Professor findProfessor(int professorId) {
		 Session currentSession = entityManager.unwrap(Session.class);
	        //get section
	        return currentSession.get(Professor.class, professorId);
	}

	@Override
	public void deleteProfessor(int professorId) {
		 Session currentSession = entityManager.unwrap(Session.class);
	        Query query = currentSession.createQuery("delete from Professor where id=:professorId");
	        query.setParameter("id", professorId);
	        query.executeUpdate();
		
	}

	@Override
	public void addProfessor(Professor p) {
		 Session currentSession = entityManager.unwrap(Session.class);
	     currentSession.saveOrUpdate(p);
	}//end addProfessor

}
