package com.zettamine.mpa.escrow.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zettamine.mpa.escrow.dto.EscrowReqDto;
import com.zettamine.mpa.escrow.repository.EscrowRequirmentRepository;
import com.zettamine.mpa.escrow.service.EscrowReqService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EscrowReqServiceImpl implements EscrowReqService{
	
	private EscrowRequirmentRepository escroReqRepo;
	
	@Override
	public List<EscrowReqDto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EscrowReqDto findById(Integer escId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(EscrowReqDto escReqDto) {
	
	
		
	}

	
}
