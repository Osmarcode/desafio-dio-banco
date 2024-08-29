package com.desafio_dio_banco.tipo_conta;

import com.desafio_dio_banco.Cliente;
import com.desafio_dio_banco.Conta;

public class ContaCorrente extends Conta{


	//construtor que obriga a conta a ter cliente
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	 public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ==="); 
		super.imprimirInformacoesComuns();
	 }
	 
	 public void imprimirTipoConta() {
			System.out.println("=== Conta Corrente ==="); 
			super.imprimirInformacoesComuns();
		 }

	@Override
	public String toString() {
        return "Tipo: ContaCorrente { cliente: " + cliente.getNome() + ", saldo R$" + saldo + "}\n";
    }
	
}
