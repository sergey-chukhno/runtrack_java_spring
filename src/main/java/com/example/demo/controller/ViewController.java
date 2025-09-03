package com.example.demo.controller;

import com.example.demo.model.UserForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {

    @GetMapping("/welcome")
    public String showForm(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "view";
    }

    @PostMapping("/welcome")
    public String handleForm(
            @Valid @ModelAttribute("userForm") UserForm userForm,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "view"; // retourne le formulaire avec les erreurs
        }

        model.addAttribute("message", "Bienvenue, " + userForm.getName() + ", âge " + userForm.getAge() + " !");
        return "view";
    }
}

