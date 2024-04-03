package com.zettamine.mpa.escrow.dto;

import lombok.Data;

@Data
public class SearchCriteria {
	
	private Integer escrowId;
	private String name;
	private String state;
	private String city;
	private Integer zipcode;

}
