package com.zettamine.mpa.escrow.dto;

import com.zettamine.mpa.escrow.entity.Escrow;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EscrowAgentDto {
	
	
	private Integer escrowAgentId;
	
	@NotBlank(message = "*Required")
	private String escrowLicenceId;
	
	@NotBlank(message = "*Required")
	private String firstName;
	
	@NotBlank(message = "*Required")
	private String lastName;
	
	@NotBlank(message = "*Required")
	private String email;
	
	@NotBlank(message = "*Required")
	private String phone;
	
	@NotNull(message = "*Required")
	private Integer avgTxVol;
	
	@NotNull(message = "*Required")
	private Float txSuccessRate;
	
	@NotBlank(message = "*Required")
	private String escrowSw;

	
	@NotNull(message = "*Required")
	private String escrow;
	
r
 @NotNull(message = "*Required")
	private String escrow;
}
