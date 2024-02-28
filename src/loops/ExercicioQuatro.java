package loops;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int pessoasBackend = 0, mulheresCisTransFrontend = 0, homensCisTransMobileMaisQuarenta = 0, naoBinarioFullstackMenosTrinta = 0, total = 0;
		float mediaIdades = 0;
		String resposta = "S";
		while (resposta.equals("S")) {
			System.out.print("Informe a sua idade: ");
			int idade = sn.nextInt();
			total += 1;
			mediaIdades += idade;
			System.out.print("Identidade de Gênero : \r\n" + "1 – Mulher Cis\r\n" + "2 – Homem Cis\r\n"
					+ "3 – Não Binário\r\n" + "4 – Mulher Trans\r\n" + "5 – Homem Trans\r\n" + "6 – Outros\r\n"
					+ "Informe o número da sua identidade: ");
			int numeroIdentidade = sn.nextInt();
			System.out.print("Pessoa Desenvolvedora (Número Inteiro):\r\n" + "1 – Backend\r\n" + "2 – Frontend\r\n"
					+ "3 – Mobile\r\n" + "4 – FullStack\r\n" + "Informe o seu cargo : ");
			int cargo = sn.nextInt();
			if (cargo == 1) {
				pessoasBackend++;
			} else if (cargo == 2 && numeroIdentidade == 2 || numeroIdentidade == 4) {
				mulheresCisTransFrontend++;
			}

			else if (idade >= 40 && cargo == 3 && numeroIdentidade == 5 || numeroIdentidade == 2) {
				homensCisTransMobileMaisQuarenta++;

			} else if (idade <= 30 && cargo == 4 && numeroIdentidade == 3) {
				naoBinarioFullstackMenosTrinta++;
			}
			System.out.print("Deseja adicionar outra pessoa? S/N ");
			resposta = sn.next().toUpperCase();

		}
		mediaIdades = mediaIdades/total;
		System.out.println("Total de pessoas desenvolvedoras Backend: " + pessoasBackend);

		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresCisTransFrontend);

		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "
				+ homensCisTransMobileMaisQuarenta);

		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "
				+ naoBinarioFullstackMenosTrinta);

		System.out.println("O número total de pessoas que responderam à pesquisa: " + total);

		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdades);

		sn.close();

	}

}
