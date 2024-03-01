package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioPilha {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Queue<String> listaClientes = new LinkedList<String>();
		boolean menu = true;
		while (menu) {
			System.out.println("\n1-Adicionar um novo Cliente na fila ");
			System.out.println("2-Listar todos os Clientes na fila ");
			System.out.println("3-Chamar (retirar) uma pessoa da fila ");
			System.out.println("0-O programa deve ser finalizado ");
			System.out.print("\nInforme a opção que você deseja : ");
			int opcao = sn.nextInt();
			switch (opcao) {
			case 0 : {
				System.out.println("PROGRAMA FINALIZADO !");
				menu = false;
				break;
			}
			case 1: {

				System.out.println("\nAdicionar um novo Cliente na fila");
				System.out.print("Informe o nome do cliente para ser adicionado : ");
				System.out.println("");
				String nomeCliente = sn.next().toUpperCase();
				listaClientes.add(nomeCliente);
				System.out.println("CLIENTE ADICIONADO COM SUCESSO! ");
				break;
			}

			case 2: {
				System.out.println("\nListar todos os Clientes na fila");
				if(listaClientes.size() != 0) {
					System.out.println(listaClientes);
				}
				else {
					System.out.println("Ainda não possuem clientes cadastrados!");
				}
				break;
			}

			case 3: {
				System.out.println("\nChamar (retirar) uma pessoa da fila");
				if(listaClientes.size() != 0) {
					listaClientes.remove();
				}

				else {
					System.out.println("Ainda não possuem clientes cadastrados!");
				}
				break;
			}

			default:
				System.out.println("\nOPÇÃO INEXISTENTE!");
				break;
			}
		}

		sn.close();
	}

}
