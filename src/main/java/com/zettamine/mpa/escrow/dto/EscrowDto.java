package com.zettamine.mpa.escrow.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.zettamine.mpa.escrow.constants.EscrowConstants;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EscrowDto {
	
	@NotBlank(message = "Company Name should not be a null or empty")
    @Pattern(regexp= EscrowConstants.NAMES_REGEX, message = EscrowConstants.INVALID_NAME)
	private String escoName;
	
	@NotBlank(message = "Address should not be null or empty")
	private String address;
	private String city;
	private String state;
	
	@NotBlank(message = "Zipcode can not be a null or empty")
    @Pattern(regexp= EscrowConstants.ZIPCODE_REGEX, message = EscrowConstants.INVALID_ZIPCODE)
	private String zipcode;
	
	@NotEmpty(message = "Mobile Number can not be a null or empty")
    @Pattern(regexp= EscrowConstants.PHONE_REGEX, message = EscrowConstants.INVALID_PHONE_NUMBER)
	private String phone;
	
	@NotEmpty(message = "Email should not be null or empty")
	@Pattern(regexp = EscrowConstants.EMAIL_REGEX, message = EscrowConstants.INVALID_EMAIL)
	private String email;
	
	@NotEmpty(message = "Email should not be null or empty")
	@Pattern(regexp = EscrowConstants.ACCOUNT_NUMBER_REGEX, message = EscrowConstants.INVALID_ACCOUNT_NUMBER)
	private String inEscrowAcNo;
	
	@NotEmpty(message = "Escrow bank name should not be null or empty")
	@Pattern(regexp = EscrowConstants.NAMES_REGEX, message = EscrowConstants.INVALID_NAME)
	private String esAcBankName;
	
	private Integer esProcessTime;
	
  
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<EscrowServiceAreaDto> serviceArea = new ArrayList<>();
	
	
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<EscrowAgentDto> escrowAgent = new ArrayList<>();
       
              
}
