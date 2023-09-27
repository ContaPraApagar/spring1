package com.senai.Nicolas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "nome")
	private String nCliente;
	
	@Column(name = "fone")
	private String fone;
	
	public Long getIdcCliente() {
		return idcCliente;
	}
	public void setIdcCliente(Long idcCliente) {
	    this.idcCliente = idcCliente;
    }
	public String getnCliente() {
		return nCliente;
	}
	public void setnCliente(String ncliente) {
		this.nCliente = ncliente;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
    }