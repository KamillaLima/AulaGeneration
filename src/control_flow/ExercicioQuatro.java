package control_flow;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("O animal se trata de um VERTEBRADO ou INVERTEBRADO: ");
		String tipo = sn.next().toUpperCase();
		if (tipo.equals("VERTEBRADO")) {
			System.out.print("Se trata de uma AVE ou MAMIFERO? ");
			String tipoDois = sn.next().toUpperCase();
			if (tipoDois.equals("AVE")) {
				System.out.print("Se trata de uma CARNIVORO ou ONIVORO? ");
				String tipoTres = sn.next().toUpperCase();
				if (tipoTres.equals("CARNIVORO")) {
					System.out.println("É UMA ÁGUIA!");
				} else {
					System.out.println("É UMA POMBA!");
				}
			} else {
				System.out.print("Se trata de um ONÍVORO ou HERBIVORO? ");
				String tipoTres = sn.next().toUpperCase();
				if (tipoTres.equals("ONIVORO")) {
					System.out.println("É UM HOMEM!");
				} else {
					System.out.println("É UMA VACA!");
				}

			}
		} else {
			System.out.print("Se trata de um INSETO ou ANELIDEO? ");
			String tipoDois = sn.next().toUpperCase();
			if (tipoDois.equals("INSETO")) {
				System.out.print("Se trata de um HEMATOFAGO ou HERBIVORO? ");
				String tipoTres = sn.next().toUpperCase();
				if (tipoTres.equals("HEMATOFAGO")) {
					System.out.println("É UMA PULGA!");
				} else {
					System.out.println("É UMA LAGARTA!");
				}
			} else {
				System.out.print("Se trata de um HEMATOFAGO ou ONIVORO? ");
				String tipoTres = sn.next().toUpperCase();
				if (tipoTres.equals("HEMATOFAGO")) {
					System.out.println("É UM SANGUESSUGA!");
				} else {
				}

			}
		}

		sn.close();

	}

}
