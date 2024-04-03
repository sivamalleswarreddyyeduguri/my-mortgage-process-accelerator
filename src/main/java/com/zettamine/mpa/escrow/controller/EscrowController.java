package com.zettamine.mpa.escrow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zettamine.mpa.escrow.constants.EscrowConstants;
import com.zettamine.mpa.escrow.dto.EscrowDto;
import com.zettamine.mpa.escrow.dto.ResponseDto;
import com.zettamine.mpa.escrow.service.EscrowService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/escrow")
public class EscrowController {
	  
	 EscrowService escrowService;
	 
	 @PostMapping("/create")
	 public ResponseEntity<ResponseDto> addEscrow(@Valid @RequestBody EscrowDto escrowDto){
		     
		   escrowService.save(escrowDto);
		   return ResponseEntity
				   .status(HttpStatus.CREATED)
				   .body(new ResponseDto(EscrowConstants.STATUS_201, EscrowConstants.MESSAGE_201));
	 }
}
