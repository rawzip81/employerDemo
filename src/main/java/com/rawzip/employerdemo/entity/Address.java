package com.rawzip.employerdemo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.List;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long addressId;
    @Column
    private String streetName;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private Long zipCode;
    @Column
    private String country;



}
