package lab11_12_13;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite em metros que eu converto para cent�metros: ");
		double metros = scan.nextDouble();
		double centimetros = metros * 100;
		System.out.println("O n�mero convertido �: " + centimetros + "cm");
		
	}

}
