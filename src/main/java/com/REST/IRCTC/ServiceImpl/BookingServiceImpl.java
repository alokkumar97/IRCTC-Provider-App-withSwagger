package com.REST.IRCTC.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.REST.IRCTC.Request.Passenger;
import com.REST.IRCTC.Response.Ticket;
import com.REST.IRCTC.Service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	private Integer ticketNumber = 1000;
	Map<Integer, Ticket> ticketMap = new HashMap<>();
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		
		Ticket ticket = new Ticket();
		BeanUtils.copyProperties(passenger, ticket);
		ticket.setCost(550.00);
		ticket.setStatus("CONFIRMED");
		ticket.setTicketNum(ticketNumber);
		
		ticketMap.put(ticketNumber, ticket);
		ticketNumber ++;
		
		return ticket ;
	}

	@Override
	public Ticket getTicket(Integer ticketNumb) {
		if(ticketMap.containsKey(ticketNumb)) {
			return ticketMap.get(ticketNumb);
		}
		return null;
	}

}
