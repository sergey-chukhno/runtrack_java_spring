package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

public class UserForm {

    @NotBlank(message = "Le nom est obligatoire")
    private String name;

    @NotNull(message = "L'âge est obligatoire")
    @Min(value = 1, message = "L'âge doit être au moins 1")
    @Max(value = 120, message = "L'âge ne peut pas dépasser 120")
    private Integer age;

    // Getters et Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
}
