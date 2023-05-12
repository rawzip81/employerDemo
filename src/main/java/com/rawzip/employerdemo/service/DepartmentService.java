package com.rawzip.employerdemo.service;

import com.rawzip.employerdemo.entity.Department;
import com.rawzip.employerdemo.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    public void InsertDepartment(Department department) {
        //this.departmentRepository.save(department);
    }

    public void DeleteDepartmentById(Long departmentId) {
        //this.departmentRepository.save(departmentId);
    }
}
