package com.example.oneToOne_unidirectionalThymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oneToOne_unidirectionalThymeleaf.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
