package com.web_dev_494.uGraduate.student;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "teststudents", schema = "test", catalog = "")
public class TeststudentsEntity {
    private Object id;
    private String firstName;
    private String lastName;
    private String major;

    @Id
    @Column(name = "id")
    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeststudentsEntity that = (TeststudentsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(major, that.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, major);
    }
}
