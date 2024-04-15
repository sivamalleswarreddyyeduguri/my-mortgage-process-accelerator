package com.zettamine.mpa.escrow.dto;

import com.zettamine.mpa.escrow.constants.EscrowConstants;
import com.zettamine.mpa.escrow.constants.EscrowReqConstants;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(name = "Escrow Requirment Dto" , description = "Schema to hold requirment data")
public class EscrowReqDto {
    
   
    @NotBlank(message = EscrowReqConstants.REQ_NAME_REQUIRED)
    @Pattern(regexp = EscrowConstants.NAMES_REGEX, message = EscrowConstants.INVALID_NAME)
    @Schema(description = "The name of the escrow requirement.", example = "PROPERTY TAX PENALTY PAYMENTS")
    private String reqName;
    
    
    @Schema(description = "The description of the escrow requirement.", example = "Escrow account may cover penalties for late property tax payments")
    private String description;
}
