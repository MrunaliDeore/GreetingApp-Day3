package com.example.greetingappdevelopment.service;

public class GreetingService {

    public static String getMessage() {
        return "Hello Mrunali";
    }

    public static String messageByName(String firstname, String lastname) {
        return "Hello " + firstname + " " + lastname ;
    }
}
