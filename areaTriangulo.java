import java.util.Scanner;
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Ler a base de um triangulo
    System.out.print("Digite a base do triangulo: ");
    double base = scanner.nextDouble();

// Ler a altura de um triangulo
    System.out.print("Digite a altura do triangulo: ") ;
    double altura = scanner.nextDouble();

// Calcular a area do triangulo
    double area = base * altura;

// Resultado
    PrintStream printf = System.out.printf("O valor do triangulo é : " + area);

}
