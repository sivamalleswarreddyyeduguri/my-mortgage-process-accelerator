package com.zettamine.mpa.escrow.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "escrow_company")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Escrow extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "esco_id")
    @SequenceGenerator(name = "esco_id", initialValue = 101, allocationSize = 1)
	@Column(name = "esco_id")
	private Integer escoId;
	
	@NotBlank(message = "*Required")
    @Column(name = "esco_name", unique = true)
	private String escoName;
	
	@NotBlank(message = "*Required")
	private String address;
	
	@NotBlank(message = "*Required")
	private String city;
	
	@NotBlank(message = "*Required")
	private String state;
	
	@NotBlank(message = "*Required")
	private String zipcode;
	
	@NotBlank(message = "*Required")
	@Column(name = "phone", unique = true)
	private String phone;
	
	@NotBlank(message = "*Required")
	@Column(name = "email", unique = true)
	private String email;
	
	@NotBlank(message = "*Required")
	@Column(name = "in_escrow_ac_no", unique = true)
	private String inEscrowAcNo;
	
	@NotBlank(message = "*Required")
	@Column(name = "es_ac_bank_name")
	private String esAcBankName;
	
	@NotNull(message = "*Required")
	@Column(name = "es_process_time")
	private Integer esProcessTime;
	
	
	@OneToMany(mappedBy = "escrow", cascade = CascadeType.ALL)
    private List<EscrowServiceArea> serviceArea;
	
	@OneToMany(mappedBy = "escrow", cascade = CascadeType.ALL)
    private List<EscrowAgent> escrowAgent;
}
