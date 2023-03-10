package fundamentos.Operadores;

public class Relacionais {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b);

        // 97 to HEX = 0x61
        System.out.println('\u0061');

        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);


        // Operadores Relacionais com operadores logicos
        double nota = 8.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && nota >= 7;

        System.out.println("Tem desconto? " + temDesconto);
    }
}
