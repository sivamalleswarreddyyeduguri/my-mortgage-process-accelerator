package com.zettamine.mpa.mapper;

import java.util.Optional;

import org.mapstruct.Mapper;

import com.zettamine.mpa.escrow.dto.EscrowServiceAreaDto;
import com.zettamine.mpa.escrow.entity.EscrowServiceArea;

@Mapper(componentModel = "spring")
public interface EscrowServiceAreaMapper {
	
	EscrowServiceArea toEntity(EscrowServiceAreaDto dto);

	EscrowServiceAreaDto toDto(EscrowServiceArea escoServiceArea);
	  
}
