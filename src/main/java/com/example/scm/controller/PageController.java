package com.example.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Prerna");
        model.addAttribute("youtubeChannel", "https://youtube.com/@yourchannel");
        model.addAttribute("githubRepo", "https://github.com/codergirlprerna");
        return "home"; // Refers to home.html inside /templates
    }
}
