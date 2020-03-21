package com.web_dev_494.uGraduate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="major")
public class Major {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "major_id")
    private int majorId;
	  
    @Column(name = "major_name")
    private String majorName;


    //constructors
    public Major() {
    }

    public Major(int majorId, String majorName){

        this.majorId = majorId;
        this.majorName = majorName;

    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public int getMajorId() {
        return majorId;
    }

    public String getMajorName() {
        return majorName;
    }


    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    @Override
    public String toString() {
        return "Major{" +
            "majorId=" + majorId +
            ", majorName='" + majorName + '\'' +
            '}';
    }


	    

}
