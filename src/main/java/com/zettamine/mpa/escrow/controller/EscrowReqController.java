package com.zettamine.mpa.escrow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zettamine.mpa.escrow.constants.EscrowConstants;
import com.zettamine.mpa.escrow.dto.EscrowReqDto;
import com.zettamine.mpa.escrow.dto.ResponseDto;
import com.zettamine.mpa.escrow.service.EscrowReqService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "api/v1/escrow/requirements")
@AllArgsConstructor
public class EscrowReqController {
	
	private EscrowReqService escoReqService;
	
	public ResponseEntity<ResponseDto> save(EscrowReqDto escoReqDto){
		
		
		return null;
	}
	
}
