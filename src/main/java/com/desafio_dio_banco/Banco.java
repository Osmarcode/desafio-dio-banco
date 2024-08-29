package com.desafio_dio_banco;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Banco {
	
	private String nome;
	private List<Conta> contas;
	
	
	public Banco(String nome, List<Conta> contas) {
		super();
		this.nome = nome;
		this.contas = contas;
	}
	
	

}
