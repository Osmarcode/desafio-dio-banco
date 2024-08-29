package com.desafio_dio_banco.tipo_conta;

import com.desafio_dio_banco.Cliente;
import com.desafio_dio_banco.Conta;

public class ContaPoupanca extends Conta{

	
	//construtor que obriga a conta a ter cliente
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}
	
	 public void imprimirExtrato() {
			System.out.println("=== Extrato Conta Poupança ==="); 
			super.imprimirInformacoesComuns();
		 }
	 
	 public void imprimirTipoConta() {
			System.out.println("=== Conta Poupanca ==="); 
			super.imprimirInformacoesComuns();
		 }

	@Override
	 public String toString() {
        return "TIpo: ContaPoupanca { cliente: " + cliente.getNome() + ", saldo R$" + saldo + "}\n";
    }



}
