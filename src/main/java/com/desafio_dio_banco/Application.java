package com.desafio_dio_banco;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio_dio_banco.tipo_conta.ContaCorrente;
import com.desafio_dio_banco.tipo_conta.ContaPoupanca;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
        List<IConta> contas = new ArrayList<>();
		
		Cliente pessoa1 = new Cliente();
		pessoa1.setNome("pessoa1");
		ContaCorrente cc= new ContaCorrente(pessoa1);
	
		Cliente pessoa2 = new Cliente();
		pessoa2.setNome("pessoa2");
		ContaPoupanca poupanca = new ContaPoupanca(pessoa2);
		
		Cliente pessoa3 = new Cliente();
		pessoa3.setNome("pessoa3");
		ContaCorrente cc2 = new ContaCorrente(pessoa3);
		
		
		cc.depositar(100);
		cc.imprimirExtrato();
		cc.sacar(15);
		cc.imprimirExtrato();
		cc.transferir(25, poupanca);
		cc.imprimirExtrato();
		
		cc2.depositar(1000);
		cc2.imprimirExtrato();
		cc2.sacar(200);
		cc2.imprimirExtrato();
		cc2.transferir(600, poupanca);
		cc2.imprimirExtrato();
		
		poupanca.depositar(50);
		poupanca.imprimirExtrato();
		poupanca.sacar(15);
		poupanca.imprimirExtrato();
		poupanca.transferir(100, cc);
		poupanca.imprimirExtrato();
		
		contas.add(poupanca);
		contas.add(cc);
		contas.add(cc2);
		
		System.out.println("Lista de Contas e Titulares: \n" + contas);
	}

}
