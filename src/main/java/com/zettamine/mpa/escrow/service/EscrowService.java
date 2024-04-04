package com.zettamine.mpa.escrow.service;

import java.util.List;

import com.zettamine.mpa.escrow.dto.EscrowDto;
import com.zettamine.mpa.escrow.dto.SearchCriteria;

public interface EscrowService {
	
	List<EscrowDto> getAll();
	
	EscrowDto findById(Integer escrowId);
	
	void save(EscrowDto escrowDto);
	
	EscrowDto findByEscrowName(String escoName);
	
	boolean update(EscrowDto escrowDto);
	
	List<EscrowDto> search(SearchCriteria criteria); 
	
}
