package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioQuatroSet {

	public static void main(String[] args) {
		Set<Integer> lista = new HashSet<Integer>();
		lista.add(2);
		lista.add(5);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(7);
		lista.add(2);
		lista.add(8);
		lista.add(10);
		lista.add(6);
		Scanner sn = new Scanner(System.in);
		System.out.print("Informe o número que você deseja buscar na lista : ");
		int valor = sn.nextInt();
		boolean encontrado = false;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.contains(valor)) {
				encontrado = true;
				break;
			}
		}

		if (encontrado) {
			System.out.println("O NÚMERO " + valor + " FOI ENCONTRADO" );
		} else {
			System.out.println("O NÚMERO " + valor + " NÃO FOI ENCONTRADO!");
		}

		sn.close();

	}

}
