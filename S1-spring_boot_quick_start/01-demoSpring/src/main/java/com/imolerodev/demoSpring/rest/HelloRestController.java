package com.imolerodev.demoSpring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello world!";
    }
}
