package com.example.greetingappdevelopment.controller;

import com.example.greetingappdevelopment.entity.model.GreetingData;
import com.example.greetingappdevelopment.service.GreetingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s !";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public GreetingData greeting (@RequestParam(value = "name", defaultValue = "world") String name){
        return new GreetingData (counter.incrementAndGet(),String.format(template,name));
    }

    @GetMapping("/greetingmsg")
    public String getMessage() {
        return GreetingService.getMessage();
    }
}
