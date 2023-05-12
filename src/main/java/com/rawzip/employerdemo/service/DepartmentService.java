package com.rawzip.employerdemo.service;

import com.rawzip.employerdemo.entity.Department;
import com.rawzip.employerdemo.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    public void InsertDepartment(List<Department> department) {
        this.departmentRepository.saveAll(department);
    }

    public void DeleteDepartmentById(Long departmentId) {
        this.departmentRepository.deleteById(departmentId);
    }

    public List<Department> getDepartment(Department department) {
        return departmentRepository.findAll();
    }

    public void updateDepartment(Department department) {
        departmentRepository.save(department);
    }
}
