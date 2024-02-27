package control_flow;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("--------------------LANCHONETE--------------------");
		System.out.println("Código do produto  Produto          Preço unitário");
		System.out.println("1                  Cachorro Quente  R$ 10.00");
		System.out.println("2                  X-Salada         R$ 15.00");
		System.out.println("3                  X-Bacon          R$ 18.00");
		System.out.println("4                  Bauru            R$ 12.00");
		System.out.println("5                  Refrigerante     R$ 08.00");
		System.out.println("6                  Suco de laranja  R$ 13.00");
		System.out.print("\nInforme o código do produto que você deseja comprar: ");
		int codigoProduto = sn.nextInt();
		switch (codigoProduto) {
		case 1: {
			System.out.print("O produto selecionado é o Cachorro Quente, quantas unidades você deseja comprar? ");
			int unidades = sn.nextInt();
			System.out.println("O valor total da compra é de R$" + 10 * unidades);
			break;
		}
		case 2: {
			System.out.print("O produto selecionado é o X-Salada, quantas unidades você deseja comprar? ");
			int unidades = sn.nextInt();
			System.out.println("O valor total da compra é de R$" + 15 * unidades);
			break;
		}
		case 3: {
			System.out.print("O produto selecionado é o X-Bacon, quantas unidades você deseja comprar? ");
			int unidades = sn.nextInt();
			System.out.println("O valor total da compra é de R$" + 18 * unidades);
			break;
		}

		case 4: {
			System.out.print("O produto selecionado é o Bauru, quantas unidades você deseja comprar? ");
			int unidades = sn.nextInt();
			System.out.println("O valor total da compra é de R$" + 12 * unidades);
			break;
		}

		case 5: {
			System.out.print("O produto selecionado é o Refrigerante, quantas unidades você deseja comprar? ");
			int unidades = sn.nextInt();
			System.out.println("O valor total da compra é de R$" + 8 * unidades);
			break;
		}
		
		case 6: {
			System.out.print("O produto selecionado é o Suco de laranja, quantas unidades você deseja comprar? ");
			int unidades = sn.nextInt();
			System.out.println("O valor total da compra é de R$" + 13 * unidades);
			break;
		}

		default:
			System.out.println("Esse código de produto não existe!");
			break;
		}

		sn.close();

	}

}
