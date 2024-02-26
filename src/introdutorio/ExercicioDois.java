package introdutorio;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		float primeiraNota = sc.nextFloat();
		System.out.print("Informe a segunda nota: ");
		float segundaNota = sc.nextFloat();
		System.out.print("Informe a terceira nota: ");
		float terceiraNota = sc.nextFloat();
		System.out.print("Informe a quarta nota: ");
		float quartaNota = sc.nextFloat();
		float media = (primeiraNota+segundaNota+terceiraNota+quartaNota)/4;
		System.out.printf("A sua média é de: %.1f\n", media);
		//Concatenar a formatação com vírgula e não com o símbolo de mais
		sc.close();
	}

}
