package loops;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int numero;
		float total=0 , numerosMultiplos=0;
		float media;
		do {
			System.out.print("Informe um número: ");
			numero = sn.nextInt();
			if(numero%3==0 && numero!=0) {
				total+=numero;
				numerosMultiplos++;
			}
		} while (numero !=0);

		media = total/numerosMultiplos;
		System.out.printf("A média de todos os números múltiplos de 3 é : %.1f" , media);

		sn.close();

	}

}
