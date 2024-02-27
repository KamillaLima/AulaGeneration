package control_flow;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Informe o nome do colaborador :");
		String nome = sn.nextLine();
		System.out.println("--------------------REAJUSTE--------------------");
		System.out.println("Código do cargo    Cargo          		Percentual do reajuste");
		System.out.println("1                  Gerente 		  		10%");
		System.out.println("2                  Vendedor         	  		7%");
		System.out.println("3                  Supervisor          	  		9%");
		System.out.println("4                  Motorista              		6%");
		System.out.println("5                  Estoquista     			5%");
		System.out.println("6                  Técnico de T.I  			8%");
		System.out.print("\nInforme o código do cargo que você deseja realizar o reajuste: ");
		int codigoCargo = sn.nextInt();
		System.out.print("Informe o salário:  R$");
		double salario = sn.nextDouble();

		switch (codigoCargo) {
		case 1: {
			double novoSalario = salario + (0.1 * salario);
			System.out.printf("O salário reajustado do colaborador " + nome + " é de : R$ %.2f", novoSalario);
			break;
		}
		case 2: {
			double novoSalario = salario + (0.07 * salario);
			System.out.printf("O salário reajustado do colaborador " + nome + " é de : R$ %.2f", novoSalario);
			break;
		}
		case 3: {
			double novoSalario = salario + (0.09 * salario);
			System.out.printf("O salário reajustado do colaborador " + nome + " é de : R$ %.2f", novoSalario);
			break;
		}

		case 4: {
			double novoSalario = salario + (0.06 * salario);
			System.out.printf("O salário reajustado do colaborador " + nome + " é de : R$ %.2f", novoSalario);
			break;
		}

		case 5: {
			double novoSalario = salario + (0.05 * salario);
			System.out.printf("O salário reajustado do colaborador " + nome + " é de : R$ %.2f", novoSalario);
			break;
		}

		case 6: {
			double novoSalario = salario + (0.08 * salario);
			System.out.printf("O salário reajustado do colaborador " + nome + " é de : R$ %.2f", novoSalario);
			break;
		}

		default:
			System.out.println("Esse código de cargo não existe!");
			break;
		}

		sn.close();

	}
}
