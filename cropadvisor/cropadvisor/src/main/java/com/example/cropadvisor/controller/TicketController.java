package com.example.cropadvisor.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.cropadvisor.entity.Ticket;
import com.example.cropadvisor.service.TicketService;

@Controller
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public String ticketsPage(Model model) {
        List<Ticket> tickets = ticketService.getAllTickets();
        model.addAttribute("tickets", tickets);
        return "tickets";
    }

    @PostMapping("/save")
    @ResponseBody
    public Ticket saveTicket(@RequestBody Ticket ticket) {
        return ticketService.saveTicket(ticket);
    }
}