package com.loiane.cursojava.aula43.labs.exer01v2;

public class Teste {

	public static void main(String[] args) {

		System.out.println("Testando Conta Bancaria");
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Jos�");
		contaSimples.setNumConta("1234");

		realizarDeposito(contaSimples, 100);

		realizarSaque(contaSimples, 30);

		realizarSaque(contaSimples, 80);

		System.out.println(contaSimples);

		System.out.println("Testando Conta Poupan�a");
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Maria");
		contaPoupanca.setNumConta("2345");
		contaPoupanca.setDiaRendimento(4);

		realizarDeposito(contaPoupanca, 100);

		realizarSaque(contaPoupanca, 30);

		realizarSaque(contaPoupanca, 80);

		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo � de = " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje n�o � dia de rendimento, novo saldo n�o calculado");
		}

		System.out.println(contaPoupanca);
		
		System.out.println("Testando Conta Especial");
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Jo�o");
		contaEspecial.setNumConta("3456");
		contaEspecial.setLimite(200);

		realizarDeposito(contaEspecial, 100);

		realizarSaque(contaEspecial, 30);

		realizarSaque(contaEspecial, 300);

		System.out.println(contaEspecial);

	}

	public static void realizarDeposito(ContaBancaria conta, double valor) {
		System.out.println("Tentando realizar dep�sito");
		conta.depositar(valor);
		System.out.println("Dep�sito efetuado com sucesso " + conta.getSaldo());
	}

	public static void realizarSaque(ContaBancaria conta, double valor) {
		System.out.println("Tentando realizar saque");
		if (conta.sacar(valor)) {
			System.out.println("Saque realizado com sucesso, saldo atual � de: " + conta.getSaldo());
		} else {
			System.out.println("Saldo insulficente para saque de " + valor + ", saldo atual � de " + conta.getSaldo());
		}
	}

}
