package com.example.cropadvisor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cropadvisor.entity.Farmer;
import com.example.cropadvisor.repository.FarmerRepository;

@Service
public class FarmerService {

    private final FarmerRepository farmerRepository;

    public FarmerService(FarmerRepository farmerRepository) {
        this.farmerRepository = farmerRepository;
    }

    // ADD
    public Farmer registerFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    // GET ALL
    public List<Farmer> getAllFarmers() {
        return farmerRepository.findAll();
    }

    // UPDATE
    public Farmer updateFarmer(Long id, Farmer farmer) {

        Farmer existing = farmerRepository.findById(id).orElse(null);

        if (existing != null) {

            existing.setName(farmer.getName());
            existing.setEmail(farmer.getEmail());
            existing.setPassword(farmer.getPassword());
            existing.setPhone(farmer.getPhone());

            return farmerRepository.save(existing);
        }

        return null;
    }

    // DELETE
    public void deleteFarmer(Long id) {
        farmerRepository.deleteById(id);
    }
}