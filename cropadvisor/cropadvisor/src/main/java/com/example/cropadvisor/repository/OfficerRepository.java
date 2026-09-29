package com.example.cropadvisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cropadvisor.entity.Officer;

public interface OfficerRepository extends JpaRepository<Officer, Long> {

}