package lab16_17;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean nomeValido = false;
		boolean idadeValido = false;
		boolean salarioValido = false;
		boolean sexoValido = false;
		boolean estadocivilValido = false;
		
		while (!nomeValido){
			System.out.println("Digite o seu nome: ");
			String nome = scan.nextLine();
			
			if (nome.length() > 3) {
				nomeValido = true;
				System.out.println("Nome v�lido");
			} else {
				System.out.println("Nome inv�lido, digite um nome com pelo menos 4 caracteres");
			}
		}
		
		while (!idadeValido){
			System.out.println("Digite sua idade: ");
			int idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150){
				idadeValido = true;
				System.out.println("Idade v�lida");
			} else {
				System.out.println("Idade inv�lida, digite uma idade entre 0 � 150");				
			}
		}
		
		while (!salarioValido){
			System.out.println("Digite o seu s�lario: ");
			double salario = scan.nextDouble();
			
			if (salario > 0) {
				salarioValido = true;
				System.out.println("Sal�rio v�lido");
			} else {
				System.out.println("Sal�rio inv�lido, digite um sal�rio maior que zero");
			}
		}
		
		while (!sexoValido){
			System.out.println("Digite o seu g�nero: ");
			String sexo = scan.next();
			
			if ((sexo.equalsIgnoreCase("f")) || (sexo.equalsIgnoreCase("m"))){
				sexoValido = true;
				System.out.println("G�nero v�lido");
			} else {
				System.out.println("G�nero inv�lido, digite um g�nero com M de Masculino ou F de Feminino");
			}
		}
		
		while (!estadocivilValido){
			System.out.println("Digite seu estado civil: ");
			String estadocivil = scan.next();
			
			if (estadocivil.equalsIgnoreCase("s") || estadocivil.equalsIgnoreCase("c") || estadocivil.equalsIgnoreCase("v") || estadocivil.equalsIgnoreCase("d")){
				estadocivilValido = true;
				System.out.println("Estado civil v�lido");
			} else {
				System.out.println("Estado civil inv�lido, digite um g�nero com S de solteiro(a) ou C de Casado(a) ou V de Viuvo(a) ou D de Divorciado(a)");
			}
		}

	}

}
