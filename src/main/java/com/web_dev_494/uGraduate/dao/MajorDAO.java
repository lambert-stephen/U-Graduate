package com.web_dev_494.uGraduate.dao;

import com.web_dev_494.uGraduate.entity.Major;

import java.util.List;

public interface MajorDAO {

    /*
    public List<Student> findAll();
    public void save(Student student);
    public Student findById(int id);
    public void deleteById(int id);
     */

    public List<Major> findAll();
    public void save(Major major);
    public Major findById(int id);
    public void deleteById(int id);

}
