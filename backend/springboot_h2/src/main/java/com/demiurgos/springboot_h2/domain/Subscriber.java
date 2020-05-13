package com.demiurgos.springboot_h2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Subscriber {
    
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String category;

    public Subscriber(){}

    public Subscriber(String firstname, String lastname, String email, String category) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.category = category;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

    @Override
    public String toString() {
        return "Subscriber [email=" + email + ", firstname=" + firstname + ", id=" + id + ", lastname=" + lastname
                + "]";
    }

    

    

    

}