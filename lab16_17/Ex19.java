package lab16_17;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantas notas voc� vai calcular: ");
		int num = scan.nextInt();
		int[] n = new int[num];
		int total = 0;
		double media = 0;
		
		for (int i = 0; i < num; i++){
			System.out.println("Digite um n�mero: ");
			n[i] = scan.nextInt();
			total = total + n[i];
		}
		
		media = total / num;
		
		System.out.println("A m�dia aritm�tica �: " + media);
		
	}

}
