// Atividade de Conversão de Temperatura

import java.util.Scanner;

public class Temperatura {
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = fahrenheitParaCelsius(fahrenheit);
        System.out.printf("%.1f º Fahrenheit é igual a %.1f º Celsius%n", fahrenheit, celsius);
    }
}
