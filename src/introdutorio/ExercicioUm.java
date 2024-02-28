package introdutorio;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o valor do seu salário: R$");
		float salario = sc.nextFloat();
		System.out.print("\nInforme o valor do seu abono: R$");
		float abono = sc.nextFloat();
		float novoSalario = salario+abono;
		System.out.println("O valor do seu salário como o abono é de R$"+novoSalario);
		sc.close();
	}

}
