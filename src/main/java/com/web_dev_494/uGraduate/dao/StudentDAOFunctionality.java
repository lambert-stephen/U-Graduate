package com.web_dev_494.uGraduate.dao;

import com.web_dev_494.uGraduate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class StudentDAOFunctionality implements StudentDAO {

    private EntityManager entityManager;

    @Autowired
    public StudentDAOFunctionality(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);
        System.out.println("************FIND ALL");
        Query theQuery =
                currentSession.createQuery("from Student ", Student.class);

        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void save(Student student){
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(student);
    }

    @Override
    public Student findById(int id){

        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);
        //get student
        return currentSession.get(Student.class, id);

    }

    @Override
    public void deleteById(int id){
        Session currentSession = entityManager.unwrap(Session.class);
        Query query = currentSession.createQuery("delete from Student where id=:studentId");
        query.setParameter("studentId", id);

        query.executeUpdate();
    }

}
