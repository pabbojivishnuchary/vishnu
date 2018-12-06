package com.ibs.datademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.datademo.entities.Ticket;
import com.ibs.datademo.service.TicketBookingService;

@RestController
@RequestMapping(value = "api/tickets")
public class TicketBookingController {
	
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping(value = "/createticket")
	public Ticket createTicket(@RequestBody Ticket ticket){
		return ticketBookingService.createTicket(ticket);	
	}
	
	@GetMapping(value = "/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId){
		return ticketBookingService.getTicketById(ticketId);

	}
	@GetMapping(value = "ticket/alltickets")
	public Iterable<Ticket> getAllBookedTickets(){
		System.out.println("Hello World");
		return ticketBookingService.getAllBookedTickets();
	}
	public void vishnu(){
		System.out.println("Happy birthday vishnu");
		System.out.println("Happy birthday Phani in advance");
	}
		
	@DeleteMapping(value = "/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId){
		ticketBookingService.deleteTicket(ticketId);
	}
	
	@PutMapping(value = "/ticket/{ticketId}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId,@PathVariable("newEmail") String newEmail){
		return ticketBookingService.updateTicket(ticketId,newEmail);
	}
	
	
}
