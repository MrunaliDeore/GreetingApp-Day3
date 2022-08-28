package com.example.greetingappdevelopment.entity;


import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "greeting")
public class User {

    @Id
    @GeneratedValue
    private int id;
     String firstname;
     String lastname;

    //generate contructor
    public User(String firstname, String lastname) {

        this.firstname = firstname;
        this.lastname = lastname;
    }

    public User(User user) {
        this.firstname = user.firstname;
        this.lastname = user.lastname;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    //generate getter and setter for id,firstname,lastname

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

    public int getId() {
        return Math.toIntExact(id);
    }

    public void setId(int id) {
        this.id = id;
    }
}
