package com.desafio_dio_banco;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Conta implements IConta{

	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
    //com esse modificador de acesso, continua protegido e 
	//agora pode ser usado pelas classesfilhas Corrente e Poupança
	protected int agencia;
	protected int numero;
	protected double saldo = 0;
	protected Cliente cliente;
	
	public Conta() {
		
	}
	
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}



	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	//lógica da transferência, saco da minha conta e deposito na conta destino
	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor); 
		contaDestino.depositar(valor);
		
	}
	
		protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}


	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}
	
	

}
