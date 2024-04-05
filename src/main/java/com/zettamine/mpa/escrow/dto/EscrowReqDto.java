package com.zettamine.mpa.escrow.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EscrowReqDto {
	
	private Integer reqId;
	
	@NotBlank(message = "*Required")
	private String reqName;
	
	private String description;
}
