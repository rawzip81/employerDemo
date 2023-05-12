package com.rawzip.employerdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="department")
public class Department {
@Id
@Column
    private Long department_id;
@Column
    private String department_name;
@Column
    private Long department_code;

}
