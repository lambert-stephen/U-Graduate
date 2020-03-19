package com.web_dev_494.uGraduate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web_dev_494.uGraduate.entity.Section;

@Repository
public class SectionDAOFunctionality implements SectionDAO {
	
	 private EntityManager entityManager;

	    @Autowired
	    public SectionDAOFunctionality(EntityManager entityManager){
	        this.entityManager = entityManager;
	    }
	
	    @Override
	    public Section find(int CRN) {
	    	//get current hibernate session
	        Session currentSession = entityManager.unwrap(Session.class);
	        //get student
	        return currentSession.get(Section.class, CRN);
	    }
	    
	    //adding/updating
	    @Override
		 public void addSection(Section s) {
	    	 Session currentSession = entityManager.unwrap(Session.class);
	         currentSession.saveOrUpdate(s);
		 }
	    
	    @Override
		//update: 
		 public void deleteSection(int CRN) {
	    	 Session currentSession = entityManager.unwrap(Session.class);
	         Query query = currentSession.createQuery("delete from Section where id=:CRN");
	         query.setParameter("CRN", CRN);

	         query.executeUpdate();
		 }
		//delete: 
}
