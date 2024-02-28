package loops;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int numero;
		int soma=0;
		do {
			System.out.print("Informe um número: ");
			numero = sn.nextInt();
			if(numero > 0 ) {
				soma+=numero;
			}
		} while (numero !=0);

		System.out.println("A soma dos números positivos é de : " + soma);
		sn.close();
	}

}
