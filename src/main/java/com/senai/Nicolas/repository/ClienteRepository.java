package com.senai.Nicolas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Nicolas.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	

}
