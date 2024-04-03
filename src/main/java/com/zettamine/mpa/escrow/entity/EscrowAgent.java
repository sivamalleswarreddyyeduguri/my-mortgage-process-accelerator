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
	 
	@NotBlank(message = "*Required")
	@Column(name = "escrow_licence_id", unique = true)
	
	@NotBlank(message = "*Required")
	private String escrowLicenceId;
	
	@NotBlank(message = "*Required")
	@Column(name = "first_name")
	private String firstName;
	
	@NotBlank(message = "*Required")
	@Column(name = "last_name")
	private String lastName;
	
	@NotBlank(message = "*Required")
	@Column(unique = true)
	private String email;
	
	@NotBlank(message = "*Required")
	@Column(unique = true)
	private String phone;
	
	@NotNull(message = "*Required")
	@Column(name = "avg_tx_vol")
	private Integer avgTxVol;
	
	@NotNull(message = "*Required")
	@Column(name = "tx_success_rate")
	private Float txSuccessRate;
	
	@NotBlank(message = "*Required")
	@Column(name = "escrow_sw")
	private String escrowSw;
	
	 @ManyToOne
	 @JoinColumn(name = "esco_id")
	 @NotNull(message = "*Required")
	 private Escrow escrow;
}
