package lab14_15;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		double num2 = scan.nextDouble();
		System.out.println("Digite o terceiro n�mero: ");
		double num3 = scan.nextDouble();
		
		if ((num1>=num2) && (num1>=num3)){
			System.out.println("O n�mero: " + num1 + " � o maior n�mero");
		} else if ((num2>=num1) && (num2>=num3)){
			System.out.println("O n�mero: " + num2 + " � o maior n�mero");
		} else if ((num3>=num1) && (num3>=num2)){
			System.out.println("O n�mero: " + num3 + " � o maior n�mero");
		}
		
	}

}
