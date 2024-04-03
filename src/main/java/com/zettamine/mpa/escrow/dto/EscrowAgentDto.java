package com.zettamine.mpa.escrow.dto;

import lombok.Data;

@Data
public class EscrowAgentDto {
		
	private String escrowLicenceId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private Integer avgTxVol;
	private Float txSuccessRate;
	private String escrowSw;
	
    private String escoId;
}
