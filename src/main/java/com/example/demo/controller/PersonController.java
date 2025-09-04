package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.demo.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons")
    public String listPersons(Model model) {
        model.addAttribute("persons", personRepository.findAll());
        return "persons";
    }


    @PostMapping("/persons")
    public String addPerson(@RequestParam String name, @RequestParam int age) {
        personRepository.save(new Person());
        return "redirect:/persons";
    }
}

