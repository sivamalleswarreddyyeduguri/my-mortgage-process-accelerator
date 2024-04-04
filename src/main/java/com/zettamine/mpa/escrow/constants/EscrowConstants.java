package com.zettamine.mpa.escrow.constants;

public interface EscrowConstants {
	
		//response message constants
		String SAVE_SUCCEESS = "Escrow company saved successfully";
		String SAVE_CONFLICT = "Failed to save escrow company";
		String UPDATE_SUCCESS = "Escrow company details updated successfully";
		String UPDATE_FAILED = "Escrow not found with given id";
		String NOT_FOUND = "Resource not found";
		String INTERNAL_SERVER_ERROR = "Internal server error";
		String INVALID_PHONE_NUMBER = "Please provide valid phone number";
		String INVALID_EMAIL = "Please provide valid email id";
		String INVALID_ACCOUNT_NUMBER = "Please provide valid valid account number  12-16 characters required";
		String INVALID_ESC_LIENCE_ID = "Please provide valid escrow lienece number";
		String NOT_NULL = "Please provide escrow name";
		
		//validation constants
		String PHONE_REGEX = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
		String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		String COMPANY_NAME_REGEX = "^[a-zA-Z]+$";
		String ZIPCODE_REGEX =  "^\\d{5}(?:-\\d{4})?$";
		String ACCOUNT_NUMBER_REGEX = "^\\d{12,16}$";
		String ESC_LINCENCE_ID_REGEX = "^[A-Za-z0-9]{5,10}$";
		String ONLY_ALPHA_REGEX = "^[a-zA-Z]+$";
		
		//status codes constants
		String STATUS_201 ="201";

}
