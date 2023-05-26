package com.rawzip.employerdemo.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

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
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String dob;
    @Column
    private String hireDate;
    @Column
    private Long phoneNumber;




}
