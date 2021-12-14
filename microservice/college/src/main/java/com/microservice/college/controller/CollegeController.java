package com.microservice.college.controller;

import com.microservice.college.entity.College;
import com.microservice.college.service.CollegeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/college")
@Slf4j
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @PostMapping("/save")
    public College saveCollege(@RequestBody College college){
        log.info("Inside saveCollege method of CollegeController");
        return collegeService.saveCollege(college);
    }

    @GetMapping("/{id}")
    public College findById(@PathVariable long id){
        log.info("Inside saveCollege method of CollegeController");
        return collegeService.findById(id);
    }
}
