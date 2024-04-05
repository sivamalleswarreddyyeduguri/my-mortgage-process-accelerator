package com.zettamine.mpa.escrow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zettamine.mpa.escrow.constants.EscrowConstants;
import com.zettamine.mpa.escrow.dto.EscrowServiceAreaDto;
import com.zettamine.mpa.escrow.dto.ResponseDto;
import com.zettamine.mpa.escrow.service.EscrowServiceAreaService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/escrow")
@AllArgsConstructor
public class EscrowServiceAreaController {
	
	 private EscrowServiceAreaService serviceAreaService;
		
	 @PostMapping("/service-area/create")
	 public ResponseEntity<ResponseDto> addServiceArea(@RequestBody EscrowServiceAreaDto serviceAreaDto){
		 		
		     serviceAreaService.save(serviceAreaDto);
		     return ResponseEntity
					   .status(HttpStatus.CREATED)
					   .body(new ResponseDto(EscrowConstants.STATUS_201, EscrowConstants.SAVE_SUCCEESS));
	 }
	 
	 
}
