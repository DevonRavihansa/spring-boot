package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Devon Ravihansa on 8/5/2017.
 */
@Controller
public class DefaultController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("pageTitle", "Spring Thymeleaf Home Page");
        model.addAttribute("content", "dashboard");
        return "general";
    }

    @RequestMapping("/login")
    public String signIn(Model model){
        model.addAttribute("pageTitle", "Login Page");
        model.addAttribute("content", "login");
        return "general";
    }
}
