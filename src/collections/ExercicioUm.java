package collections;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		List<String> listaCores = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			System.out.print("Informe uma cor : ");
			String cor = sn.nextLine();
			listaCores.add(cor);
		}

		System.out.println("As cores informadas são : ");
		System.out.println(listaCores);

		System.out.println("As cores em ordem crescente são : ");
		Collections.sort(listaCores);
		System.out.println(listaCores);
		sn.close();
	}

}
