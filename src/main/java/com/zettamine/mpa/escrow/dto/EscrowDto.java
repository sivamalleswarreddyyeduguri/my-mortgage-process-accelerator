package com.zettamine.mpa.escrow.dto;

import java.util.List;

import com.zettamine.mpa.escrow.constants.EscrowConstants;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EscrowDto {

	private Integer escoId;
	
    @NotBlank(message = "*Required")
	private String escoName;
	
	@NotBlank(message = "*Required")
	private String address;
	
	@NotBlank(message = "*Required")
	private String city;
	
	@NotBlank(message = "*Required")
	private String state;
	
	@NotBlank(message = "*Required")
	private String zipcode;
	
	@NotBlank(message = "*Required")
	private String phone;
	
	@NotBlank(message = "*Required")
	@Pattern(regexp = EscrowConstants.EMAIL_REGEX, message = EscrowConstants.INVALID_EMAIL)
	private String email;
	
	@NotBlank(message = "*Required")
	private String inEscrowAcNo;
	
	@NotBlank(message = "*Required")
	private String esAcBankName;
	
	@NotNull(message = "*Required")
	private Integer esProcessTime;
	
    private List<EscrowServiceAreaDto> serviceArea;
    
    private List<EscrowAgentDto> escrowAgent;
	
	
              
}
