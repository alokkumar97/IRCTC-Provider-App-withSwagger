package com.REST.IRCTC.Request;

import lombok.Data;

@Data
public class Passenger {

	
	private String name;
	private String from;
	private String to;
	private String doj;
	private Integer trainNum;
}
