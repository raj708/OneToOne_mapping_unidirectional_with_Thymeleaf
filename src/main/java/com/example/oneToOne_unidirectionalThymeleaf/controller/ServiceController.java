package com.example.oneToOne_unidirectionalThymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.oneToOne_unidirectionalThymeleaf.entity.Address;
import com.example.oneToOne_unidirectionalThymeleaf.entity.Person;
import com.example.oneToOne_unidirectionalThymeleaf.service.AddressService;
import com.example.oneToOne_unidirectionalThymeleaf.service.PersonService;

@Controller
public class ServiceController {
	@Autowired
	PersonService pService;
	@Autowired
	AddressService aService;
	
	@PostMapping("/addDetails")
	String addDetails(@ModelAttribute Person person, @ModelAttribute Address address) {
		Person p=new Person();
		p.setName(person.getName());
		p.setAddress(address);
		pService.addDetails(p);
		return "index";
	}

}
