package com.rawzip.employerdemo.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "EmployeeId", referencedColumnName = "id")
    private List<Address> address;


}
