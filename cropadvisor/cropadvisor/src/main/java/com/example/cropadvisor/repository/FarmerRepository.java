package com.example.cropadvisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cropadvisor.entity.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {

}