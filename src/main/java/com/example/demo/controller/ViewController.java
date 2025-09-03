package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ViewController {
    @GetMapping("/message")
    public String sayMessage(Model model) {
        model.addAttribute("message", "Hello, this is a message shown with Thymeleaf");
        return "view";
    }
}
