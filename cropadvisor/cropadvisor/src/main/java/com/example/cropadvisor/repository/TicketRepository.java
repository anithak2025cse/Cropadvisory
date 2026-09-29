package com.example.cropadvisor.repository;

import com.example.cropadvisor.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}