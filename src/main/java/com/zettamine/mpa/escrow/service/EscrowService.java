package com.zettamine.mpa.escrow.service;

import java.util.List;

import com.zettamine.mpa.escrow.dto.EscrowDto;
import com.zettamine.mpa.escrow.dto.SearchCriteria;

public interface EscrowService {
	
	void save(EscrowDto escrowDto);
	
	EscrowDto findById(Integer escrowId);
	
	EscrowDto findByEscrowName(String escoName);
	
	List<EscrowDto> getAll();
	
	boolean update(EscrowDto escrowDto);
	
	List<EscrowDto> search(SearchCriteria criteria); 
	
}
