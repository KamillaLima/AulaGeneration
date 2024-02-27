package control_flow;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Informe o primeiro valor : ");
		int valor = sn.nextInt();
		System.out.print("Informe o segundo valor: ");
		int valorDois = sn.nextInt();
		System.out.print("Informe o terceiro valor: ");
		int valorTres = sn.nextInt();
		int soma = valor+valorDois;
		if(soma<valorTres) {
			System.out.println("A soma dos valores A e B é menor do que o valor C");
		}
		else if(soma == valorTres) {
			System.out.println("A soma dos valores A e B é igual ao valor C");
		}
		else {
			System.out.println("A soma dos valores A e B é maior do que o valor C");
		}
		
		sn.close();

	}

}
