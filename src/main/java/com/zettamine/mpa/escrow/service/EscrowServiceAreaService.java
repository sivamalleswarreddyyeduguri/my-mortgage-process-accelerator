package com.zettamine.mpa.escrow.service;

import java.util.List;

import com.zettamine.mpa.escrow.dto.EscrowServiceAreaDto;

public interface EscrowServiceAreaService {

	void save(EscrowServiceAreaDto escSrvcDto);
	
	EscrowServiceAreaDto findById(Integer srvcId);
	
	List<EscrowServiceAreaDto> getAll();
	
	List<EscrowServiceAreaDto> findByEscoId(Integer escoId);
	
	boolean update(EscrowServiceAreaDto escSrvcDto);

}
