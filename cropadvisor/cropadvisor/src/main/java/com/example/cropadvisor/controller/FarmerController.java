package com.example.cropadvisor.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.cropadvisor.entity.Farmer;
import com.example.cropadvisor.service.FarmerService;

@Controller
@RequestMapping("/farmers")
public class FarmerController {

    private final FarmerService farmerService;

    public FarmerController(FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    // SHOW FARMERS
    @GetMapping
    public String farmersPage(Model model) {

        List<Farmer> farmers = farmerService.getAllFarmers();

        model.addAttribute("farmers", farmers);

        return "farmers";
    }

    // ADD
    @PostMapping("/register")
    public String registerFarmer(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String phone) {

        Farmer farmer = new Farmer();

        farmer.setName(name);
        farmer.setEmail(email);
        farmer.setPassword(password);
        farmer.setPhone(phone);

        farmerService.registerFarmer(farmer);

        return "redirect:/farmers";
    }

    // UPDATE
    @PostMapping("/update/{id}")
    public String updateFarmer(
            @PathVariable Long id,
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String phone) {

        Farmer farmer = new Farmer();

        farmer.setName(name);
        farmer.setEmail(email);
        farmer.setPassword(password);
        farmer.setPhone(phone);

        farmerService.updateFarmer(id, farmer);

        return "redirect:/farmers";
    }

    // DELETE
    @PostMapping("/delete/{id}")
    public String deleteFarmer(@PathVariable Long id) {

        farmerService.deleteFarmer(id);

        return "redirect:/farmers";
    }
}