package com.rawzip.employerdemo.controller;

import com.rawzip.employerdemo.entity.Department;
import com.rawzip.employerdemo.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

private DepartmentService departmentService;
public DepartmentController(DepartmentService departmentService){
    this.departmentService= departmentService;
}

@GetMapping
    public void GetDepartment(){

}
@PostMapping
    public void InsertDepartment(@RequestBody Department department){
    departmentService.InsertDepartment(department);

}
@DeleteMapping
    public void DeleteDepartmentById(@RequestParam (value = "department_id") Long department_id){
    departmentService.DeleteDepartmentById(department_id);

}
@PutMapping
    public void UpdateDepartment(){

}
}
