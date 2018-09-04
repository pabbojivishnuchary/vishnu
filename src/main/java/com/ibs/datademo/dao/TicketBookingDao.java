package com.ibs.datademo.dao;

import org.springframework.data.repository.CrudRepository;

import com.ibs.datademo.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {
	
}
