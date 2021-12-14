package com.microservice.department.service;

import com.microservice.department.entity.Department;
import com.microservice.department.repo.DepartmentRepo;
import com.microservice.department.vo.CollegeVO;
import com.microservice.department.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private RestTemplate restTemplate;

    public Department saveDepartment(Department department){
        return departmentRepo.save(department);
    }

    public Department findById (long id){
        return  departmentRepo.findById(id).orElse(null);
    }

    public ResponseVO findByIdWithResponseVO(long id) {
        Department department= departmentRepo.findById(id).orElse(null);
        CollegeVO collegeVO=restTemplate.getForObject("http://COLLEGE-SERVICE/college/"+department.getCollegeId(), CollegeVO.class);
        ResponseVO responseVO = new ResponseVO();

        responseVO.setDepartment(department);
        responseVO.setCollegeVO(collegeVO);

        return responseVO;
    }
}
