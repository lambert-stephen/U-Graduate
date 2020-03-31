package com.web_dev_494.uGraduate.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.web_dev_494.uGraduate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.web_dev_494.uGraduate.entity.Professor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfessorDAOFunctionality implements ProfessorDAO {

	private EntityManager entityManager;

	@Autowired
	public ProfessorDAOFunctionality(EntityManager entityManager){
		this.entityManager = entityManager;
	}

	@Override
	public void save(Professor p) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(p);
	}

	@Override
	public Professor findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Professor.class, id);
	}

	@Override
	public void deleteById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("delete from Professor where id=:professorId");
		query.setParameter("professorId", id);

		query.executeUpdate();
	}

	@Override
	public List<Professor> findByName(String name) {
		Session session = entityManager.unwrap(Session.class);

		Query query = session.createQuery("from Professor s where" + " s.name " +
				"LIKE CONCAT('%', :name, '%') ");

		query.setParameter("name", name);
		return query.getResultList();
	}

	@Override
	public void deleteByName(String name) {

	}
}
