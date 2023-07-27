package com.example.oneToOne_unidirectionalThymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oneToOne_unidirectionalThymeleaf.entity.Address;

@Repository
public interface AddressRepository  extends JpaRepository<Address, Integer>{

}
