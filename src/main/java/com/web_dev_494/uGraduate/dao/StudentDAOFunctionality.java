package com.web_dev_494.uGraduate.dao;

import com.web_dev_494.uGraduate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDAOFunctionality implements StudentDAO {

    private EntityManager entityManager;

    @Autowired
    public StudentDAOFunctionality(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Student> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);
        System.out.println("************FIND ALL");
        Query<Student> theQuery =
                currentSession.createQuery("from Student ", Student.class);
        System.out.println(theQuery.getResultList());
        List<Student> students = theQuery.getResultList();

        return students;
    }

    @Override
    @Transactional
    public void save(Student student){
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(student);
    }
}
