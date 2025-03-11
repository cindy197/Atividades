import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar as 3 notas
        System.out.print("Digite a nota da Av1: ");
        int av1 = scanner.nextInt();

        System.out.print("Digite a nota da Av2: ");
        int av2 = scanner.nextInt();

        System.out.print("Digite a nota da Av3: ");
        int av3 = scanner.nextInt();

        //Calcular a media
        int media = (av1 + av2 + av3) / 3;

        //Determinar o conceito
        char conceito; // utilizar char consome menos memoria, pois utiliza menos caracteres.
        if (media == 10) {
            conceito = 'A';
        }
        else if (media == 9) {
            conceito = 'B';

        } else if (media == 8) {
            conceito = 'C';

        } else if (media == 7) {
            conceito = 'D';

        }
        else {
            conceito = 'E';
        }

        //Exibir resultado
        System.out.println("Média: " + media) ;
        System.out.println("Conceito: " + conceito);


    }
}
