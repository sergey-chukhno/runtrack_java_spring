package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/welcome")
    public String showForm() {
        return "view";
    }

    @PostMapping("/welcome")
    public String handleForm(@RequestParam("name") String name, Model model) {
        model.addAttribute("message", "Bienvenue, " + name + " !");
        return "view";
    }

}
