package com.MicroService_Sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	 @GetMapping("/")
	    public String hello() {
	    	return "Welcome to TRH";
	    }


}
