package loops;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Informe o primeiro número : ");
		int primeiroNumero = sn.nextInt();
		System.out.print("Informe o segundo número : ");
		int segundoNumero = sn.nextInt();
		if(primeiroNumero < segundoNumero) {
			for(int i= primeiroNumero; i <= segundoNumero;i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i +" é multiplo de 3 e 5");
				}
			}
		}
		else {
			System.out.println("ATENÇÃO: O PRIMEIRO NÚMERO DEVE SER MENOR QUE O SEGUNDO NÚMERO! ");
		}

		sn.close();
	}

}
