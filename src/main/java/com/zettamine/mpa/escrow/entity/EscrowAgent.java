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
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "escrow_agent")
@AllArgsConstructor
@NoArgsConstructor
public class EscrowAgent extends BaseEntity {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "escrow_agent_id")
	private Integer escrowAgentId;
	 
	@Column(name = "escrow_licence_id", unique = true, nullable = false )
	private String escrowLicenceId;
	
	@Column(name = "first_name", nullable = false )
	private String firstName;
	
	@Column(name = "last_name", nullable = false )
	private String lastName;
	
	@Column(unique = true, nullable = false )
	private String email;
	
	@Column(unique = true, nullable = false )
	private String phone;
	
	@Column(name = "avg_tx_vol", nullable = false )
	private Integer avgTxVol;
	
	@Column(name = "tx_success_rate", nullable = false )
	private Float txSuccessRate;
	
	@Column(name = "escrow_sw", nullable = false )
	private String escrowSw;
	
	 @ManyToOne
	 @JoinColumn(name = "esco_id")
	 private Escrow escrow;
}
