package com.everis.projectdemodao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.projectdemodao.entity.Person;
import com.everis.projectdemodao.repositories.PersonRepository;

@RestController
public class MainController {
	
	@Autowired
	PersonRepository personRepository;
	
	@GetMapping(path="/hello")
	public String sayHello() {
		return "Hello";
	}
	
	
	@GetMapping(path="/add")
	public String addPerson() {
		Person p  = new Person(1, "amine", "flehi"); 
		personRepository.save(p);
		return "Success";
	}
}
