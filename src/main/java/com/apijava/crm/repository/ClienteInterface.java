package com.apijava.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apijava.crm.model.Cliente;

@Repository
public interface ClienteInterface extends JpaRepository<Cliente, Long> {
	
	

}
