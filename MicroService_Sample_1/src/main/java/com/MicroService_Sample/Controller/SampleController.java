package com.MicroService_Sample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String hello() {
    	return "Welcome to microservice1";
    }
}
