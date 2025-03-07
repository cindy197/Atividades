import java.util.Scanner;
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Ler a idade
    System.out.print("Digite a idade: ");
    double idadeAnos = scanner.nextDouble();


// Calcular a idade
    double idadeDias = idadeAnos * 365;

// Resultado
    PrintStream printf = System.out.printf("A idade em dias é : " + idadeDias);

}
