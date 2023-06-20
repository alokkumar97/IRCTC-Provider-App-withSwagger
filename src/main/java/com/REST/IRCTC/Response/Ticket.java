package com.REST.IRCTC.Response;

import lombok.Data;

@Data
public class Ticket {

	private Integer ticketNum;
	private Double cost;
	private String status;	
	private String name;
	private String from;
	private String to;
	private String doj;
	private Integer trainNum;
}
