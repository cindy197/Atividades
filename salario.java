import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicitar o salario atual e a porcentagem do reajuste
        System.out.print("Digite o salario atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite a porcentagem do reajuste: ");
        double reajuste = scanner.nextDouble();

        // Calcular o salario com reajuste
        double salarioReajuste = salarioAtual + (salarioAtual * reajuste / 100);

        // Exibir o resultado
        System.out.println("O novo salario é de: R$ " + salarioReajuste);

    }
}

