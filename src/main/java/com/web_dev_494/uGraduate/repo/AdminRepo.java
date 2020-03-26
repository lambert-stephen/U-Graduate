package com.web_dev_494.uGraduate.repo;

import com.web_dev_494.uGraduate.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;


public interface AdminRepo  {

   Admin findByUsername(String username);

}
