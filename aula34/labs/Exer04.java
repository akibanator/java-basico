package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor de n1");
		double num1 = scan.nextDouble();

		System.out.println("Metros para P�s " + ConversaoDeUnidadesDeArea.metrosParaPes(num1));
		System.out.println("P�s para Cent�metros " + ConversaoDeUnidadesDeArea.pesParaCentimetros(num1));
		System.out.println("Milhas para Acres " + ConversaoDeUnidadesDeArea.milhaParaAcres(num1));
		System.out.println("Acres para P�s " + ConversaoDeUnidadesDeArea.acresParaPes(num1));

	}

}
