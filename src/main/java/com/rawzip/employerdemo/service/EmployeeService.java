package com.rawzip.employerdemo.service;

import com.rawzip.employerdemo.entity.Employee;
import com.rawzip.employerdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployeeDetails() {
        return employeeRepository.findAll();
    }

    public void insertEmployeeDetails(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}
