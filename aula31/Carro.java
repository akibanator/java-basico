package com.loiane.cursojava.aula31;

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros; // n�mero de passageiros
	double capCombustivel; // capacidade de combust�vel
	private double consumoCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " km");
	}

	public double obterAutonomia() {

		System.out.println("M�todo obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustivel(double km){
		return this.consumoCombustivel;
	}

	public double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}
}
