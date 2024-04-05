package com.zettamine.mpa.escrow.service;

import com.zettamine.mpa.escrow.dto.EscrowServiceAreaDto;
import java.util.List;
import java.util.Optional;
public interface EscrowServiceAreaService {


	void save(EscrowServiceAreaDto serviceAreaDto);
	
	EscrowServiceAreaDto findById(Integer srvcId);
	
	List<EscrowServiceAreaDto> getAll();
	
	List<EscrowServiceAreaDto> findByEscoId(Integer escoId);
	
	boolean update(EscrowServiceAreaDto escSrvcDto);

	Optional<EscrowServiceAreaDto> findByEscoIdAndZipCode(Integer escoId, String zipcode);


}
