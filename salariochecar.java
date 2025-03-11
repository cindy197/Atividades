import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Definir salario minimo
        final double salarioMinimo = 1640.00; //O final tem função de valor constante

        //Solicitar valor salarial
        System.out.print("Digite o seu valor salarial:" );
        double salario = scanner.nextDouble();

        //Verificação se o salario é maior ou igual um salario minimo
        if (salario >= salarioMinimo) {
            System.out.println("Você ganha mais que um salario minimo");
                   }
        else {
            System.out.println("Você ganha menos que um salario minimo");
        }
// A função do if vai informar se o salario for maior igual o sistema irá informar na tela a mensagem 1, se não o sistema
// irá pro else informando a mensagem 2.

    }
}
