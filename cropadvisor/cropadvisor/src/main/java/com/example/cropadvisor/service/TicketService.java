package com.example.cropadvisor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cropadvisor.entity.Ticket;
import com.example.cropadvisor.repository.TicketRepository;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
}