package com.imolerodev.demoSpring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello world!\nI'm using devtools!!!";
    }

    @GetMapping("/workout")
    public String workout() {
        return "13 planchas esta semana, y algo de cardio";
    }
}
