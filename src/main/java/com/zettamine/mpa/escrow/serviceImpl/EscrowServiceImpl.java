package com.zettamine.mpa.escrow.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zettamine.mpa.escrow.constants.EscrowConstants;
import com.zettamine.mpa.escrow.dto.EscrowAgentDto;
import com.zettamine.mpa.escrow.dto.EscrowDto;
import com.zettamine.mpa.escrow.dto.EscrowServiceAreaDto;
import com.zettamine.mpa.escrow.dto.SearchCriteria;
import com.zettamine.mpa.escrow.entity.Escrow;
import com.zettamine.mpa.escrow.entity.EscrowAgent;
import com.zettamine.mpa.escrow.entity.EscrowServiceArea;
import com.zettamine.mpa.escrow.repository.EscrowRepository;
import com.zettamine.mpa.escrow.service.EscrowService;
import com.zettamine.mpa.escrow.utils.StringUtil;
import com.zettamine.mpa.exception.EscrowAlreadyExistsException;
import com.zettamine.mpa.exception.ResourceNotFoundException;
import com.zettamine.mpa.mapper.EscrowAgentMapper;
import com.zettamine.mpa.mapper.EscrowMapper;
import com.zettamine.mpa.mapper.EscrowServiceAreaMapper;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EscrowServiceImpl implements EscrowService {
			
	private EscrowRepository escrowRepository;
	private EscrowMapper escrowMapper;
	private EscrowServiceAreaMapper serviceAreaMapper;
	private EscrowAgentMapper agentMapper;
	
	@Override
	@Transactional
	public void save(EscrowDto escrowDto) {		
		
		   Escrow escrow = escrowMapper.toEntity(escrowDto);
		   StringUtil.escrowRemoveSpaces(escrow);
		   List<EscrowServiceArea> serviceAreaList = new ArrayList<>();
		   List<EscrowAgent> agentList = new ArrayList<>();
		   
		   for(EscrowServiceAreaDto serviceArea: escrowDto.getServiceArea()) {
			   EscrowServiceArea escrowService = serviceAreaMapper.toEntity(serviceArea);
			   StringUtil.escrowServiceAreaRemoveSpaces(serviceAreaMapper.toEntity(serviceArea));
			   escrowService.setEscrow(escrow);
			   serviceAreaList.add(escrowService);
		   }
		   
		   for(EscrowAgentDto agent: escrowDto.getEscrowAgent()) {
			   EscrowAgent escrowAgent = agentMapper.toEntity(agent);
			   StringUtil.escrowAgentRemoveSpaces(escrowAgent);
			   escrowAgent.setEscrow(escrow);
			   agentList.add(escrowAgent);
		   }
		   
		   System.out.println(serviceAreaList);
		  escrow.setServiceArea(serviceAreaList);
		  escrow.setEscrowAgent(agentList);
		  escrowRepository.save(escrow);
	  }

	@Override
	public EscrowDto findById(Integer escrowId) {
		  Optional<Escrow> escrow = escrowRepository.findById(escrowId);
		  if(escrow.isEmpty()) {
			  throw new ResourceNotFoundException(EscrowConstants.ENTITY_NOT_FOUND + escrowId);
		  }
		  
		  return escrowMapper.toDto(escrow.get());
		  
	}

	@Override
	public EscrowDto findByEscrowName(String escoName) {
		 Optional<Escrow> escrow = escrowRepository.findByEscoName(StringUtil.removeExtraSpaces(escoName));
		 if(escrow.isEmpty()) {
			 throw new ResourceNotFoundException(EscrowConstants.ENTITY_NOT_FOUND  + escoName);
		 }
		 
		 return escrowMapper.toDto(escrow.get());
	}

	@Override
	public List<EscrowDto> getAll() {
		List<Escrow> all = escrowRepository.findAll();
		List<EscrowDto> list = new ArrayList<>();
		for(Escrow escrow: all) {
			EscrowDto dto = escrowMapper.toDto(escrow);
			list.add(dto);
		}
		return list;
	}

	@Override
	public boolean update(EscrowDto escrowDto, Integer escoId) {
	   Optional<Escrow> escrow = escrowRepository.findById(escoId);
	   if(escrow.isPresent()) {
		    Escrow entity = escrowMapper.toEntity(escrowDto);
		    entity.setEscoId(escoId);
		    entity.setCity(StringUtil.removeExtraSpaces(entity.getCity()));
		    escrowRepository.save(entity);
		    return true;
	   }
		return false;
	}

	@Override
	public List<EscrowDto> search(SearchCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}
}
