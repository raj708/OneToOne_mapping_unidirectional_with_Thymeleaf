package com.example.oneToOne_unidirectionalThymeleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oneToOne_unidirectionalThymeleaf.entity.Address;
import com.example.oneToOne_unidirectionalThymeleaf.repository.AddressRepository;

@Service
public class AddressServiceImplementation implements AddressService{
	
	@Autowired
	AddressRepository aRepo;

	@Override
	public void addAddress(Address address) {
		aRepo.save(address);
		
	}

}
