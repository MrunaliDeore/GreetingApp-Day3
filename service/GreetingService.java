package com.example.greetingappdevelopment.service;

import com.example.greetingappdevelopment.entity.User;
import com.example.greetingappdevelopment.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@Service
public class GreetingService  {

    public static String getMessage() {
        return "Hello Mrunali";
    }

    public static String messageByName(String firstname, String lastname) {
        return "Hello " + firstname + " " + lastname ;
    }

    @Autowired
    GreetingRepository greetingRepository;

    public User saveRepo(User user){
        User newuser = new User(user);
        greetingRepository.save(user);
        return newuser;
    }
    public String saveRepoHello(User user) {
        User newUser = new User(user);
        return "Hello "+ newUser;
    }

}
