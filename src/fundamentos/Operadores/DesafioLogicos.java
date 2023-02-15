package fundamentos.Operadores;

public class DesafioLogicos {
    public static void main(String[] args) {

        // Trabalhou na Terça (V ou F)
        // Trabalhou na Quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete  = trabalho1 || trabalho2;

        // Operador Unário!
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"?" + comprouTV50);
        System.out.println("Comprou TV 32\"?" + comprouTV32);
        System.out.println("Comprou Sorvete\"?" + comprouSorvete);

        //Operador Unário!
        System.out.println("Mais saudável\"?" + !maisSaudavel);
    }
}