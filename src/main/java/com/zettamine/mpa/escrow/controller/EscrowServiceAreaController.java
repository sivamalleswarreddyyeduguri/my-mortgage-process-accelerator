package com.zettamine.mpa.escrow.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zettamine.mpa.escrow.constants.EscrowConstants;
import com.zettamine.mpa.escrow.dto.EscrowDto;
import com.zettamine.mpa.escrow.dto.EscrowServiceAreaDto;
import com.zettamine.mpa.escrow.dto.ResponseDto;
import com.zettamine.mpa.escrow.entity.Escrow;
import com.zettamine.mpa.escrow.service.EscrowServiceAreaService;
import com.zettamine.mpa.exception.EscrowServiceAreaAlreadyExistsException;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/escrow")
@AllArgsConstructor
@Validated
public class EscrowServiceAreaController {

	private EscrowServiceAreaService serviceAreaService;

	@PostMapping("/service-area/create")
	public ResponseEntity<ResponseDto> addServiceArea(@Valid @RequestBody EscrowServiceAreaDto serviceAreaDto) {
		EscrowDto escrow = serviceAreaDto.getEscrow();
		Optional<EscrowServiceAreaDto> escoSerArea = serviceAreaService.findByEscoIdAndZipCode(escrow.getEscoId(),
				serviceAreaDto.getZipcode());
		if(escoSerArea.isPresent()) {
			throw new EscrowServiceAreaAlreadyExistsException("Escrow service area already exists in the provided region");
		}
		serviceAreaService.save(serviceAreaDto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new ResponseDto(EscrowConstants.STATUS_201, EscrowConstants.SAVE_SUCCEESS));
	}
		
}
