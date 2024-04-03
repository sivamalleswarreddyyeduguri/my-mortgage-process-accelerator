package com.zettamine.mpa.escrow.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "escrow_service_area")
@AllArgsConstructor
@NoArgsConstructor
public class EscrowServiceArea extends BaseEntity {
		
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "service_area_id")
	 private Integer serviceAreaId;
	 
	 @NotBlank(message = "*Required")
	 private String county;
	 
	 @NotBlank(message = "*Required")
	 private String city;
	 
	 @NotBlank(message = "*Required")
	 private String state;
	 
	 @NotBlank(message = "*Required")
	 private String zipcode;
	 
	 @ManyToOne
	 @JoinColumn(name = "esco_id")
	 private Escrow escrow;
}
