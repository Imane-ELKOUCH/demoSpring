package com.everis.projectdemodao.repositories;

import org.springframework.data.repository.CrudRepository;

import com.everis.projectdemodao.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{

}
