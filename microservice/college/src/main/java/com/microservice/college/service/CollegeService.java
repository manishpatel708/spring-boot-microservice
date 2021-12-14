package com.microservice.college.service;

import com.microservice.college.entity.College;
import com.microservice.college.repo.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    public College saveCollege(College college) {
        return collegeRepository.save(college);
    }

    public College findById(long id) {
        return collegeRepository.findById(id).orElse(null);
    }
}
