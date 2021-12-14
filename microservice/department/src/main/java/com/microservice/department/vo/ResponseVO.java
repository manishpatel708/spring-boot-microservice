package com.microservice.department.vo;

import com.microservice.department.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVO {

    private Department department;
    private CollegeVO collegeVO;
}
