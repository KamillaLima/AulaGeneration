package introdutorio;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		float primeiroValor = sc.nextFloat();
		System.out.print("Informe o segundo valor: ");
		float segundoValor = sc.nextFloat();
		System.out.print("Informe o terceiro valor: ");
		float terceiroValor = sc.nextFloat();
		System.out.print("Informe o quarto valor: ");
		float quartoValor = sc.nextFloat();
		float produtoUm = primeiroValor * segundoValor;
		float produtoDois = terceiroValor * quartoValor;
		float resultado = produtoUm - produtoDois;
		System.out.println("Diferença : " + resultado	);
		sc.close();
	}

}
