package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args){

        //O usuário deve digitar o nome do dia da semana e retornar o Nº correspondente, sendo domingo 1,
        // segunda 2, terça 3, quarta 4, quinta 5, sexta 6 e sábado 7.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o dia da semana: ");
        String diaDaSemana = entrada.next();

        if ("domingo".equalsIgnoreCase(diaDaSemana)) {
            System.out.println(1);
        } else if ("segunda".equalsIgnoreCase(diaDaSemana)){
            System.out.println(2);
        } else if ("terça".equalsIgnoreCase(diaDaSemana)){
            System.out.println(3);
        } else if ("quarta".equalsIgnoreCase(diaDaSemana)){
            System.out.println(4);
        } else if ("quinta".equalsIgnoreCase(diaDaSemana)){
            System.out.println(5);
        } else if ("sexta".equalsIgnoreCase(diaDaSemana)){
            System.out.println(6);
        } else if ("sábado".equalsIgnoreCase(diaDaSemana)
                ||("sabado".equalsIgnoreCase((diaDaSemana)))) {
            System.out.println(7);
        } else {
            System.out.println("Dia inválido");
        }



        entrada.close();
    }
}
