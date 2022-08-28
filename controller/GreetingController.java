package com.example.greetingappdevelopment.controller;

import com.example.greetingappdevelopment.entity.User;
import com.example.greetingappdevelopment.entity.model.GreetingData;
import com.example.greetingappdevelopment.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s !";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public GreetingData greeting (@RequestParam(value = "name", defaultValue = "world") String name){
        return new GreetingData (counter.incrementAndGet(),String.format(template,name));
    }

    //localhost:8080/greetingmsg
    @GetMapping("/greetingmsg")
    public String getMessage() {
        return GreetingService.getMessage();
    }

    //localhost:8080/msgbyname/Mrunali/Deore
    @GetMapping("/msgbyname/{firstname}/{lastname}")
    public String getByNameParam(@PathVariable String firstname,@PathVariable String lastname) {
        return GreetingService.messageByName(firstname, lastname);
    }


    @PostMapping("/post")
    public User saveRepo (@RequestBody User user){
        User newuser = greetingService.saveRepo(user);
        return newuser;
    }

    @GetMapping("/get/{id}")
    public Optional<User> getById (@PathVariable int id){
        Optional<User> response = greetingService.getById(id);
        return response;
    }

    @GetMapping("/users")
    public List<User> listofAll (){
        List<User> response = greetingService.listAll();
        return response;
    }
}
