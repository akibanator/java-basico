package lab14_15;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letra = scan.nextLine();
		
		switch(letra){
		case "a":
		case "e":
		case "i":
		case "o":
		case "u": System.out.println("A letra � vogal"); break;
		default: System.out.println("A letra � consoante"); break;
		}
	}

}
