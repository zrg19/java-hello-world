package com.engrzrg.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/build")
    public String buildDeploy() {
        return "This is my second build deployed to tomcat server through jenkins";
    }
}
