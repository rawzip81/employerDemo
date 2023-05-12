package com.rawzip.employerdemo.entity;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column
    @SequenceGenerator(name="employee_sequence",
            sequenceName = "employee_sequence",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_sequence")
    private Long id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String dob;
    @Column
    private String hire_date;




}
