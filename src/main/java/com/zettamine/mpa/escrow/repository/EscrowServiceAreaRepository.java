package com.zettamine.mpa.escrow.repository;


import java.io.Serializable;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.zettamine.mpa.escrow.entity.EscrowServiceArea;

public interface EscrowServiceAreaRepository extends JpaRepository<EscrowServiceArea, Serializable> {
	
	public Optional<EscrowServiceArea> findByEscoIdAndZipCode(Integer escoId, String zipcode);

}
