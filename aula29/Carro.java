package com.loiane.cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros; // n�mero de passageiros
	double capCombustivel; // capacidade de combust�vel
	double consumoCombustivel;

	Carro() {
		System.out.println("Classe Carro foi instaciada");
		numPassageiros = 4;
	}

	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = capCombustivel_;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " km");
	}

	double obterAutonomia() {

		System.out.println("M�todo obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}

}
