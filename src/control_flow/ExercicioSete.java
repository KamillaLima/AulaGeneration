package control_flow;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Informe o primeiro valor : ");
		float primeiroValor = sn.nextFloat();
		System.out.print("Informe o segundo valor : ");
		float segundoValor = sn.nextFloat();
		System.out.println("--------------------CALCULADORA--------------------");
		System.out.println("Código     Operação");
		System.out.println("1          Soma");
		System.out.println("2          Subtração");
		System.out.println("3          Multiplicação");
		System.out.println("4          Divisão");
		System.out.print("\nInforme o código da operação que você deseja realizar : ");
		int codigoOperacao = sn.nextInt();
		switch (codigoOperacao) {
		case 1: {
			double resultado = primeiroValor + segundoValor; 
			System.out.print(primeiroValor + " + " + segundoValor + " = " + resultado);
			break;
		}
		case 2: {
			double resultado = primeiroValor - segundoValor; 
			System.out.print(primeiroValor + " - " + segundoValor + " = " + resultado);
			break;
		}
		case 3: {
			double resultado = primeiroValor * segundoValor; 
			System.out.print(primeiroValor + " X " + segundoValor + " = " + resultado);
			break;
		}

		case 4: {
			double resultado = primeiroValor / segundoValor; 
			System.out.print(primeiroValor + " / " + segundoValor + " = " + resultado);
			break;
		}

		default:
			System.out.println("OPERAÇÃO INVÁLIDA!");
			break;
		}

		sn.close();

	}
	}


