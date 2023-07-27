package com.example.oneToOne_unidirectionalThymeleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oneToOne_unidirectionalThymeleaf.entity.Person;
import com.example.oneToOne_unidirectionalThymeleaf.repository.PersonRepository;

@Service
public class PersonServiceImplentation implements PersonService{
	
	@Autowired
	PersonRepository pRepo;

	@Override
	public void addDetails(Person person) {
		pRepo.save(person);
		
	}

}
