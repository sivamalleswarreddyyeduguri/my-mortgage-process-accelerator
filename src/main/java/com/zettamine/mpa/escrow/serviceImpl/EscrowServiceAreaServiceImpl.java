package com.zettamine.mpa.escrow.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.zettamine.mpa.escrow.dto.EscrowServiceAreaDto;
import com.zettamine.mpa.escrow.entity.EscrowServiceArea;
import com.zettamine.mpa.escrow.repository.EscrowServiceAreaRepository;
import com.zettamine.mpa.escrow.service.EscrowServiceAreaService;
import com.zettamine.mpa.mapper.EscrowMapper;
import com.zettamine.mpa.mapper.EscrowServiceAreaMapper;

public class EscrowServiceAreaServiceImpl implements EscrowServiceAreaService{

	private EscrowServiceAreaRepository escoSerRepo;
	private EscrowServiceAreaMapper escoSerAreaMapper;
	@Override
	public void save(EscrowServiceAreaDto serviceAreaDto) {

	}
	 
	@Override
	public Optional<EscrowServiceAreaDto> findByEscoIdAndZipCode(Integer escoId, String zipcode) {
		EscrowServiceAreaDto dto = escoSerAreaMapper.toDto(escoSerRepo.findByEscoIdAndZipCode(escoId, zipcode).get());
		return Optional.ofNullable(dto);
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
