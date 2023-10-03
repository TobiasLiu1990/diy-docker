package com.diy.docker.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Hello {
    
    @GetMapping
    public String get() {
        return "Hello world";
    }
    
}
