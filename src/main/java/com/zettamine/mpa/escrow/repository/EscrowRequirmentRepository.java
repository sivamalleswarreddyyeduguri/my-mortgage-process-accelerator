package com.zettamine.mpa.escrow.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zettamine.mpa.escrow.entity.EscrowReq;

public interface EscrowRequirmentRepository extends JpaRepository<EscrowReq, Serializable> {

}
