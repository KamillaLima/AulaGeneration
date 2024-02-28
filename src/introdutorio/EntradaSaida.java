package introdutorio;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Escreva o seu nome: ");
		String nome = sn.nextLine();
		System.out.println("bom dia " + nome);
		sn.close();
		
	}

}
