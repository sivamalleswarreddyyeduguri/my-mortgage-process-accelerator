package com.zettamine.mpa.escrow.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(ReqLoanCompositePrimaryKey.class)
public class EscrowReqLoanProduct {
	
	
	@Id
	@Column(name = "req_id")
	private Integer reqId;
	@Id
	@Column(name = "prod_id")
	private Integer prodId;
}
