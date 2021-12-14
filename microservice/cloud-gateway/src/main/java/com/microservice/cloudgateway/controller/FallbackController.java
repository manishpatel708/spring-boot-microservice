package com.microservice.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/collegeServiceFallBack")
    public String collegeServiceFallBackMethod(){
        return  "College service taking longer then expected... Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){
        return  "Department service taking longer then expected... Please try again later";
    }
}
