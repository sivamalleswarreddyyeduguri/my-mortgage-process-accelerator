package com.zettamine.mpa.escrow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zettamine.mpa.escrow.constants.EscrowConstants;
import com.zettamine.mpa.escrow.dto.EscrowDto;
import com.zettamine.mpa.escrow.dto.ResponseDto;
import com.zettamine.mpa.escrow.service.EscrowService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/escrow")
public class EscrowController {
	  
	 private EscrowService escrowService;
	 
	 @PostMapping("/create")

	    public ResponseEntity<ResponseDto> addEscrow(@Valid @RequestBody EscrowDto escrowDto) {
	       
	            escrowService.save(escrowDto);
	            return ResponseEntity
	                    .status(HttpStatus.CREATED)
	                    .body(new ResponseDto(EscrowConstants.STATUS_201, EscrowConstants.SAVE_SUCCEESS));
	        
	    }
	 
	 @GetMapping("/fetch")
	 public ResponseEntity<List<EscrowDto>> fetchEscrowCompanies(){
		 
		     List<EscrowDto> allEscrowDtos = escrowService.getAll();
		     return ResponseEntity
		    		 .status(HttpStatus.OK)
		    		 .body(allEscrowDtos);
		    		 
	 }
	 
	 @GetMapping("/fetch/{escoId}")
	 public ResponseEntity<EscrowDto> fetchEscrowById(@PathVariable Integer escoId){
		         EscrowDto escrowDto = escrowService.findById(escoId);
		         return ResponseEntity
		        		 .status(HttpStatus.OK)
		        		 .body(escrowDto);
	 }
	 
	 @GetMapping("/fetch/name/{escoName}")
	 public ResponseEntity<EscrowDto> fetchEscrowByName(@PathVariable @NotBlank(message = "Escrow name should be null or empty") String escoName){
		   	    EscrowDto escrowDto = escrowService.findByEscrowName(escoName);
		   	    return ResponseEntity
		   	    		.status(HttpStatus.OK)
		   	    		.body(escrowDto);
	 }
	 
	 
	 
	 @PutMapping("/update/{escoId}")
	 public ResponseEntity<ResponseDto> updateEscrow(@RequestBody EscrowDto escrowDto, @PathVariable Integer escoId){
		         boolean isUpdated = escrowService.update(escrowDto, escoId);
		         if(isUpdated) {
		             return ResponseEntity
		                     .status(HttpStatus.OK)
		                     .body(new ResponseDto(EscrowConstants.STATUS_200, EscrowConstants.UPDATE_SUCCESS));
		         }else{
		             return ResponseEntity
		                     .status(HttpStatus.NOT_FOUND)
		                     .body(new ResponseDto(EscrowConstants.STATUS_404, EscrowConstants.NOT_FOUND));
		         }
	 }
	 
	 
}
