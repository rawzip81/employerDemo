package com.rawzip.employerdemo.controller;

import com.rawzip.employerdemo.entity.Department;
import com.rawzip.employerdemo.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

private DepartmentService departmentService;
public DepartmentController(DepartmentService departmentService){
    this.departmentService= departmentService;
}

@GetMapping
    public List<Department> getDepartment(Department department){
    return departmentService.getDepartment(department);

}
@PostMapping
    public void insertDepartment(@RequestBody List<Department> department){
    departmentService.InsertDepartment(department);

}
@DeleteMapping("/delete")
    public void deleteDepartmentById(@RequestParam (value = "id") Long department_id){
    departmentService.DeleteDepartmentById(department_id);

}
@PutMapping("/update")
    public void updateDepartment(@RequestParam (value = "id") Long department_id,
                                 @RequestBody Department department){
    departmentService.updateDepartment(department);
}
}
