package com.rawzip.employerdemo.service;

import com.rawzip.employerdemo.entity.Address;
import com.rawzip.employerdemo.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    public void insertAddress(Address address) {
        addressRepository.save(address);
    }

    public void deleteAddressById(Long addressId) {
        addressRepository.deleteById(addressId);
    }

    public void updateAddressById(Address address) {
        addressRepository.save(address);
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Optional<Address> getAddressById(Long addressId) {
        return addressRepository.findById(addressId);
    }
}
