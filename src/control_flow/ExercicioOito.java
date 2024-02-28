package control_flow;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		float saldo = 1000f;
		System.out.println("----OPERAÇÕES BANCÁRIAS----");
		System.out.println("Código da operação  Operação");
		System.out.println("1                   Saldo");
		System.out.println("2                   Saque");
		System.out.println("3                   Depósito");
		System.out.print("Informe o código da operação que deseja realizar : ");
		int codigoOperacao = sn.nextInt();
		switch (codigoOperacao) {
		case 1: {
			System.out.printf("O seu saldo atual é de R$ %.2f" , saldo);
			break;
		}
		
		case 2 :{
			System.out.print("Informe o valor que deseja sacar : R$");
			float valorSaque = sn.nextFloat();
			if(valorSaque< saldo) {
				System.out.printf("Após realizar o saque,o seu saldo é de R$ %.2f" , (saldo-valorSaque));
			}
			else {
				System.out.println("OPERAÇÃO NEGADA , SAQUE MAIOR QUE O SALDO!");
			}
			break;
		}
		case 3 : {
			System.out.print("Informe o valor que deseja depositar : R$");
			float valorDeposito = sn.nextFloat();
			System.out.printf("Após realizar o depósito,o seu saldo é de R$ %.2f" , (saldo+valorDeposito));
			break;
		}
		default:
			System.out.println("OPERAÇÃO INVÁLIDA!");
			break;
		}
		
		
		
		
		
		sn.close();
	}

}
