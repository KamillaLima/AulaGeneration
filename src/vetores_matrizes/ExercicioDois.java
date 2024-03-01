package vetores_matrizes;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		int vetores[] = new int[10];
		Scanner sn = new Scanner(System.in);
		float media;
		float soma = 0;

		for (int i = 0; i < vetores.length; i++) {
			System.out.print("Informe o " + (i + 1) + " número : ");
			int numero = sn.nextInt();
			vetores[i] = numero;
			soma += numero;
		}
		System.out.println("ELEMENTOS NOS ÍNDICES IMPARES");
		for (int i = 0; i < vetores.length; i++) {
			if (i % 2 != 0) {
				System.out.print(vetores[i] + "  ");
			}

		}
		System.out.println("\nELEMENTOS  PARES");
		for (int i = 0; i < vetores.length; i++) {
			if (vetores[i] % 2 == 0) {
				System.out.print(vetores[i] + "  ");
			}

		}
		media = soma / 10;
		System.out.println("\nSoma " + soma);
		System.out.printf("Média  %.2f", media);
		sn.close();

	}

}
