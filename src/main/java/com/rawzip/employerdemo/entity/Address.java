package com.rawzip.employerdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="address")
public class Address {
    @Id
    @Column
    private Long address_id;
    @Column
    private String street_name;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private Long zip_code;
    @Column
    private String country;

}
