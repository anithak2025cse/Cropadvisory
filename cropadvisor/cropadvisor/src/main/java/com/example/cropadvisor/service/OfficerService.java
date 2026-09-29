package com.example.cropadvisor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cropadvisor.entity.Officer;
import com.example.cropadvisor.repository.OfficerRepository;

@Service
public class OfficerService {

    private final OfficerRepository officerRepository;

    public OfficerService(OfficerRepository officerRepository) {
        this.officerRepository = officerRepository;
    }

    public Officer registerOfficer(Officer officer) {
        return officerRepository.save(officer);
    }

    public List<Officer> getAllOfficers() {
        return officerRepository.findAll();
    }
}