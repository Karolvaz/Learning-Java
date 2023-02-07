package fundamentos;

import java.util.Scanner;

public class DesafioVariaveisConstantesFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // (ºF-32) x 5/9 = ºC
        double fahrenheit;
        double celsius;

        final int NUM = 32;
        final double DIV = 5.0 / 9.0;

        System.out.print("Informe a temperatura: ");
        fahrenheit = scanner.nextInt();

        celsius = (fahrenheit - NUM) * DIV;
        System.out.print(celsius);

        scanner.close();
    }
}

