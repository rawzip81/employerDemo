package com.rawzip.employerdemo.service;

import com.rawzip.employerdemo.entity.Employee;
import com.rawzip.employerdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployeeDetails(String lastName) {
        return employeeRepository.findByLastName(lastName);
    }
    public List<Employee> getEmployeeDetails() {
        return employeeRepository.findAll();
    }

    public void insertEmployeeDetails(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateEmployeeDetailsById(Employee employee) {
       return employeeRepository.save(employee);
    }
    public Employee updateEmployeeById( Employee employee){
        return employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }


}
