package com.rawzip.employerdemo.repository;

import com.rawzip.employerdemo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long>{

}
