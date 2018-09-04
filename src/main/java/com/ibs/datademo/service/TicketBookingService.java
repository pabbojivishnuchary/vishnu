package com.ibs.datademo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.datademo.dao.TicketBookingDao;
import com.ibs.datademo.entities.Ticket;

@Service
public class TicketBookingService {

	
	@Autowired
	private TicketBookingDao ticketBookingDao;
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}
	
	
	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findById(ticketId).orElse(null);
	}

	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}


	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
		
	}


	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketfromdb = ticketBookingDao.findById(ticketId).orElse(null);
		ticketfromdb.setEmail(newEmail);
		Ticket updatedticket = ticketBookingDao.save(ticketfromdb);
		return updatedticket;
	}
	
	
	

}
