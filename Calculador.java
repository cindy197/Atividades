import java.util.Scanner;
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Ler cotação do Dolar
    System.out.print("Digite a cotação do dolar: ");
    double cotacao = scanner.nextDouble();

// Ler a quantidade de dolar
    System.out.print("Digite a quantidade dos dólares: ");
    double quantidadeDolares = scanner.nextDouble();

// Conversor pra reais
    double valorEmReais = cotacao * quantidadeDolares;

// Resultado
    System.out.printf("O valor em reais é : R$ %2f%n", valorEmReais);

}
