package lab14_15;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em qual turno voc� estuda? M - Matutino | V - Vespertino | N - Noturno");
		String turno = scan.nextLine();
		
		if (turno.equalsIgnoreCase("M")){
			System.out.print("Bom dia!");
		} else if (turno.equalsIgnoreCase("V")){
			System.out.println("Boa tarde!");
		} else if (turno.equalsIgnoreCase("N")){
			System.out.print("Boa noite!");
		} else {
			System.out.println("Valor inv�lido");
		}
		
	}

}
