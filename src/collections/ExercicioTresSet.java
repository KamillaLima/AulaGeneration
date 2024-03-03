package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioTresSet {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int numero;
		Set<Integer> listaValores = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o " +  (i+1)+ " número : ");
			numero = sn.nextInt();
			listaValores.add(numero);
		}
		
		sn.close();

		System.out.println("Os valores informados são : ");
		System.out.println(listaValores);
	}

}
