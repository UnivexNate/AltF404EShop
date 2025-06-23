package com.example.catalogue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {

    @GetMapping("/admin")
    public String admin() {
        return "admin.html"; // retourne le fichier depuis /static/admin.html
    }
    @GetMapping("/login")
    public String login() {
        return "login.html"; // retourne le fichier depuis /static/admin.html
    }
}
