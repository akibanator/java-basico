package lab11_12_13;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numero1 = scan.nextInt();
		System.out.println("Digite outro n�mero");
		int numero2 = scan.nextInt();
		int resultado = numero1 + numero2;
		System.out.println("O valor da soma dos n�meros digitados �: " + resultado);

	}

}
