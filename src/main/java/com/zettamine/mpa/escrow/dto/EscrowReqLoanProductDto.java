package com.zettamine.mpa.escrow.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EscrowReqLoanProductDto {
	
	private Integer reqId;

	private Integer prodId;
}
