package com.REST.IRCTC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.REST.IRCTC.Request.Passenger;
import com.REST.IRCTC.Response.Ticket;
import com.REST.IRCTC.Service.BookingService;

@RestController
public class TicketController {

	@Autowired
	private BookingService service;
	
	
	@PostMapping("/book")
	public ResponseEntity<Ticket>book(@RequestBody Passenger passenger){
		Ticket bookTicket = service.bookTicket(passenger);
		
		return new ResponseEntity<Ticket>(bookTicket, HttpStatus.CREATED);
	}
	
	@GetMapping("/getticket/{ticketNum}")
	public ResponseEntity<Ticket> getTicket(@PathVariable Integer ticketNum){
		Ticket ticket = service.getTicket(ticketNum);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}
	
}
