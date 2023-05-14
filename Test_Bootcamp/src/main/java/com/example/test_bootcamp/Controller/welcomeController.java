package com.example.test_bootcamp.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomeController")
public class welcomeController {

    @GetMapping(path = "/name")
    public String helloWorld(){
        return "My name is Mohd Mahdi";
    }

    @GetMapping(path = "/age")
    public String age(){
        return "My age is 27";
    }

    @GetMapping(path = "/check")
    public String status(){
        return "Everything OK";
    }

    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";
    }

}
