package com.zettamine.mpa.mapper;

import org.mapstruct.Mapper;

import com.zettamine.mpa.escrow.dto.EscrowDto;
import com.zettamine.mpa.escrow.entity.Escrow;

@Mapper(componentModel = "spring")
public interface EscrowMapper {
	Escrow toEntity(EscrowDto dto);
	
	EscrowDto toDto(Escrow escrow);
}
