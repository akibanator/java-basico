package lab14_15;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro e informarei se � par ou impar: ");
		int numero = scan.nextInt();
		
		int par = numero%2;
		
		if (par==0) {
			System.out.println("O n�mero informado � par");
		} else {
			System.out.println("O n�mero informado � impar");
		}
	}

}
