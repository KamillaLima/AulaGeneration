package loops;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int idade=0;
		int menorVinteUm = 0;
		int maiorCinquenta = 0;
		while (idade > -1) {
			System.out.print("Informe a idade: ");
			idade = sn.nextInt();
			if (idade <= -1 ) {
				break;
			}
			else if (idade <= 21) {
				menorVinteUm++;
			} else if (idade >= 50) {
				maiorCinquenta++;
			}
		}

		System.out.println("Numero de pessoas com menos de 21 anos : " + menorVinteUm);
		System.out.println("Numero de pessoas com mais de 50 anos : "+ maiorCinquenta);
		sn.close();
	}

}
