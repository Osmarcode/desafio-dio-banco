package com.desafio_dio_banco;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente implements IConta{
	
	private String nome;
	private String tipoConta;
	private double saldoConta = 0;
	private Conta conta;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String tipoConta, double saldoConta) {
		super();
		this.nome = nome;
		this.tipoConta = tipoConta;
		this.saldoConta = saldoConta;
	}


	@Override
	public void sacar(double valor) {
		if(saldoConta > valor && valor <= saldoConta) {
			//valor = saldoConta - valor;
			saldoConta -= valor;
		}	
	}

	@Override
	public void depositar(double valor) {
		if(valor > 0) {
			//saldoConta = saldoConta + valor;
			saldoConta += valor;
		}
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if(valor > 0 && valor <= saldoConta) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
	}

	@Override
	public void imprimirExtrato() {
		  System.out.println("Extrato da Conta:");
	        System.out.println("Nome: " + this.nome);
	        System.out.println("Tipo de Conta: " + this.tipoConta);
	        System.out.println("Saldo: R$ " + this.saldoConta);
		
	}

	@Override
	public void imprimirTipoConta() {
		System.out.println("Tipo conta: " + this.tipoConta);
		
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipoConta=" + tipoConta + ", saldoConta R$ " + saldoConta + "]";
	}


}
