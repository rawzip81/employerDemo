package com.rawzip.employerdemo.controller;

import com.rawzip.employerdemo.entity.Address;
import com.rawzip.employerdemo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAddress(){
      return  addressService.getAllAddresses();
    }
    @GetMapping("/view")
    public Optional<Address> getAddressById(@RequestParam (value = "id", required = false ) Long address_id){
     return addressService.getAddressById(address_id);
    }
    @PostMapping
    public void insertAddress(@RequestBody Address address){
        addressService.insertAddress(address);
    }
    @DeleteMapping("/id")
    public void deleteAddressById(@RequestParam (value = "id") Long address_id){
        addressService.deleteAddressById(address_id);
    }
    @PutMapping("/update")
    public void updateAddress(@RequestParam (value = "id") Long address_id, @RequestBody Address address){
        addressService.updateAddressById(address);
    }
}
