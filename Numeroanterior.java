import java.util.Scanner;
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Ler um numero
    System.out.print("Digite o numero inteiro: ");
    int numero = scanner.nextInt();

// Calcular o numero anterior
    int antecessor = numero - 1;

// Resultado
    PrintStream printf = System.out.printf("O valor anterior é : " + antecessor);

}
