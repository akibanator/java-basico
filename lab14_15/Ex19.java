package lab14_15;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe dois n�meros");
		System.out.println("Informe o primeiro n�mero: ");
		double n1 = scan.nextDouble();
		System.out.println("Informe o segundo n�mero: ");
		double n2 = scan.nextDouble();
		
		System.out.println("Informe qual opera��o deseja realizar");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		int opcao = scan.nextInt();
		double resultado = 0;

		switch(opcao){
		case 1: resultado = n1 + n2; break;
		case 2: resultado = n1 - n2; break; 
		case 3: resultado = n1 * n2; break; 
		case 4: resultado = n1 / n2; break;
		default: System.out.println("Valor inv�lido");
		}
		
		System.out.println("O resultado da opera��o �: " + resultado);
		
		double par = resultado % 2;
		if (par==0){
			System.out.println("O resultado � par");
		} else {
			System.out.println("O resultado � �mpar");
		}
		
		if (resultado>=0) {
			System.out.println("O resultado � positivo");
		} else {
			System.out.println("O resultado � negativo");
		}
	}

}
