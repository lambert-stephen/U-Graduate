package com.web_dev_494.uGraduate.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "authorities")
public class Authorities implements GrantedAuthority {

    // private static final long serialVersionUID = -8123526131047887755L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
    private int id;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="admin")
    private Admin admin;
    @Column(name = "authority")
    private String authority;

    public Authorities() {
    }

    public Authorities(int id, Admin admin, String authority) {
        this.id = id;
        this.admin = admin;
        this.authority = authority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
