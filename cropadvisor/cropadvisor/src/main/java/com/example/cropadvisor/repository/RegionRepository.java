package com.example.cropadvisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cropadvisor.entity.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {

}