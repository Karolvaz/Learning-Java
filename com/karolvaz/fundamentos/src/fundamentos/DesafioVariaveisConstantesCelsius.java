package fundamentos;

import java.util.Scanner;

public class DesafioVariaveisConstantesCelsius {
    public static void main(String [] args) {

        // (°C x 1.8) + 32 = °F
        Scanner scanner = new Scanner(System.in);

        double celcius;
        double fahrenheit;

        System.out.print("Informe a temperatura: ");
        celcius = scanner.nextInt();

        fahrenheit = ((celcius*1.8) + 32);
        System.out.print(fahrenheit);
    }
}
