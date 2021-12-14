package com.microservice.department.controller;

import com.microservice.department.entity.Department;
import com.microservice.department.service.DepartmentService;
import com.microservice.department.vo.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable long id){
        log.info("Inside findById method of DepartmentController");
        return departmentService.findById(id);
    }

    @GetMapping("/details/{id}")
    public ResponseVO findByIdForDetails(@PathVariable long id){
        log.info("Inside findById method of DepartmentController");
        return departmentService.findByIdWithResponseVO(id);
    }
}
