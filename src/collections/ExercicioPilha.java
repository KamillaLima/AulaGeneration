package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Stack<String> listaLivros = new Stack<String>();
		Scanner sn = new Scanner(System.in);
		boolean menu = true;
		while (menu) {
			System.out.println("\n1-Adicionar um novo livro na pilha ");
			System.out.println("2-Listar todos os livros ");
			System.out.println("3-Retirar livro da pilha ");
			System.out.println("0-SAIR");
			System.out.print("\nInforme a opção que você deseja : ");
			int opcao = sn.nextInt();
			switch (opcao) {
			case 0: {
				System.out.println("PROGRAMA FINALIZADO !");
				menu = false;
				break;
			}
			case 1: {

				System.out.println("\nAdicionar um novo livro na fila");
				System.out.print("Informe o nome do livro para ser adicionado :");
				sn.nextLine();
				String nomeLivro = sn.nextLine();
				listaLivros.add(nomeLivro);
				System.out.println("LIVRO ADICIONADO COM SUCESSO! ");
				break;
			}

			case 2: {
				System.out.println("\nListar todos os livros na fila");
				Iterator<String> Ilista = listaLivros.iterator();

				while (Ilista.hasNext()) {
					// o HasNext significa que ele
					// irá retornar verdadeiro no caso de possuir mais elementos.
					// Já o next irá retornar o próximo elemento
					System.out.println(Ilista.next());
				}
				break;
			}

			case 3: {
				System.out.println("\nRetirar um livro ");
				if (listaLivros.size() != 0) {
					listaLivros.pop();
				}

				else {
					System.out.println("Ainda não possuem livros cadastrados!");
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
