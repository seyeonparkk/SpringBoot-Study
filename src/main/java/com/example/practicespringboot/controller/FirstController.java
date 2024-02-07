package com.example.practicespringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/he")
    public String niceToMeetYou(Model model){
        return "greetings";
    }
}
