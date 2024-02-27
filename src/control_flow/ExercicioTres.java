package control_flow;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Bom dia! Informe o seu nome : ");
		String nome = sn.nextLine();
		System.out.print("Informe a sua idade: ");
		int idade = sn.nextInt();
		if (idade < 18) {
			System.out.println("Infelizmente você não está apto para doar sangue por ser menor de idade!");
		} else if (idade >= 60 && idade <= 69) {
			System.out.print("É a sua primeira doação? [S] ou [N]");
			String primeiraDoacao = sn.next().toUpperCase();
			if (primeiraDoacao.equals("N")) {
				System.out.println(nome + " ,o/a senhor/a pode doar já que não é a sua primeira doação!");
			} else {
				System.out.println(
						"Infelizmente o/a senhor/a não pode doar devido a sua idade e por ser a sua primeira doação");
			}

		}
		else {
			System.out.println(nome + " ,você está apto/a para doar sangue!");
		}
		
		sn.close();
	}

}
