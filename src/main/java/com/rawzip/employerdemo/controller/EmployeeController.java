package com.rawzip.employerdemo.controller;

import com.rawzip.employerdemo.entity.Employee;
import com.rawzip.employerdemo.repository.EmployeeRepository;
import com.rawzip.employerdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeRepository employeeRepository;
    //or we can create a constructor and do it in another way without using @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    @GetMapping
    public List<Employee> getEmployeeDetails(){
        return employeeService.getEmployeeDetails();
    }
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }
    @PostMapping
    public void insertEmployeeDetails(@RequestBody Employee employee){
        employeeService.insertEmployeeDetails(employee);
    }
    @DeleteMapping("/delete")
    public void deleteEmployeeDetails(@RequestParam (value = "id") Long id){
        employeeService.deleteEmployeeById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable("id") Long id){
        employeeService.deleteEmployeeById(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable("id") Long id, @RequestBody Employee employee){
        Optional<Employee> employeeData = employeeRepository.findById(id);
        if (employeeData.isPresent()) {
            return new ResponseEntity(employeeService.updateEmployeeById(employee), HttpStatus.OK);
           }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
    @PutMapping("/edit")
    public ResponseEntity<Employee> updateEmployeeDetailsById(@RequestParam (value = "id") Long id,
                                                    @RequestBody Employee employee){
        if (id != employee.getId()){ return new ResponseEntity(HttpStatus.BAD_REQUEST);}
       return new ResponseEntity(employeeService.updateEmployeeDetailsById(employee), HttpStatus.OK);
    }
}
