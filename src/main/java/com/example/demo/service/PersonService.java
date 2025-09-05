package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

public class PersonService {
    PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person findById(Long id) {
        return repository.findById(id).orElse(null);
    }
    public Person findByName(String name) {
        return repository.findByName(name);
    }
}
