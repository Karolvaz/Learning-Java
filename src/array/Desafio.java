package array;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner desafio = new Scanner(System.in);

        System.out.print("Quantas notas você deseja informar? ");

        int quatidadeNotas = desafio.nextInt();

        double[] notas = new double[quatidadeNotas];

        for (int i=0; i<notas.length; i++){
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = desafio.nextDouble();
        }

        double total = 0;
        for (double nota: notas){
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A média é " + media + "!");

        desafio.close();
    }
}
