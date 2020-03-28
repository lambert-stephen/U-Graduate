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
		 public void save(Section section) {

	    	 Session currentSession = entityManager.unwrap(Session.class);
	         currentSession.saveOrUpdate(section);
		 }

	@Override
	public Section findByCRN(int CRN) {

	    	Session session = entityManager.unwrap(Session.class);
	    	return session.get(Section.class, CRN);
	}

	@Override
	public List<Section> findByName(String name) {

	    	Session session = entityManager.unwrap(Session.class);

	    	Query query = session.createQuery("from Section s where" + " s.className " +
					"LIKE CONCAT('%', :name, '%') ");
			query.setParameter("name", name);

			return query.getResultList();
	}

	@Override
	public void deleteByName(String name) {

	}

	@Override
	public void deleteByCRN(int id) {

	}
}
