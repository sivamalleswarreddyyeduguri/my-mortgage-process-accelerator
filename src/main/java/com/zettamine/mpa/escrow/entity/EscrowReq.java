package com.zettamine.mpa.escrow.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "escrow_requirements")
@AllArgsConstructor
@NoArgsConstructor
public class EscrowReq extends BaseEntity{
     
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer reqId;
	@Column(name = "req_name")
	private String reqName;
	private String description;
	
}
