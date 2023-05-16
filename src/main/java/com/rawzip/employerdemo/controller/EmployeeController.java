package com.rawzip.employerdemo.controller;

import com.rawzip.employerdemo.entity.Employee;
import com.rawzip.employerdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    //or we can create a constructor and do it in another way without using @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    @GetMapping
    public List<Employee> getEmployeeDetails(){
        return employeeService.getEmployeeDetails();
    }
    @PostMapping
    public void insertEmployeeDetails(@RequestBody Employee employee){
        employeeService.insertEmployeeDetails(employee);
    }
    @DeleteMapping("/delete")
    public void deleteEmployeeDetails(@RequestParam (value = "id") Long id){
        employeeService.deleteEmployeeById(id);
    }
    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployeeDetailsById(@RequestParam (value = "id") Long id,
                                                    @RequestBody Employee employee){
        if (id != employee.getId()){ return new ResponseEntity(HttpStatus.BAD_REQUEST);}
       return new ResponseEntity(employeeService.updateEmployeeDetailsById(employee), HttpStatus.OK);
    }
}
