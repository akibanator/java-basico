package com.loiane.cursojava.aula26;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros; //n�mero de passageiros
	double capCombustivel; //capacidade de combust�vel
	double consumoCombustivel;

	void exibirAutonomia(){		
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " km");
	}
	
	double obterAutonomia() {
		
		System.out.println("M�todo obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
}
