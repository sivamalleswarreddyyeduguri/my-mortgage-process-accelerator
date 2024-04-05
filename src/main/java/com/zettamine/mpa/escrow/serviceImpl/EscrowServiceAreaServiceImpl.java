package com.zettamine.mpa.escrow.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zettamine.mpa.escrow.constants.EscrowConstants;
import com.zettamine.mpa.escrow.dto.EscrowServiceAreaDto;
import com.zettamine.mpa.escrow.entity.Escrow;
import com.zettamine.mpa.escrow.entity.EscrowServiceArea;
import com.zettamine.mpa.escrow.repository.EscrowRepository;
import com.zettamine.mpa.escrow.repository.EscrowServiceAreaRepository;
import com.zettamine.mpa.escrow.service.EscrowServiceAreaService;
import com.zettamine.mpa.escrow.utils.StringUtil;
import com.zettamine.mpa.exception.EscrowAlreadyExistsException;
import com.zettamine.mpa.exception.ResourceNotFoundException;
import com.zettamine.mpa.mapper.EscrowServiceAreaMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EscrowServiceAreaServiceImpl implements EscrowServiceAreaService {

     private EscrowServiceAreaMapper serviceAreaMapper;
     private EscrowServiceAreaRepository serviceAreaRepository;

     
	@Override
	public void save(EscrowServiceAreaDto serviceAreaDto) {
			 
		  EscrowServiceArea serviceArea = serviceAreaMapper.toEntity(serviceAreaDto);
		  StringUtil.escrowServiceAreaRemoveSpaces(serviceArea);
		  
		  // If escrow id is not present in db that exception is Already  handled by global exception handler 
		  
		  
//		  if(serviceAreaDto.getEscrow().getEscoId() != null) {
//			    Optional<Escrow> escrow = escrowRepository.findById(serviceAreaDto.getEscrow().getEscoId());  
//			    if(escrow.isEmpty()) {
//			    	 throw new ResourceNotFoundException(EscrowConstants.NOT_FOUND + serviceAreaDto.getEscrow().getEscoId());
//			    }
//		  }
		  
		  
		 
		  serviceAreaRepository.save(serviceArea);
	}	
	

	@Override
	public EscrowServiceAreaDto findById(Integer srvcId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EscrowServiceAreaDto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EscrowServiceAreaDto> findByEscoId(Integer escoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(EscrowServiceAreaDto escSrvcDto) {
		// TODO Auto-generated method stub
		return false;
  }	
			
}
