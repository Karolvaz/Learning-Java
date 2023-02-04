package correcoes;

import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {

        // (ºF-32) x 5/9 = ºC
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        System.out.println("CONVERSÃO FAHRENHEIT PARA CELSIUS");
        System.out.println();

        System.out.print("Informe a temperatura em fahrenheit: ");
        fahrenheit = scanner.nextInt();

        celsius = (fahrenheit - 32) * (double) 5 / (double) 9;

        System.out.printf("O resultado em celsius é %.2fºC", celsius);

        scanner.close();
    }
}
