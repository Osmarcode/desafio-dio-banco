package com.desafio_dio_banco;

//essa interface, poderia não ser usada, deixando todos os métodos dentro de Conta,
//mas aqui vemos todos os métodos que uma conta pode executar, descritos nesse contrato
public interface IConta {
	
	//essesmétodos já são públicos, não colocar public, evita redundância
	 void sacar(double valor);
	
	 void depositar(double valor);
	
	 //aqui está sendo utilizado o conceito de polimorfismo
	 void transferir(double valor, IConta contaDestino);
	 
	 
	 void imprimirExtrato();
	
	void imprimirTipoConta();


}
