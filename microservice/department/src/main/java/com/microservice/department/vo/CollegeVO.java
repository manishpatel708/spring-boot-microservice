package com.microservice.department.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CollegeVO {

    private long id;
    private String name;
    private String address;
    private String phoneNo;
}
