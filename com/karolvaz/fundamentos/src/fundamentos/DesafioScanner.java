package fundamentos ;

import java.util.Scanner ;
public class DesafioScanner  {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in) ;
        String nome ;
        int idade ;

        System.out.print("Digite seu nome: ") ;
        nome = scanner.nextLine() ;
        System.out.print("Digite sua idade: ") ;
        idade = scanner.nextInt() ;

        System.out.println() ;

         System.out.println("Seu nome é " + nome + " e você possui " + idade + " anos de idade");

        scanner.close() ;
    }

}
