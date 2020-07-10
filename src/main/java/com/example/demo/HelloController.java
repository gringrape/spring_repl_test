package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class HelloController {

    @GetMapping("/")
    public List<User> helloHandler() {
        List<User> users = new ArrayList<>();
        users.add(new User("Allen"));
        users.add(new User("Hane"));
        return users;
    }
}
