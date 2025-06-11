package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("user")
    public User getUser(){
        return new User(1L, "Ngô Đức Quang", 31);
    }

    @PostMapping("/user")
    public Map<String, String> createUser(@RequestBody User user) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Received user: " + user.getName() + ", age: " + user.getAge());
        return response;
    }
}
