package com.example.cropadvisor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/index"})
    public String home() {
        return "index";
    }

    @GetMapping("/crop-advisory")
    public String cropAdvisory() {
        return "crop-advisory";
    }

    @GetMapping("/weather")
    public String weather() {
        return "weather";
    }

    @GetMapping("/reports")
    public String reports() {
        return "reports";
    }
}