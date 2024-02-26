package introdutorio;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o salário bruto: R$");
		float salarioBruto = sc.nextFloat();
		System.out.print("Informe o adicional noturno: R$");
		float adicionalNoturno = sc.nextFloat();
		System.out.print("Informe o total de horas extras: ");
		float totalHoras = sc.nextInt();
		
		System.out.print("Informe o total de desconto: R$");
		float descontos = sc.nextFloat();
		
		float total = salarioBruto + adicionalNoturno + (totalHoras * 5) -descontos;
		System.out.print("O salário líquido é de R$" + total);
		
		
	}

}
