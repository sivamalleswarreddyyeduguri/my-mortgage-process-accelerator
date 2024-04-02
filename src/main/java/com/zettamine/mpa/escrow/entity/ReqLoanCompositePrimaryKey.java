package com.zettamine.mpa.escrow.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReqLoanCompositePrimaryKey implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer reqId;
	private Integer prodId;
	
}
