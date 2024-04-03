package com.zettamine.mpa.escrow.serviceImpl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zettamine.mpa.escrow.constants.EscrowConstants;
import com.zettamine.mpa.escrow.dto.EscrowDto;
import com.zettamine.mpa.escrow.entity.Escrow;
import com.zettamine.mpa.escrow.repository.EscrowRepository;
import com.zettamine.mpa.escrow.service.EscrowService;
import com.zettamine.mpa.escrow.utils.StringUtil;
import com.zettamine.mpa.exception.EscrowAlreadyExistsException;
import com.zettamine.mpa.mapper.EscrowMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EscrowServiceImpl implements EscrowService {
			
	private EscrowRepository escrowRepository;
	private EscrowMapper escrowMapper;
	@Override
	public void save(EscrowDto escrowDto) {
		  Optional<Escrow> byEscoName = escrowRepository.findByEscoName(escrowDto.getEscoName());
		  if(byEscoName.isPresent()) {
			  throw new EscrowAlreadyExistsException("Escrow Corporation already exists with name "+ 
		              escrowDto.getEscoName());
		  }
		  
		  Escrow escrow = escrowMapper.toEntity(escrowDto);
		  escrow.setAddress(StringUtil.);
			escrowRepository.save(escrow);
	  }
}
