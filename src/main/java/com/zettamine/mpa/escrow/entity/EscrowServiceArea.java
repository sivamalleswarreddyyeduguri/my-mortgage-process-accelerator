package com.zettamine.mpa.escrow.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import com.zettamine.mpa.escrow.dto.EscrowDto;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "escrow_service_area")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EscrowServiceArea extends BaseEntity {
		
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "service_area_id")
	 private Integer serviceAreaId;
	 
	 private String county;
	 
	 private String city;
	 
	 private String state;
	 
	 private String zipcode;
	 
	 @ManyToOne
	 @JoinColumn(name = "esco_id")
	 private Escrow escrow;
}
