package vetores_matrizes;

public class ExercicioTres {

	public static void main(String[] args) {
		int matrizInteiros[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int somaPrincipal=0;
		int somaDiagonal=0;
		System.out.println("Diagonal Principal:");
        for (int i = 0; i < matrizInteiros.length; i++) {
            System.out.print(matrizInteiros[i][i] + " ");
            somaPrincipal+=matrizInteiros[i][i];
        }

        System.out.println("\nDiagonal Secundária:");
        for (int i = 0; i < matrizInteiros.length; i++) {
            System.out.print(matrizInteiros[i][matrizInteiros.length - 1 - i] + " ");
            somaDiagonal+=matrizInteiros[i][i];
        }
		
        System.out.println("\nSoma principal = " + somaPrincipal);
        System.out.println("Soma diagonal = " +  somaDiagonal);
	}

}
