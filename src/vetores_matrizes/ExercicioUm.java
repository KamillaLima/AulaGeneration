package vetores_matrizes;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		int vetores[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		Scanner sn = new Scanner(System.in);
		System.out.print("Informe o número que você deseja buscar na lista : ");
		int valor = sn.nextInt();
		int posicao = 0;
		boolean encontrado = false;
		for (int i = 0; i < vetores.length; i++) {
			if (valor == vetores[i]) {
				posicao = i;
				encontrado = true;
				break;
			}
		}

		if (encontrado) {
			System.out.println("O NÚMERO " + valor + " ESTÁ LOCALIZADO NA POSIÇÃO " + posicao);
		} else {
			System.out.println("O NÚMERO " + valor + " NÃO FOI ENCONTRADO!");
		}

		sn.close();

	}

}
