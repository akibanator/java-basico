package lab11_12_13;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto voc� ganha por hora?: ");
		double horasTrabalhadas = scan.nextDouble();
		System.out.println("Qual o total de horas trabalhadas durante o m�s?: ");
		double totalHoras = scan.nextDouble();
		double resultado = totalHoras * horasTrabalhadas;
		System.out.println("O seu sal�rio nesse m�s foi: " + resultado);

	}

}
