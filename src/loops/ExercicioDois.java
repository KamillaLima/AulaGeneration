package loops;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int totalPares = 0;
		int totalImpares = 0;
		for (int i = 0; i <= 9; i++) {
			System.out.print("Informe o " + (i + 1) + " número: ");
			int numero = sn.nextInt();
			if (numero % 2 == 0) {
				totalPares++;

			} else {
				totalImpares++;
			}
		}

		System.out.println("Numeros pares = " + totalPares);
		System.out.println("Numeros impares = " + totalImpares);
		sn.close();

	}

}
