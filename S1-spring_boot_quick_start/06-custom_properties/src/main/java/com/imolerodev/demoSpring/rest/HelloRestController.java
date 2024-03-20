package com.imolerodev.demoSpring.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello world!\nI'm using devtools!!!";
    }

    @GetMapping("/workout")
    public String workout() {
        return "18 planchas esta semana, y dos tandas de cardio";
    }

    // publicar un nuevo endpoint
    @GetMapping("/fortune")
    public String fortune() {
        return "Hoy es tu dia de suerte.";
    }

    @GetMapping("/teaminfo")
    public String getTeaminfo() {
        return "Coach: " + this.coachName + ", Team name: " + this.teamName;

    }

}
