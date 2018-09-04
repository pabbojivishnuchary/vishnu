package com.ibs.datademo;

import java.util.Date;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ibs.datademo.entities.Ticket;
import com.ibs.datademo.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementAppApplication {
	
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		
		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService",TicketBookingService.class);
		
		Ticket ticket = new Ticket();
		ticket.setBookingDate("28/09/2018");
		ticket.setSourceStation("hyderabad");
		ticket.setDestStation("Cochin");
		ticket.setPassengerName("vishnu");
		ticket.setEmail("vishnu@gmail.com");
		ticketBookingService.createTicket(ticket);
	}
	
	
}
