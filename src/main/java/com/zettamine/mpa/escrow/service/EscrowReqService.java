package com.zettamine.mpa.escrow.service;

import java.util.List;

import com.zettamine.mpa.escrow.dto.EscrowReqDto;

public interface EscrowReqService {
	
	List<EscrowReqDto> getAll();
	
	EscrowReqDto findById(Integer escId);
	
	void save(EscrowReqDto escReqDto);
	

}
