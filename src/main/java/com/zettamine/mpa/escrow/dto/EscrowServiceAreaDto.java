package com.zettamine.mpa.escrow.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EscrowServiceAreaDto {
		
	
	 private Integer serviceAreaId;
	 
	 @NotBlank(message = "*Required")
	 private String county;
	 
	 @NotBlank(message = "*Required")
	 private String city;
	 
	 @NotBlank(message = "*Required")
	 private String state;
	 
	 @NotBlank(message = "*Required")
	 private String zipcode;
	 
	 private EscrowDto escrow;
	
}
