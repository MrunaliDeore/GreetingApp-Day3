package com.example.greetingappdevelopment.entity.model;

public class GreetingData {

    private long id;
    private String firstname;

    public GreetingData(long id, String firstname) {
        this.id = id;
        this.firstname = firstname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
