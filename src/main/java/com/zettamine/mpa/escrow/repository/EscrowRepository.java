package com.zettamine.mpa.escrow.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zettamine.mpa.escrow.entity.Escrow;

public interface EscrowRepository extends JpaRepository<Escrow, Integer> {
			
	  public Optional<Escrow> findByEscoName(String escoName);
	  Optional<Escrow> findByEscoNameAndPhoneAndEmailAndInEscrowAcNo(String escoName, String phone, String email, String inEscrowAcNo); 
}
