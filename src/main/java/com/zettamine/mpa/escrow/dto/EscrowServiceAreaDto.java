package com.zettamine.mpa.escrow.dto;

import com.zettamine.mpa.escrow.constants.EscrowConstants;
import com.zettamine.mpa.escrow.entity.Escrow;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EscrowServiceAreaDto {
		
	@NotBlank(message = "County should not be a null or empty")
    @Pattern(regexp= EscrowConstants.NAMES_REGEX, message = EscrowConstants.INVALID_NAME)
	 private String county;
	
	@NotBlank(message = "City should not be a null or empty")
    @Pattern(regexp= EscrowConstants.NAMES_REGEX, message = EscrowConstants.INVALID_NAME)
	 private String city;
	
	@NotBlank(message = "State should not be a null or empty")
    @Pattern(regexp= EscrowConstants.NAMES_REGEX, message = EscrowConstants.INVALID_NAME)
	 private String state;
	
	 @NotBlank(message = "Zipcode can not be a null or empty")
     @Pattern(regexp= EscrowConstants.ZIPCODE_REGEX, message = EscrowConstants.INVALID_ZIPCODE)
	 private String zipcode;
	 private Escrow escrow;
	 
}
