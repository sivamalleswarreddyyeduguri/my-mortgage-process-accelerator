package com.zettamine.mpa.escrow.dto;

import java.util.List;

import com.zettamine.mpa.escrow.entity.EscrowAgent;
import com.zettamine.mpa.escrow.entity.EscrowServiceArea;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EscrowDto {
		
	private String escoName;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String phone;
	private String email;
	private String inEscrowAcNo;
	private String esAcBankName;
	private Integer esProcessTime;
	
    private List<EscrowServiceAreaDto> serviceArea;
    private List<EscrowAgentDto> escrowAgent;

              
}
