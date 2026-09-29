package com.example.cropadvisor.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.cropadvisor.entity.Region;
import com.example.cropadvisor.service.RegionService;

@Controller
@RequestMapping("/regions")
public class RegionController {

    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping
    public String regionsPage(Model model) {
        List<Region> regions = regionService.getAllRegions();
        model.addAttribute("regions", regions);
        return "regions";
    }

    @PostMapping("/save")
    @ResponseBody
    public Region saveRegion(@RequestBody Region region) {
        return regionService.saveRegion(region);
    }
}