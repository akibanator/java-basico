package lab16_17;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de turmas: ");
		int turmas = scan.nextInt();
		int[] alunos = new int[turmas];
		int total = 0;
		double media = 0;
		
		for (int i = 0; i < turmas; i++){
			System.out.println("Digite o n�mero de alunos na turma " + i + ":");
			alunos[i] = scan.nextInt();
			if (alunos[i] > 40){
				System.out.println("As turmas n�o podem ter mais que 40 alunos");
			} else {
				total += alunos[i];
				media = total/turmas;
			}
		}
		System.out.println("A m�dia de alunos por turma �: " + media);
	}

}
