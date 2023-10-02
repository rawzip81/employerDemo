package com.rawzip.employerdemo.repository;

import com.rawzip.employerdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
     @Query(value="select * from employee where last_name like ?1%", nativeQuery = true)
//   @Query(value="select * from employee where last_name=?1", nativeQuery = true)
//   @Query(value = "select * from employee where phone_number=1111", nativeQuery = true)
  public List<Employee> findByLastName(String lastName);
}
