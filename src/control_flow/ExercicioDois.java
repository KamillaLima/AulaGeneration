package control_flow;

import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor = sn.nextInt();
        boolean positivo = false;
        boolean par = false;

        if (valor > 0) {
            positivo = true;
        }

        if (valor % 2 == 0) {
            par = true;
        }

        if (positivo ) {
            System.out.print("O valor é positivo e ");
        } else {
            System.out.print("O valor é negativo e ");
        }

        if (par) {
            System.out.print("é par");
        } else {
            System.out.print("é ímpar");
        }

        sn.close();
    }
}
