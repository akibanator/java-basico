package lab16_17;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a popula��o do pa�s A");
		double paisA = scan.nextDouble();
		System.out.println("Entre com a popula��o do pa�s B");
		double paisB = scan.nextDouble();
		System.out.println("Entre com a taxa de crescimento do pa�s A");
		double taxaAnoA = scan.nextDouble();
		System.out.println("Entre com a taxa de crescimento do pa�s B");
		double taxaAnoB = scan.nextDouble();
		
		boolean passou = false;
		int i = 0;
				
		do {	
			double popA = paisA * taxaAnoA;
			double popB = paisB * taxaAnoB;
			
			paisA = paisA + popA;
			paisB = paisB + popB;
			
			i++;
			
			if (paisA>paisB){
				passou = true;
				System.out.println("Vai levar " + i + " anos para o p�is A passar ou igualar o B em popula��o.");
				System.out.println("Popula��o A: " + paisA);
				System.out.println("Popula��o B: " + paisB);
			}
			
		} while (!passou);

	}

}
