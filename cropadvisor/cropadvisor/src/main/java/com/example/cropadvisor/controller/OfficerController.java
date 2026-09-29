package com.example.cropadvisor.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.cropadvisor.entity.Officer;
import com.example.cropadvisor.service.OfficerService;

@Controller
@RequestMapping("/officers")
public class OfficerController {

    private final OfficerService officerService;

    public OfficerController(OfficerService officerService) {
        this.officerService = officerService;
    }

    @GetMapping
    public String officersPage(Model model) {
        List<Officer> officers = officerService.getAllOfficers();
        model.addAttribute("officers", officers);
        return "officers";
    }

    @PostMapping("/register")
    @ResponseBody
    public Officer registerOfficer(@RequestBody Officer officer) {
        return officerService.registerOfficer(officer);
    }
}