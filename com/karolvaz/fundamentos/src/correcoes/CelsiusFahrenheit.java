package correcoes;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {

        // (°C x 1.8) + 32 = °F
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.println("CONVERSÃO CELSIUS PARA FAHRENHEIT");
        System.out.println();

        System.out.print("Informe a temperatura em celsius: ");
        celsius = scanner.nextInt();

        fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("O resultado em fahrenheit é %.2fºC", fahrenheit);

        scanner.close();
    }

}
