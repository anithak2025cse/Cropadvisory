package com.example.cropadvisor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cropadvisor.entity.Region;
import com.example.cropadvisor.repository.RegionRepository;

@Service
public class RegionService {

    private final RegionRepository regionRepository;

    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    public Region saveRegion(Region region) {
        return regionRepository.save(region);
    }

    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }
}