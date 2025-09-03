package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/messages")
    public String sayMessage(Model model) {
        List<String> messages = List.of("Hello", "How are you?", "Have a nice day!");
        model.addAttribute("messages", messages);
        return "view";
    }
}
