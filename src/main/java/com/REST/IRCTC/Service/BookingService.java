package com.REST.IRCTC.Service;

import com.REST.IRCTC.Request.Passenger;
import com.REST.IRCTC.Response.Ticket;

public interface BookingService {

	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicket(Integer ticketNum);
}
